# 모듈
# 프로그램을 함수끼리 파일로 저장하고 비지니스 부분은 

import biSearch  # 파일명

data = [55,3,-12,2,51,-23,17,9,13,16,30,9]
number = int(input("찾고자 하는 수를 입력하세요 : "))
data.sort()
result = biSearch.biF(data, number)  #함수명
if result :
    print("%d은 리스트에 존재한다"%number)
else : 
    print("%d은 리스트에 존재하지 않는다"%number)
