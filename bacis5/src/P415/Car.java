package P415;

public class Car {
	
	private Tire tire1 = new Tire();  //Car에서만 접근 가능
	
	private Tire tire2 = new Tire() { //new Tire의 자식클래스_익명 자식 객체로 생성됨 "{}"
		//자식 객체 여기다 설계, 바로 객체화
		int a=10;
		
		public void roll() {
			System.out.println(a);
			System.out.println("한국 타이어가 굴러갑니다.");
		};
	};
	public void run1() {
		tire1.roll();
		tire2.roll();
	}
	
	public void run2() {
		Tire tire = new Tire() {
		@Override
		public void roll() {
			System.out.println("익명 자식 Tire 객체2가 굴러갑니다.");
		}
	};
	tire.roll();
}
	
public void run3(Tire tire) {
	tire.roll();
}
}

