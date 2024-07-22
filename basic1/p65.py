# 문자열 길이 구하기
# len() legth_길이
x = "가는 말이 고와야 오는 말이 곱다"
n = len( x )
print( "문자열의 길이 : " + str(n) )

# 자기 이름 폰번호의 마지막 숫자 만큼 반복하기
# 2781
name = "심현정"
phoneNum = "2784"
end = phoneNum[-1]
print(name*int(end))

# 조건 : 15글자 한국 핸드폰번호, 아니면 집번호
# 결과1 : phone1은 한국 핸드폰번호 입니다.
# 결과2 : phone2은 한국 집번호 입니다.
phone1 = '82-10-8744-3334'
phone2 = '82-02-123-4567'
'''       
if len(phone1)==15 :                          
    print('phone1은 한국 핸드폰번호 입니다.')
else :
    print('phone1은 한국 집번호 입니다.')     

if len(phone2)==15 :
    print('phone2은 한국 핸드폰번호 입니다.')
else :
    print('phone2은 한국 집번호 입니다.')
'''                         #''' or """으로 범위 주석이 가능하다.
