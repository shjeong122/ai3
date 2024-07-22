# p173~179 
# 코딩연습
'''
# C4-9 while문으로 1~100까지 홀수의 누적 합계 구하기
i = 1
sum = 0
cnt = 0
while i <= 100 : 
    if i % 2 == 1 :
        sum += i
        print('%4d'%sum, end = " ")
        cnt += 1
        if cnt % 10 == 0 :
            print()
    i += 1


# while으로 통화 환산표 만들기
# 10~100달러, 10씩 증가
#원화와 유로의 환산표

print('-'*30)
print('달러  원화  유로')
print('-'*30)

dollar = 10
while dollar <= 100 :
    won = dollar*1380
    euro = dollar*0.92
    print('%7d %7.1f %7.1f'%(dollar, won, euro))
    dollar += 10

print('-'*30)


# C4-11 while으로 영어 문장 역순 출력
# 문장을 입력해 주세요 : You mean everything to me.
s=input('문장을 입력해 주세요 : ')
print('문장의 길이는 : len(w)')
i = len(s)

while 0<=i :
    if s[i-1]==" " :
        print("-", end="")
    else :
        print('%s'%s[i-1], end="")
    i = i -1
'''


