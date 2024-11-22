import pandas as pd
import matplotlib.pyplot as plt
from matplotlib import font_manager, rc

# 데이터 불러오기 (올바른 시트 이름 사용)
df = pd.read_excel('age.xlsx', sheet_name='전체')

# 열 이름 지정 및 인덱스 설정
df.columns = ['연도', '2018', '2019', '2020', '2021', '2022', '2023']
df.set_index('연도',  inplace=True)
df.drop('합계', inplace=True)

# 폰트 설정
font_path = "H2GPRM.TTF"
font_name=font_manager.FontProperties(fname=font_path).get_name()
rc('font', family=font_name)


# 파이 차트 그리기 (레이블이 겹치지 않도록 설정)
df['2023'].plot(kind='pie',
        figsize=(8,5),
        autopct='%1.2f%%',
        fontsize=15,
        startangle=10,
        colors=['bisque', 'cadetblue', 'chocolate']
        )

# 그래프 설정
plt.title('연령별 인구 수(2023)', size=20)
plt.ylabel("")
plt.axis('equal')  # 원형 유지
# plt.legend(loc='upper left')
plt.show()
