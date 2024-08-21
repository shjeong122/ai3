package P337;

public class SnowTireEx {

	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire() ;
		Tire tire = snowTire;
		snowTire.run();
		tire.run();
		
		tire = snowTire;
		tire.run();
		
		//classCastException 예외 발생_다운그레이드의 잘못된 예
		//snowTire = (snowTire) tire;
		//snowTire.run() ; 
		
	}

}
