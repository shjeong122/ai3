# 반복문과 리스트
# 예제 5-3
'''
colors = ["빨간색", "파란색", "노란색", "검정색", "초록색"]

for color in colors :
    print("나는 %s을 좋아한다."%color)

# 예제 5-4
n=len(colors) 
for i in range(n) :
    print('나는 %s을 좋아한다.'%colors[i])

# 예제 5-5
# while문에서 리스트 사용
animals = ["코끼리", "호랑이", "사슴", "펭귄", "여우"]

i=0
while i < len(animals) :
    print(animals[i], end=" ")
    print(animals[len(animals)-1-i], end=" ")
    i += 1
'''
list1 = ['홍길동', 100, 80]
list2 = ['이순신', 90, 75]
list3 = ['최경미', 75, 100]
'''
name = "홍길동", "이순신", "최경미"
korean = 100, 90, 75
math = 80,75,100
sum = 180, 165, 175
avg = 90, 82.5, 87.5

print('-'*30)
print(' 이름 국어점수 수학점수 합계 평균')
print('-'*30)
print(list1[0], list1[1],'     ', list1[2], '   ',list1[1]+list1[2],'  ', list1[1]+list1[2]/2)
print(list2[0], '', list2[1], '     ',list2[2], '   ',list2[1]+list2[2], '  ',list2[1]+list2[2]/2)
print(list3[0], '', list3[1],'    ', list3[2],'   ',list3[1]+list3[2], '  ',list3[1]+list3[2]/2)
print('-'*30)

for i in range(4) :
    list[i]
# 이름만 출력
print('우리반 이름 :', list1[0], list2[0], list3[0])

# 국어 점수의 합계

print('우리반 국어점수 합계 :%d' %(list1[1]+list2[1]+list3[1]))
print('우리반 영어점수 합계 :%d' %(list1[2]+list2[2]+list3[2]))

# 우리반에서 국어 점수 제일 잘 본 사람은?
if list1[1]>list2[1] and list1[1]>list3[1] :
    result = list1
elif list2[1]>list1[1] and list2[1]>list3[1] :
    result = list2
else :
    result = list3
print('우리반에서 국어점수 제일 잘 본 사람의 이름은? %s'%result[0])
'''
# 우리반에 박경수가 있나요?
find = input('찾고 싶은 사람은? ')
name=[list1[0], list2[0], list3[0]]
print(name)
if find == name[0] or find == name[1] or find == name[2] :
    print('우리반에 %s 있어요'%find)
else :
    print('우리반에 %s 없어요'%find)



