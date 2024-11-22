import pandas as pd
import numpy as np
from sklearn.datasets import load_iris
from sklearn.preprocessing import LabelEncoder
from sklearn.tree import DecisionTreeClassifier
from sklearn.model_selection import GridSearchCV, train_test_split
from sklearn.metrics import accuracy_score

# 1. 데이터 로드
data = pd.read_excel('dataset_root.xlsx', sheet_name='normalized')

# 2. 분류 및 회귀용 특성과 타겟 설정
# 분류용 특성 및 타겟
X_class = data[['관계_정규화', '장소_정규화']].values
y_class = LabelEncoder().fit_transform(data['판정'])

# 회귀용 특성 및 타겟
X_reg = data[['관계_정규화', '장소_정규화']]
y_reg = data['결과_정규화']
X_train, X_test, y_train, y_test = train_test_split(X_class, y_class, test_size=0.2)

# GridSearchCV의 param_grid 설정
params = {
    'max_depth': [2, 3],
    'min_samples_split': [2, 3]
}

dtc = DecisionTreeClassifier()

grid_tree = GridSearchCV(dtc, param_grid=params, cv=5, refit=True)
grid_tree.fit(X_train, y_train)

print('최적의 매개변수 : ', grid_tree.best_params_)
print('최상의 교차 검증 정확도 : ', grid_tree.best_score_)
#em = grid_tree.best_estimator_
#pred = em.predict(X_val)
#accuracy_score(y_val, pred)

# estimator : classifier, regressor, pipeline 등 가능
# param_grid : 튜닝을 위해 파라미터, 사용될 파라미터를 dictionary 형태로 만들어서 넣는다.
# scoring : 예측 성능을 측정할 평가 방법을 넣는다. 보통 accuracy 로 지정하여서 정확도로 성능 평가를 한다.
# cv : 교차 검증에서 몇개로 분할되는지 지정한다.
# refit : True가 디폴트로 True로 하면 최적의 하이퍼 파라미터를 찾아서 재학습 시킨다.

# best parameters :  {'max_depth': 2, 'min_samples_split': 2}
# best score :  0.9958333333333333