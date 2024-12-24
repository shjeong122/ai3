import random
import string

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
        if id in bookList.listIds :
            return True
        return False    
    def fwSearch(fw) :
        if fw in bookList.listFws:
            return True
        return False    
    def membership() :        
        id = input('ID : ')
        fw = input('FW : ')
        if project_book_login_def.idSearch(id) == False : 
            if id == '' :
                print("입력해주세요.")
            else :
                bookList.listIds.append(id)
                bookList.listFws.append(fw)
                print('회원가입 완료')
        else :
            print('회원정보가 있습니다.')
    def findFw() :
        id = input("아이디 입력 : ")
        if project_book_login_def.idSearch(id) == True :
            i = bookList.listIds.index(id)
            print("비밀번호는 %s"%bookList.listFws[i])
        else:
            print('정보가 없습니다.')
    def fwChange() :
        id = input('아이디 : ')
        fw = input('비밀번호 : ')
        if project_book_login_def.idSearch(id) == True and project_book_login_def.fwSearch(fw):
            i = bookList.listIds.index(id)
            bookList.listFws[i] = input('변경할 FW : ')
            print("변경완료")
        else :
            print('정보가 없습니다.')
    def idFwDel() :
        id = input('아이디 : ')
        fw = input('비밀번호 : ')
        if project_book_login_def.idSearch(id) == True and project_book_login_def.fwSearch(fw) == True :
            i = bookList.listIds.index(id)
            bookList.listIds.remove(bookList.listIds[i])
            bookList.listFws.remove(bookList.listFws[i])
            print('삭제완료')
        else :
            print('정보가 없습니다.')           
