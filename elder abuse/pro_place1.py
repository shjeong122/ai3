import pandas as pd
import matplotlib.pyplot as plt
from matplotlib import font_manager, rc

# 폰트 설정
font_path = "H2GPRM.TTF"
font_name=font_manager.FontProperties(fname=font_path).get_name()
rc('font', family=font_name)

# read
df = pd.read_excel('학대발생장소.xlsx', sheet_name='데이터' )

# 열이름 지정
df.columns = ['발생장소','2018', '2019', '2020', '2021', '2022']
df.set_index('발생장소', inplace=True)
print(df)

# 파이 차트 그리기

plt.rcParams.update({'font.size': 14})  # 전체 폰트 크기 설정 (14로 변경 가능)

df['2022'].plot(kind='pie',
        figsize=(10,8),
        autopct='%1.2f%%',
        startangle=10,
        )
plt.title('발생 장소에 따른 노인 학대 발생 비율(2022)', size=20)
plt.axis('equal')
plt.legend(loc='upper right')
plt.show()
