# 선형 탐색 = 순차 탐색
# 순차적으로 하나씩 비교

def find_max(n) :
    mx = n[0]
    for i in range(1,len(n)) :
        if n[i] > mx :
            mx=n[i]

    return mx

data = [5, -3, 12, 8,2]
print(data)

max_value = find_max(data)
print('최대값 :', max_value)

# 이진탐색
# 오름차순 또는 내림차순으로 정렬이 선수행되어 있어야한다.
# 특정 값 인덱스 찾기(while문)

def binary_search(n,x) :
    start = 0
    end = len(n) -1  # n=8

    while start <= end :   # 0 <= 8
        mid = (start + end)//2  # mid = 8/2=4, 5+8/2=6
        if x == n[mid] :           # 52 != 40, 52 != 68 
            return mid
        elif x > n[mid] :           # 52 > 40,  52 > 68 
            start = mid + 1   # start = 4+1=5
        else :
            end = mid - 1            #     start= 6-1=5
    return -1

data = [7,16,23,35,40,52,68,78,82]
print(data)

search_num = 99
index = binary_search(data, search_num)
print('%d의 위치 : %d'%(search_num, index)) #52:5, 16:1, 99:-1(없다)
