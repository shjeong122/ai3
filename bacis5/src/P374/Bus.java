package P374;

public class Bus implements Vehicle {
	
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
		
	}
	public void checkFare() {
		System.out.println("승차요금을 채크합니다.");
	}
}
