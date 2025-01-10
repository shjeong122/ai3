package payproject;

import java.util.ArrayList;
import java.util.Scanner;

public class PayMain {
	//모든 메소드가 사용할 수 있도록 main밖에 작성
	static Scanner sc = new Scanner(System.in); //입력 명령
	
	static ArrayList<Employee> empList = new ArrayList<>();	//객체생성
	static ArrayList<Staff> staffList = new ArrayList<>();	
	static ArrayList<RegEmp> regLlist= new ArrayList<>();
	static ArrayList<TempEmp> tempList = new ArrayList<>();
	
	static Employee emp = new Employee();
	static Staff staff = new Staff();
	static RegEmp regEmp = new RegEmp();
	static TempEmp tempEmp = new TempEmp();
	
	public static void main(String[] args) {
		int count = countMem();
		for(int i=0; i<count; i++) {
			inputBasic();//사원이름+번호
			inputShift(i);//근무형태
		}
		//출력
		printAll();
	}
	public static void printAll() {
		System.out.println("급여보고서");
		System.out.println("CEO 급여");
		for(Staff s : staffList) {
			System.out.println(s);
		}
		System.out.println("정규직 급여");
		for(RegEmp r : regLlist) {
			System.out.println(r);
		}
		System.out.println("임시직 급여");
		for(TempEmp t : tempList) {
			System.out.println(t);
		}
	}
			public static int countMem() {
				System.out.println("=======================================");
				System.out.println("MBC 아카데미 직원 급여");
				System.out.println("---------------------------------------");
				System.out.println();
				System.out.print("사원 수 : ");
				int count = sc.nextInt(); //입력
				return count;
			}
			public static void inputBasic() {
				System.out.print("사원 이름 : ");
				String name = sc.next(); 	//저장 => 배열, 컬렉션 사용을 위해 객체생성 ArrayList<Employee>
				emp.name = name;
				
				System.out.print("사원 번호 : ");
				String sno = sc.next(); 	
				emp.sno = sno;
				
				empList.add(emp);		//list에 담기	
			}
			private static void inputShift(int i) {
				System.out.print("근무 유형(1.CEO, 2.정규직, 3.임시직) : ");
				int shift = sc.nextInt();
				if(shift == 1) {
					System.out.print("직책 : ");
					String staffTitle = sc.next(); //대표
					staff.title = staffTitle;
					System.out.println("급여 : ");
					staff.staffPay = sc.nextInt(); 
					staff.staffPay = staff.earnings();
					
					staff.name = empList.get(i).name;
					staff.sno = empList.get(i).sno;
					
					staffList.add(staff);
					//System.out.println(staffList.get(i));
							
					
				}else if(shift == 2) {
					System.out.println("부서 : ");
					regEmp.dept = sc.next();
					System.out.println("업무 : ");
					regEmp.regTitle = sc.next();
					System.out.println("급여 : ");
					regEmp.regPay = sc.nextInt();
					regEmp.regPay = staff.earnings();
					
					regEmp.name = regLlist.get(i).name;
					regEmp.sno = regLlist.get(i).sno;
					
					regLlist.add(regEmp);
					//System.out.println(regLlist.get(i));
					
				}else if(shift == 3) {
					System.out.println("부서 : ");
					String dept = sc.next();
					tempEmp.dept = dept;
					System.out.println("월 근무 시간수 : ");
					int hour = sc.nextInt();
					System.out.println("급여 : ");
					tempEmp.tempHour = hour;
					
					tempEmp.name = tempList.get(i).name;
					tempEmp.sno = tempList.get(i).sno;
					
					tempList.add(tempEmp);
					//System.out.println(tempList.get(i));
					
				}else if(shift == 4) {
					
				}
					
				
				
}
}
