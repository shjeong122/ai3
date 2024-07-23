# 팀플
# 입력
# 처리 : 할인율, 판매금액
#ver1.0
# 리스트 3개 만들어서 저장 후 한번에 출력
'''
for i in range(3) : 
    list=[]
''' 
 



list = []
 
for i in range(3) :
    name = input('도서명 : ')
    price = int(input('정가 : '))
    howMany = int(input('주문수량 : '))
    where = input('판매처 : ')
    paywith = input('구입방법 : ')
    list.append(name)
    list.append(price)
    list.append(str(howMany))
    list.append(where)
    list.append(paywith)

    # 서점 + 카드 10 + 5
    if where == '서점' and paywith == '카드' :
        percent = (0.1+0.05)*100
        sellPrice = price*(1-(0.1+0.05))
    # 서점 + 현금 할인율 10% +10
    elif where == '서점' and paywith == '현금' :
        percent = (0.1+0.1)*100
        sellPrice = price*(1-(0.1+0.1))
    # 인터넷 + 카드 15 + 5
    elif where == '인터넷' and paywith == '카드' :
        percent = (0.15+0.05)*100
        sellPrice = price*(1-(0.15+0.05))
    # 인터넷 + 현금 15 + 10
    elif where == '인터넷' and paywith == '현금' :
        percent = (0.15+0.1)*100 
        sellPrice = price*(1-(0.15+0.1))
    
    list.append(percent)
    list.append(sellPrice)
'''
list1=[list[0],list[1],list[5],list[6],list[2],list[3],list[4]]
list2=[list[7], list[8],list[12],list[13],list[9],list[10],list[11]]
list3=[list[14], list[15],list[19],list[20],list[13],list[17],list[18]]

print('도서명  정가  할인율  주문수량  판매금액  판매처  구입방법')
print(list1)
print(list2)
print(list3)
'''
print('   도서명       정가      할인율    주문수량    판매금액   판매처   구입방법  ')
print('%7s    %8s %8s   %10s %10s %7s  %7s'%(list[0],list[1],list[5],list[6],list[2],list[3],list[4]))
print('%7s    %8s %8s   %10s %10s %7s %7s'%(list[7], list[8],list[12],list[13],list[9],list[10],list[11]))
print('%7s %8s %10s %10s %10s %7s %7s'%(list[14], list[15],list[19],list[20],list[16],list[17],list[18]))

'''
cnt = 0
for i in range(len(list1)) :
    print( list1[i], end=" ")
    cnt += 1
    if cnt == 7 :
        print()
        cnt = 0 
'''


'''
print('도서명  정가  할인율  주문수량  판매금액  판매처  구입방법')
'''
#도서명

#정가

#할인율

#주문수량

#판매금액

#판매처

#구입방법