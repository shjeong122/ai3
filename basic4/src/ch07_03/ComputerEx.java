package ch07_03;

public class ComputerEx {

	public static void main(String[] args) {
		int r=10;
		//부모 객체 생성
		Calculator c = new Calculator();
		System.out.println("원면적 : " + c.areaCircle(r)); //3.14159 * r * r
		System.out.println();
		//자식 객체 생성
		Computer co = new Computer();
		//자식객체 생성 후 메소드 호출하면 자식 내용 출력
		System.out.println("원면적 : " + co.areaCircle(r)); //Math.PI *r*r
		System.out.println();
		
	}	

}
