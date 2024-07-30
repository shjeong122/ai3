# 팀플
# 입력
# 처리 : 할인율, 판매금액
# ver2.0 메뉴 만들어서 작성하기
def menuL() :
    print('0. 로그인하기')
    print('1. 입력하기')
    print('2. 수정하기')
    print('3. 삭제하기')
    print('4. 전체판매 현황보기')
    print('5. 종료하기')
    menu = input('메뉴를 선택하세요==> ')
    return menu  

def calc() :
    if where == '서점' and paywith == '카드' :
        percent = 15
    # 서점 + 현금 할인율 10% +10
    elif where == '서점' and paywith == '현금' :
        percent = 20
    # 인터넷 + 카드 15 + 5
    elif where == '인터넷' and paywith == '카드' :
        percent = 15
    # 인터넷 + 현금 15 + 10
    elif where == '인터넷' and paywith == '현금' :
        percent = 25
    return percent

def index() :
    try :
        indexRe = nameL.index(inputRe)
        return indexRe
            
    except ValueError :
        print('도서명을 다시 입력하세요.')

def listUp() :
    for i in range(len(list1)) :
        for j in range(len(list1[i])) :
            print(list1[i][j], end="  ") 
        print() 
    
nameL = []

list1=[]
indexRe = 0

print("로그아웃 상태입니다.")
menu = '1'
while menu != '5' :
    menu = menuL()
    # 0 : 로그인
    if menu == '0' :
        id = input('아이디 : ')     #admin
        pw = input('비밀번호 : ')    #1234
        if id == 'admin' and pw == '1234' :
            print('-'*30)
            print('로그인 되었습니다.')
            print('-'*30)

            while menu != '5' :

                menu = menuL()
                # 1 : 입력 
                if menu == '1' :   
                    print('-'*30)
                    print('도서 정보를 입력하세요')
                    print('-'*30)
                    name = input('도서명 : ')
                    price = int(input('정가 : '))
                    howMany = input('주문수량 : ')
                    where = input('판매처 : ')
                    paywith = input('구입방법 : ')

                    percent = calc()                
                    sellPrice = price*(100-percent)/100

                    nameL.append(name)
     
                    list1.append([name,price,percent,howMany,sellPrice,where,paywith])

                    print('도서명 정가 할인율 주문수량 판매금액 판매처 구입방법  ')
                    listUp()
                    
                if menu == '2' :
                    print('-'*30)
                    inputRe=input('수정할 도서명을 입력하세요 : ')
                    print('-'*30)
                      #indexRe
                    menu2 = '1' 
                    while menu2 != '6':
                        menu2 = input('수정할 항목을 입력하세요(2.정가, 6.나가기) : ')   #1.도서명, 2. 정가, 3.주문수량, 4. 판매처, 5. 구입방법
                        
                        if menu2== '2' :
                            indexRe = int(index())
                            
                            priceRe=int(input('수정할 정가를 입력하세요 : '))
                           
                            percent = calc()                
                            sellPrice = priceRe*(100-percent)/100

                            list1[indexRe][1] = priceRe
                            list1[indexRe][4] = sellPrice

                            print('도서명 정가 할인율 주문수량 판매금액 판매처 구입방법  ')
                            listUp()

                elif menu == '3' :
                    print('-'*30)
                    inputRe=input('삭제할 도서명을 입력하세요 : ')
                    print('-'*30)
                      #indexRe            
                    indexRe = int(index())
                    list1.pop(indexRe)
                    print('도서명 정가 할인율 주문수량 판매금액 판매처 구입방법  ')
                    listUp()
                    
                elif menu == "4" :                 
                    print('도서명 정가 할인율 주문수량 판매금액 판매처 구입방법  ')
                    listUp()


    else :
        print('-'*30)
        print('다시 입력해 주세요')
        print('-'*30)

'''      
                if menu == '3'  :
                    print('-'*30)
                    delInput=input('삭제할 도서명을 입력하세요 : ')
                    print('-'*30)
'''



  
   


# 의논하여 요구사항을 구상해 보세요