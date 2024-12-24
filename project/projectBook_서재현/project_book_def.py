class project_book_login_def:
    def login() :    
        print('1. 로그인')
        print('2. 회원가입')
        print('3. 비밀번호 찾기')
        print('4. 비밀번호 변경')
        print('5. 회원탈퇴')
        print('0. 종료하기')
        menuSelect = input('메뉴 선택 : ')
        return menuSelect
    
    def idSearch(id) :
        if id in bookList.listId :
            return True
        return False
    
    def fwSearch(fw) :
        if fw in bookList.listFw:
            return True
        return False
    
    def membership() :        
        id = input('ID : ')
        fw = input('FW : ')
        if project_book_login_def.idSearch(id) == False : 
            bookList.listId.append(id)
            bookList.listFw.append(fw)
            print('회원가입 완료')
        else :
            print('회원정보가 있습니다.')

    def findFw() :
        id = input("아이디 입력 : ")
        if project_book_login_def.idSearch(id) == True :
            i = bookList.listId.index(id)
            print("비밀번호는 %s"%bookList.listFw[i])

    def fwChange() :
        id = input('아이디 : ')
        fw = input('비밀번호 : ')
        if project_book_login_def.idSearch(id) == True and project_book_login_def.fwSearch(fw):
            i = bookList.listId.index(id)
            bookList.listFw[i] = input('변경할 FW : ')
            print("변경완료")
        else :
            print('정보가 없습니다.')

    def idFwDel() :
        id = input('아이디 : ')
        fw = input('비밀번호 : ')
        if project_book_login_def.idSearch(id) == True and project_book_login_def.fwSearch(fw) == True :
            i = bookList.listId.index(id)
            bookList.listId.remove(bookList.listId[i])
            bookList.listFw.remove(bookList.listFw[i])
            print('삭제완료')
            
