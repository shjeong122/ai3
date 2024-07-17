# 퀴즈 Q2-7
phone1 = "010"
phone2 = "1234"
phone3 = "5678"
print(phone1, phone2, phone3, sep="-")

kor=input("국어 성적을 입력하세요: ")  #85
eng=input("영어 성적을 입력하세요: ")  #87
math=input("수학 성적을 입력하세요: ") #99
sum=int(kor)+int(eng)+int(math)
avg=sum/3
print("합계: %d, 평균: %.2f"%(sum, avg))
8