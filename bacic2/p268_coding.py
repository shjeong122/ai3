# 코딩연습
'''
# C7-1 함수와 매개변수로 두 수의 합 구하기
sum=0
def add(num1, num2) :
    sum = num1 + num2
    print('%d + %d = %d'%(num1, num2, sum))
    
add(12, 15)
add(245, 300)
add(-38, -12)

# C7-2 함수와 매개변수로 정수 합계 구하기
#20~50 = 1085
# 600~800 = 140700

def intSum(start, end) :
    sum2 = 0
    for i in range(start, end+1) :
        sum2 += i
    print('%d ~ %d 정수 합계 : %d'%(start, end, sum2))

intSum(20,50)
intSum(600,800)
'''
# C7-3 매개변수 *args 활용

def member_join(*args) :
    result=""
    for member in member_join :
        result = result + " "
    print('가입 회원 :', member)

member_join('김정연', '안서영')

