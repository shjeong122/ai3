
# 조건 : 15글자 한국 핸드폰번호, 아니면 집번호
# 결과1 : phone1은 한국 핸드폰번호 입니다.
# 결과2 : phone2은 한국 집번호 입니다.
phone1 = '82-10-8744-3334'  #핸드폰
phone2 = '82-02-123-4567'   #집

if len(phone1)==15 and len(phone2)==15 :                   #!=  : 같지 않을 경우
    print('phone1은 한국 핸드폰번호 입니다.')
    print('phone2은 한국 핸드폰번호 입니다.')
elif len(phone1) == 15 and len(phone2) == 14 :
    print('phone1은 한국 핸드폰번호 입니다.')
    print('phone2은 한국 집번호 입니다.')
elif len(phone1) == 14 and len(phone2) == 15 :
    print('phone1은 한국 집번호 입니다.')
    print('phone2은 한국 핸드폰번호 입니다.')
elif len(phone1) == 14 and len(phone2) == 14 :
    print('phone1은 한국 집번호 입니다.')
    print('phone2은 한국 집번호 입니다.')