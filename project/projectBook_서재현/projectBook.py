from projectBookListDef import *

bookList.start()

while True :
    menuSelect = project_book_login_def.login()
    if menuSelect == '1' :
        id = input('아이디 : ')
        fw = input('비밀번호 : ')
        if project_book_login_def.idSearch(id) == True and project_book_login_def.fwSearch(fw) == True :
            while True :
                menuSelect = project_book_input_def.menuSelectInput()
                if menuSelect == '1' :
                    project_book_input_def.bookListAppendF()
                elif menuSelect == '2' :
                    if len(bookList.listCode) == 0 :
                        print('저장된 정보가 없습니다.')
                    else :
                        bookCode = input("코드명 : ")
                        project_book_input_def.changeBookInput(bookCode)
                elif menuSelect == '3' :
                    if len(bookList.listCode) == 0 :
                        print('저장된 정보가 없습니다.')
                    else :
                        bookCode = input("코드명 : ")    
                        project_book_input_def.delete(bookCode)
                elif menuSelect == '4' :
                    if len(bookList.listCode) == 0 :
                            print('저장된 정보가 없습니다.')
                    else :
                        bookCode = input("코드명 : ")      
                        project_book_input_def.listFindSoloBook(bookCode)
                elif menuSelect == '5' :
                    if len(bookList.listCode) == 0 :
                        print("저장된 정보가 없습니다.")
                    else :
                        bookCode = input("코드명 : ")
                    project_book_input_def.listFindBook(bookCode)
                elif menuSelect == '6' :
                    if len(bookList.listCode) == 0 :
                        print("저장된 정보가 없습니다.")
                    else :
                        project_book_input_def.listSoloPrint()
                elif menuSelect == '7' :
                    try :
                        if len(bookList.listCode) == 0 :
                            print('저장된 정보가 없습니다.')
                        else:
                            project_book_input_def.listPrint()
                    except ValueError :
                        print('다시 입력해 주세요.')
                elif menuSelect == '0' :
                    print('로그아웃')
                    break
                else : 
                    print('다시 선택해주세요.')

        else :
            print('아이디와 비밀번호를 다시 입력해주세요.')  
    elif menuSelect == '2' :
        project_book_login_def.membership()
        print(bookList.listIds)
    elif menuSelect == '3' :
        project_book_login_def.findFw()
    elif menuSelect == '4' :
        project_book_login_def.fwChange()
    elif menuSelect == '5' :
        project_book_login_def.idFwDel()
    elif menuSelect == '0' :
        print('종료')
        break
    else :
        print('다시 선택해주세요.')

bookList.save()