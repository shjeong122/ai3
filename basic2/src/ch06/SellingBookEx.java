package ch06;

public class SellingBookEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("도서명 ");
		System.out.print("정가 ");
		System.out.print("할인율 ");
		System.out.print("주문수량 ");
		System.out.print("판매금액 ");
		System.out.print("판매처 ");
		System.out.println("구입방법");
		
		SellingBook sb = new SellingBook();
		sb.setBookName("엑셀");
		sb.setCost(30000);
		sb.setDiscount(20);
		sb.setAmount(5);
		sb.setPrice(24000);
		sb.setSeller("서점");
		sb.setPay("현금");
		
		System.out.print(sb.getBookName() + "  ");
		System.out.print(sb.getCost() + " ");
		System.out.print(sb.getDiscount() + " ");
		System.out.print(sb.getAmount() + " ");
		System.out.print(sb.getPrice() + "  ");
		System.out.print(sb.getSeller() + " ");
		System.out.println(sb.getPay());
		
		sb.setBookName("자바");
		sb.setCost(35000);
		sb.setDiscount(25);
		sb.setAmount(4);
		sb.setPrice(26250);
		sb.setSeller("인터넷");
		sb.setPay("현금");
		
		System.out.print(sb.getBookName() + "  ");
		System.out.print(sb.getCost() + " ");
		System.out.print(sb.getDiscount() + " ");
		System.out.print(sb.getAmount() + " ");
		System.out.print(sb.getPrice() + " ");
		System.out.print(sb.getSeller() + " ");
		System.out.println(sb.getPay());
		
		sb.setBookName("파이썬");
		sb.setCost(25000);
		sb.setDiscount(20);
		sb.setAmount(6);
		sb.setPrice(20000);
		sb.setSeller("인터넷");
		sb.setPay("카드");
				
		System.out.print(sb.getBookName() + " ");
		System.out.print(sb.getCost() + " ");
		System.out.print(sb.getDiscount() + " ");
		System.out.print(sb.getAmount() + " ");
		System.out.print(sb.getPrice() + " ");
		System.out.print(sb.getSeller() + " ");
		System.out.println(sb.getPay());
		
	}
	
	

}
