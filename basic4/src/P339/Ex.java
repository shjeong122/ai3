package P339;

public class Ex {
	public static void action(A a) {
		a.method1();
		if(a instanceof C) { //a주소로 C객체를 가르킬 수 있나요
			C c = (C) a; //작은타입(자식변수) = (작은타입) 큰타입(부모변수)
			c.method2(); //((C) a).method2();
		}
	}

	public static void main(String[] args) {
		action(new A()); // A a = new A()
		action(new B()); // A a = new B()
		action(new C()); // A a = new C()

	}

}
