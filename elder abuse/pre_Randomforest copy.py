import pandas as pd
import matplotlib.pyplot as plt
from matplotlib import font_manager, rc
from sklearn.model_selection import train_test_split
from sklearn.ensemble import RandomForestClassifier
from sklearn.preprocessing import LabelEncoder
from sklearn.metrics import accuracy_score, classification_report

# 데이터 불러오기 (올바른 시트 이름 사용)
data = pd.read_excel('dataset_root.xlsx', sheet_name='normalized')

# 2. 분류 및 회귀용 특성과 타겟 설정
# 분류용 특성 및 타겟
X = data[['관계_정규화', '장소_정규화']]
y = LabelEncoder().fit_transform(data['판정'])

# 3. 데이터셋 분할 및 스케일링
# 분류용 데이터셋
X_train, X_test, y_train, y_test = train_test_split(
    X, y, test_size=0.2, random_state=42)

# 4. 모델 생성 및 학습
# 랜덤포레스트 모델 초기화
model = RandomForestClassifier(random_state=42)

# 모델 학습 및 평가
model.fit(X_train, y_train)
y_pred = model.predict(X_test)
# accuracy = accuracy_score(y_test, y_pred)
# classification_rep = classification_report(y_test, y_pred)

# 5. 결과 출력
print("knn_classifier 훈련 세트 점수: ", model.score(X_train, y_train) )
print("knn_classifier 테스트 세트 점수: ", model.score(X_test, y_test) )
print("knn_regressor 훈련 세트 점수: ", model.score(X_train, y_train) )
print("knn_regressor 테스트 세트 점수: ", model.score(X_test, y_test) ) 

# 폰트 설정
font_path = "malgun.TTF"
font_name=font_manager.FontProperties(fname=font_path).get_name()
rc('font', family=font_name)
