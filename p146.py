# 4-4 range() 함수

for i in range (10) :
    print(i, end=" ")
print()

for i in range(1, 11) :
    print(i, end=" ")
print()

for i in range(1,10,2) :
    print(i, end=" ")
print()

for i in range(20, 0, -2) :
    print(i, end=" ")


sum=0
for i in range(5,201,5) :
    print(i, end=" ")
print() 


sum=0
cnt=0  # 갯수 세기 변수
for i in range(4,201,4) :
    print(i, end=" ")
    cnt = cnt + 1
print()
print('개수는 %d'%cnt)
'''
sum=0
cnt=0
for i in range(200, -201, -50) :
    print(i, end=" ")
    cnt = cnt + 1
print()
print('개수는 %d'%cnt)
'''
