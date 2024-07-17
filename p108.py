# 3.3.2 배수 판별하기
# 약수로 나눠 0이 나오는지 확인
# 3 또는 4의 배수 판별하기
'''
num = int(input('양의 정수를 입력하세요 : '))
result = '3의 배수도 4의 배수도 아니다.'

if num%3 == 0 :
    result = '3의 배수이다.'
if num%4 == 0 :
    result = '4의 배수이다.'
if num%3 == 0 and num%4 == 0 :
    result = '3의 배수이면서 4의 배수이다.'
    
print('%d은(는) %s'%(num, result))
'''

#응용문제 숫자를 받아서 "짝수이고 4의 배수"인 숫자이면 "행운의 수"라고 출력
#아니면 입력 받은 수를 출력
#예1 4 : "행운의 수"
#예2 8 : "행운의 수"
#예3 3 : 3

num = int(input('양의 정수를 입력하세요 : '))
result = num

if  num%2 == 0 and num%4 == 0 :
    result = "행운의 수"
else :
    result = num

print(result)


