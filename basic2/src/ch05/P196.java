package ch05;

import java.util.Calendar;

public class P196 {

	public static void main(String[] args) {
		// 열거형
		Week today = null;
		Calendar cal = Calendar.getInstance();
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		switch(week) {
		case 1 : today = Week.SUNDAY; break;
		case 2 : today = Week.MONDAY; break;
		case 3 : today = Week.TUESDAY; break;
		case 4 : today = Week.WENDSDAY; break;
		case 5 : today = Week.THURSDAY; break;
		case 6 : today = Week.FRIDAY; break;
		case 7 : today = Week.SATURDAY; break;
		}
		System.out.println(today);
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		} else {
			System.out.println("열심히 자바를 공부합니다.");
		}
		
		LoginResult loginR = null;
		String id = "admin";
		int pwd = 1234;
		
		if(id.equals("admin")&& pwd == 1234) {
			System.out.println(LoginResult.LOGIN_SUCCESS);
		}else {
			System.out.println(LoginResult.LOGIN_FAILED);
		}
	}

}
