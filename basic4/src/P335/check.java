package P335;

public class check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AA aa = new AA();
		A a1;
		a1 = aa; // 큰타입 부모 = 작은타입 자식(자동형변환 up casting)
		A a2 = new A();
		aa = (AA) a2; //잘못된 것_a2 는 AA의 객체가 없다
		aa = (AA) a1; // 맞는 것 _a1주소에 AA객체가 있다(강제형변환 down Casting)
		
	}	

}

class A{
	String name;
	void a() {} ;
	void k() {} ;
	
}
class AA extends A{
	@Override
	public void k() {
		// TODO Auto-generated method stub
		super.k();
	}
	
	void aa() {
		name = "김수연";
		a();
		
	}
	
}