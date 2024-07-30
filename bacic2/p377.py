import csv
'''
f = open("weather.csv", "r", encoding="utf-8")
lines = csv.reader(f)

weatherList = []
for line in lines :
    print(line)
    weatherList.append(line)

f.close()
print(weatherList)


f = open("weather.csv", "r", encoding="utf-8")
lines = csv.reader(f)

header = next(lines) # 헤더부분(열제목) 추출해서 header에 저장

searchDay = input("온도 알고 싶은 날짜를 입력하세요 : ")
for line in lines :
    if line[1] == searchDay :
        day = line[1]
        min_tmp = line[4]
print("%s 최고기온 %s도"%(day, min_tmp))
'''


""" file_name = "weather1.csv"
f=open(file_name, "r", encoding="utf-8") """

file_name = "waether.csv"
file_name = "waether2.csv"
f1 = open("weather.csv", "a", encoding="utf-8")

lines = ["서울""," "2024-7-29""," "24""," "34""," "21"]

for line in lines :
    f1.write("\n")
    f1.write(line)


print("파일쓰기 종료")
f1.close()


