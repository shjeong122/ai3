
# 주민번호의 마지막 번호가 짝수이면 true
jumin = '991013-2012456'
end = jumin[13]                 # 1. 마지막 번호 출력, or jumin[-1]
print(end)
print(type(end))

if int(end) % 2 == 0 :            # 2. 형변환, 3. 조건문 주민번호 오류 검출
    print('맞는 주민번호')     
else : 
    print('틀린 주민번호')
