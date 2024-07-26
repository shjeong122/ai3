# 9-34 주사위 던지기

import random
import time

print("two dice are rolling...")
time.sleep(2)

me = random.randint(1,6)
computer = random.randint(1,6)
print("나 : ", me)
print("컴퓨터 : ", computer)

import random
import time

cnt1=0
cnt2=0
cnt3=0
for i in range(1000) :

    print("two dice are rolling...")
    time.sleep(2)

    me = random.randint(1,6)
    com = random.randint(1,6)
    print('-'*30)
    print(me)
    print(com)

    if me>com :
        cnt1+=1
        print("내가 이겼다.")
    elif me<com :
        cnt2+=1
        print("컴퓨터가 이겼다.")
    else :
        cnt3+=1
        print("비겼다.")

#1000번 반복해서 내가 600번, 컴350번, 비긴 50번 카운트
print('+'*30)
print("내가 이긴 횟수 : %d"%cnt1)
print("컴퓨터가 이긴 횟수 : %d"%cnt2)
print("비긴 횟수 : %d"%cnt3)
print('+'*30)