package P378;

public class Car {
	Tire tire1 = new HankookTire();
	Tire tire2 = new MichelinTire();
	Tire tire3 = new KumhoTire();
	
	void run() {
		tire1.roll();
		tire2.roll();
		tire3.roll();
	}
}
