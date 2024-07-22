# 203
'''
# 리스트 정렬
data = [12,8,15,32,-3,-20,-15,34,6]
print(data)
data.sort() 
print(data,'')

data2 = ['a', '가', '!', '2', 'ac', '다']
print(data2)
data2.sort() 
print(data2,'111')

data2.sort(reverse=True)
print(data2,'222')

data2.sort(reverse=False)
print(data2,'333')

# 205
# 문자열과 리스트
# 5-19 find() 메소드로 문자열 찾기
string1 = 'Python is fun!'
print(string1)

x = string1.find('fun')
print(x)

# 5-20. replace() 메소드로 문자열 치환하기
string2 = '사과는 맛있다. 나는 사과를 제일 좋아한다.'
print(string2)

x=string2.replace('사과', '딸기', 1)
print(x,'111')
y=string2.replace('사과', '딸기', 2)
print(y,'222')

z = string2[0].replace('사과', '딸기', -1)
string2 = [z]
print(string2, '333')

# 207
# 문자열 쪼개기
# 5-22 split()
hello = 'have a nice day'
print(hello)

list1 = hello.split(' ')
print(list1)
print(type(list1))

for i in range(0, len(list1)) :
    print('list1[%d] : %s'%(i, list[i]))

list2 = 'a, b, c, d, e, f'
a = list2.split(', ')
print(a)

list3 = ['홍길동:100:20', '이순신:90:80', '최수연:100:75']

list33 = []
for i in list3 :
    list30 = i.split(':')
    print(list30, '111')
    for j in list30 :
        list33.append(j)
        
print(list33, '222')
'''
# 나누세요
'''
list5 = ['kbs-사장-200, mbc-부장-100', 'kbs-사원-50, mbc-대리-80']
list55 = []
for i in list5 :
    list50 = i.split('-')
    print(list50, '111')
    for j in list50 :
        list51 = j.split(',')
        print(list51, '222')

        for k in list50 :
            list52 = k.split(',')
            print(list52, '333')
            for l in list51 :
                list55.append(l)
                print(list55. '444')
'''
list = []
list5 = ['kbs-사장-200,mbc-부장-100','kbs-사원-50,sbs-대리-80']
for i in list5 :
    list_5 = i.split('-')
    print(list_5)
    for j in list_5 :
        list__5 = j.split(',')
        print(list__5)
        for k in list__5 :
            list.append(k)
            print(list)