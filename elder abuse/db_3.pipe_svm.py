import pandas as pd
import numpy as np
from sklearn.datasets import load_iris
from sklearn.preprocessing import LabelEncoder
from sklearn.tree import DecisionTreeClassifier
from sklearn.model_selection import GridSearchCV, train_test_split
from sklearn.svm import SVC
from sklearn.metrics import accuracy_score
from sklearn.preprocessing import MinMaxScaler
from sklearn.pipeline import Pipeline

# 1. 데이터 적재와 분할
data = pd.read_excel('dataset_root.xlsx', sheet_name='normalized')
X_class = data[['관계_정규화', '장소_정규화']].values
y_class = LabelEncoder().fit_transform(data['판정'])
X_train, X_test, y_train, y_test = train_test_split(X_class, y_class)

# 파이프라인 구축 및 평가
# 1단계: scaler, 2단계: SVM모델 훈련
pipe = Pipeline([("scaler", MinMaxScaler()), ("svm", SVC())])
pipe.fit(X_train, y_train)
print("적용 전 테스트 점수: {:.2f}".format(pipe.score(X_test, y_test)))

# 파이프라인 적용
# 최적의 매개변수 C와 gamma 찾기
param_grid = {'svm__C':[0.001, 0.01, 0.1, 1, 10, 100],'svm__gamma':[0.001, 0.01, 0.1, 1, 10, 100]}
grid = GridSearchCV(pipe, param_grid=param_grid, cv=5)
grid.fit(X_train, y_train)
print("최상의 교차 검증 정확도: {:.2f}".format(grid.best_score_))
print("적용 후 테스트 세트 점수:{:.2f}".format(grid.score(X_test, y_test)))
print("최적의 매개변수: ", grid.best_params_)


