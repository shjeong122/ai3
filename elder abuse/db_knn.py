import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
from sklearn.model_selection import train_test_split
from sklearn.preprocessing import LabelEncoder
from sklearn.neighbors import KNeighborsClassifier, KNeighborsRegressor
from sklearn.metrics import accuracy_score, mean_squared_error
from matplotlib import font_manager, rc

# 1. 데이터 로드
data = pd.read_excel('dataset_root.xlsx', sheet_name='normalized')

# 2. 분류 및 회귀용 특성과 타겟 설정
# 분류용 특성 및 타겟
X_class = data[['관계_정규화', '장소_정규화']].values
y_class = LabelEncoder().fit_transform(data['판정'])

# 회귀용 특성 및 타겟
X_reg = data[['관계_정규화', '장소_정규화']]
y_reg = data['결과_정규화']

# 3. 데이터셋 분할 및 스케일링
# 분류용 데이터셋
X_train_class, X_test_class, y_train_class, y_test_class = train_test_split(
    X_class, y_class, test_size=0.2, random_state=42)

# 회귀용 데이터셋
X_train_reg, X_test_reg, y_train_reg, y_test_reg = train_test_split(
    X_reg, y_reg, test_size=0.2, random_state=42)

# 4. 모델 생성 및 학습
# K-최근접 이웃 분류기 및 회귀 모델 초기화
knn_classifier = KNeighborsClassifier(n_neighbors=1)
knn_regressor = KNeighborsRegressor(n_neighbors=1)

# 분류 모델 학습 및 평가
knn_classifier.fit(X_train_class, y_train_class)
y_pred_class = knn_classifier.predict(X_test_class)
# accuracy = accuracy_score(X_test_class, y_pred_class)
# classification_rep = classification_report(X_test_class, y_pred_class)


# 회귀 모델 학습 및 평가
knn_regressor.fit(X_train_reg, y_train_reg)
y_pred_reg = knn_regressor.predict(X_test_reg)
# accuracy = accuracy_score(X_test_reg, y_pred_reg)
# classification_rep = classification_report(X_test_reg, y_pred_reg)

# 5. 결과 출력
#print("knn_classifier 테스트 세트 예측: \n", knn_classifier.predict(X_test_class) ) 
#print("knn_classifier 훈련 세트 예측: \n", knn_classifier.predict(X_train_class) )
print("knn_classifier 훈련 세트 점수: ", knn_classifier.score(X_train_class, y_train_class) )
print("knn_classifier 테스트 세트 점수: ", knn_classifier.score(X_test_class, y_test_class) )
#print("knn_regressor 테스트 세트 예측: \n", knn_regressor.predict(X_test_class) )
#print("knn_regressor 훈련 세트 예측: \n", knn_regressor.predict(X_train_class) )
print("knn_regressor 훈련 세트 점수: ", knn_regressor.score(X_train_class, y_train_class) )
print("knn_regressor 테스트 세트 점수: ", knn_regressor.score(X_test_class, y_test_class) ) # 결정계수 R^2 값 반환

#print("Classification Accuracy(분류 정확도):", classification_accuracy)
#print("Regression Mean Squared Error(회귀 평균 제곱 오차):", regression_mse)

# 6. 시각화
# 폰트 설정
font_path = "malgun.TTF"
font_name=font_manager.FontProperties(fname=font_path).get_name()
rc('font', family=font_name)

# Classification 정확도 시각화
classification_labels = ['정답', '오답']
classification_counts = [ (y_pred_class == y_test_class).sum(), (y_pred_class != y_test_class).sum()]
plt.figure(figsize=(10, 5))
plt.bar(classification_labels, classification_counts, alpha=0.7)
plt.title('K-최근접 이웃 분류 분석_정확도')
plt.ylabel('개수')
plt.xlabel('결과')
plt.show()

# Regression prediction 시각화
plt.figure(figsize=(10, 5))
plt.scatter(range(len(y_test_reg)), y_test_reg, label='실제 값', alpha=0.7)
plt.scatter(range(len(y_pred_reg)), y_pred_reg, label='예측 값', alpha=0.7, color='r')
plt.title('K-최근접 이웃 회귀 분석_예측 및 실제값')
plt.ylabel('값')
plt.xlabel('데이터 인덱스')
plt.legend()
plt.show()

# 결정경계 시각화
# 음수 부호 문제 해결
plt.rcParams['axes.unicode_minus'] = False

# 결정 경계 그리기
x_min, x_max = X_train_class[:, 0].min() - 1, X_train_class[:, 0].max() + 1
y_min, y_max = X_train_class[:, 1].min() - 1, X_train_class[:, 1].max() + 1
xx, yy = np.meshgrid(np.arange(x_min, x_max, 0.01), np.arange(y_min, y_max, 0.01))

Z = knn_classifier.predict(np.c_[xx.ravel(), yy.ravel()])
Z = Z.reshape(xx.shape)

plt.figure(figsize=(10, 6))
plt.contourf(xx, yy, Z, alpha=0.8, cmap=plt.cm.coolwarm)
plt.scatter(X_train_class[:, 0], X_train_class[:, 1], c=y_train_class, edgecolor='k', cmap=plt.cm.coolwarm, label="Train Data")
plt.scatter(X_test_class[:, 0], X_test_class[:, 1], c=y_test_class, edgecolor='k', cmap=plt.cm.coolwarm, marker='x', label="Test Data")
plt.title('KNN 결정 경계')
plt.xlabel('관계')
plt.ylabel('장소')
plt.xlim(-0.1, 0.5)
plt.ylim(0.6, 1.1)
plt.legend()
plt.show()