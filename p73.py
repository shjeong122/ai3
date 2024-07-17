#퀴즈 Q2-6
'''
a = input(첫 번째 정수를 입력하세요: )
#첫번째 정수 = 12, 10
b = input('두 번째 정수를 입력하세요: ')
#두번째 정수 = 15, 20
c = a + b
c = int(a) + int(b)
#print(c)

aval = int(a)
bval = int(b)

if aval > bval :
    print(aval)
else :
    print(bval)
'''
'''
a = input('첫 번째 정수를 입력하세요: ')
b = input('두 번째 정수를 입력하세요: ')
c = input('세 번째 정수를 입력하세요: ')

aval = int(a)
bval = int(b)
cval = int(c)

if aval > bval and cval :
    print(aval)
elif bval > cval :
    print(bval)
else :
    print(cval)
'''

a = int(input('첫 번째 정수를 입력하세요: '))
b = int(input('두 번째 정수를 입력하세요: '))
c = int(input('세 번째 정수를 입력하세요: '))

if a > b and a > c :
    print('가장 큰 수는 :', a)
elif b > c :
    print('가장 큰 수는 :', b)
else :
    print('가장 큰 수는 :', c)