class project_book_input_def:
    def line() :
        print('-'*130)
    def menuSelectInput() :
        print('1. 입력하기')
        print('2. 수정하기')
        print('3. 삭제하기')
        print('4. 구입방법에 의한 할인가격 검색')
        print('5. 서적 별 판매 현황')
        print('6. 서적 정보 보기')
        print('7. 전체 판매 현황 보기')
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
            return '카드'
        else :
            print('구입방법을 다시 입력해 주세요.')
            return -1       
    def bookInput() :
            name = input('도서명 >')
            price = (input('정가 >'))
            quantity = (input('주문수량 > '))
            buy = (input('판매처(1. 서점, 2. 인터넷) >'))
            method = (input('구입방법(1. 현금, 2. 카드) >'))
            bookList = [name, int(price), int(quantity), int(buy), int(method)]
            return bookList     
    def bookListAppendF() :
        bookInput_1 = project_book_input_def.bookInput()
        name = bookInput_1[0]
        price = bookInput_1[1]
        quantity = bookInput_1[2]
        buy = bookInput_1[3]
        method = bookInput_1[4]
        buy = project_book_input_def.buy12(buy)
        method = project_book_input_def.method12(method)
        if name in bookList.listNames and price in bookList.listPrices :
            if bookList.listNames.count(name) > 1 :
                bookCode = input("중복된 도서가 있습니다. 코드를 입력해주세요.")
                i = bookList.listCode.index(bookCode);
                bookList.listQuantitys[i] = bookList.listQuantitys[i] + quantity
        else :
            if buy == -1 or method == -1 :
                print('입력 실패')
            else :
                project_book_input_def.bookListAppend(name,price,quantity,buy,method)
                print('입력 완료')
    def bookListAppend(name,price,quantity,buy,method) :
        bookList.listNames.append(name)
        bookList.listPrices.append(price)
        bookList.listQuantitys.append(quantity)
        bookList.listBuys.append(buy)
        bookList.listMethods.append(method)
        discount = project_book_input_def.place_buy(buy) + project_book_input_def.cash_card(method)
        bookList.listDiscounts.append(discount)
        bookList.listSalePrices.append(project_book_input_def.salePirce(discount,price))
        cnt=0
        letter_set = string.ascii_letters
        try :
            while True :
                random_list = random.randint(1,500)
                random_listA = random.sample(letter_set,2)
                i = "".join(random_listA) + str(random_list)
                if i == bookList.listCode[cnt]:
                    continue
                else:
                    break
        except IndexError:
            random_list = random.randint(1,500)
            random_listA = random.sample(letter_set,2)
            i = "".join(random_listA) + str(random_list)
        bookList.listCode.append(str(i))
    def bookListModify(name,price,quantity,buy,method,i) :
        bookList.listNames[i] = name
        bookList.listPrices[i] = price
        bookList.listQuantitys[i] = quantity
        bookList.listBuys[i] = buy
        bookList.listMethods[i] = method
        bookList.listDiscounts[i] = project_book_input_def.place_buy(buy) + project_book_input_def.cash_card(method)
        bookList.listSalePrices[i] = project_book_input_def.salePirce(bookList.listDiscounts[i],price)
    def delete(bookCode) :
        try :
            i = bookList.listCode.index(bookCode)      
            bookList.listNames.pop(i)
            bookList.listPrices.pop(i)
            bookList.listQuantitys.pop(i)
            bookList.listBuys.pop(i)
            bookList.listMethods.pop(i)
            bookList.listDiscounts.pop(i)
            bookList.listSalePrices.pop(i)
            bookList.listCode.pop(i)
            print('삭제 완료')
        except (TypeError, ValueError) :
            print("존재하지 않는 코드")
    def changeBookInput(bookCode):
        try :
            if bookCode in bookList.listCode :
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
                    i = bookList.listCode.index(bookCode)
                    project_book_input_def.bookListModify(name,price,quantity,buy,method,i)
                    print('수정 완료')
            else:
                print("존재하지 않는 코드")
        except (TypeError, ValueError) :
            print("존재하지 않는 코드")
    def listFindBook(bookCode) :
        try :
            if bookCode in bookList.listCode :
                i = bookList.listCode.index(bookCode)
                project_book_input_def.line()
                print('『Code』\t『도서명』\t『정가』\t『할인율』\t『주문수량』\t『판매금액』\t『판매처』\t『구입방법』')
                project_book_input_def.line()
                print('『%s』\t『%s』\t『%d원』\t『%d%%』\t\t『%d개』\t\t『%.0f원』\t『%s』\t『%s』'%(bookList.listCode[i],bookList.listNames[i],bookList.listPrices[i],bookList.listDiscounts[i],bookList.listQuantitys[i],bookList.listSalePrices[i],bookList.listBuys[i],bookList.listMethods[i])) 
                project_book_input_def.line()            
            else:
                print("존재하지 않는 코드")
        except (TypeError, ValueError) :
            print("존재하지 않는 코드")
    def listFindSoloBook(bookCode) :
        try :
            if bookCode in bookList.listCode :
                i = bookList.listCode.index(bookCode)
                buy = int(input("원하는 판매처(1. 서점, 2. 인터넷) >"))
                method = int(input("원하는 구입방법(1. 현금, 2. 카드) >)"))
                buy = project_book_input_def.buy12(buy)
                method = project_book_input_def.method12(method)
                discount = project_book_input_def.place_buy(buy) + project_book_input_def.cash_card(method)
                money = project_book_input_def.salePirce(discount,bookList.listPrices[i])
                project_book_input_def.line()
                print('『Code』『도서명』\t『정가』\t『』판매금액』')
                project_book_input_def.line()
                print('『%s』『%s』\t『%d원』\t『%d원』'%(bookList.listCode[i],bookList.listNames[i],int(bookList.listPrices[i]),int(money)))
                project_book_input_def.line()
            else:
                print("존재하지 않는 코드")
        except (TypeError, ValueError) :
            print("존재하지 않는 코드")
    def listSoloPrint() :
        project_book_input_def.line()
        print('『Code』\t『도서명』\t『정가』')
        for i in range(len(bookList.listCode)) :
            project_book_input_def.line()
            print('『%s』\t『%s』\t『%d원』'%(bookList.listCode[i],bookList.listNames[i],bookList.listPrices[i])) 
        project_book_input_def.line()
    def listPrint() :
        project_book_input_def.line()
        print('『Code』\t『도서명』\t『정가』\t『할인율』\t『주문수량』\t『판매금액』\t『판매처』\t『구입방법』')
        for i in range(len(bookList.listCode)) :
            project_book_input_def.line()
            print('『%s』\t『%s』\t『%d원』\t『%d%%』  \t『%d개』  \t『%.0f원』\t『%s』\t『%s』'%(bookList.listCode[i],bookList.listNames[i],bookList.listPrices[i],bookList.listDiscounts[i],bookList.listQuantitys[i],bookList.listSalePrices[i],bookList.listBuys[i],bookList.listMethods[i])) 
        project_book_input_def.line()
