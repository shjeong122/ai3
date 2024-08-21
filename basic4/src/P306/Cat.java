package P306;

public class Cat extends Animal{
	//자식=>작은타입
	int a=5;  //4byte 작은타입
	long b=10L; //8byte 큰타이
	
	void m() {
	b=a; //메소드, 대입연산자, 큰타입 = 작은타입 : 자동형변환
	a=(int)b; //작은타입=(작은타입)큰타입 : 강제형변환
	}
}
class Animal {
	//부모 =>큰타입
}