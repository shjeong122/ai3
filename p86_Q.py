
# C2-1 년월일 사이에 . 을 삽입하여 출력하는 프로그램 작성
year = input("년은? ")
month = input("월은? ")
day = input("일은? ")
print(year, month, day, sep=".")

# C2-2 사각형의 둘레와 면적 계산
width = int(input("사각형의 너비는? "))
height = int(input("사각형의 높이는? "))
length = (width+height)*2
area = width*height
print('사각형의 너비 : %d cm' % width)
print('사각형의 높이 : %d cm ' % height)
print('사각형의 둘레 : %d cm' % length)
print('사각형의 넓이 : %d cm2' % area)

# C2-3 원의 둘레와 면적 계산

r = int(input("반지름은? "))
length = r*2*3.14
area = r**2*3.14
print('원의 반지름 : %.2f cm' %r)
print('원의 둘레 : %.2f cm' %length)
print('원의 면적 : %.2f cm2' %area)

# C2-4 인치inch를 센티미터cm로 환산
#센티미터 = 인치*2.54
inch = float(input('인치는? '))
cm = inch*2.54
print('%.1f inch => %.1f cm' % (inch, cm))


# C2-5 온라인 서점의 책 결제 금액 계산
# 결제금액 : 책값 - (책값 * (할인율/100)) + 배송료

price = int(input('책 값은? '))      #20000
discount = int(input('할인율은? '))  #10
delivery = int(input('배송료는? '))  #3000
pay = price - (price * ( discount / 100 )) + delivery
print('책 값 : %d원'%price)
print('할인율 : %d'%discount)
print('배송료 : %d원'%delivery)
print('결제 금액 : %d원'%pay)
