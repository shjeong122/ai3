package sellinBook;

public class Book {

	String name; //도서명
	int cost; // 정가
	int discount; //할인율
	int amount; //수량
	String where;  //구입처
	String how;  //결제방법
	int offer;  //판매금액
	
	public Book() {}	
		
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public int getamount() {
		return amount;
	}
	public void setamount(int amount) {
		this.amount = amount;
	}
	public String getWhere() {
		return where;
	}
	public void setWhere(String where) {
		this.where = where;
	}
	public String getHow() {
		return how;
	}
	public void setHow(String how) {
		this.how = how;
	}
	public int getOffer() {
		return offer;
	}
	public void setOffer(int offer) {
		this.offer = offer;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " " + cost + " " +  discount + " " +  amount + " " +  where + " " +  how + " " +  offer;
	}
	
	
	
	
}


//1. class book 생성
//- 도서명, 정가 등 객체 생성
//2. Array list <book> 생성
//3. add(bookmain = new book())
//4. main을 통해 받은 내용 주소로 출력

