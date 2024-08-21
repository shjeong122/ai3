package P327;

public abstract class Phone {
	String owner;
	public Phone(String owner) {
		this.owner = owner;
	}
	void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	void turnOff( ) {
		System.out.println("폰 전원을 끕니다.");
	}
	abstract void ab(); //추상메소드_내용이 없는 형태
	abstract void abb(); //추상메소드
}
