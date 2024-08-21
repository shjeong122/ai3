package ch0602;

public class P248 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P248_1 p1 = new P248_1();
		P248_2.address = "서울";
		P248_2.rate = 0.2;
		P248_2.setAddress("인천");
		P248_2.setRate(0.256);
		
		//인스턴스 멤버들은 힙메모리에 올려놓고 사용한다
		//new하여 사용한다.
		P248_2 p2 = new P248_2();
		p2.name = "홍길동";
	}

}

class P248_1 {
	
	public P248_1() {
		System.out.println("2. 기본 생성자 부분");  //인스턴스 블록 수행 후 기본 생성자 수행
	}
	{
		System.out.println("1. 인스턴스 블록 부분");  //정적 블록 수행 후 인스턴스 블록 부분 출력
	}
	static {
		System.out.println("0. 정적 블록"); // 인스턴스화될때 제일 먼저 수행
	}
}

class P248_2 {
	//인스턴스 멤버
	String name;
	int age;
	
	//정적 멤버
	static String address;
	static double rate;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public static String getAddress() {
		return address;
	}
	public static void setAddress(String address) {
		P248_2.address = address;
	}
	public static double getRate() {
		return rate;
	}
	public static void setRate(double rate) {
		P248_2.rate = rate;
	}
		
}

class StaticEx {
	int a=100; //인스턴스 필드
	static int sa=100; //정적 필드
	
	void aM() { //인스턴스 메소드 ( new하기 전에는 메모리에 올라가지 못한다)
		a=a+10;
		sa = sa - 90;		
		saM();
	}
	static void saM() { //정적 메소드(정적 필드만 사용 가능)
		//a = a +10;  //오류 =>메모리에 올라가는 시점이 달라서 오류 발생
		sa = sa - 90;
		
	}
}


