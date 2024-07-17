# 예제 4-14 while문으로 영어 모음 개수 구하기
'''
s = 'Python is widely used by a number of big companies'

i = 0
cnt = 0
print('문자열의 길이는 %d'%len(s))
print('모음 :', end = '')

while i <= len(s) - 1 :
    if (s[i] != " ") and ((s[i] == 'a' or s[i] == 'A' or s[i] =='e' or s[i] == 'E'\
        or s[i] == 'i'or s[i] == 'I'or s[i] == 'o'or s[i] == 'O'\
        or s[i] == 'u'or s[i] == 'U')) :
        cnt += 1
        print(s[i], end = "")
    i += 1
print()
print('모음 개수 : %d'%cnt)

# 숫자 두개를 입력 받아서 덧셈하기
yN == 'y'
while yN == 'y' :
    num1 = int(input('첫 번째 숫자를 입력하세요. : '))
    num2 = int(input('두 번째 숫자를 입력하세요. : '))

    print('%d+%d=%d'%(num1, num2, num1+num2))
    yN = input('계속하시겠습니까?(y/n) : ')


# 문자열은 2개 입력 받아서 합치기
w1 = 'Hello'
w2 = 'Love'
# 결과 : H L e o L v l e o
# 계속하시겠습니까?(y/n)

while yN == "y" :
    for i in range(1,6) :
        result = (w1[i], " ", w2[i])
    print(result)
    yN = '계속하시겠습니까?(y/n) : '

yN == "y"
w1 = 'Hello'
w2 = 'Love'
ws = ""
while (yN == "y") :
    for i in range(len(w1)+len(w2)) :
        if i <= len(w1)-1 :
            ws = ws + w1[i]
        if i <= len(w2)-1 :
            ws = ws + w2[i]
    print(ws)    
    yN = input('계속하시겠습니까?(y/n) :')

while True :
    w=input("문자1 : " )
    s=input("문자2 : ")
    ws = ""
    for i in range( len(w) + len(s)) : # 0, 1, 2, .... 8
        if i <= len(w)-1 : # i<=4 0, 1, 2, 3, 4
           ws = ws + w[i]
        if i <= len(s)-1 : # i<=3 0, 1, 2, 3 
           ws = ws + s[i]
    print(ws)
    yN = input("계속하실래요?(y/n)")
    if yN == 'n' :
        break
'''

yN = "y"
while( yN=="y" ) :
    w=input("문자1 : " )
    s=input("문자2 : ")
    ws = ""
    for i in range( len(w) + len(s)) : # 0, 1, 2, .... 8
        if i <= len(w)-1 : # i<=4 0, 1, 2, 3, 4
           ws = ws + w[i]
        if i <= len(s)-1 : # i<=3 0, 1, 2, 3 
           ws = ws + s[i]
    print(ws)
    yN = input("계속하실래요?(y/n)")