package P343;

public class RemoteControlEx {

	public static void main(String[] args) {
		RemoteControl.changeBattery(); 
		//인터페이스명.메소드명();
		
		RemoteControl rc;
		rc = new Television();
		rc.turnOn(); 
		//인터페이스=>turnOn(Television)
		
		rc = new Audio();
		rc.turnOn();
		
		rc = new SmartPhone();
		rc.turnOn();
		rc.setMute(false);
		
		rc = new Printer();
		rc.turnOn();
		rc.setMute(false);
		
		System.out.println( RemoteControl.MAX_VOLUME);
		System.out.println( RemoteControl.MIN_VOLUME);
	}

}
