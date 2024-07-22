# E3-6
'''
num = int(input('수를 입력하세요. : '))   # 9
result = '오류! %d은(는) 범위(0~999) 이외의 숫자이다.'%num

if 9>= num >=0 :
    result = '%d은(는) 한 자리 숫자이다.'%num
elif 99>= num >= 10 :
    result = '%d은(는) 두 자리 숫자이다.'%num
elif 999>= num >= 100 :
    result = '%d은(는) 세 자리 숫자이다.'%num

print(result)


number = input('수를 입력하세요. : ')
inputLength = len(number)

if not(0<=number<=999) :
    print('오류! %s은(는) 범위(0~999) 이외의 숫자이다.'%number)
elif inputLength == 1 :
    print('%s은(는) 한자리 숫자이다.'%number)
elif inputLength == 2 :
    print('%s은(는) 두자리 숫자이다.'%number)
elif inputLength == 3 :
    print('%s은(는) 세자리 숫자이다.'%number)

# E3-8 
# 두개의 숫자를 받아 사칙연산 기능 수행 프로그램 작성
num1 = int(input('첫 번째 숫자를 입력하세요. : '))
num2 = int(input('두 번째 숫자를 입력하세요. : '))
select = input('원하는 연산을 선택하세요(1/2/3/4). : ')
print('더하기 : 1')
print('빼기 : 2')
print('곱하기 : 3')
print('빼기 : 4')
print()

if not(select == '1' or select == '2' or select == '3' or select == '4') :
    print('선택 오류.')
elif select == '1' :
    print('%d+%d=%d'%(num1, num2, num1+num2))
elif select == '2' :
    print('%d-%d=%d'%(num1, num2, num1-num2))
elif select == '3' :
    print('%d*%d=%d'%(num1, num2, num1*num2))
elif select == '4' :
    print('%d/%d=%d'%(num1, num2, num1/num2))
'''
# S3-2
# 두 시간 중 빠른 시간과 늦은 시간을 찾는 프로그램

hour1 = int(input('첫 번째 시간의 시를 입력하세요. : '))
min1 = int(input('첫 번째 시간의 분을 입력하세요. : '))
hour2 = int(input('두 번째 시간의 시를 입력하세요. : '))
min2 = int(input('두 번째 시간의 분을 입력하세요. : '))
time1 = hour1*60 + min1
time2 = hour2*60 + min2
time = time1-time2
'''
if not(0<=hour1<=12 or 0<=hour2<=12 or 0<=min1<=60 or 0<=min2<=60) :
    print('입력 오류')
elif hour1 >= hour2 and hour1 >= hour2 :
    print('- 빠른 시간 : %d:%d'%(hour1,min1))
elif hour1 >= hour2 :
    hourF = hour1                         
elif min1 >= min2 :
    minF = min1
elif min1 <= min2 :
    minF = min2
'''
if not(0<=hour1<=24 and 0<=hour2<=24 and 0<=min1<=59 and 0<=min2<=59) :
    print('입력 오류')
elif time > 0 :
    print('- 빠른 시간 : %d:%d'%(hour2,min2))
    print('- 늦은 시간 : %d:%d'%(hour1,min1))
elif time < 0 :
    print('- 빠른 시간 : %d:%d'%(hour1,min1))
    print('- 늦은 시간 : %d:%d'%(hour2,min2))
