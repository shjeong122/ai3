import csv
'''
file_name1 = "weather.csv"
file_name2 = "weather2.csv"
f1 = open(file_name1, "r", encoding="utf-8")
f2 = open(file_name2, "w", encoding="utf-8", newline="")

lines = csv.reader(f1)
where = input("지역 : ")
when = input("날짜 : ")
avgTmp = input("평균 기온 : ")
maxTmp = input("최고 기온 : ")
minTmp = input("최저 기온 : ")

lines2 = [[where, when, avgTmp, maxTmp, minTmp]]
wr = csv.writer(f2)

header = next(lines)

cnt = 5
for i in range(cnt):
    line = next(lines)
    wr.writerow(line)

for line2 in lines2 :
    wr.writerow(line2)    

    print("파일쓰기 종료!")

f1.close
f2.close
'''
file_name1 = "weather.csv"
file_name2 = "weather2.csv"

f1 = open(file_name1, "r", encoding="utf-8")
f2 = open(file_name2, "w", encoding="utf-8", newline="")

lines = csv.reader(f1)
wr = csv.writer(f2)

header = next(lines)

for i in lines:
    line = next(lines)
   csv.writerow(i)

where = input("지역 : ")
when = input("날짜 : ")
avgTmp = input("평균 기온 : ")
maxTmp = input("최고 기온 : ")
minTmp = input("최저 기온 : ")

lines2 = [[where, when, avgTmp, maxTmp, minTmp]]

f = open("weather3.csv", "a", encoding = "utf-8")

wr = csv.writer(f)
wr.writerow(lines2)
f.close()