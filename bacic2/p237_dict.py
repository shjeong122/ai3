# 딕셔너리
member = {'name':'황예린', 'age':22, 'email' : 'yerin@hanmail.net'}
print(member['name'])
print(member['age'])

members = {'name':'황예린', 'age':22, 'age':30}
print(members['age'])

score = dict([('국어',80),('영어',90),('수학',100)])  
print(score, '111')
print(score['국어'], '222')
score['국어'] = 90    # 국어 값 변경
print(score, '333')
score['음악'] = 70
print(score, '444')
x = score.pop('수학')
print(score)
score.clear()
print(score)
'''
score2 = dict([['국어',80],['영어',90],['수학',100]])
print(score2, '111')
print(score2['국어'], '222')
score2['국어'] = 90    # 국어 값 변경
print(score2, '333')
'''

# for문과 딕셔너리

score = {'국어': 80,'영어':90,'수학':100}

for key in score :
    print('%s 과목 : %s'%(key, score[key]))