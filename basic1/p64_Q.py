# 퀴즈 Q2-4
# Q1 각 변수의 데이터 형 구하기
x='수학정석:'
y=80
z=x+str(y)
print('x의 자료형 : ', type(x))
print('y의 자료형 : ', type(y))

# Q2 프로그램의 실행 결과
date ='20220301'
year = date[0:4]
month = date[4:6]
day = date[6:]         # [6:]와 같이 :의 마지막이 정의되지 않을 경우, 끝까지 출력한다.
date2 = year + '-' + month +'-' + day
print(date2)

# 데이터 형 int(), str() 
# 자료형 반환 type() 
# 자료 길이length len()
