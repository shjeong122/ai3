package ch06;

public class CarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Car car = new Car();
		System.out.println(car.model + " " + car.speed + " " + car.start);
		// null 0 false
		car.model = "그랜져";
		car.speed = 300;
		car.start = false;
		//소나타 280 true
		Car car1 = new Car();
		car1.model = "소나타";
		car1.speed = 280;
		car.start = true;
		//k5 240 false
		Car car2 = new Car();
		car2.model = "k5";
		car2.speed = 240;
		car2.start = false;
		//EV6 340 true
		Car car3 = new Car();
		car3.model = "EV6";
		car3.speed = 340;
		car3.start = true;
				
		//모든 자동차의 모델명
		System.out.println("자동차 모델명 : "+ car.model + ", "+car1.model + ", "+car2.model +", "+ car3.model);
		//스피드 평균
//		int sum=0;
//		for(int i=0; i<3; i++) {
//			int sum += (int)(car[i].speed)
					
	
		System.out.println("자동차의 스피드 평균 : "+(car.speed + car1.speed + car2.speed + car3.speed)/4);
		
		//start가 false 자동차 모델
		if(!(car.start)) {
			System.out.println(car.model);
		} if(!(car1.start)) {
			System.out.println(car1.model);
		} if(!(car2.start)) {
			System.out.println(car2.model);
		} if(!(car3.start)) {
			System.out.println(car3.model);
}
	}

}
