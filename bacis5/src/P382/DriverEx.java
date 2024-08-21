package P382;

public class DriverEx {

	public static void main(String[] args) {
		// Driver 객체 생성
		Driver driver = new Driver() ;
		
		//Vehicle 구현 객체 생성
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		//매개값으로 구현 객체 대입(다형성)
		driver.drive(taxi);
		driver.drive(bus);

	}

}
