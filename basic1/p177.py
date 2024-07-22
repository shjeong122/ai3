# E연습문제
'''
# E4-1 for문, 1~10까지 수 중 홀수 출력
for i in range(1,11) :
    if i%2==1 :
        print(i)

#E4-2 for문, 1~100까지 수 중 3의 배수의 합 
sum=0
for i in range(1, 101) :
    if i%3 == 0 :
        sum = sum + i
print('1~100까지의 3의 배수 합계 : %d'%sum)

# E4-3 for문, 1~100까지 수 중 5의 배수 출력
for i in range(1,101) :
    if i%5 == 0 :
        print(i, end = " ")

# E4-4 4-3에서 5의 배수를 한줄에 5개씩 출력
cnt=0
for i in range(1,101) :
    if i%5 == 0 :
        print(i, end = " ")
        cnt = cnt+1
        if cnt%5==0 :
            print()

# E4-5 for문, 1~100까지 수 중 4의 배수 누적 합계
sum=0
for i in range(1,101) :
    if i%4==0 :
        sum += i
        print('%d --> %d'%(i, sum))

# E4-6 for문, 10!(1*2*3...*10)을 구하기
i=0
fac=1
for i in range(0,9) :
    i += 1
    fac= fac * (i+1)
print('10! = %d'%fac)
'''
# E4-7 6번 문제 동일 결과, while문 사용
i=1
fac=1
while i<11 :
    fac=fac*i
    i = i + 1
print('10! = %d'%fac)
