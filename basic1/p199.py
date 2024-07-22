# 리스트 복습
'''
# 리스트 일반
nameList = ['a', 'b']
noList = list(range(241001,241021))
print(noList)
print(nameList[1])

for i in noList :
    print(i, end=" ")

i=0
while i < len(noList) :
    print(noList[i], end=" ")
    i = i + 1
    print()

# 리스트 이름 바꾸기
nameList = ['이순신', '홍길동', '박수연']
print(nameList)

# 박수연 -> 박수현
nameList[2] = '박수현'
for i in nameList :
    print(i, end=" ")
print()

# 추가_append
nameList.append('정현희')
for i in nameList :
    print(i, end=" ")
print()

# 삽입_insert
# 이순신 (이승후) 홍길동 박수현 정현희 
nameList.insert(1, '이승후')
for i in nameList :
    print(i, end=" ")
print()

# 인덱스 번호 찾기
# 이순신 이승후 홍길동 박수현 정현희 중
# 박수현의 인덱스 번호
try :
    nameList = ['박수현', '이순신', '이승후', '홍길동', '정현희']
    serch=nameList.index('박수현', 0, 10)
    print(serch)
    serch=  nameList.index('장수현', 0, 10)
except ValueError :
    print('장수현은 없습니다.')

# 리스트 요소 삭제하기
member = [1,2,3,4,2,2,2,2]  #값 삭제
member.remove(2)
print(member)

member = [1,2,3,4,2,2,2,2] # 인덱스번호 삭제
member.clear()
print(member)
   
# 리스트 다루기
p1 =[1,3,5]
p2 =[2,4,6]
p3 = p1 + p2
print(p3)

# 리스트 합계
p4 = list(range(1,11))
print(p4)
sum = 0
for i in p4 :
    sum += i
print(sum)

p4 = list(range(1,11))
p4Sum = sum(p4)
print(p4)
print(p4Sum)

# 리스트 연산
p5 = [100,8,90]
p5Sum = sum(p5)
print(p5Sum)

p5Avg = p5Sum/len(p5)
print(p5Avg)

p5Max = max(p5)
print(p5Max)

p5Min = min(p5)
print(p5Min)

# 역순 나열
p5.reverse()
print(p5)
'''
# 복사
# 깊은 복사 : 다른 메모리 사용, 다른 두개의 주소
p6 = ['apple', 'banana', 'orange']
print(p6,'1111')

p6Copy = p6.copy()
print(p6,'1111')
print(p6Copy,'222')

# 삭제
# apple
p6.remove('apple')
print(p6,'1111')
print(p6Copy,'222')

# 수정
# orange -> mango
p6Copy[2] = 'mango'
print(p6,'1111')
print(p6Copy,'222')

# 얕은복사 : 같은 메모리 사용, 주소 복사(같은 주소 사용)
p7 = ['사과', '바나나', '오렌지']
p77 = p7
print(p7, '111')
print(p77, '222')

p7.remove('사과')
print(p7, '111')
print(p77, '222')
p77[1] = '망고'
print(p7, '111')
print(p77, '222')
p7.append('곰')
print(p7, '111')
print(p77, '222')