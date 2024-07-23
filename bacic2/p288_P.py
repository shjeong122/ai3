# 연습문제
# 7장 함수
'''
# 7-1,7-2, 7-3 오류 발생 원인 설명
def func() :
    global x
    x = 200
    print(x)
    
x = 100
func()
print(x)

# 7-4 사용자 함수를 정의하여 킬로미터를 마일로 환산하는 프로그램
# 환산 수식 : 마일 = 킬로미터 *0.621371 


def mile(km) :
    result = km * 0.621371
    print(result)
    return result

km = int(input('킬로미터를 입력하세요 : '))
mileKm = mile(km)
print('%d 킬로미터는 %.2f 마일 입니다.'%(km, mileKm))

def mile() :
    global km
    result = km * 0.621371
    return result

km = float(input('킬로미터를 입력하세요 : '))
mileKm = mile()
print('%d 킬로미터는 %.2f 마일 입니다.'%(km, mileKm))


# 7-5 하나 이상의 사용자 함수를 정의
# 간단한 계산기 프로그램

print('-선택 옵션')
print('1. 더하기')
print('2. 빼기')
print('3. 곱하기')
print('4. 나누기')
select = input('원하는 연산을 선택하세요(1/2/3/4) : ')
num1 = int(input('첫 번째 숫자를 입력하세요 : '))
num2 = int(input('두 번째 숫자를 입력하세요 : '))

def add() :
    global num1
    global num2
    result = num1 + num2
    return result
def sub() :
    global num1
    global num2
    result = num1 - num2
    return result
def mult() :
    global num1
    global num2
    result = num1 * num2
    return result
def divid() :
    global num1
    global num2
    result = num1 / num2
    return result

if select=='1':
    adD=add()
    print('%d + %d = %s'%(num1, num2, adD))
elif select == '2':
    suB=sub()
    print('%d - %d = %s'%(num1, num2, suB))
elif select == '3' :
    mulT=mult()    
    print('%d * %d = %s'%(num1, num2, mulT))
elif select == '4' :
    diviD=divid()
    print('%d / %d = %s'%(num1, num2, diviD))
'''
# 7-6 사용자 함수 이용 
# 영어 문장에 있는 알파벳 개수 카운트 프로그램 작성
# I am a student. a
def count() :
    global a
    global b
    cnt = 0
    for i in range(len(a)) :
        if i == b :
            cnt += 1

a = input('영어 문장을 입력하세요 : ')
b = input('알파벳 하나를 입력하세요 : ')
counT = count()
print('%s에 포함된 %s의 개수는 %s 개이다.'%(a, b, counT))
