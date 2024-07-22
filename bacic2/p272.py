# 함수 값의 반환
'''
# 7-10 
def func(n) :
    x = n + 5
    return x
a = func(10)
print(a)


def inchToCm(inch) :
    cm = inch * 2.54
    return cm
print(inchToCm(10))

def inchToCm(inch) :
    cm = []
    for i in range(inch,31,10) :
        k = i * 2.54
        cm.append(k)
    return cm
print(inchToCm(10))

def p(m) :
    answer = 1
    for j in range(m, 0, -1) :
        answer *= j
    return answer
print(p(5))    #120=5*4*3*1

def o(m) :
    answer = 0
    for l in range(m, 0, -1) :
        answer += l
    return answer
print(o(5))  # 5~1 더하기

def d(m) :
    len(m)
print(d(5))  #길이

print(p(5), o(5), d(m))
'''

## 세 가지 함수 합치기

def p(m) :
   
    result = []
    answer = 1
    for i in range(m, 0, -1) :
        answer *= i
    result.append(answer)
    answer = 0
    for i in range(1, m+1) :
        answer += i
    result.append(answer)   
    answer = 0
    for i in range(1,m+1) :
        answer =+ 1
    result.append(answer)
    return result
print(p(5))
'''
def p(x) :
    a = 1
    b = 0
    cnt=0
    for i in range (x,0,-1) :
        a = a * i
        b += i
        cnt+=1
    list1 = [a,b,cnt]
    return list1

    dd
    

print(p(5))
'''      