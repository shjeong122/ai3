#문자열 포맷팅

age = 20
print('내 나이는 %s살 입니다.'%age)

pay = 100000000
print('내 나이는 %s살 이고, 연봉은 %d원 입니다.'%(age, pay))

#
kor = 88
eng = 95
math = 97
sum = kor + eng + math
avg = sum/3
print('합계 : %d, 평균 : %.2f' %(sum, avg))

# 문자열 포맷 코드 %s_string, %d_digit, %f_floating point
# %.2f_숫자 반환 시, 소수점 둘째 자리까지