# while 조건식 :
# 참이면 수행하는 문장
# 조건식 거짓이면 처리
# 또는 조건식 다음으로 처리

# 1~10까지 합계 구하기
i = 1
sum = 0
while i <= 10 :
    sum = sum + i
    i = i + 1
print('합계는 %d'%sum)


# 500~600까지의 정수 중 5의 배수의 합계
i =500
sum = 0
while i <= 600 :
    
    if i % 5 == 0 :
        sum += i
    i += 1
print('합계는 %d'%sum)

# 1~1000까지 정수 중 100의 배수를 제외하고 합계
i = 1
sum=0
while i <=1000 :
    if not(i%100==0) :
        sum += i
    i += 1
print('합계는 %d'%sum)

