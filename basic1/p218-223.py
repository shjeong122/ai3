# 코딩연습
# C5-5 리스트로 영어 스펠링 퀴즈 만들기
'''
listQ = ['s_hool', 'compu_er', 'deco_ation', 'windo_', 'hi_tory']
listA = ['c', 't', 'r', 'w', 's']

for i in range(0, len(listQ)) :
    que = input('%s : 밑 줄에 들어갈 알파벳은? '%listQ[i])
    print(que)
    if que == listA[i] :
        print('정답!')
    else :
        print('틀렸어요!')



# C5-6 리스트로 성적 합계와 평균
# 성적을 입력하세요(종료시 -1 입력) :
# 합계 : %3d , 평균 : %4.2f

scores = []

while True :
    x = int(input("성적을 입력하세요(종료시 -1 입력): "))
    if x == -1 :
        break
    else : 
        scores.append(x)
sum = 0
for score in scores :
    sum += score

avg = sum/len(scores)
print('합계 : %3d , 평균 : %4.2f'%(sum, avg))
'''
# C5-7 리스트로 수/우/미/양/가 개수 카운트
#20명 학생의 성적 등급의 개수 카운트

s=[64,89,100,85,77,58,79,67,96,87,87,36,82,98,84,76,63,69,53,22]

soo = 0
woo = 0
mi = 0
yang = 0
ga = 0

i = 0
while i < len(s) :
    if 90 <= s[i] <= 100 :
        soo += 1
    elif 80 <= s[i] <= 89 :
        woo += 1
    elif 70 <= s[i] <= 79 :
        mi += 1
    elif 60 <= s[i] <= 69 :
        yang += 1
    elif 0 <= s[i] <= 59 :
        ga += 1        
    i += 1

print('수 : %d명'%soo)
print('우 : %d명'%woo)
print('미 : %d명'%mi)
print('양 : %d명'%yang)
print('가 : %d명'%ga)

# C5-8 리스트로 영화관 예약 가능 좌석 표시
# 예약 가능 □, 예약 불가 ■

seats = [[0,0,0,0,0,0,0,0,0,0],\
        [0,0,0,0,0,0,0,0,0,0],\
        [0,0,0,0,0,0,0,0,0,0],\
        [1,1,1,0,0,0,0,0,1,0],\
        [0,0,0,0,0,1,0,0,0,0],\
        [0,1,0,0,0,1,0,1,0,0],\
        [0,0,0,0,0,0,1,0,0,0],\
        [1,0,1,0,0,0,0,0,0,1]]

for i in range(len(seats)) :
    for j in range(len(seats[i])) :
        if seats[i][j] == 0 :
            print('%3s'%'□', end = "")
        else :
            print('%3s'%'■', end = "")
    print()
    

