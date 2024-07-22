# 코딩연습
'''
# C6-2 딕셔너리, 성적 합계 평균
scores = {'김채린':85, '박수정':98, '함소희':94, '안예린':90, '안수진':93}
sum = 0
avg = 0
for key in scores :
    sum = sum + scores[key]
    print('%s : %d'%(key, scores[key]))
avg = sum/len(scores)
print('합계 : %d, 평균 : %.2f'%(sum, avg))


# C6-3 딕셔너리 정보 접근 제어
# 아이디를 입력하세요 : admin, admin
# 비밀번호를 입력하세요 : 12345, 36637
# 정보에 접근 권한이 있습니다!, 정보에 접근 권한이 없습니다!

admin_info = {'id': 'admin', 'pw':'12345'}

while True :
    input_id = input('아이디를 입력하세요 :')
    input_pw = input('비밀번호를 입력하세요 :') 
    if input_id == 'admin' and input_pw == '12345' :
        print('정보에 접근 권한이 있습니다!')
        break
    else :
        print('정보에 접근 권한이 없습니다!')
'''

# 딕셔너리로 영어 단어 퀴즈 프로그램
words = {'꽃': 'flower', '나비' : 'butterfly', '학교':'school', '자동차' : 'car', '비행기' : 'airplane'}

print('<영어 단어 맞추는 퀴즈>')

for i in range(1,6) :
    for kor in words :
        q = input('%s에 해당되는 영어 단어를 입력해주세요 : '%kor)
        if q == words[kor] :
            print('정답입니다!')
        else :
            print('틀렸습니다!')

            
