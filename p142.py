# 4.1 반복문
'''
for x in range(2) :
    print('안녕하세요.')

for x in range(3) :
    print(x)

for x in range(2) :
    print(x)
    print('Hello')

for i in range (1,4) :
    print(i)

for i in range (1,10,2) :
    print(i)
'''
sum = 0
for i in range (1,5,1) :
    print(i, end=" ")
    sum = sum + i
print()
print(sum)

for i in range (1,5,1) :
    print(i)

# 짝수의 합
sum = 0
for i in range(0, 11, 2) :
    sum = sum + i
    print('i의 값 : %d => 합계 : %d'%(i, sum))


for i in range(10) :
    print(i, end = " ")
print()