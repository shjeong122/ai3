package ch0601;

public class CalculatorEx {

	public static void main(String[] args) {
		// Calculator 객체 생성
		Calculator myCalc = new Calculator();
		
		//리턴값이 없는 메소드
		myCalc.powerOn();
		//plus 메소드 호출 시 5와 6 매개값 제공
		//덧셈 결과 리턴받아 result1 변수 대입
		int result1 = myCalc.plus(5,6);
		System.out.println("result1: " + result1);
		int x = 10;
		int y = 4;
		double result2 = myCalc.divide(x, y);
		System.out.println("result2 : " + result2);
		
		myCalc.powerOff();

		Calculator myCalcu = new Calculator();
		double result3 = myCalcu.areaRectangle(10);
		double result4 = myCalcu.areaRectangle(10,20);
		System.out.println("정사각형 넓이 = " + result3);
		System.out.println("직사각형 넓이 = " + result4);
		

	}	

}
