f = open("new_file2.txt", "w", encoding="UTF-8")
names = ["홍지수", "안지영", "김연수", "김예린", "한정연", "홍길동"]

for name in names :
    f.write(name +"\n")
print("파일쓰기")
f.close()

f = open("new_file2.txt", "r", encoding="UTF-8")
readList=f.readlines()
print("파일쓰기", readList)

readList = f.readline()
print(readList, '111')
readList = f.readline()
print(readList, '222')

readList = f.readline()
print(readList, '333')

readList = f.readline()
print(readList, '444')

readList = f.readline()
print(readList, '555')

readList = f.readline()
print(readList, '666')

readList = f.readline()
print(readList, '777')

readList = f.readline()
print(readList, '888')

# 기존 파일에 새로운 자료 넣기
f = open("new_file2.txt", "a", encoding="UTF-8")
fruits = ["사과", "배", "바나나"]
for fruit in fruits :
    f.write(fruit + "\n")
print("추가", fruits)

