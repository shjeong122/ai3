package P404;

public class A {
	String name;
	int a() {return 0;};
	static String sname;
	static double sa() {return 0.0;};
	
	void m() {  //메소드 안에 클래스 생성
		class B {
			String b;
			int bM() { return 0;};
			static String sb;
			static double sb() {return 0.0;};
			
			void bbM() {
				name = "홍길동";
				a();
				A.sname = "이순신";
				A.sa();
				b="김수진";
				bM();
				B.sb = "이명자";
				B.sb();
				System.out.println(name + " " + A.sname + " " + b + " " + B.sb);
				
			}
		}// end B
		B b = new B(); //메소드 끝나기 전 객체화할 것
		b.bbM();   //객체화 후 사용, 내부에서만 사용 가능
		 
	}// end m();
	
}
