#사칙연산
#실습1
print( 31 + 26 )   #덧셈
print( 511 - 54 )  #나눗셈
print( 5 * 15 )    #곱셈
print( 96 / 4 )    #나눗셈

#실습2
print(26//2)   #나머지 절삭
print(31//4)

print(26%2)    #나머지 연산
print(31%4)

print(2**4)    #거듭제곱
print(4**6)

#Q1. a,b에 각각 5,7을 할당하고 곱셈을 한 값을 변수 result에 저장하여 출력하는 프로그램 작성
a=5    # a, b = 5, 7
b=7
result=a*b
print('a*b : ', result)

#Q2. 다음 식의 몫과 나머지를 각각 다른 변수 portion, the_rest에 저장시키는 프로그램 작성, 12345 나누기 789
c=12345
d=789
portion=12345//789
the_rest=12345%789
print('몫 : ', portion)
print('나머지 : ', the_rest)

#Q3. x, y에 각각 11, 22를 할당하고 그 후 숫자를 직접 이용하지 않고 다른 변수z를 이용하여 두 수를 교환하는 프로그램 작성
x = 11    # x , y = 11 , 22
y = 22
z = x     #교환 알고리즘
x = y
y = z

print( 'x : ', x )    #pritn( 'x=', x , 'y=', y )
print( 'y : ', y )

#Q3-1. 파이썬에서 변수 값 맞교환하기, 파이썬에서만 가능(Java, c언어에서는 에러)
m, n =100, 200
m,n=n,m
print( 'm=', m , 'n=', n )

#Q4. 반지름(r)이 7인 원의 넓이(area)를 제곱을 이용하여 구하는 프로그램 작성
r = 7
area = r ** 2 * 3.14
print( '원의 넓이 : ', area )
