# 코딩연습
'''
# C4-1 for문으로 5의 배수가 아닌 수를 출력
# 200에서 800까지 정수 중 5의 배수가 아닌 수를 한줄로 10개씩 출력
cnt = 0
for i in range(200,801) :
    if not(i%5==0) :
        print(i, end=" ")
        cnt += 1
        if cnt%10==0 :
            print()

# C4-2 for문으로 길이 환산표 작성
# 센티미터(1~100cm, 1씩 증가), 밀리미터(mm), 미터(m), 인치(inch)로 환산
print('-'*30)
print('  cm   mm    m    inch ')
print('-'*30)

for cm in range(1,101) : 
    mm=cm*10
    m=cm*0.1
    inch=cm*0.3937
    print('%4d %4d %5.2f %5.1f'%(cm, mm, m, inch))
print('-'*30)


# C4-3 for문으로 별표 트리를 만들어라

for i in range(10) :
    print('*'*i)


# C4-3 트리 모양 변경_역삼각형

for i in range(10) :
    count = 10-i 
    print('*'*count)

# C4-5 for문으로 홀수의 개수 카운트
# 입력 : 477569040
# 홀수 개수 : 4

number = input('숫자를 입력하세요. : ')

cnt = 0
for i in number : 
    num=int(i)
    if num%2==1 :
        print(i, end="")
        cnt = cnt + 1
print()
print('홀수의 개수 : %d'%cnt)


# 10 20 30 ... 100 출력

for j in range(5) :
    k=6-j

    for i in range(1,k) :
        print(i, end=" ")
    print()
'''

for i in range(5) :
    for x in range(1+i,6) :
        print(x, end=' ')
    print()
