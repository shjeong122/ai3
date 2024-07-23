'''
def func() :
    global x        # 전역변수 선언
    x = x + 500     # 지역변수 탄생
    print(x+100)    # 사용

x = 200             # 전역변수 탄생
func()
print(x)
'''
def varF() :
    x= 10
    global a
    print(x, a, '111')
    a = a + 1000
    varF2()

def varF2() :
    a = 5000
    a = a +1000
    print(a, '222')

a = 100
varF()
print(a,'333')