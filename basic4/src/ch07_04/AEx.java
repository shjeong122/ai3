package ch07_04;

public class AEx {

	public static void main(String[] args) {
		// A 클래스 객체 생성
		A a = new A();
		// AA 클래스 객체 생성
		AA aa = new AA();
		//a.sum 함수 호출 및 출력
		System.out.println(a.sum(50));
		//aa.sum(200)
		System.out.println(aa.sum(200));
		
	}

}
