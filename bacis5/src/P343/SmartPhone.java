package P343;

public class SmartPhone implements RemoteControl {
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("스마트폰을 켭니다.");
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;	
		}
		System.out.println("현재 TV 볼륨 : " + this.volume);
		
	}

}
