package P378;

public class CarEx {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		myCar.run();
		
		myCar.tire1 = new KumhoTire();
		myCar.tire2 = new MichelinTire();
		

		myCar.run();
	}

}