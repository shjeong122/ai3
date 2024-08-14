a = []
b = []
c = []
d = []
e = []
f = []
g = []
menu = '1'

print('0. 로그인하기')
print('1. 입력하기')
print('2. 수정하기')
print('3. 삭제하기')
print('4. 전체판매 현황보기')
print('5. 종료하기')
menu = input('메뉴를 선택하세요==> ')

if menu != '5' :
    while menu != '0' :
        menu = input('0을 눌러 로그인 하세요==> ')

    if menu == '0' :   
        userId = input('아이디는? ')
        passWord = input('비밀번호는? ')
        
    if not (userId == 'admin' and passWord == '1234'):
        print('다시 입력해 주세요')
        userId = input('아이디는? ')
        passWord = input('비밀번호는? ')
        
        if userId == 'admin' and passWord == '1234':
            print('"admin"으로 로그인됨')

    elif userId == 'admin' and passWord == '1234':
        print('"admin"으로 로그인됨')
        print()


while menu != '5' :
    print('0. 로그인하기')
    print('1. 입력하기')
    print('2. 수정하기')
    print('3. 삭제하기')
    print('4. 전체판매 현황보기')
    print('5. 종료하기')
    menu = input('메뉴를 선택하세요==> ')

    if menu == '0':
        userId = input('아이디는? ')
        passWord = input('비밀번호는? ')
        if not (userId == 'admin' and passWord == '1234'):
            print('다시 입력해 주세요')
            userId = input('아이디는? ')
            passWord = input('비밀번호는? ')
        elif userId == 'admin' and passWord == '1234':
            print('"admin"으로 로그인됨')
            print()

    elif menu == '1' :
        yn = 'y'
        while yn == 'y':
            name = input("도서명> ")
            price = int(input("정가> "))
            count = int(input("주문수량> "))
            shop = input("판매처> ")
            how = input("구입방법> ")
            a.append(name)
            b.append(price)
            c.append(count)
            f.append(shop)
            g.append(how)
            if shop == '서점' and how == '현금':
                sale = '20%'
                sale_price = int(price * 0.8)
                d.append(sale)
                e.append(sale_price)

            elif shop == '서점' and how == '카드':
                sale = '15%'
                sale_price = int(price * 0.85)
                d.append(sale)
                e.append(sale_price)

            elif shop == '인터넷' and how == '현금':
                sale = '25%'
                sale_price = int(price * 0.75)
                d.append(sale)
                e.append(sale_price)

            elif shop == '인터넷' and how == '카드':
                sale = '20%'
                sale_price = int(price * 0.8)
                d.append(sale)
                e.append(sale_price)

            yn = input('더 입력하시겠습니까?(y or n) ')

        print()
        print('도서명 정가 할인율 주문수량 판매금액 판매처 구입방법')
        for i in range(len(a)):
            print(a[i], b[i], d[i], c[i], e[i], f[i], g[i])
        print()



    elif menu == '2':
        yn = 'y'
        while yn == 'y':
            modify_name = input('수정 할 도서명? ')
            if modify_name not in a :
                print('입력된 도서명이 아닙니다.')
                print()
            else :
                print('%s의 수정할 항목을 선택하세요' % modify_name)
                modify_menu = input('1.정가 2.주문수량 3.판매처 4.구입방법==> ')

                index_name = a.index(modify_name)

                if modify_menu == "1":
                    modify_price = int(input("수정할 정가를 입력하세요 "))
                    b[index_name] = modify_price

                elif modify_menu == "2":
                    modify_count = int(input("수정할 주문수량을 입력하세요 "))
                    c[index_name] = modify_count

                elif modify_menu == "3":
                    modify_shop = input("수정할 판매처를 입력하세요 ")
                    f[index_name] = modify_shop

                elif modify_menu == "4":
                    modify_how = input("수정할 구입방법을 입력하세요 ")
                    g[index_name] = modify_how

                price = b[index_name]
                shop = f[index_name]
                how = g[index_name]

                if shop == '서점' and how == '현금':
                    modify_sale = '20%'
                    modify_sale_price = int(price * 0.8)
                    d[index_name] = modify_sale
                    e[index_name] = modify_sale_price

                elif shop == '서점' and how == '카드':
                    modify_sale = '15%'
                    modify_sale_price = int(price * 0.85)
                    d[index_name] = modify_sale
                    e[index_name] = modify_sale_price

                elif shop == '인터넷' and how == '현금':
                    modify_sale = '25%'
                    modify_sale_price = int(price * 0.75)
                    d[index_name] = modify_sale
                    e[index_name] = modify_sale_price

                elif shop == '인터넷' and how == '카드':
                    modify_sale = '20%'
                    modify_sale_price = int(price * 0.8)
                    d[index_name] = modify_sale
                    e[index_name] = modify_sale_price

            yn = input('더 수정하시겠습니까?(y or n) ')

        print()
        print('수정되었습니다!')
        print('도서명 정가 할인율 주문수량 판매금액 판매처 구입방법')
        for i in range(len(a)):
            print(a[i], b[i], d[i], c[i], e[i], f[i], g[i])
        print()

    elif menu == '3':
        yn = 'y'
        while yn == 'y':
            delName = input("삭제할 도서명? ")
            if delName not in a :
                    print('입력된 도서명이 아닙니다.')
                    print()
            else :
                nIndex = a.index(delName)
                a.pop(nIndex)
                b.pop(nIndex)
                d.pop(nIndex)
                c.pop(nIndex)
                e.pop(nIndex)
                f.pop(nIndex)
                g.pop(nIndex)
                
            yn = input('더 삭제하시겠습니까?(y or n) ')
        print()
        print("삭제완료")
        print('도서명 정가 할인율 주문수량 판매금액 판매처 구입방법')
        for i in range(len(a)):
            print(a[i], b[i], d[i], c[i], e[i], f[i], g[i])
        print()
        

    elif menu == '4':
        print('전체판매 현황 보기')
        print('도서명 정가 할인율 주문수량 판매금액 판매처 구입방법')
        for i in range(len(a)):
            print(a[i], b[i], d[i], c[i], e[i], f[i], g[i])
        print()

if menu == '5' :
    print('프로그램을 종료합니다.')
    print()
    