class bookList:
    listNames = []
    listPrices = []
    listQuantitys = []
    listBuys = []
    listMethods = []
    listDiscounts = []
    listSalePrices = []
    listIds = []
    listFws = []
    listCode = []
    listRandomCode = ['A','B','C','D','E','F','G','a','b','c','d','e','f','g']
    def start():

        listName = open("listName.txt",'r',encoding='utf-8')
        n = listName.readlines()
        for name in n :
            bookList.listNames.append(name.rstrip("\n"))

        listPrice = open("listPrice.txt",'r',encoding='utf-8')
        p = listPrice.readlines()
        for price in p :
            bookList.listPrices.append(int(price.strip("\n")))

        listQuantity = open("listQuantity.txt",'r',encoding='utf-8')
        q = listQuantity.readlines()
        for quantity in q :
            bookList.listQuantitys.append(int(quantity.strip("\n")))

        listBuy = open("listBuy.txt",'r',encoding='utf-8')
        b = listBuy.readlines()
        for buy in b :
            bookList.listBuys.append(buy.strip("\n"))

        listMethod = open("listMethod.txt",'r',encoding='utf-8')
        m = listMethod.readlines()
        for method in m :
            method.strip("\n")
            bookList.listMethods.append(method.strip("\n"))

        listDiscount = open("listDiscount.txt",'r',encoding='utf-8')
        d = listDiscount.readlines()
        for discount in d :
            bookList.listDiscounts.append(int(discount.strip("\n")))

        listSalePrice = open("listSalePrice.txt",'r',encoding='utf-8')
        s = listSalePrice.readlines()
        for salePrice in s :
            bookList.listSalePrices.append(float(salePrice.strip("\n")))

        listId = open("listId.txt",'r',encoding='utf-8')
        i = listId.readlines()
        for id in i :
            bookList.listIds.append(id.strip("\n"))

        listFw = open("listFw.txt",'r',encoding='utf-8')
        f = listFw.readlines()
        for fw in f :
            bookList.listFws.append(fw.strip("\n"))

        listCode = open("listCode.txt",'r',encoding='utf-8')
        c = listCode.readlines()
        for code in c :
            bookList.listCode.append(code.strip("\n"))
        
        listName.close()
        listPrice.close()
        listQuantity.close()
        listBuy.close()
        listMethod.close()
        listDiscount.close()
        listSalePrice.close()
        listFw.close()
        listId.close()
        listCode.close()
    def save() :
        listName = open("listName.txt",'w',encoding='utf-8')
        for name in bookList.listNames :
            listName.write(str(name)+"\n")

        listPrice = open("listPrice.txt",'w',encoding='utf-8')
        for price in bookList.listPrices :
            listPrice.write(str(price)+"\n")

        listQuantity = open("listQuantity.txt",'w',encoding='utf-8')
        for quantity in bookList.listQuantitys :
            listQuantity.write(str(quantity)+"\n")

        listBuy = open("listBuy.txt",'w',encoding='utf-8')
        for buy in bookList.listBuys :
            listBuy.write(str(buy)+"\n")

        listMethod = open("listMethod.txt",'w',encoding='utf-8')
        for method in bookList.listMethods :
            listMethod.write(str(method)+"\n")

        listDiscount = open("listDiscount.txt",'w',encoding='utf-8')
        for discount in bookList.listDiscounts :
            listDiscount.write(str(discount)+"\n")

        listSalePrice = open("listSalePrice.txt",'w',encoding='utf-8')
        for salePrice in bookList.listSalePrices :
            listSalePrice.write(str(salePrice)+"\n")

        listId = open("listId.txt",'w',encoding='utf-8')
        for id in bookList.listIds :
            listId.write(str(id)+"\n")
            
        listFw = open("listFw.txt",'w',encoding='utf-8')
        for fw in bookList.listFws :
            listFw.write(str(fw)+"\n")

        listCode = open("listcode.txt",'w',encoding='utf-8')
        for code in bookList.listCode :
            listCode.write(str(code)+"\n")

        listName.close()
        listPrice.close()
        listQuantity.close()
        listBuy.close()
        listMethod.close()
        listDiscount.close()
        listSalePrice.close()
        listFw.close()
        listId.close()
        listCode.close()