class project_book_input_def:
    def line() :
        print('-'*50)

    def menuSelectInput() :
        print('1. 입력하기')
        print('2. 수정하기')
        print('3. 삭제하기')
        print('4. 서적 정보 찾기')
        print('5. 서적 별 판매 현황')
        print('6. 전체 판매 현황 보기')
        print('0. 로그아웃')
        menuSelect = input('(1/2/3/4/5/6/0) :')
        return menuSelect
    
    def place_buy(w):
        if w == "서점":
            dis_rate = 10
        elif w == "인터넷":
            dis_rate = 15
        else:
            dis_rate = 0  
        return dis_rate

    def cash_card(y):
        if y == "현금":
            dis_rate2 = 10
        elif y == "카드":
            dis_rate2 = 5
        else:
            dis_rate2 = 0  
        return dis_rate2

    def salePirce(dis_rate,price) :
        dec = (100 - dis_rate) / 100
        money = price * dec
        return money

    
    def bookInput() :
            name = input('도서명 >')
            price = (input('정가 >'))
            quantity = (input('주문수량 > '))
            buy = (input('판매처(1. 서점, 2. 인터넷) >'))
            method = (input('구입방법(1. 현금, 2. 인터넷) >'))
            bookList = [name, int(price), int(quantity), int(buy), int(method)]
            return bookList

    def buy12(buy) :
        if buy == 1 :
            return '서점'
        elif buy == 2 :
            return'인터넷'
        else :
            print('판매처를 다시 입력해 주세요.')
            return -1

    def method12(method) :
        if method == 1 :
            return '현금'
        elif method == 2 :
            return '인터넷'
        else :
            print('구입방법을 다시 입력해 주세요.')
            return -1
    def bookListAppendF() :
        bookInput_1 = project_book_input_def.bookInput()
        name = bookInput_1[0]
        price = bookInput_1[1]
        quantity = bookInput_1[2]
        buy = bookInput_1[3]
        method = bookInput_1[4]
        buy = project_book_input_def.buy12(buy)
        method = project_book_input_def.method12(method)
        if name in bookList.listName and price in bookList.listPrice :
            i = bookList.listName.index(name)
            if bookList.listBuy[i] == buy and bookList.listMethod[i] == method:
               bookList.listQuantity[i] = bookList.listQuantity[i]+ quantity
        else :
            if buy == -1 or method == -1 :
                print('입력 실패')
            else :
                project_book_input_def.bookListAppend(name,price,quantity,buy,method)
                print('입력 완료')




    def bookListAppend(name,price,quantity,buy,method) :
        bookList.listName.append(name)
        bookList.listPrice.append(price)
        bookList.listQuantity.append(quantity)
        bookList.listBuy.append(buy)
        bookList.listMethod.append(method)
        discount = project_book_input_def.place_buy(buy) + project_book_input_def.cash_card(method)
        bookList.listDiscount.append(discount)
        bookList.listSalePrice.append(project_book_input_def.salePirce(discount,price))

    def bookListModify(name,price,quantity,buy,method,i) :
            bookList.listName[i] = name
            bookList.listPrice[i] = price
            bookList.listQuantity[i] = quantity
            bookList.listBuy[i] = buy
            bookList.listMethod[i] = method
            bookList.listDiscount[i] = project_book_input_def.place_buy(buy) + project_book_input_def.cash_card(method)
            bookList.listSalePrice[i] = project_book_input_def.salePirce(bookList.listDiscount[i],price)

    def delete(i) :
                bookList.listName.pop(i)
                bookList.listPrice.pop(i)
                bookList.listQuantity.pop(i)
                bookList.listBuy.pop(i)
                bookList.listMethod.pop(i)
                bookList.listDiscount.pop(i)
                bookList.listSalePrice.pop(i)
                print('삭제 완료')

    def changeBookInput(i):
        bookInput_1 = project_book_input_def.bookInput()
        name = bookInput_1[0]
        price = bookInput_1[1]
        quantity = bookInput_1[2]
        buy = bookInput_1[3]
        method = bookInput_1[4]
        buy = project_book_input_def.buy12(buy)
        method = project_book_input_def.method12(method)
        if buy == -1 or method == -1 :
            print('입력 실패')
        else :
            project_book_input_def.bookListModify(name,price,quantity,buy,method,i)
            print('수정 완료')

    def listFindBook(name) :
        i = bookList.listName.index(name)
        print('찾기 성공')
        project_book_input_def.line()
        print('도서명 정가 할인율 주문수량 판매금액 판매처 구입방법')
        project_book_input_def.line()
        print('%s %d원 %d%% %d개 %.0f원 %s %s'%(bookList.listName[i],bookList.listPrice[i],bookList.listDiscount[i],bookList.listQuantity[i],bookList.listSalePrice[i],bookList.listBuy[i],bookList.listMethod[i])) 
        project_book_input_def.line()

    def listFindSoloBook(name) :
        i = bookList.listName.index(name)
        print('찾기 성공')
        buy = int(input("원하는 판매처(1. 서점, 2. 인터넷) >"))
        method = int(input("원하는 구입방법(1. 현금, 2. 인터넷) >)"))
        buy = project_book_input_def.buy12(buy)
        method = project_book_input_def.method12(method)
        discount = project_book_input_def.place_buy(buy) + project_book_input_def.cash_card(method)
        money = project_book_input_def.salePirce(discount,bookList.listPrice[i])
        project_book_input_def.line()
        print('도서명 정가 판매금액')
        project_book_input_def.line()
        print('%s %d원%d원'%(bookList.listName[i],bookList.listPrice[i],money))
        project_book_input_def.line()
            
    def listPrint() :
        project_book_input_def.line()
        print('도서명 정가 할인율 주문수량 판매금액 판매처 구입방법')
        for i in range(0,len(bookList.listName)) :
            project_book_input_def.line()
            print('%s %d원 %d%% %d개 %.0f원 %s %s'%(bookList.listName[i],bookList.listPrice[i],bookList.listDiscount[i],bookList.listQuantity[i],bookList.listSalePrice[i],bookList.listBuy[i],bookList.listMethod[i])) 
        project_book_input_def.line()

class bookList:
    listName = list()
    listPrice = list()
    listQuantity = list()
    listBuy = list()
    listMethod = list()
    listDiscount = list()
    listSalePrice = list()
    listId = ['admin']
    listFw = ['1234']