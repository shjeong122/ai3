package p468;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		double a = 10.5/0;
		System.out.println(a);
	try {
		System.out.println("데이터베이스를 엽니다.");
		System.out.println("키값을 10만원 샀습니다.");
		int[] iA = new int[10];
		for(int i=0; i<iA.length; i++) {
			iA[i] = 10+i;
			System.out.println(iA[i]);
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요>> ");
		String n = sc.next(); //10 "10"
		//"10" -> 10
		int nn = Integer.parseInt(n);
		System.out.println( nn + 100 );
		
		FileInputStream fis = new FileInputStream("file.txt");
	/*	
	}catch(ArrayIndexOutOfBoundsException ex) { // Arry ... Exception : 에러를 담당하는 클래스
		System.out.println("위의 예외가 발생하면 이곳을 수행");
		System.out.println(ex.getMessage());
	}catch(NumberFormatException ex1) {
		System.out.println("정수를 입력하라고요~");
		System.out.println(ex1.getLocalizedMessage());
	} catch (FileNotFoundException e) {
		System.out.println("file.txt 파일이 없나봄");
		e.printStackTrace();
		*/
	} catch(ArrayIndexOutOfBoundsException | NumberFormatException e) {
		System.out.println("위의 예외가 발생하면 이곳을 수행");
		System.out.println(e.getMessage());
		
	} catch(Exception e) {
		System.out.println(e.getMessage());
		
	}finally {
		System.out.println("테이터베이스를 종료합니다.");
		System.out.println("키값을 메모리에서 삭제합니다.");
	}
}
}