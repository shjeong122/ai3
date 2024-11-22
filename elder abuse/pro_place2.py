import pandas as pd 
import matplotlib.pyplot as plt
import numpy as np
from matplotlib import font_manager, rc

df = pd.read_excel('학대행위자와의_동거여부.xlsx', engine='openpyxl')
df= df.set_index('동거유무별') # y축 인덱스 설정
df.columns = ['2018', '2019', '2020', '2021', '2022']  # x축 값 설정
df=df.transpose()

font_path = "malgun.ttf"
font_name=font_manager.FontProperties(fname=font_path).get_name()
rc('font', family=font_name)

# 누적
ax1 = df[:].plot(kind='bar', stacked=True, figsize=(10,6))
# ax2 = ax1.twinx()
ax1.set_ylim(0,10000)
# ax2.set_ylim(0,8000)
ax1.set_xlabel('연도', size=12)
ax1.set_ylabel('발생 수', size=12)
# ax2.set_ylabel('전년 대비')

plt.title('피해 학대 노인과 가해자의 동거 여부에 따른 발생 수', size=15)
plt.legend(loc='upper right')
plt.show()
