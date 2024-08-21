package P396;

public class A {
	int ia;  //인스턴스 필드
	void iam() {}  //인스턴스 메소드
	static int sia=10;  //정적 필드
	static void siam() {};  //정적 메소드
	
	void aM() {
		//bb=30; //내부클래스 객체와 메소드는 바깥 클래스에서 사용 불가
		//bbM();
		B.sbb = 30;  //내부클래스의 static은 사용 가능
	}

	class B {
		int bb;
		static int sbb = 20;
		void bbM() {};
		static void sbbM() {};
		
		void bM() {
			bb=100;
			ia = 50;  //바깥클래스 인스턴스 필드 사용 가능
			iam();
			System.out.println(A.sia+B.sbb);
			A.siam();
			bbM();
			B.sbbM();
		}
		static void sbm() {   
			//ia = 50;   //static 메소드는 new 전에 heap에 올라가야하기때문에, static만 사용 가능
			//iam();    
			System.out.println(A.sia);
			A.siam();
		}
	}
}
