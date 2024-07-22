# 튜플
# p230
'''
animals = ('토끼','거북이','사자','여우')
print('animals =', animals)

numbers = tuple(range(10))
print('numbers =', numbers)

# 출력하기
print('animals[1:] =', animals[1:])
print('numbers[:3] =', numbers[:3])
print('numbers[::3] =', numbers[::3])

# 수정하기
# animals[2] = '호랑이'  => tuple은 수정 안됨

# 병합
anNu = animals + numbers
print(anNu)


# for문
n2 = tuple(range(101))
for i in n2 :
    sum =sum + i
print(sum)


# 길이
tup1 = (range(5))
cnt = 0
for i in range(len(tup1)) :
    cnt += 1
    print(tup1[i])
    print(cnt, '111')
'''

# 튜플로 구구단표 만들기
print('구구단표')
print('='*30)

for i in range(2, 10) :
    print('%d단'%i)
    for j in range(1,10) :
        print('%d x %d = %d'%(i, j, i*j))
    print('-'*30)

