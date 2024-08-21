package P320R;

public class DriverEx {

	public static void main(String[] args) {
		// 객체 생성
		// 매개값으로 driver() 메소드 호출
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		driver.drive(bus);
		Taxi taxi = new Taxi();
		driver.drive(taxi);			

	}

}
