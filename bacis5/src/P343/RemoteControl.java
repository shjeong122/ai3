package P343;

public interface RemoteControl { //인터페이스에서는 추상메소드가 기본
	public static final int MAX_VOLUME = 10; //상수 선언
	 int MIN_VOLUME = 0; // 생략 가능
	 
	public void turnOn();
	void turnOff(); //추상메소드 추가 시 오버라이드 역시 추가해야
	void setVolume(int volume);
	//int a; //변수 선언은 불가 
	
	private void defaultCommen() {
		System.out.println("내부적으로만 사용되는 메소드");
	}
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음처리합니다.");
			setVolume(MIN_VOLUME);
		} else {
			System.out.println("무음을 해제합니다.");
		}	
	}
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}