package basic6;

import java.util.Scanner;

public class P133 {

	public static void main(String[] args) {
		//keycontrolExample.java
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int speed = 0;

		while (run) {
			System.out.println("------------------------");
			System.out.println("1. 증속 | 2. 감속 | 3. 중지");
			System.out.println("------------------------");
			System.out.print("선택: ");

			String strNum = scanner.nextLine();
//if문
//			if (strNum.equals("1")) {
//				speed++;
//				System.out.println("현재 속도 = " + speed);
//			} else if (strNum.equals("2")) {
//				speed--;
//				System.out.println("현재 속도 = " + speed);
//			} else if (strNum.equals("3")) {
//				run = false;
//			}
//		}
//		System.out.println("프로그램 종료");
		
//switch
//속도의 최대는 10, 최소는 0
			switch(strNum) {
			case "1" :
				speed++;
				if(speed>10) {
					speed = 10;
				}
				System.out.println("현재 속도 = " + speed);
				break;
			case "2" :
				speed--;
				if(speed<0) {
					speed = 0;
				}
				System.out.println("현재 속도 = " + speed);
				break;
			case "3" : 
				run = false;
				break;
			default :
				System.out.println("메뉴는 1/2/3 중에 1개를 고르세요.");
			}
		}System.out.println("프로그램 종료");
		
	}

}
