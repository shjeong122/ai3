# 심화문제
# S4-3 범위의 시작 수와 끝 수를 입력 받아
# 범위 내에 있는 소수를 구하는 프로그램
# 소수 : 1과 자신 이외에 나누어 떨어지지 않는 수
# 시작수 30, 끝수 80
'''
x=31
for i in range(2,x) :
    if x%i == 0 :
        print('소수가 아니다.')
        break       
    if i+1==x :
        print('소수이다.')

num1 = int(input('첫 번째 숫자를 입력하세요 : '))
num2 = int(input('두 번째 숫자를 입력하세요 : '))

for x in range(num1, num2+1) :
    for i in range(2,num2) :
        if x%i == 0 :
            break       
        if i+1==x :
            print('%d'%x, end=" ")      

# while 사용해서 소수 구하기

x=stat
i=2
flag = True
while x <= end+1 :
    while i < x :
        if x % i == 0 :
            flag=False
        i += 1
    if not(flag) :
        break
    if x == i + 1 :
        print('%d '%x, end=" ")
    x += 1

'''



# 구구단 출력하기

for i in range(2, 10) :
    for j in range(1,10) :
        print('%2d x%2d = %2d'%(j, i, j*i), end=" ")
    print()

# 소수 구하기 

x=31
for i in range(2, x) :
    if x%i==0 :
        break
    if i+1==x :
        print('%d'%x, end=" ")
