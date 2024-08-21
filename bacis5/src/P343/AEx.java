package P343;

public class AEx {

	public static void main(String[] args) {
		A a = new A(); // 추상클래스이기 때문에 객체 생성 불가
		II ii = new A(); //다형성
		I i = new A();

	}

}
