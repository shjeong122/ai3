

def biF(data, number) :
    start = 0           # 첫 위치 인덱스 번호
    end = len(data)-1   # 마지막 위치 인덱스 번호
    while start <= end :    
        mid = (start + end)//2
        print(mid, '111')
        if data[mid] == number :
            return True            # 함수와 반복문에서 빠져나온다.
        elif data[mid] > number :  
            end = mid - 1
        elif data[mid] < number :  
            start = mid + 1
    return False
    