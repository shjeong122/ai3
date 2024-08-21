package P317R;

public class CarEx {

	public static void main(String[] args) {
		// Car 객체 생성
		Car myCar = new Car() ;
		// Tire 객체 장착
		myCar.tire = new Tire();
		myCar.run();
		
		//한국타이어
		myCar.tire = new HankookTire();
		myCar.run();
		
		//금호타이어
		myCar.tire = new kumhoTire();
		myCar.run();
		
	}

}
