numbers = [[10,20,30,40,50,60,70,80,]]
print(numbers[0][4])
print(len(numbers)) #행의 갯수 1
print(len(numbers[0])) #열의 갯수 9
for i in range(len(numbers)) :
    for j in range(len(numbers[i])) :
        print(numbers[i][j], end= " ")

list2DD = [[1,2,3,4],[5,6,7]]
print(list2DD[1][2], end= " ")

print(len(list2DD), '111')      #행의 갯수 2
print(len(list2DD[0]), '222')   #열의 갯수 4
print(len(list2DD[1]),'333')    #열의 갯수 3

for i in range(len(list2DD)) :
    for j in range(len(list2DD[i])) :
        print(list2DD[i][j], end= " ")
        