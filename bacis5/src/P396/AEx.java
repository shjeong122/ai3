package P396;

import P396.A.B;

public class AEx {
	
	public static void main(String[] args) {
		A a = new A();
		a.ia = 200;
		a.aM();
		a.iam();
		A.sia=30;
		A.siam();
		
		//B b = new B();  //B는 A의 내부 클래스이므로
		A.B b = a.new B();  //외부클래스인 A를 함께 표기
		b.bb = 400;
		b.bbM();
		b.bM();
		A.B.sbb = 300;
		B.sbb = 300;
		B.sbbM();
		B.sbm();
		
		
	}
}
