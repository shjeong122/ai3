package ch07_03;

public class Computer extends Calculator{

	public double areaCirclekkk(double r) {
		super.areaCircle(r); //부모 메소드 호출
		
		System.out.println("Computer 객체의 areaCirclekkk()실행");
		return Math.PI *r*r;
		
}
	
	

}
