# 퀴즈 Q2-3 문자열과 문자 추출하기
string = "쥐 구멍에 볕들 날 있다."
print(string[2:8])

animal = "tiger"
print(animal[0:2])

# 99년 10월 13일 출력 프로그램 작성
jumin = '991013-2012456'
print(jumin[0:2]+'년', jumin[2:4]+'월', jumin[4:6]+'일')
sex = jumin[7]
print(sex)

# 1,3인 경우 남자 출력, 2,4인 경우 여자 출력
if sex=='1' or sex=='3' : 
    print("남자")       # 문장이 끝나지 않은 상태에서 줄바꿈 시, 들여쓰기
else :
    print('여자')

# 주민번호의 마지막 번호가 짝수이면 true
end = jumin[13]                 # 1. 마지막 번호 출력, or jumin[-1]
print(end)
print(type(end))
endInt = int(end)               # 2. 연산을 위해 문자를 숫자로 형변환 : int함수 사용
print(endInt)
print(type(endInt))

if int(end) % 2 == 0 :            # 3. 조건문 주민번호 오류 검출
    print('맞는 주민번호')
else : 
    print('틀린 주민번호')



