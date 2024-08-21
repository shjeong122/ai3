package ch0601;

public class SellingBookEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  SellingBook exel = new SellingBook();
	  SellingBook java = new SellingBook();
	  SellingBook android = new SellingBook();
	  
	  System.out.println("도서명\t정가\t할인율\t주문수량\t판매금액\t판매처\t구입방법");
	  exel.setBookName("엑셀");
	  exel.setPrice(30000);
	  exel.setQuantity(5);
	  exel.setPlace("서점");
	  exel.setMethod("현금");
	  exel.setDiscount(0);
	  exel.setSales();
	  exel.printData();
	  java.setBookName("자바");
	  java.setPrice(35000);
	  java.setQuantity(4);
	  java.setPlace("인터넷");
	  java.setMethod("현금");
	  java.setDiscount(0);
	  java.setSales();
	  java.printData();
	  android.setBookName("파이썬");
	  android.setPrice(25000);
	  android.setQuantity(6);
	  android.setPlace("인터넷");
	  android.setMethod("카드");
      android.setDiscount(0);
      android.setSales();
      android.printData();   
	   }
}
