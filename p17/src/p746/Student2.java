package p746;

public class Student2 {
	//1. Student에 implements를 직접구현 : comparable
	//2. Student클래스와 상관없는 비교 클래스 구현 : comparator_건들수없어!
	private String name;
	private int score;
	private String phone;
	
	public Student2(String name, int score, String phone) {
		super();
		this.name = name;
		this.score = score;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
	public String getPhone() {
		return phone;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " " + score + " " + phone;
		
	}
}
