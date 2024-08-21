package ch05;

import java.util.Scanner;

public class ScoreProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int menu = 0;
		int sCnt = 0;
		int scores[] = null;
		while(true) {
			System.out.println("----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("----------------------------------------------");
			System.out.print("선택>");
			menu=sc.nextInt();
			
			if(menu == 1) {
				System.out.println("학생수를 입력하세요. ");
				sCnt = sc.nextInt();
				scores = new int[sCnt];
			}
			if(menu == 2) {
				for(int i=0; i<scores.length; i++) {
					System.out.println(i+1 +"번 학생의 점수를 입력하세요");
					scores[i] = sc.nextInt();
			}
			if(menu == 3) {
				
			}
				
				
			}
				
		}
		
		
		
	}

}
