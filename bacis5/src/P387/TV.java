package P387;

public class TV implements Remocon{

	@Override
	public void powerOn() {
		System.out.println("TV를 켰습니다.");

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Remocon r = new TV();
		r.powerOn();
	}


}