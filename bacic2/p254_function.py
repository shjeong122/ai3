# 함수 function
# 함수 만들기
'''
# def 함수() :
def hello() :
    print('hello')

for i in range(5) :
    print('hello')

for i in range(5) :
    hello()


# 함수의 종류
# 사용자 함수_개발자가 만드는 함수
# 내장 함수_미리 만들어진 함수 : print, input, range, list, int, float, str, type


# 1~100까지 합계 
def uSum() :
    sum=0
    for i in range(1,101) :
        sum += i
    print(sum)

# 함수 호출
# 만들어진 함수를 사용하는 쪽 : 비지니스로직
uSum()
uSum()

def lineP() :
    print('-'*50)

lineP()
uSum()
lineP()
uSum()
lineP()

# 합계가 3000이 넘는 순간 멈추기
# 합계, i값 출력

while sum == 3000 :
    sum=0
    for i in range(1,101) :
        sum += i
    print(sum)

def ifSum(n) :
    sum=0
    for i in range(1,101) :
        if sum >= n :
            break
        sum += i
    print('%d이상 일 떄 %d값, 합계%d'%(n,i,sum))

ifSum(4000)
'''
# 요구사항 2가지 입력
# 시작수? 50, 끝수? 200
# 50~200까지 합 출력
def uSum(uStart, uEnd) :
    sum=0
    for i in range(uStart, uEnd+1) :
        sum += i
    print(sum)

def ifSum(n) :
    sum=0
    for i in range(1,101) :
        if sum >= n :
            break
        sum += i


start = int(input('시작 수 ? '))
end = int(input('끝 수 ? '))

uSum(start,end)

