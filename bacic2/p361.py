# 연습문제
# E9-1
import math
import time
import random
print(math.ceil(35.1), math.ceil(35.7))
# 9-2
print(math.floor(7.1), math.floor(-8.7))
#9-3
print(round(23.7), round(-12.3))
#9-4
print(math.pow(2,4), math.pow(5,-2))

# 심화
# S9-1
# random.choice()활용, 가위바위보 프로그램

print("="*30)
print("가위바위보 게임")
print("="*30)

again="y"
while( again=="y") :
    for i in range(3) : 
        x=["가위", "바위", "보"]
        me = random.choice(x)
        you = random.choice(x) 
        print("나 : %s"%me)
        print("당신 : %s"%you)
        if me=="가위" and you=="가위" :
            print("무승부입니다!")
        elif me=="가위" and you=="바위" :
            print("당신의 승리입니다!")
        elif me=="가위" and you=="보" :
            print("나의 승리입니다!")
        elif me=="바위" and you=="바위" :
            print("무승부입니다!")
        elif me=="바위" and you=="가위" :
            print("나의 승리입니다!")
        elif me=="바위" and you=="보" :
            print("당신의 승리입니다!")
        elif me=="보" and you=="가위" :
            print("당신의 승리입니다!")
        elif me=="보" and you=="바위" :
            print("나의 승리입니다!")
        elif me=="보" and you=="보" :
            print("무승부입니다!")
        print('-'*30)
    again = input("계속하려면 y를 입력하세요!")
print("게임이 종료되었습니다!")
