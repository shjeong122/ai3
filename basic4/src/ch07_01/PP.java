package ch07_01;

public class PP extends P{
	public PP() {
		super(); //부모생성자호출 반드시 첫줄에만 사용할 수 있다.
				// 안쓰면 컴파일러가 자동으로 생성, 적지 않아도 됨.
		System.out.println("PP의 생성자");		
	}

}