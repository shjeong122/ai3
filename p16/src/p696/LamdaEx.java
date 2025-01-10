package p696;

public class LamdaEx {

	public static void main(String[] args) {
		CalImpl c = new CalImpl();
		c.calculate(10,20);
	
		//방법2 익명형 구현 객체
		Cal c2 = new Cal() {
			
			@Override
			public void calculate(int x, int y) {
				System.out.println(x-y);
				//처리할 코드 구현
			}
			};
			//방법3 람다식 표현 : 인터페이스(추상형 메소드1개)를 불러와 사용한다.
			c2.calculate(200, 100);
			
			Cal c3 = (int x, int y)->{System.out.println(x*y);};
			c3.calculate(10, 5);
			//인터페이스 변수(1개 추상메소드)를 그대로 불러와 사용
			//람다는 ->{};로 사용 명령
			Cal c4 = (x,y) -> System.out.println(x*y);
			c4.calculate(20, 8);
			//메소드가 1개인 인터페이스는 변수 자료형과 {}를 생략할 수 있다.
			//방법1의 부분 생략
//			Cal c2 = [new Cal() {
//						
//				@Override
//				public void calculate](int x, int y) {
//					System.out.println(x-y);
//					//처리할 코드 구현
	}
}
@FunctionalInterface //하기의 인터페이스는 함수적 인터페이스임을 표기
interface Cal{         			 //함수적 인터페이스	: 추상메소드 1개를 가진 인터페이스
	void calculate(int x, int y); //추상메소드
	//void calculate(int x, int y); //Duplicate method calculate(int, int) in type Cal
}
//방법1
class CalImpl implements Cal{//일반클래스 1개 생성 및 구현

	@Override
	public void calculate(int x, int y) {
		System.out.println(x + y); //처리할 코드 구현
}
}

