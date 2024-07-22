# 리스트 추가
# 성적관리프로그램
# 1. 학생 이름 입력 (이름? )
# 2. 성적 입력 (누구의 성적 입력?, 국어, 영어, 수학)
# 3. 통계자료 보기 (반 전체 통계, 학생 통계)
# 4. 학생 자료 삭제 (삭제하려는 학생 이름?)
# 5. 프로그램 종료하기

names = []
kor = []
eng = []
math = []

menu = '1'
while menu != '5' :
    print('='*30)
    print('성적 관리 프로그램')
    print('='*30)
    print('1. 학생 이름 삽입하기')
    print('2. 성적 입력하기')
    print('3. 통계자료 보기')
    print('4. 학생 자료 삭제하기')
    print('5. 프로그램 종료하기 ')
    menu = input(' ==> 메뉴를 선택하세요(1/2/3/4/5) : ')
    if menu == '1' :
        # 학생 이름 삽입하기 <<
        name=input('학생 이름은? ')
        names.append(name)
        print(names)  # 지워

    elif menu == '2' :
        # 성적 입력하기 <<
        try :
            k = int(input('국어 점수 : '))
            e = int(input('영어 점수 : '))
            m = int(input('수학 점수 : '))
            kor.append(k)
            eng.append(e)
            math.append(m)
            print(kor, eng, math)  # 지워1
        except IndexError :
            print('점수는 숫자로 입력해주세요.')

    elif menu == '3' :
        # 통계자료 보기 <<
        print('1) 반 성적 검색')
        print('2) 개인 점수 검색')
        stMenu = input('번호를 선택하세요(1/2) : ')
        if stMenu == '1' :
            # 반 성적 검색
            print('-'*30)
            print('이름 국어 영어 수학')
            print('-'*30)
            
            for i in range(len(names)) :
                print(names[i], kor[i], eng[i], math[i])
                
        elif stMenu == '2' :
            # 개인 점수 검색
            sName = input('점수를 알고 싶은 학생 이름 : ')
            try :
                sIndex = names.index(sName)
                print("이름 : %s   국어 : %d   영어 : %d  수학 : %d"%(names[sIndex], kor[sIndex], eng[sIndex], math[sIndex]))
            except ValueError :
                print('%s 우리반 학생이 아닙니다.'%sName)

    elif menu == '4' :
        # 학생 자료 삭제하기 <<
        delName = input('삭제하려는 학생의 이름 : ')
        try :
            sIndex = names.index(delName)
            print(sIndex,"88888888")
            names.pop(sIndex)
            kor.pop(sIndex)
            eng.pop(sIndex)
            math.pop(sIndex)
            
        except ValueError :
            print('%s 우리반 학생이 아닙니다.'%delName)




'''검색 프로그램
elif stMenu == '2' :
    # 개인 점수 검색
    sName = input('점수를 알고 싶은 학생 이름 : ')
            
     student = -999
            for j in range( len(names) ) :
                if sName == names[j] : 
                    student = j
                    break
            if student == -999 :
                print('%s는 우리반 학생이 아닙니다.'%sName)
            else :
                print("이름 : %s   국어 : %d   영어 : %d  수학 : %d"%(names[j], kor[j], eng[j], math[j]))
'''        

