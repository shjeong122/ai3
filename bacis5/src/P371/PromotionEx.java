package P371;

public class PromotionEx {

	public static void main(String[] args) {
		//구현 객체 생성
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		//인터페이스 변수 선언
		A a;
		//변수에 구현 객체 대입, 자동 타입 변환(A <- B ...)
		a = b;
		a = c;
		a = d;
		a = e;

	}

}
