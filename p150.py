# for문에서 문자열 다루기

for j in range(0,3,1) : 

    word = input("영어 단어는")
    flag = 0 # 있으면 1로 없으면 0으로 됨 
    cnt = 0 # a의 갯수를 세어주는 변수 
    for i in word :
        if i == 'a' :
            flag=1
            cnt += 1
    if flag == 0 :
        print("a가 없어요")       
    else :
        print("%d개 있습니다"%cnt)

# 영어문장에 'a' 글자의 여부
word = 'apple'  # 답은 1개 있어요

flag = 0
cnt = 0
for i in word :
    if i == 'a' :
        flag = 1
        cnt += 1
if flag == 0 :
    print ('없어요')
else : 
    print('%d개 있어요'%cnt)


word = 'an/a'  # 답은 2개 있어요

flag = 0
cnt = 0
for i in word :
    if i == 'a' :
        flag = 1
        cnt += 1
if flag == 0 :
    print ('없어요')
else : 
    print('%d개 있어요'%cnt)


for j in range(0,3,1) : 

    word = 'book'   # 답은 없어요

    flag = 0
    cnt = 0
    for i in word :
        if i == 'a' :
            flag = 1
            cnt += 1
    if flag == 0 :
        print ('없어요')
    else : 
        print('%d개 있어요'%cnt)
