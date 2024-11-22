import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
from sklearn.preprocessing import MinMaxScaler
from matplotlib import font_manager, rc

# 폰트 설정
font_path = "H2GPRM.TTF"
font_name=font_manager.FontProperties(fname=font_path).get_name()
rc('font', family=font_name)

# 데이터 로드 
file_path = 'dataset_root.xlsx'
data = pd.read_excel(file_path, sheet_name='data', header=0)

# 정규화할 열 선택
columns = ['관계', '장소']

# Min-Max Scaler 객체 생성 및 적용
scaler = MinMaxScaler()
normalized_data = scaler.fit_transform(data[columns])
# print(normalized_data)

# 정규화된 결과를 원본 데이터프레임에 추가
data[['관계_정규화', '장소_정규화']] = normalized_data

# 단일 컬럼으로 추가 (평균값 사용)
data['결과_정규화'] = normalized_data.mean(axis=1)

# 판정
def classify_result(value):
    if value < 0.2:
        return "주의"
    elif 0.2 <= value < 0.6:
        return "경고"
    else:
        return "조치"

# '결과_정규화'열에 적용하여 판정 열 생성
data['판정'] = data['결과_정규화'].apply(classify_result)

# 기존 파일에 새로운 시트로 저장
output_path = file_path  # 같은 파일에 저장
with pd.ExcelWriter(output_path, engine='openpyxl', mode='a', if_sheet_exists='replace') as writer:
    data.to_excel(writer, sheet_name='normalized', index=False)

# 시각화
# 결과_정규화 산점도
plt.figure(figsize=(8, 6))
plt.scatter(range(len(data['결과_정규화'])), data['결과_정규화'], alpha=0.7)
plt.title('결과_정규화의 산점도')
plt.xlabel('인덱스')
plt.ylabel('결과_정규화')
plt.grid(True)
plt.show()

# # 판정 바그래프
classification_counts = data['판정'].value_counts()

plt.figure(figsize=(8, 6))
classification_counts.plot(kind='bar', alpha=0.8)
plt.title('판정 분류 바그래프', fontsize=16)
plt.xlabel('판정', fontsize=14)
plt.ylabel('개수', fontsize=14)
plt.xticks(rotation=0)
plt.grid(axis='y', linestyle='--', alpha=0.7)
plt.show()
