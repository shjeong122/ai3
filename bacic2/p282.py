# 7-15

# 동일한 이름의 전역/지역 변수 사용의 예
def func() :
    x = 200
    print(x)

x = 100
func()
print(x)

# 7-16 
# 키워드 global 개념 익히기
def func() :
    global x
    x = 200
    print(x, '111')

x = 100
print(x, '222')
func()
print(x, '333')

# 7-17 
# global을 이용한 원의 면적과 둘레 구하기

def cir_area() : 
    global r
    result = r*r*3.14
    return result
def cir_length() :
    global r
    result = 2*3.14*r
    return result

r = float(input('원의 반지름을 입력하세요 : '))
area = cir_area()
length = cir_length()
print('원의 면적 : %.1f, 원주의 길이 : %.1f'%(area, length))

# 7-18
# 매개변수를 이용한 원의 면적과 둘레 구하기

def cir_area(r) :
    result = r*r*3.14
    return result

def cir_length(r) :
    result = 2*3.14*r
    return result

r = float(input('원의 반지름을 입력하세요 : '))
area = cir_area(r)
length = cir_length(r)
print('원의 면적 : %.1f, 원주의 길이 : %.1f'%(area, length))

