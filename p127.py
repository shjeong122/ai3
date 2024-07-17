# 3-10 만 나이 구하기

print('='*50)
now_year = int(input('현재 년은? '))
now_month = int(input('현재 월은?'))
now_day = int(input('현재 일은?' ))

birth_year = int(input('출생 년은? '))
birth_month = int(input('출생 월은?'))
birth_day = int(input('출생 일은?' ))

if birth_month < now_month : 
    age = now_year - birth_year
elif birth_month == now_month :
    if birth_day < now_day :
        age = now_year - birth_year
    else :
        age = now_year - birth_year -1
else :
    age = now_year - birth_year -1
