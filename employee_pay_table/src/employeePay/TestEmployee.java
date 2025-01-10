package employeePay;

import java.util.InputMismatchException;
import java.util.Scanner;
import employeePay.*;

public class TestEmployee {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		 // 직원 수 입력
		System.out.print("입력 자료 수: ");
        int count = 0;
        while (true) {
            try {
            	count = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                if (count <= 0) {
                    System.out.println("0보다 큰 수를 입력하세요.");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("숫자를 입력하세요.");
                scanner.next(); // Clear the invalid input
            }
        }
        // 직원 배열 생성
		Employee[] employees = new Employee[count];
		
		// 직원 정보 입력
		 for (int i = 0; i < count; i++) {
			 	String sno = "";
	            String name = "";
	            int type = 0;
		while (true) {
            try {
                System.out.print("사원 번호: ");
                sno = scanner.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("사원 번호(숫자)를 입력하세요.");
            	}
	        }
	        System.out.print("사원 이름: ");
	        name = scanner.nextLine();
	        
	        
	        while (true) {
                try {
                    System.out.print("사원의 근무유형: (1:CEO, 2:정규직, 3:임시직)...");
                    type = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    if (type < 1 || type > 3) {
                        System.out.println("1~3 안의 숫자를 입력하세요.");
                    } else {
                        break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("근무유형을 위의 숫자로 입력하세요.");
                    scanner.next(); // Clear the invalid input
                }
	        }
	        
	        switch (type) {
            case 1: // CEO
                System.out.print("직책: ");
                String title = scanner.nextLine();
                long staffPay = 0;
                while (true) {
                    try {
                        System.out.print("월 임금: ");
                        staffPay = scanner.nextLong();
                        scanner.nextLine(); // Consume newline
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("월 입금을 입력하세요..");
                        scanner.next(); // Clear the invalid input
                    }
                }
                employees[i] = new Staff(name, sno, title, staffPay);
                break;
            case 2: // 정규직
                System.out.print("부서: ");
                String dept = scanner.nextLine();
                System.out.print("업무 ");
                String regTitle = scanner.nextLine();
                long regPay = 0;
                while (true) {
                    try {
                        System.out.print("월 임금: ");
                        regPay = scanner.nextLong();
                        scanner.nextLine(); // Consume newline
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("월 임금을 입력하세요.");
                        scanner.next(); // Clear the invalid input
                    }
                }
                employees[i] = new RegEmployee(name, sno, dept, regTitle, regPay);
                break;

            case 3: // 임시직
                System.out.print("부서: ");
                String hdept = scanner.nextLine();
                int tempHour = 0;
                while (true) {
                    try {
                        System.out.print("월 근무시간 수 : ");
                        tempHour = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("월 근무시간 수를 숫자로 입력하세요.");
                        scanner.next(); // Clear the invalid input
                    }
                }
                employees[i] = new TempEmployee(name, sno, hdept, tempHour);
                break;

            default:
                System.out.println("근무유형 오류 재입력...");
                i--; // Retry this employee
                break;
        }
    }

    // 직원 정보 출력
    for (Employee emp : employees) {
        System.out.println(emp);
        System.out.println("이름: " + emp.getEname() + ", 사원번호: " + emp.getEsno() + "급여액: " + emp.earning());
    }

    // Scanner 닫기
    scanner.close();
}
}
	        
	        
	    
		//사원번호, 이름… 1001 진달래
		//사원의 근무유형: (1:CEO, 2:정규직, 3:임시직)… 1
		//직책, 월 임금…. 대표 1180

		//사원번호, 이름… 2001 개나리
		//사원의 근무유형: (1:CEO, 2:정규직, 3:임시직)… 2
		//부서, 업무, 월 임금…. 인사부 기획 800

//		사원번호, 이름… 2002 민들레
//		사원의 근무유형: (1:CEO, 2:정규직, 3:임시직)… 4
//		근무유형 오류 재입력…
//		사원번호, 이름… 2002 민들레
		
//		사원번호, 이름… 2003 수선화
//		사원의 근무유형: (1:CEO, 2:정규직, 3:임시직)… 2
//		부서, 업무, 월 임금… 영업부 영업 1100
		
//		사원번호, 이름… 2004 선인장
//		사원의 근무유형: (1:CEO, 2:정규직, 3:임시직)… 3
//		부서, 월 근무시간 수… 총무부 35
		
		

