package P400;

public class A {
	double a = 1.2;  //인스턴스 변수
	void aM() {};    //인스턴스 메소드
	static boolean sa = true;   //정적 변수
	static void saM() {};    //정적 메소드
	
	void aaM() {
		//b = 3.5;
		//bM();
		B.sb = false;
		B.sbM();
		//bbM();
		B.sbbM();
	}
	
	
	static class B {
		double b = 2.3;
		void bM() {} ;
		static boolean sb = true;
		static void sbM() {} ;
		
		void bbM() {
			//a = 200;   //외부클래스의 인스턴스 멤버 사용 불가
			//aM();
			A.sa = false;
			A.saM();
			b=3.5;
			bM();
			B.sb=false;
			B.sbM();
		}
		static void sbbM() {
			//a = 200;   //외부클래스의 인스턴스 멤버 사용 불가
			//aM() ;
			A.sa=false;
			A.saM();
			//b=3.5;   // 자신클래스의 인스턴스 멤버 사용 불가
			//bM();
			B.sb=false;
			B.sbM();
		}
	}
}
