package ch07_05.pa1;

import ch07_05.A;

public class D extends A {
	public D() {
		super();
	}
		public void methond1() {
			this.field = "value";
			this.method();
			
			super.field = "v111";
			super.method();
		}
		public void method() {
//			A a=new A();
//			a.field = "value";
//			a.method();
		
	}
}