# 로그인
def menuL() :
    print('0. 로그인하기')
    print('1. 입력하기')
    print('2. 수정하기')
    print('3. 삭제하기')
    print('4. 전체판매 현황보기')
    print('5. 종료하기')
    menu = input('메뉴를 선택하세요 >>> ')
    return menu  
#할인율
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
#인덱스찾기
def index() :
    try :
        indexRe = nameL.index(inputRe)
        return indexRe
            
    except ValueError :
        print('도서명을 다시 입력하세요')
#전체현황
def listUp() :
    print('*'*100)
    print('도서명 정가 할인율 주문수량 판매금액 판매처 구입방법  ')
    print('*'*100)
    for i in range(len(list1)) :
        for j in range(len(list1[i])) :
            print(list1[i][j], end="  ") 
        print() 
        print('-'*100)
    
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
            print('-'*100)
            print('로그인 되었습니다.')
            print('-'*100)

            # 메뉴 5.종료 시 나가기
            while menu != '5' : 
                menu = menuL()

                # 1 : 입력 
                if menu == '1' :   
                    print('='*100)
                    print('도서 정보를 입력하세요')
                    print('='*100)
                    name = input('도서명 : ')
                    price = int(input('정가 : '))
                    howMany = input('주문수량 : ')
                    where = input('판매처 : ')
                    paywith = input('구입방법 : ')

                    percent = calc()                
                    sellPrice = price*(100-percent)/100

                    nameL.append(name)
     
                    list1.append([name,price,percent,howMany,sellPrice,where,paywith])

                    listUp()

                # 2 : 수정
                if menu == '2' :
                    print('='*100)
                    inputRe=input('수정할 도서명을 입력하세요 : ')
                    print('='*100)

                    if inputRe not in nameL :
                        print('없는 도서명 입니다.')
                        print()
                    else :
                    # 수정메뉴 6.나가기 로 종료
                        menu2 = '1' 
                        while menu2 != '6':
                            print('='*100)
                            print("(1.도서명, 2. 정가, 3.주문수량, 4. 판매처, 5. 구입방법, 6.나가기)")
                            menu2 = input("수정할 항목을 입력하세요 >>> ") 
                            print('='*100)
                        
                            # 도서명 수정 => 보통하지 않아, key값
                            if menu2 == '1' :
                                indexRe = int(index())
                                print('='*100)
                                nameRe=input('새로운 도서명을 입력하세요 : ')
                                print('='*100)

                                nameL[indexRe] = nameRe
                                list1[indexRe][0] = nameRe

                                listUp()
                                break

                        # 정가 수정
                            elif menu2 == '2' :
                                indexRe = int(index())
                                print('='*100)
                                priceRe=int(input('새로운 정가를 입력하세요 : '))
                                print('='*100)

                                percent = calc()                
                                sellPrice = priceRe*(100-percent)/100

                                list1[indexRe][1] = priceRe
                                list1[indexRe][4] = sellPrice

                                listUp()

                            # 주문수량 수정
                            elif menu2 == '3' :
                                indexRe = int(index())
                                print('='*100)
                                howManyRe=input('새로운 주문 수량을 입력하세요 : ')
                                print('='*100)
                                list1[indexRe][3] = howManyRe    

                                listUp()

                            # 판매처 수정
                            elif menu2 == '4' :
                                indexRe = int(index())
                                print('='*100)
                                whereRe=input('새로운 판매처를 입력하세요(서점/인터넷) : ')
                                print('='*100)
                                list1[indexRe][5] = whereRe   

                                listUp()

                            # 구입방법 수정
                            elif menu2 == '5' :
                                indexRe = int(index())
                                print('='*100)
                                paywithRe=input('새로운 구입방법을 입력하세요(현금/카드) : ')
                                print('='*100)
                                list1[indexRe][6] = paywithRe
                                            
                                listUp()

                            # 오타_수정메뉴   
                            elif menu2 != '1' and menu2 != '2' and menu2 != '3' and menu2 != '4' and menu2 != '5' and menu2 != '6':
                                print('-'*100)
                                print('잘못입력했습니다.')
                                print('-'*100)
                                break

                # 3. 삭제          
                elif menu == '3' :
                    print('='*100)
                    inputRe=input('삭제할 도서명을 입력하세요 : ')
                    print('='*100)
                      #indexRe            
                    indexRe = int(index())
                    list1.pop(indexRe)

                    listUp()

                # 4. 전체 출력    
                elif menu == "4" :                 
                    listUp()

                # 5. 종료
                elif menu == "5" :
                    print('종료되었습니다.')

                # 오류_메뉴
                elif menu != '1' and menu != '2' and menu != '3' and menu != '4' and menu != '5' :
                    print('-'*100)
                    print('잘못입력했습니다.')
                    print('-'*100)

    # 오류_아이디
    else :
        print('-'*100)
        print('다시 입력해 주세요')
        print('-'*100)