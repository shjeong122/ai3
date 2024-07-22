'''
# 조건문이란? if
# 조건문, 반복문 = 제어문

x = -10
if x > 0 :
    print('양수')
print('조건문 배워요')

y=100
if y>90 :
    print("A+")
else : 
    print("낮은 점수")
print("모두 실행되는 곳")

a=8
b=10
if a>=b :
    print("a가 더 크다")
else : 
    print("b가 더 크다")
print("판단 끝")


jumsu = int(input("당신의 점수는? "))
if jumsu <=100 and jumsu >= 90 :
    print("A")
elif jumsu >= 80 :
    print("B")
elif jumsu >= 70 :
    print("C")
elif jumsu >= 60 :
    print("D")
else : 
    print("F")

'''

jumsu = int(input("당신의 점수는? "))
if jumsu <=100 and jumsu >= 90 :
    print("A")
print("B")