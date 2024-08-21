package b.bb;

public class BB {
	String address; //자기 클래스에서만 사용 가능
	private int score; //접근제한 객체내부

	public BB(String address) {
		super();
		this.address = address;
		this.score = 100;
	}

	public String getAddress() {
		return address + this.score ;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}
