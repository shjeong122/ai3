import pandas as pd
import matplotlib.pyplot as plt
from matplotlib import font_manager, rc
import numpy as np
 
# 데이터 불러오기 (올바른 시트 이름 사용)
df = pd.read_excel('age.xlsx', sheet_name='전체')

# 열 이름 지정 및 인덱스 설정
df.columns = ['연도', '2018', '2019', '2020', '2021', '2022', '2023']
df.set_index('연도',  inplace=True)
# df.drop('합계', inplace=True)

# 폰트 설정
font_path = "H2GPRM.TTF"
font_name=font_manager.FontProperties(fname=font_path).get_name()
rc('font', family=font_name)

# 그래프 그리기 준비
x = df.columns
y = df.loc[['15세미만','15~64세', '65세이상']]

# Determine the maximum value from '합계' and '65세이상' to set a common y-limit
max_value = max(df.loc['합계'].max(), df.loc['65세이상'].max())

# Plotting the graph with shared y-axis limits
# Plotting both the bar graph for '합계' and line graph for 
# '65세이상' with values displayed on the bars
fig, ax1 = plt.subplots(figsize=(10, 7))

# Bar graph for total population (합계) with a custom color
bars = ax1.bar(df.columns, df.loc['합계'], label='총 인구수', alpha=0.6, color='grey')
ax1.set_xlabel('연도', size=15)
ax1.set_ylabel('인구수', size=15)
ax1.set_ylim(0, max_value * 1.2)

# Adding the value labels on top of each bar
for bar in bars:
    yval = bar.get_height()
    ax1.text(bar.get_x() + bar.get_width() / 
             2, yval, f"{int(yval):,}", ha='center', va='bottom')

# Secondary axis for 65세이상 population as a line graph with the same y-limit
ax2 = ax1.twinx()
ax2.plot(df.columns, df.loc['65세이상'], ls='--', marker='o', 
         markersize=8, color='red', label='65세이상 인구수')
ax2.set_ylim(0, max_value * 1.2)
ax2.set_ylabel('')

# Title and legend
plt.title('총 인구수 대비 노인 인구수 (2018-2023)', size=20)
fig.legend(loc="upper left", bbox_to_anchor=(0.13,0.88))
plt.show()



