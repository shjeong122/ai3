package ch06;

public class P210 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SportCar sportCar = new SportCar();
		sportCar.namePrint();
		sportCar.pricePrint();
		
		Student st = new Student();  //인스턴스화 = 객체화
		System.out.println(st.hakbun);
		System.out.println(st.age);
		System.out.println(st.name);
		
		Student st1 = new Student();
		st1.name="이순신";
		st1.hakbun ="231213";
		st1.age = 30;
		
		System.out.println(st.name);
		System.out.println(st1.name);
		
		Student st2 = new Student();
		st2.name = "장미연";
		System.out.println(st2.name);
		st2.agePrint();
	}
}

class SportCar {
	String name = "람보르기니";  //필드 = 변수
	int price = 1000000;
	//메소드
	void namePrint() {  
		System.out.println("차 이름은 " + name);
	}
	void pricePrint() {  // void : 실행 후 값을 가져오지 않는다.
		System.out.println("가격은 " + price);
	}
}

class Student{
	String hakbun = "24050706";
	int age = 30;
	String name = "홍길동";
	void agePrint() {
		System.out.println("나이는 " + age);
	}
	//생성자
	Student() {
		// new연산자로 자동 호출
		//생략 시 컴파일러가 자동으로 생성함.
	}
}