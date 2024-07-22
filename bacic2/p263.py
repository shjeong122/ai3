# 매개변수 *args

def average(*args) :
    print(args)
    print(len(args))

def func(food) :
    food.append("딸기")
    food.append("수박")

# 비지니스로직 부분(실제 코드 수행 부분) 함수 호출
average(85,96,87)
average(77,93,85,97,72)

fruits = ['사과', '오렌지', '바나나']
print(fruits)
func(fruits)
print(fruits)
