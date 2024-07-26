# math 모듈

import math as m

print(m.sqrt(9))
tData = tuple(range(20))
print(tData)
print(m.fsum(tData))

import time

seconds = time.time()
print(seconds)
gmseconds = time.gmtime()
print(gmseconds)

tm = time.localtime(time.time())
print(tm.tm_year)
print(tm.tm_hour)
print(tm.tm_min)
print(tm.tm_sec)
print(tm.tm_year,tm.tm_hour,tm.tm_min,tm.tm_sec)

string = time.ctime(time.time())
print(string)

tm = time.localtime(time.time())
string = time.strftime("%Y년 %m월 %d일")
print(string)
string2 = time.strftime("%H시 %M분 %S초 %p")
print(string2)
string3 = time.strftime("요일 : %A")
print(string3)

print(tm.tm_wday)
week = ['월', '화', '수', '목', '금', '토', '일']
wday=week[ tm.tm_wday]
print('%s요일'%wday)

def func() :
    sum = 0
    for i in range(1, 10001) :
        sum += i
        
start = time.time()
func()
end = time.time()
print(start, end)
print(end - start)


