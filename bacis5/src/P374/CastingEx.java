package P374;

public class CastingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		
		Bus bus = (Bus) vehicle; //강제 타입 변환
		bus.run();
		bus.checkFare();
	}

}
