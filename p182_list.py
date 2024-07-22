# 리스트
'''
list1 = [3, 15, -12.5, '사과', '딸기', True, False]
list2 = list(range(1,21,2))

print(list1)
print(list2)
print(list1[1])
print(list1[4])

for i in range(7) :
    print(list1[6-i], end=" ")
print()

print(list2[6:9])
print(list2[1: :2])
print(list2[-1: :-2])


index=nameList.index(a)

# 응용문제
# 100~200까지, 10씩 증가하는 리스트 만들기

list3=list(range(100,201,10))
print(list3)
cnt = 0
for i in list3 :
    cnt+=1
print('리스트의 개수는 %d개 입니다.'%cnt)

# 합계 구하기
sum = 0
for i in list3 :
    sum += i
print('list3의 합계는 %d 입니다.'%sum)

print(len(list3))
print('list의 개수는', len(list3),'개 입니다.')
'''