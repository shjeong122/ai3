#할인함수 / 할인율에 고려해야하는 것은 판매처와 구매방법
def dc() :
    global sdc
    global pdc
    result = sdc + pdc
    return result


#판매금액 함수
def price() :
    global netPrice
    global a
    result = netPrice - (netPrice*a/100)
    return result

#줄 함수
def line() :
    print("-"*100)

def line2() :
    print("="*100)
    
# 할인 변수
pdc = 0
sdc = 0
a = dc() #총할인율

list2=[]

#출력결과 // "도서명", "정가", "할인율", "주문수량", "판매금액", "판매처", "구입방법"//

bnl=[] #도서명
npl=[] #정가
dcl=[] #할인율
oql=[] #주문수량
spl=[] #판매금액# #
shl=[] #판매처
phl=[] #결제수단

id = ""
pw = ""

# 로그인로직
while True :
    print("《 로그인하기 》")
    id=input("아이디는? ")
    pw=input("비밀번호는? ")
    if id == "admin" and pw == "1234" :
        print(" ●로그인 성공● ")
        line2()
        break
    ans=input("아이디 또는 비밀번호가 틀렸습니다.\n다시 시도하시려면 아무키나 눌러주세요(나가기 q)")
    line()
    if ans == "Q" or ans == "q" :
        break
# 메뉴출력
while id == 'admin' and pw == '1234' :
    print("1.입력하기")
    print("2.수정하기")
    print("3.삭제하기")
    print("4.전체판매 현황보기")
    print("5.종료하기")
    menu=input("메뉴를 선택하세요 ▶ ")

    if menu == "1" :  ######################################
        line2()
        print("1.입력하기")
        line2()
        while True :
            bookName=input("도서명 ▶ ")
            netPrice=int(input("정가 ▶ "))
            orderQ=int(input("주문수량 ▶ "))
            shohp=input("판매처 ▶ ")
            purchase=input("결제수단 ▶ ")
            
            if shohp == "서점" :
                sdc = 10    
            elif shohp == "인터넷" :
                sdc = 15
            

            if purchase == "현금" :
                pdc = 10    
            elif purchase == "카드" :
                pdc = 5

            a = dc()
            b = price()
                
            bnl.append(bookName)
            npl.append(netPrice)
            dcl.append(a)
            oql.append(orderQ)
            spl.append(price())
            shl.append(shohp)
            phl.append(purchase)          

            line2()
            print("『도서명』", " 『정가』", "『할인율』", "『주문수량』", "『판매금액』", "『판매처』", "『결제수단』")
            line()
            for i in range(len(bnl)) :
                print(" %4s    %6d      %d"%(bnl[i],npl[i],dcl[i])+"%","     %5d        %6.0f원      %s       %s"%(oql[i],spl[i],shl[i],phl[i]))
            line2()

            list=[bookName,netPrice,a,orderQ,price(),shohp,purchase]
            list2.append(list) 

            quit = input("정보 입력을 계속 하시려면 아무키나 눌러주세요 (나가기 버튼 q) ") 
            if quit == "q" or quit == "Q" :
                break

    elif menu == "2" : ######################################################################
        line2()
        print("수정하기")
        line2()
        print("         『도서명』", " 『정가』", "『할인율』", "『주문수량』", "『판매금액』", "『판매처』", "『결제수단』")
        for i in range(len(list2)) :  
            print("%d번 고객 : %4s    %6d      %d"%(i+1,bnl[i],npl[i],dcl[i])+"%","     %5d        %6.0f원      %s       %s"%(oql[i],spl[i],shl[i],phl[i]))
        line()
        select = int(input("수정하실 고객의 번호를 선택하세요 "))
        line2()
        for i in range(len(list2)) :
            if i+1 == select :
                line2()
                print("1.도서명")
                print("2.정가")
                print("3.주문수량")    
                print("4.판매처")
                print("5.결제수단")
                print("6.나가기")
                line()
                select2 = input("%d번 고객의 정보중 수정할 내용을 골라주세요 ▶ "%(i+1))
                line()
                if select2 == "1" :
                    newBook = input("수정하실 도서명 : ")
                    bnl[i] = newBook
                    line2()
                elif select2 == "2" :
                    newNetPrice = int(input("수정하실 정가 : "))
                    npl[i] = newNetPrice
                    line2()
                    spl[i] = newNetPrice - (newNetPrice*dcl[i]/100) # 정가 변화에따른 판매가 변화식
                elif select2 == "3" :
                    newOrderQ = int(input("수정하실 수량 : "))
                    oql[i] = newOrderQ
                    line2()
                elif select2 == "4" :
                    newShohp = input("수정하실 판매처 : ")
                    shl[i] = newShohp
                    line2()
                    if newShohp == "서점" :
                        sdc = 10    
                    elif newShohp == "인터넷" :
                        sdc = 15
                    if phl[i] == "현금" :
                        pdc = 10
                    elif phl[i] == "카드" :
                        pdc = 5
                    a = dc()
                    dcl[i] = a # 판매처 변화로인해 할인율 변화
                    spl[i] = npl[i] - (npl[i]*dcl[i]/100) # 할인율 변화에따른 판매가 변화식
                elif select2 == "5" :
                    newPurchase = input("수정하실 결제수단 : ")
                    phl[i] = newPurchase
                    line2()
                    if newPurchase == "현금" :
                        pdc = 10
                    elif newPurchase == "카드" :
                        pdc = 5
                    if shl[i] == "서점" :
                        sdc = 10
                    elif shl[i] == "인터넷" :
                        sdc = 15
                    a = dc()
                    dcl[i] = a # 결제수단 변화로인해 할인율 변화
                    spl[i] = npl[i] - (npl[i]*dcl[i]/100) # 할인율 변화에따른 판매가 변화식
                else :
                    pass
                ##수정하기 끝 ##
    elif menu == "3" :
        line2()
        print("3.삭제하기")
        line2()
        # 고객 현황을 보여 준 후 삭제할 고객의 정보를 선택, 해당 고객의 리스트 자체를 날려버리자
        print("         『도서명』", " 『정가』", "『할인율』", "『주문수량』", "『판매금액』", "『판매처』", "『결제수단』")
        for i in range(len(bnl)) :
            print("%d번 고객 : %4s    %6d      %d"%(i+1,bnl[i],npl[i],dcl[i])+"%","     %5d        %6.0f원      %s       %s"%(oql[i],spl[i],shl[i],phl[i]))
        line()
        select = int(input("삭제하실 고객의 번호를 선택하세요 ▶ "))
        line2()
        k = select-1
        bnl.pop(k) 
        npl.pop(k)
        dcl.pop(k)
        oql.pop(k)
        spl.pop(k)
        shl.pop(k) 
        phl.pop(k)

    elif menu == "4" : # 전체판매현황 표 - 총 판매금액 등을 넣어주면 좋을듯 
        s = 0
        line2()
        print("4.전체판매 현황")
        line2()
        for i in range(len(spl)) : # 총 판매금액 계산
            p=oql[i]*spl[i]
            s += p

        print("         『도서명』", " 『정가』", "『할인율』", "『주문수량』", "『판매금액』", "『판매처』", "『결제수단』")
        for i in range(len(bnl)) :
            print("%d번 고객 : %4s    %6d      %d"%(i+1,bnl[i],npl[i],dcl[i])+"%","     %5d        %6.0f원      %s       %s"%(oql[i],spl[i],shl[i],phl[i]))
        line()
        print("●총 판매금액 : %d 원"%s)
        line()
             
    if menu == "5" :
        line()
        print("이용해주셔서 감사합니다\n프로그램을 종료합니다")
        break