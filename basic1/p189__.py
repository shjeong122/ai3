# 리스트 추가하기

names = []

menu = '1'
while menu != '2' :
    menu = input('메뉴를 입력하세요(1.이름/2.끝) : ')
    if menu == '1' :
        n = input('학생 이름은? ')
        names.append(n)  
        print(names)

