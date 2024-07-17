# 코딩연습
'''
# C3-4 영문 소문자 또는 대문자의 자음/모음 판별
a = input('알파벳 하나를 입력하세요.')
upA = a.upper()

if upA == 'A' or upA == 'e' or upA == 'i' or upA == 'o' or upA == 'u' :
    result = '모음'
else :
    result = '자음'

print(result)

# C3-5 다이어트 필요성 판정
height = int(input('키를 입력하세요. '))
weight = int(input('몸무게를 입력하세요. '))
countD = height-100*0.9

if countD < weight :
    result = '건강을 위해 다이어트가 필요합니다!'
else : 
    result = '표준 또는 마른 체형입니다!'

print(result)

# C3-6 아르바이트 급여 계산
# 주간 = 9500원, 야간 = 주간시급*1.5
print('아르바이트 급여 계산 프로그램')
print('*시급')
print('- 주간 근무 : 9,500원')
print('- 야간 근무 : 주간 시급 * 1.5')
print()

hour_pay = 9500
day = input('주간 또는 야간을 입력하세요. : ')
time = int(input('근무 시간을 입력하세요.'))

if day == '주간' :
    result = 9500 * time 
else : 
    result = 9500*1.5*time

print('당신의 이번달 급여는 %d원 입니다.' %result)
'''