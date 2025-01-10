package p882;

public class Product {
	private int no; //상품번호
	private String name; //상품명
	private int price; //가격
	private int stock; //수량
	
	//lombok.jar 파일 속 기능 =>다운받아 사용한다.
	/*@Data  //setter, getter, toString이 있는 것으로 간주
	@NoArgsConstructor  //기본 생성자로 간주
	@AllArgsConstructor*/  // 모든 필드의 생성자로 간주
	
	public Product() {
	}
	
	public Product(int no, String name, int price, int stock) {
		super();
		this.no = no;
		this.name = name;
		this.price = price;
		this.stock = stock;
	}

	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}


}
