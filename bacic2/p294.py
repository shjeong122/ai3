# 파이썬의 내장 함수
n = '10'
n2 = 20
n3 = int(n) + n2
n4 = n + str(n2)
print(n3)     # int의 덧셈 : 30
print(n4)     # str의 덧셈 : 1020
print(type(n2))   # 데이터형 : <class 'int'>

print(ord('A'))  # 아스키코드 : 65 (a=97)

print(str(42))   # 42
print(bin(42))   # 2진수 : 0b101010
print(oct(42))   # 8진수 : 0o52
print(hex(42))   # 16진수 : 0x2a
print(str(0b101010))   # 42
print(bin(0b101010))   # 2진수 : 0b101010
print(oct(0b101010))   # 8진수 : 0o52
print(hex(0b101010))   # 16진수 : 0x2a


print(round(12.578))   # 반올림 : 13

listM = [97, 65, 33, 49]
print(max(listM))  # 숫자의 최대값 : 97
print(min(listM))  # 숫자의 최소값 : 33
listN = ['a', 'A', '!', '1']
print(max(listN))  # 문자의 최대값(유니코드) : a = 97  
print(min(listN))  # 문자의 최소값(유니코드) : ! = 33

tupleN = (1,2,3,4,5)      # tuple 선언1 : tuple은 ()로 묶어 표시한다.
tupleN2 = tuple(range(10))  # tuple 선언2
print(tuple)               # <class 'tuple'>
print(max(tupleN))         # 최대값 : 5
print(min(tupleN))         # 최소값 : 1
print(max(tupleN2))        # 최대값 : 9
print(min(tupleN2))        # 최소값 : 0

# 내장 함수명은 사용자정의 함수명으로 사용하면 안된다
def is_prime(n) :
    prime = True
    if n>1 :
        for i in range(2, n) :
            if n%1 == 0 :
                prime = False
                break
    return prime

print(bin(8))
print(str(0b1000))

print(bin(12))
print(str(0b1100))
#비지니스로직 부분(실제 코드 수행시키는 곳)
number = int(input('수를 입력하세요'))
if is_prime(number) :
    print('소수이다')
else : 
    print('소수 아니다')

