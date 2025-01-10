package p696;

public class LamdaEx2 {

	public static void main(String[] args) {
		//방법2 나누기
		Impl impl = new Impl();
		impl.iM(1.5, 3);
		
		I i2 = new I() {
			public void iM(double a, int b) {
				System.out.println(a/b);
			}
			};
			i2.iM(10.2, 2);
			//방법3 더하기 : 람다식 함수 만들기, 함수호출 필요
			I i3 = (double a, int b) -> {System.out.println(a +b);};
			I i4 = (a, b) -> System.out.println(a +b);
			//함수호출
			i3.iM(7.8, 11);
			i4.iM(8.2, 4);
	}
}
@FunctionalInterface //하기의 인터페이스는 함수적 인터페이스임을 표기
interface I {
	void iM(double a, int b);
}
	
	//방법1 곱하기 : class 생성
class Impl implements I{
	
	@Override
	public void iM(double a, int b) {
		System.out.println(a * b);
	}	
}
		
