# 심화문제

# S8-1 선형탐색, 입력받은 수 찾기 프로그램

def linearSearch(data, number) :
    for i in data :
        if number == i :
            return True
        return False

data = [55,3,-12,2,51,-23,17,9,13,16,30,9]
number = int(input("찾고자 하는 수를 입력하세요 : "))
result = linearSearch(data, number)
if result :
    print("%d은 리스트에 존재한다"%number)
else : 
    print("%d은 리스트에 존재하지 않는다"%number)


# S8-2 이진탐색으로 동일한 결과 출력 프로그램, sort()메소드 활용
# 이진검색 : 조건_정렬되 있는 것 검색, 검색 속도가 가장 빠르다.

def biSearch(data, number) :
    start = 0           # 첫 위치 인덱스 번호
    end = len(data)-1   # 마지막 위치 인덱스 번호
    while start <= end :    
        mid = (start + end)//2
        print(mid, '111')
        if data[mid] == number :
            return True            # 함수와 반복문에서 빠져나온다.
        elif data[mid] > number :  
            end = mid + 1
        elif data[mid] < number :  
            start = mid + 1
    return False
    
data = [55,3,-12,2,51,-23,17,9,13,16,30,9]
number = int(input("찾고자 하는 수를 입력하세요 : "))

data.sort()
result = biSearch(data, number)
if result :
    print("%d은 이진검색 리스트에 존재한다"%number)
else : 
    print("%d은 이진검색 리스트에 존재하지 않는다"%number)

result = linearSearch(data, number)

if result :
    print("%d은 선형검색 리스트에 존재한다"%number)
else : 
    print("%d은 선형검색 리스트에 존재하지 않는다"%number)