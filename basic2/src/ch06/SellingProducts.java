package ch06;

public class SellingProducts {
	//제품판매관리 설계도
	//제품분퓨 : 화장품, 가전제품, 사무용품
	//제품명 : 립스틱, 비누 ...
	//판매가 : 원가 + 50%
	//입력화면 : 제품분류 , 품명, 판매량
	//필드 : 제품분류, 제품명, 원가, 판매가, 판매량, 매출액=판매가*판매량
	
	String products; //제품분류
	String name; //제품명
	int cost; //원가
	int price; //판매가
	int rate; //판매량
	int sales; //매출액
	
	
	public String getProducts() {
		return products;
	}
	public void setProducts(String products) {
		products = products;
	}
	public int getSales() {
		return sales;
	}
	public void setSales(int sales) {
		this.sales = sales;
	}
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	SellingProducts(String Products) {
		this.products = products ;
	}
	SellingProducts(int cost, int amount) {
		this.cost = cost ;
		this.rate = rate;
	}		
	SellingProducts(int price, String products) {
		this.price = price ;
		this.products = products;
	}
	SellingProducts sp5 = new SellingProducts("가전제품", 2500);
	SellingProducts(String name, int sales) {
		this.sales = sales ;
		this.name = name;
	}

	SellingProducts() {
		// TODO Auto-generated constructor stub
	}
	public SellingProducts(String products, String name, int cost, int price, int rate, int sales,
			SellingProducts sp5) {
		super();
		this.products = products;
		this.name = name;
		this.cost = cost;
		this.price = price;
		this.rate = rate;
		this.sales = sales;
		this.sp5 = sp5;
	}
}
