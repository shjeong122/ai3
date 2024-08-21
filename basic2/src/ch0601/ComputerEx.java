package ch0601;

public class ComputerEx {

	public static void main(String[] args) {
		// computer 객체 생성
		Computer myCom = new Computer() ;
		//sum() 메소드 호출 시 매개값 1,2,3 제공
		int result1 = myCom.sum(1, 2, 3);
		System.out.println("result1 : " + result1);
		//sum() 메소드 호출 시 매개값 1,2,3,4,5 제공
		//합산 결과를 리턴받아 result2 변수에 대입
		int result2 = myCom.sum(1,2,3,4,5);
		System.out.println("result2 : " + result2);
		//sum() 메소드 호출 시 배열 제공
		//합산 결과를 리턴받아 result3 변수 대입
		int[] values = {1,2,3,4,5};
		int result3 = myCom.sum(values);
		System.out.println("result3 : " + result3);
		//sum() 메소드 호출 시 배열 제공
		//합산 결과를 리턴받아 result4 변수에 대입
		int result4 = myCom.sum(new int[] {1,2,3,4,5});
		System.out.println("result4 : " + result4);
	}
}
