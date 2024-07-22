# 1~200 출력
'''
for i in range(1,201) :
    print(i, end=" ")

i=1
while i <= 200 :
    print(i, end = " ")
    i += 1

# 100이면 빠지기
for i in range(1,201) :
    print(i, end=" ")
    if i == 100 :
        break

i=1
while i <= 200 :
    print(i, end = " ")

    if i == 100 :
        break
    i += 1

# 100이면 찍지 않고 건너 뛰기
for i in range(1,201) :
    if i == 100 :
        continue
    print(i, end=" ")


i=1
while i < 200 :
    i += 1
    if i == 100 :
        continue
    print(i, end = " ")

'''