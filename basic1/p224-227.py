# 연습문제
'''
# E5-1 ~ 5-4
my_list = ['p','y','t','h','o','n','i','s','f','u','n','!']

print('5-1', my_list[5:11])

print('5-2', my_list[-5:-2])

print('5-3', my_list[8:])

print('5-2', my_list[:-4])
'''
# E5-5 for문, 리스트 생성 및 출력
s = 'I am a genius!'

list1 = []
for i in range(0,len(s)) :
    list1.append(s[i])
print(list1)


# E5-6 while 사용하여 작성<<<<
list2 = []
i=0
while i < len(s) :
    list2.append(s[i])
    i += 1
print(list2)   


# E5-7 ~ 5-9
numbers = [7, 9, 15, 18, 30, -3, 7, 12, -16, -12]

# E5-7 for문, 합계
sum = 0
for i in range(0, len(numbers)) :
    sum += numbers[i]
print(sum)

# E5-8 while문, 합계
sum = 0
i=0
while i <len(numbers) :
    sum += numbers[i]
    i += 1
  
print(sum) 


# E5-9 while문, 짝수번째 출력, 요소의 합
list3=[]
i=0
while i < len(numbers) :
    if i+1%2 == 0 :
        list3.append(numbers[i])
    i += 1

print('짝수 번째 요소 : %s'%(numbers))