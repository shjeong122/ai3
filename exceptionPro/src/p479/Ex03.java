package p479;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Ex03 ex03 = new Ex03();
	try {
		ex03.m1();
	} catch(NumberFormatException e) {
		System.out.println("예외 처리");
	} catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("배열 예외 처리");
	} catch(Exception e) {
		System.out.println("모든 예외 처리");
	}
	}
	void m1() throws Exception {
		m2();
	}
	void m2() throws NumberFormatException, ArrayIndexOutOfBoundsException {
		m3();
		//예외 발생
		double [] dA = new double[3];
		dA[3] = 2.5;
	}
	void m3() throws NumberFormatException{
		//예외 발생
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요>> ");
		String nn = sc.next();
		int n = Integer.parseInt(nn);
		System.out.println( n + 100);
		
	}
}
