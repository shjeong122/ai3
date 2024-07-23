# 팀플
# 입력
# 처리 : 할인율, 판매금액
#ver1.0
# 리스트 3개 만들어서 저장 후 한번에 출력
# 출력

for i in range(3) : 
    list=[]
    
    name = input('도서명 : ')
    price = int(input('정가 : '))
    howMany = int(input('주문수량 : '))
    where = input('판매처 : ')
    paywith = input('구입방법 : ')

    # 서점 + 카드 10 + 5
    if where == '서점' and paywith == '카드' :
        percent = (0.1+0.05)*100
        sellPrice = price*(0.1+0.05)
    # 서점 + 현금 할인율 10% +10
    elif where == '서점' and paywith == '현금' :
        percent = (0.1+0.1)*100
        sellPrice = price*(0.1+0.1)
    # 인터넷 + 카드 15 + 5
    elif where == '인터넷' and paywith == '카드' :
        percent = (0.15+0.05)*100
        sellPrice = price*(0.15+0.05)
    # 인터넷 + 현금 15 + 10
    elif where == '인터넷' and paywith == '현금' :
        percent = (0.15+0.1)*100 
        sellPrice = price*(0.15+0.1)

print('도서명  정가  할인율  주문수량  판매금액  판매처  구입방법')
print(' %s  %d     %.0f        %d     %.0f     %s     %s '%(name, price, percent, howMany, sellPrice, where, paywith ))