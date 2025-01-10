package p710;

import p706.Calcuable;
import p706.Person;

public class MethodreferenceEx {

	public static void main(String[] args) {
		Person person = new Person();
			
		//기본	
		person.action((double x, double y) -> {
			//처리할 내용이 컴퓨터 클래스의 static 메소드
			//computer.staticMethod()
			return Computer.staticMethod(x, y);		
		});
		//생략
		person.action(( x,  y) -> Computer.staticMethod(x, y));
		
		//인스턴스메소드 호출
		Computer computer = new Computer();
		
		person.action(new Calcuable() {
			
			@Override
			public double calc(double x, double y) {
				return computer.instanceMethod(x, y);}	});
		person.action(( x,  y) -> computer.instanceMethod(x, y));
		
		
		//메소드 참조 ::
		//메소드 참조 안에 람다식 함수 ->
		//람다식 함수 안에 함수적인터페이스 재정의 익명구현클래스 
		
		//람다식_정적메소드
		person.action(Computer::staticMethod);
		//람다식_인스턴스메소드
		person.action(computer::instanceMethod);	
	}
}
