package ch07;

public class P288SmartPhone extends P288Phone {
	   //   자식클래스	         //      부모클래스
	
	public boolean wifi;

	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태를 변경했습니다.");
	}
	
}
