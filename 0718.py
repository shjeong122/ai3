# 반복문
# 구구단 출력하기
# 이중 for문 사용

for i in range(2,10) :
    for j in range(1,10) :
        print('%2d x%2d=%2d'%(i, j, i*j), end=" ")
    print()

for i in range(1,10) :
    for j in range(2,10) :
        print('%2d x%2d=%2d'%(i, j, i*j), end=" ")
    print()