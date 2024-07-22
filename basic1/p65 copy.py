
# 조건 : 15글자 한국 핸드폰번호, 아니면 집번호
# 결과1 : phone1은 한국 핸드폰번호 입니다.
# 결과2 : phone2은 한국 집번호 입니다.
phone1 = '82-10-8744-3334'
phone2 = '82-02-123-4567'
len1 = len(phone1)
len2 = len(phone2)

if len1==15 or len2==15 :                   #!=  : 같지 않을 경우
    print('phone1은 한국 핸드폰번호 입니다.')
else :
    print('phone2은 한국 집번호 입니다.')

x = phone1
y = phone2

if len(x) == 15 and len(y) ==15 :
    print(x + '와', y + '는', '한국 핸드폰 번호 입니다.')
elif len(x) != 15 and len(y) == 15:
    print(x + '는', '한국 집번호 입니다.', y + '는', '한국 핸드폰 번호 입니다.')
elif len(x) == 15 or len(x) != 15 :
    print(x + '는', '한국 핸드폰 번호 입니다.', y + '는', '한국 집 번호 입니다.')
    