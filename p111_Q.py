# 코딩연습 

# 특정 범위에 있는 수인지 판별
# C3-1 범위의 시작과 끝, 그리고 정수를 입력받아 해당 정수가 시작과 끝 수 사이에 있는 수인지 판정하는 프로그램
start = int(input('시작 수 : '))
end = int(input('끝 수 : '))
num = int(input('정수 : '))

if start<= num <= end :
    result = '%d은(는) %d~%d 사이에 있다.'%(num, start, end)
else :
    result = '%d은(는) %d~%d 사이에 없다.'%(num, start, end)

print(result)

# C3-2 월 입력받아 계절 판별
# 봄 3~5월, 여름 6~8월, 가을 9~11월, 겨울 12~2월
month = int(input('월을 숫자로 입력하세요 : '))

if 3 <= month <= 5 :
    result = '%d월은 봄이다'%month
elif 6 <= month <= 8 :
    result = '%d월은 여름이다'%month
elif 9 <= month <= 11 :
    result = '%d월은 가을이다'%month
else :
    result = '%d월은 겨울이다'%month

print(result)

# C3-3 주민번호로 남/여를 판정하라
# 주민번호 뒷 자리 첫 번째 숫자를 받아 남/여 판정
# 남자 : 1,3 / 여자 :2,4

sex = int(input('주민번호 뒷 자리 첫번째 숫자를 입력하세요 : '))

if sex == 1 or sex == 3 :
    result = '당신은 남자'
elif sex == 2 or sex == 4 : 
    result = '당신은 여자'
else :
    result = '다시 입력하세요.'

print(result)



