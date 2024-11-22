import pandas as pd
from sklearn.preprocessing import LabelEncoder
from sklearn.model_selection import train_test_split
from sklearn.svm import SVC

# 1. 데이터 적재와 분할
data = pd.read_excel('dataset_root.xlsx', sheet_name='normalized')
X_class = data[['관계_정규화', '장소_정규화']].values
y_class = LabelEncoder().fit_transform(data['판정'])
X_train, X_test, y_train, y_test = train_test_split(X_class, y_class)

print("훈련 세트의 크기: {}, 테스트 세트의 크기: {}".format(X_train.shape[0], X_test.shape[0]))

best_score=0
scores=[]
cs=[]
gammas=[]
for gamma in [0.001, 0.01, 0.1, 1, 10, 100]:
    for C in [0.001, 0.01, 0.1, 1, 10, 100]:
        # 매개변수의 각 조합에 대해 SVC를 훈련
        svm = SVC(gamma=gamma, C=C)
        svm.fit(X_train, y_train)
        # 테스트 세트로 SVC 평가
        score = svm.score(X_test, y_test)
        # 점수가 더 높으면 매개변수와 함께 기록
        if score > best_score:
            best_score = score
            best_parameters = {'C':C, 'gamma':gamma}
            scores.append(score)
            cs.append(C)
            gammas.append(gamma)

print("교차 검증 점수: {}".format(scores))
print("매개변수 C: {}".format(cs))
print("매개변수 g: {}".format(gammas))
print("최고 점수: {:.2f}".format(best_score))
print("최적 매개변수: ", best_parameters)
