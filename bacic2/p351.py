#random모듈
import random
import time

print(random.random())
print(random.uniform(1.0,10.0))
print(random.randint(1,45))

list1=list(range(1,11))
tuple1=tuple(range(20,31))
print(list1)
print(tuple1)
print(random.choice(list1))
print(random.choice(tuple1))
random.shuffle(list1)
# random.shuffle(tuple1) # 튜플은 삭제 수정이 안되기 때문에 shuffle 불가

current_time = time.localtime(time.time())
print(current_time)
print("게임 시작 시간 : ", time.strftime("%I:%M:%S %p", current_time))
# 2024-7-26
print("게임 시작 시간 : ", time.strftime("%y-%m-%d", current_time))
# random

