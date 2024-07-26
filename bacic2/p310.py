# 문자열 위치 이동하기

def string_shift(string,d,direction) :
    if direction == " left" :
        left_part = string[d:]
        print(left_part, '111')
        right_part = string[0:d]
        print(right_part,'111')
    else :
        print(len(string)-d,'~~~')
        left_part = string[len(string)-d:]
        right_part = string[0:len(string)-d]

    result = left_part + right_part
    return result

string = 'pythonprogramming'

str_left = string_shift(string, 2, 'left')
str_right = string_shift(string, 3, 'right')

print('원래문자열 :', string)
print('좌측으로 2칸 이동 :', str_left)
print('우측으로 3칸 이동 :', str_right)