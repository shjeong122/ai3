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
        reIndex = nameL.index(reInput)
        print(reIndex)
            
    except ValueError :
        print('도서명을 다시 입력하세요.')
    
nameL = []
priceL = []
howManyL = []
whereL = []
paywithL = []
percentL = []
sellPriceL = []
list1=[]

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
                    priceL.append(price)
                    howManyL.append(howMany)
                    whereL.append(where)
                    paywithL.append(paywith)
                    percentL.append(percent)
                    sellPriceL.append(sellPrice)
                    list1=[name,price,howMany,where,paywith,percent,sellPrice]
                    print('   도서명       정가      할인율    주문수량    판매금액   판매처   구입방법  ')
                    
                    cnt=0
                    for i in range(len(list1)):
                        cnt=cnt+1
                        if cnt%7==0 :
                            print()

                    reIndex = index()
                    print('%7s    %8s %8s   %10s %10s %7s  %7s'%(nameL[reIndex],priceL[reIndex],percentL[reIndex],howManyL[reIndex],sellPriceL[reIndex],whereL[reIndex],paywithL[reIndex]))


                if menu == '2' :
                    print('-'*30)
                    reInput=input('수정할 도서명을 입력하세요 : ')
                    print('-'*30)
                    index()

                    menu2= '1' 
                    while menu2 != '6':
                        menu2 = input('수정할 항목을 입력하세요(2.정가, 6.나가기) : ')
                        
                        if menu2== '2' :
                            
                            rePrice=input('수정할 정가를 입력하세요 : ')
                            priceL[0] = rePrice

                        print('   도서명       정가      할인율    주문수량    판매금액   판매처   구입방법  ')
                        print('%7s    %8s %8s   %10s %10s %7s  %7s'%(nameL[0],priceL[0],percentL[0],howMayL[0],sellPriceL[0],whereL[0],paywithL[0]))  

                if menu == '3'  :
                    print('-'*30)
                    delInput=input('삭제할 도서명을 입력하세요 : ')
                    print('-'*30)




    else :
        print('-'*30)
        print('다시 입력해 주세요')
        print('-'*30)


   


# 의논하여 요구사항을 구상해 보세요