# 리스트 문자열 변환하기
'''
# 예제 5-23 join()

names = ['a', 'b', 'c']
x = '/'.join(names)
print(x)

# 212 2차원 리스트
list2D = [[1,2], [3,4,5], [1]]
print(list2D[1][1])

list2DD = [[1,2,3,4],[5,6,7]]
print(list2DD[1][2], end= " ")

print(len(list2DD), '111')
print(len(list2DD[0]), '222')
print(len(list2DD[1]),'333')

for i in range(0, len(list2DD)) :
    for j in range(0, len(list2DD[i])) :
        print(list2DD[i][j], end= " ")

'''
# 3차원 리스트
list3D = [[[1,2,3],[4,5]],[[6,7],[8]]]

print(list3D[1][1][0])
print(list3D[0][0][0])