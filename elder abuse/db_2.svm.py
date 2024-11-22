import pandas as pd
import numpy as np
from sklearn.datasets import load_iris
from sklearn.preprocessing import LabelEncoder
from sklearn.tree import DecisionTreeClassifier
from sklearn.model_selection import GridSearchCV, train_test_split
from sklearn.svm import SVC
from sklearn.metrics import accuracy_score
from sklearn.preprocessing import MinMaxScaler

# 1. 데이터 적재와 분할
data = pd.read_excel('dataset_root.xlsx', sheet_name='normalized')
X_class = data[['관계_정규화', '장소_정규화']].values
y_class = LabelEncoder().fit_transform(data['판정'])
X_train, X_test, y_train, y_test = train_test_split(X_class, y_class)

# 훈련 데이터의 최솟값, 최댓값을 계산
scaler = MinMaxScaler().fit(X_train)

# 훈련 데이터의 스케일을 조정
X_train_scaled = scaler.transform(X_train)

# 스케일 조정된 훈련데이터에 SVM을 학습
svm = SVC()
svm.fit(X_train_scaled, y_train)

# 테스트 데이터의 스케일을 조정하고 점수를 계산
X_test_scaled = scaler.transform(X_test)
print("적용 전 테스트 점수: {:.2f}".format(svm.score(X_test_scaled, y_test)))

# 이 코드는 예를 위한 것입니다. 실제로 사용하지 마세요.
param_grid = {'C': [0.001, 0.01, 0.1, 1, 10, 100],
              'gamma': [0.001, 0.01, 0.1, 1, 10, 100]} #개발자가 임의의 값을 넣어줌
grid = GridSearchCV(SVC(), param_grid=param_grid, cv=8)
grid.fit(X_train, y_train)
print("최상의 교차 검증 정확도: {:.2f}".format(grid.best_score_))
print("적용 후 테스트 점수: {:.2f}".format(grid.score(X_test_scaled, y_test)))
print("최적의 매개변수: ", grid.best_params_)
