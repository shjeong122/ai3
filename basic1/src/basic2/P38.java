package basic2;

import java.util.Scanner;

public class P38 {

	public static void main(String[] args) {
		int value=0;
		int result = value + 10;
		System.out.println(result);
		
		Scanner sc = new Scanner(System.in); //콘솔(키보드 입력) 객체
		System.out.println("시를 입력하세요");
		int hour=sc.nextInt();
		System.out.println("분을 입력하세요");
		int minute=sc.nextInt();
		
		System.out.println(hour + "시간" + minute + "분");
		int totalMinute = (hour*60) + minute;
		System.out.println("총" + totalMinute +"분");	
	}
}
