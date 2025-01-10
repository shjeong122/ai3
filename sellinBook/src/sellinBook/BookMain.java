package sellinBook;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class BookMain {


	static Scanner sc = new Scanner(System.in);
	static ArrayList<Book> bookList = new ArrayList<>();
	private static int c;
	static Book book = new Book();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = count();
		for(int i=0; i<c; i++) {
			selling();
		}
		printAll();
	}
		private static void printAll() {
		System.out.println("========================");
		System.out.println("도서 판매 리스트");
		System.out.println("------------------------");
		System.out.println("도서명  정가  할인율 주문수량 판매금액 구입처 구입방법" );
		for(Book b : bookList) {
			System.out.println(b);
		}
		}

		private static int count() {
			System.out.println("========================");
			System.out.println("도서 판매 관리 프로그램");
			System.out.println("------------------------");
			System.out.print("판매 도서 수량 : ");
			int count = sc.nextInt();
			return count;
		}
		private static void selling() {
			System.out.print("도서명 : ");
			String name = sc.next();
			book.setName(name);
			
			System.out.print("정가 : ");
			int cost =sc.nextInt();
			book.setCost(cost);
			
			System.out.print("수량 : ");
			int amount = sc.nextInt();
			book.setamount(amount);
			
			System.out.print("구입처 (1.서점, 2.인터넷) : ");
			int num1 = sc.nextInt();
			String where = null;
			if(num1 == 1) {  where ="서점";
			} else {
				 where = "인터넷";
			}		
			//int where = sc.nextInt();
			book.setWhere(where);
			
			System.out.print("결제방법 (1.현금, 2.카드) : ");
			int num2 = sc.nextInt();
			String how = null;
			if(num1 == 1) {  how ="서점";
			} else {
				 how = "인터넷";
			}		
			//int where = sc.nextInt();
			book.setHow(how);
			
			if(num1 ==1 && num2==1) {
				//서점 10, 인터넷15
				//현금10, 카드5
				int discount = 20;
				book.setDiscount(discount);
				int offer = cost*(100-discount)/100;
				book.setOffer(offer);
			} else if(num1 ==1 && num2==2){
				int discount = 15;
				book.setDiscount(discount);
				int offer = cost*(100-discount)/100;
				book.setOffer(offer);	
			} else if(num1 ==2 && num2==1){
				int discount = 25;
				book.setDiscount(discount);
				int offer = cost*(100-discount)/100;
				book.setOffer(offer);	
			} else if(num1 ==2 && num2==2){
				int discount = 20;
				book.setDiscount(discount);
				int offer = cost*(100-discount)/100;
				book.setOffer(offer);	
			}
			bookList.add(book);

		}
}

