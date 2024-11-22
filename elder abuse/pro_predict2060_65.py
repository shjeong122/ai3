import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LinearRegression
import numpy as np
import matplotlib.pyplot as plt
from matplotlib import font_manager, rc

font_path = "./malgun.ttf"   #폰트파일의 위치
font_name = font_manager.FontProperties(fname=font_path).get_name()
rc('font', family=font_name)

# Load data from the '전체' sheet and set up 65세이상 data for training
df = pd.read_excel('age.xlsx', sheet_name='전체')
df.columns = ['연도', '2018', '2019', '2020', '2021', '2022', '2023']
df.set_index('연도', inplace=True)

# Extract only the '65세이상' data and reshape for ML
years = np.array([2018, 2019, 2020, 2021, 2022, 2023]).reshape(-1, 1)
population_65_plus = df.loc['65세이상'].values.reshape(-1, 1)

# Train-test split (we'll use all data for training as it's a future forecast)
model = LinearRegression()
model.fit(years, population_65_plus)

# Predicting for 2060
predicted_2060 = model.predict(np.array([[2060]]))

print(f"2060년 노인 인구 수 예측: {int(predicted_2060[0][0]):,}")

# Plotting the historical data and prediction
plt.plot(years, population_65_plus, label="과거 65세이상 인구수", marker='o', color='grey')
plt.plot(2060, predicted_2060, label="2060년도 예측 노인수", marker='*', color='red', markersize=12 )
plt.xlabel('연도', size=15)
plt.ylabel('65세이상 인구수', size=15)
plt.title('2060년 노인 인구 수 예측', size=20)
plt.legend()
plt.show()