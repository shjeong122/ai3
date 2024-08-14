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
    
nameL=[]
list1=[]
indexRe=0

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

            # 메뉴 5.종료 시 나가기
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

                # 2 : 수정
                if menu == '2' :
                    print('-'*30)
                    inputRe=input('수정할 도서명을 입력하세요 : ')
                    print('-'*30)

                    # 수정메뉴 6.나가기 로 종료
                    menu2 = '1' 
                    while menu2 != '6':
                        menu2 = input("수정할 항목을 입력하세요(1.도서명, 2. 정가, 3.주문수량, 4. 판매처, 5. 구입방법, 6.나가기) : ")  
                       
                        # 도서명 수정 =>보통하지 않아, key값
                        if menu2 == '1' :
                            indexRe = int(index())
                            nameRe=input('새로운 도서명을 입력하세요 : ')

                            nameL[indexRe] = nameRe
                            list1[indexRe][0] = nameRe

                            print('도서명 정가 할인율 주문수량 판매금액 판매처 구입방법  ')
                            listUp()
                            break

                       # 정가 수정
                        elif menu2 == '2' :
                            indexRe = int(index())
                            
                            priceRe=int(input('새로운 정가를 입력하세요 : '))
                           
                            percent = calc()                
                            sellPrice = priceRe*(100-percent)/100

                            list1[indexRe][1] = priceRe
                            list1[indexRe][4] = sellPrice

                            print('도서명 정가 할인율 주문수량 판매금액 판매처 구입방법  ')
                            listUp()

                        # 주문수량 수정
                        elif menu2 == '3' :
                            indexRe = int(index())
                            howManyRe=input('새로운 주문 수량을 입력하세요 : ')
                            list1[indexRe][3] = howManyRe    

                            print('도서명 정가 할인율 주문수량 판매금액 판매처 구입방법  ')
                            listUp()

                        # 판매처 수정
                        elif menu2 == '4' :
                            indexRe = int(index())
                            whereRe=input('새로운 판매처를 입력하세요(서점/인터넷) : ')
                            list1[indexRe][5] = whereRe   

                            print('도서명 정가 할인율 주문수량 판매금액 판매처 구입방법  ')
                            listUp()

                        # 구입방법 수정
                        elif menu2 == '5' :
                            indexRe = int(index())
                            paywithRe=input('새로운 구입방법을 입력하세요(현금/카드) : ')
                            list1[indexRe][6] = paywithRe
                                           
                            print('도서명 정가 할인율 주문수량 판매금액 판매처 구입방법  ')
                            listUp()

                        # 오타_수정메뉴   
                        elif menu2 != '1' and menu2 != '2' and menu2 != '3' and menu2 != '4' and menu2 != '5' :
                            print('-'*30)
                            print('잘못입력했습니다.')
                            print('-'*30)
                            break

                # 3. 삭제          
                elif menu == '3' :
                    print('-'*30)
                    inputRe=input('삭제할 도서명을 입력하세요 : ')
                    print('-'*30)
                      #indexRe            
                    indexRe = int(index())
                    list1.pop(indexRe)
                    print('도서명 정가 할인율 주문수량 판매금액 판매처 구입방법  ')
                    listUp()

                # 4. 전체 출력    
                elif menu == "4" :                 
                    print('도서명 정가 할인율 주문수량 판매금액 판매처 구입방법  ')
                    listUp()

                # 5. 종료
                elif menu == "5" :
                    print('종료되었습니다.')

                # 오류_메뉴
                elif menu != '1' and menu != '2' and menu != '3' and menu != '4' and menu != '5' :
                    print('-'*30)
                    print('잘못입력했습니다.')
                    print('-'*30)

    # 오류_아이디
    else :
        print('-'*30)
        print('다시 입력해 주세요')
        print('-'*30)