package ch07_07;

public class D extends C{
	
	public static void main(String[] args) {
	
		B b = new B();
		System.out.println(b.hap(100));
		A a = new A();
		System.out.println(a.hap(10));
		System.out.println(a.sub(10));
		C c = new C();
		System.out.println(c.hap(200));
		System.out.println(c.sub(200));
		System.out.println(c.mul(5));
		
	
}
}
