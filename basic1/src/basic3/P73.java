package basic3;

import java.util.Scanner;

public class P73 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scanner = new Scanner(System.in);
	System.out.println("x값 입력 :");
	String strx = scanner.nextLine(); // "3"
	//"3" -> 3
	int x = Integer.parseInt(strx);
	
	System.out.println("y값 입력 : ");

	String strY = scanner.nextLine();
	
	int y = Integer.parseInt(strY);
	
	int result = x+y;
	System.out.println("x + y = " + result);
	System.out.println();
	
	while(true) {
		System.out.println("입력문자열");
		String data = scanner.nextLine();   //nextLine=python_input
		if(data.equals("q")) {
			break;
		}
		System.out.println("출력 문자열 : "+data);
		System.out.println();
	}
	System.out.println("종료");
	
	
			
	}

}
