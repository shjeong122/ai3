# if~ 구문
'''
age=int(input("나이는? "))
ticket = 2000   #기본 입장료

if age >= 65 :
    ticket = 0

print("나이 : %d세" %age)
print("입장료 : %d원" %ticket)
'''

# 65세 이상이면 무료
# 10세~20세 : 1500원
# 5세~9세 : 1200원
# 0세~4세 : 1000원

age=int(input("나이는? "))

if age >= 65 :
    ticket = 0
elif 20 >= age >= 10 :
    ticket = 1500
elif 9 >= age >= 5 :
    ticket = 1200
elif 4 >= age :
    ticket = 1000
else :
    ticket = 2000 

print("나이 : %d세" %age)
print("입장료 : %d원" %ticket)
