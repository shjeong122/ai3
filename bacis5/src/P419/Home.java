package P419;

public class Home {
	//rc라는 필드안에 익명형 구현객체를 만들어준 형태
	private RemoteControl rc = new RemoteControl() { //익명구현객체 : new 인터페이스() {};
		
		@Override                                    //추상메소드 오버라이드
		public void turnOn() {
			System.out.println("TV를 켭니다.");
		}
		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}
	}; 
	//방법1 필드사용 메소드 생성
	public void use1() {
		rc.turnOn();
		rc.turnOff();
	}
	//방법2 로컬클래스: 설계, new , 사용/메소드안에 익명 구현 객체를 만들어 쓰기
	public void use2() {
		RemoteControl rc = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("에어컨을 켭니다.");		
			}		
			@Override
			public void turnOff() {
				System.out.println("에어컨을 끕니다.");			
			}
		};
		rc.turnOn();
		rc.turnOff();
	}
	//방법3 매소드 매개변수 안에 익명구현객체 생성
	public void use3(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
		
	}
	
}
