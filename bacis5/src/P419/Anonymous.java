package P419;

public class Anonymous {
	//방법 1. 필드 익명구현객체
	//방법 2. 메소드안에 익명구현객체
	//방법 3. 메소드(매개변수안에 익명구현객체)
	
	//방법1
	Vehicle field = new Vehicle() {
	@Override
	public void run() {
		System.out.println("자전거가 달립니다.");
	}
};		
	//방법2
	void method1() {
		Vehicle localVar = new Vehicle() {
		@Override
		public void run() {
			System.out.println("승용차가 달립니다.");
		}
	};
	localVar.run();
}	
	//방법3
	void method2(Vehicle v) {
		v.run();
	}
}