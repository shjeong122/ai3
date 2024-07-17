'''
# 키보드로 이름을 입력 받아 보세요.
name = input('이름을 입력해 주세요.')

# 이름을 화면에 출력하기
print(' 입력한 이름은 \'%s\'입니다.'%name)

# 키보드로 점수를 입력 받아 보세요(포인트 3000점).
point = int(input('당신의 포인트 점수를 입력하세요.'))
print(' 입력한 point는 \'%d\'입니다.'%point)

# 포인트 점수의 20%는 600점 입니다.
point = int(input('당신의 포인트 점수를 입력하세요.'))    # 계산을 위해 숫자로 문자형 변환
per = point*0.2                                        # 계산
print(' 입력한 point의 20퍼센트는 \'%d\'입니다.'%per)    #출력
'''
# 입력 받은 주소 반복 출력
address = input('당신의 주소를 입력하세요.')
repeat = int(input('몇 번 반복하시겠습니까?'))
print(address*repeat)

# 출력 주소의 글자수 출력
address = input('당신의 주소를 입력하세요.')
length = len(address)
print('당신이 입력한 주소의 글자수는 %d개 입니다.'%length)
