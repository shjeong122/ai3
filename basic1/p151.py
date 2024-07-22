
# 4-8 전화번호에서 하이픈('-') 삭제하기
'''
for i in range(5) :
    phone = input('하이픈(-)을 포함한 휴대폰 번호를 입력하세요 : ')

    for x in phone :
        if x !='-' :
            print('%s'%x, end='')
    print()

# 전화번호에 해당 숫자의 여부
phone='010-8704-3334'
print(phone)
flag = 0
for i in phone :
    if i == "5" :
        flag = 1
if flag == 0 :
        print('없어요')
else :
     print('있어요')
 
'''
# 특수문자만 출력
for j in range(3) :
    phone = input('입력하세요 : ')

    for x in phone :
        if not("a"<=x<="z" or "A"<=x<="Z" or "0"<=x<="9") :
            print('%s'%x, end='')
    print()

# 한글만 출력
for j in range(3) :
    phone = input('입력하세요 : ')

    for x in phone :
        if "가"<=x<="힣" :
            print('%s'%x, end='')
    print()