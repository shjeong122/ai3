package ch05;

import java.util.Scanner;

public class P201 {

	public static void main(String[] args) {
		// 학생 점수를 분석하는 프로그램
		//키보드 입력하는 프로그램
		Scanner sc = new Scanner(System.in);
		
		int menu = 0;
		int sCnt = 0;
		int[] scores = null;
		while( true ) {
			System.out.println("----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("----------------------------------------------");
			System.out.print("선택>");
			menu = sc.nextInt();
			if(menu == 1) {
				System.out.println("학생수>");
				sCnt = sc.nextInt();
				scores = new int[sCnt];
			}else if(menu == 2) {
				for(int i=0; i<scores.length; i++) {
				System.out.print("scores["+i +"]>");
				scores[i] = sc.nextInt();
				}
			}else if(menu == 3) {
				for(int score :scores) {
				System.out.println("점수 = " + score);
			}
		
		     }else if (menu == 4) {
		    	 int max = -9999;
		    	 int sum = 0;
		    	 for(int score : scores) {
		    		 sum += score;
		    		 if(max < score) {
		    			 max = score;
		    		 }
		    	 }
		         double avg = (double) sum / scores.length;
		            System.out.println("최대값 : " + max);
		            System.out.println( "평균 : " + avg );
		            
		         }else if( menu == 5 ) {
		            System.out.println("프로그램이 종료 됩니다.");
		            break;
		         }        
		      }
	}
}
