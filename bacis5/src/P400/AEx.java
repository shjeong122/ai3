package P400;

import java.awt.image.SampleModel;

import P400.A.B;

public class AEx {

	public static void main(String[] args) {
		A.sa = true;  //객체화 없이 사용 가능, static A.
		A.saM();
		
		
		A a = new A(); //외부 클래스 인스턴스 객체화 후 사용 , a.
		a.a = 3.5;
		a.aaM();
		a.aM();
		
		B.sb=true; //static 객체화 없이 그냥 사용 가능
		B.sbbM();
		B.sbM();
		
		A.B b = new A.B(); //A객체화 없이 B객체화하여 사용 가능
		b.b = 2.4;
		b.bbM();
		b.bM();	
	}
}