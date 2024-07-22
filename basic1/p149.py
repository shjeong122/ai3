# 4.2.3 5의 배수 합계 구하기
# for문을 이용하여 100에서 200까지의 정수 중 5의 배수의 합 구하기
'''
sum=0
cnt=0
for i in range(20,51,2) :
    print(i, end=' ')
    cnt = cnt + 1
    sum = sum + i
print()
print('개수는 %d'%cnt)
print('2의 배수의 합계 : %d'%sum)


sum = 0
for i in range (1,100,2) :
    sum = sum + i
    print(i, end = " ")
print()
print('합계는 : %d'%sum)

# 100 95 90... 0 출력
sum=0
cnt=0
for i in range(100, -1, -5) : 
    print(i, end = " ")
    sum = sum + i
    cnt = cnt + 1
print()
print('합계는 %d'%sum)
print('개수는 %d'%cnt)
print('평균은 %.0f'%(sum//cnt))

# 1부터 100까지 합

sum=0
for i in range(1,101,1) :
    sum += i  # sum += i
    if sum >= 400 :
        print('합계가 400이 넘는 순간의 i값 %d'%i)
        break

print('1부터 100까지의 합은 : %d'%sum)


# 200~500까지 3개 증가하는 수를 출력하기
# 갯수가 20개 일때 멈추기
cnt = 0
for i in range(200,501,3) :
    print(i, end=" ")
    cnt = cnt + 1    # cnt += 1
    if cnt >= 20 :
        break
print()
print('20개 일때의 i 값 : %d'%i)


# 5부터 500까지 5의 배수 출력
# 합계가 1000이상이거나 갯수가 30개 이상이면 멈추기

cnt = 0
sum = 0
for i in range(5,501,5) :
    print(i, end=" ")
    cnt += 1
    sum += i
    if cnt>=30 or sum>=1000 :
        break
print()
print('멈춤 시 i값 : %d'%i)
print('합계 : %d'%sum)
print('개수 : %d'%cnt)
'''

x=11
division = x/5
quotient = x//5
remainder = x%5
print('나누기 : %.2f'%division)
print('몫 : %.2f'%quotient)
print('나머지 : %.2f'%remainder)