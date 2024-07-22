# E연습문제 2장. 파이썬의 기본 문법
'''
#E2-1 두개의 변수 
a = 10
b = 20
print(a+b)

#E2-2 문자열 포맷팅
sum = a+b
print('두 개의 변수의 합은 %d입니다.'%sum)

#E2-3 문자열 연결 연산자+ 와 str 함수 사용
sumStr = str(sum)
print('두 문자의 합은 %s 입니다.'%(sumStr))

#E2-4 두개의 과일 이름을 받아 출력, print 함수와 콤마 사용
fruit1 = str(input('좋아하는 과일 첫번째 : '))
fruit2 = str(input('좋아하는 과일 두번째 : '))
print(fruit1, '와(과)', fruit2, '은(는) 내가 좋아하는 과일이다.')

#E2-5 공백없애서 출력, print함수와 sep 사용
print(fruit1,'와(과)', fruit2,'은(는) 내가 좋아하는 과일이다.', sep="")

#E2-6 문자열 포맷팅 이용
print('%s와(과) %s은(는) 내가 좋아하는 과일이다.'%(fruit1, fruit2))

#E2-7 두 개의 정수를 입력받아 나눗셈 하는 프로그램 작성
# 5,3
num1 = float(input('첫 번째 숫자를 입력하세요 : '))
num2 = float(input('두 번째 숫자를 입력하세요 : '))
result = float(num1/num2)
print('%d / %d = %.6f'%(num1, num2, result))

#E2-8 소수 둘째 자리까지 표기
print('%d / %d = %.2f'%(num1, num2, result))

# E2-9 이메일 주소 두개 입력 받아 문자열 이용하여 주소 사이에 @ 붙여서 출력하는 프로그램 
email1 = str(input('이메일 주소 앞 부분은? '))
email2 = str(input('이메일 도메인 이름은? '))
print('- 이메일 주소 : %s@%s'%(email1, email2))

# E2-10 이름, 주소, 전화번호 입력 받아 화면에 출력
name = input('이름을 입력하세요 : ')
address = input('주소를 입력하세요 : ')
phone = input('전화번호를 입력하세요 : ')
print('- 이름 : %s'%name)
print('- 주소 : %s'%address)
print('- 전화번호 : %s'%phone)

# E2-11 사다리꼴의 윗변의 길이, 밑변의 길이, 높이를 입력받아 사다리꼴의 면적을 구하는 프로그램
# 사다리꼴 면적 : (윗변 길이 + 밑변 길이) * 높이 / 2
upside = float(input("윗변의 길이는? "))
under = float(input("밑변의 길이는? "))
height = float(input("높이는? "))
area = (upside + under)*height/2
print('- 사다리꼴의 면적 : %.1f'%area)

# E2-12 단어 추출
# 가는 말이 고와야 오는 말이 곱다. 중 '오는 말'
sentence = '가는 말이 고와야 오는 말이 곱다.'
print('- 추출 문자 :', sentence[10:14])

# E2-13 열 자리 숫자 입력받아 끝에서 두 개의 숫자 출력
number = str(37366366845)
print('- 추출된 두 숫자 :', number[9:11])

# 심화 문제
# S2-1 입력받은 킬로그램을 파운드와 온스로 환산하는 프로그램
# 파운드=킬로그램*2.204623, 온스=킬로그램*35.273962
kg = float(input("변환할 킬로그램(kg)은? "))
pound = kg * 2.204623
ounce = kg * 35.273962
print("-"*20)
print("킬로그램  ", '파운드   ', '온스    ')
print("-"*20)
print('%d    '%kg, '%.2f  '%pound, '%.2f'%ounce)
'''
# S2-2 하이픈이 포함된 휴대폰 번호를 입력받아 하이픈이 삭제된 번호를 출력하는 프로그램
phone = str(input('하이픈(-)이 포함된 11자리의 휴대폰 번호는? '))
print(phone)

phone1 = phone[0:3]
phone2 = phone[4:8]
phone3 = phone[9:13]
print(phone1)
print(phone2)
print(phone3)
phoneRe = (phone1+phone2+phone3)-------
print(phoneRe)

print('- 입력된 휴대폰 번호 : %s'%phone)
print('- 하이픈 삭제된 휴대폰 번호 : %s'%phoneRe)

