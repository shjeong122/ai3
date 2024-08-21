package ch05;

import java.util.Scanner;

public class P167 {

	public static void main(String[] args) {
		// p167
		int a=10;
		int[] arr;  //arr = null, 주소(힙)는 정수형
		//배열 생성 방법 1. 생성하자마자 값 넣기
		int[] arr1= {1,2,3,4,5};  // 힙에 메모리 할당(스택 -> 힙)
		double[] darr1= {1.1,2.2,3.3};
		String[] str1={"a", "b"};
		boolean[] bool1={true, false, false, true};
		char[] sht1 ={'a','b'};
		Scanner[] scn={new Scanner(System.in), new Scanner(System.in)};
		long[] unit={1000L, 2000L};
		float[] flo={1.1f, 2.2f};
		
		//배열 생성 방법 2. new연산자로 생성
		int[] iarr2 = new int[3]; //배열 안에 값은 없는 상태:다른 데이터베이스에서 정보 불러오기 가능,적은 데이터소모 =>실무에서 더 많이 사용
		//실수형 배열 5칸 만들기
		double[] darr2 = new double[5];
		//문자형 배열 10칸 만들기
		String[] sarr2 = new String[10];
		//논리형 배열 2칸 만들기
		boolean[] barr2 = new boolean[2];
		//student 객체 배열 5칸 만들기 => 선언 후 import 필요
		//Student[] student = new Strudent[5];
		
		
		//=======================
		//배열 사용 방법
		//배열 안에 값 넣고 출력
		String[] sarr3 = {"봄", "여름", "가을", "겨울"};
		System.out.println(sarr3.length); //배열값의 갯수구하기
		for(int i=0; i<sarr3.length; i++) {
			System.out.println(sarr3[i]);
		}
		// 정수10, 20,30 배열 값에 넣고 출력/합계/평균
		
		int[] iarr3 = {10, 20, 30};
		int sum = 0;
		for(int i=0; i<iarr3.length; i++){
		System.out.println(iarr3[i]);}
	 	for(int i=0; i<iarr3.length; i++) {
		sum = sum + iarr3[i];
		}
		System.out.println("합계 : " + sum);
		System.out.println("평균 : "+ (sum/iarr3.length));
		//}
		// 실수 3.1, 1.3, 7.0, 1.0 배열값에 넣고 출력 / 가장 큰수/ 가장 작은 수 
		double[] darr3 = {3.1, 1.3, 7.0, 1.0};
		double max = -9999;   //max의 초기값
		double min = 9999;    //min의 초기값
		for(int i=0; i<darr3.length; i++) {
			System.out.println(darr3[i]);
			if (max < darr3[i]) {
				max = darr3[i];
			}
			if (min > darr3[i]) {
				min = darr3[i];
			} 
		}
			System.out.println("최대값 : "+ max );
			System.out.println("최소값 : "+ min );
			
			
			//=======================
			//정수형 배열 3개 만들기_값 없이
			int[] iarr4 = new int[3];
			for(int i=0; i<iarr4.length; i++) {
				System.out.print(iarr4[i]+ " "); // 0
			}System.out.println();
			//10, 15, 20
			iarr4[0] = 10;
			iarr4[1] = 15;
			iarr4[2] = 20;
			for(int i=0; i<iarr4.length; i++) {
				System.out.print(iarr4[i]+ " ");
			}System.out.println();
			
			//문자형
			String[] sarr4 = new String[3];
			for(int i=0; i<sarr4.length; i++) {
				System.out.print(sarr4[i]+ " ");  //null
			}System.out.println();
			// 1번 인덱스에 "홍길동"을 넣으세요
			sarr4[1] = "홍길동";
			for(int i=0; i<sarr4.length; i++) {
				System.out.print(sarr4[i]+ " ");
			}System.out.println();
			
			//실수형
			float[] farr4 = new float[3];
			for(int i=0; i<farr4.length; i++) {
				System.out.print(farr4[i]+ " "); // 0.0
			}System.out.println();
			// 0번 인덱스에 5.5 넣기
			farr4[0] = 5.5f ;
			for(int i=0; i<farr4.length; i++) {
				System.out.print(farr4[i]+ " ");
			}System.out.println();
			
			//논리형
			boolean[] barr4 = new boolean[3];
			for(int i=0; i<barr4.length; i++) {
				System.out.print(barr4[i]+ " ");  //false
			} System.out.println();
			 // 2번 인덱스에 true를 넣기
			barr4[2] = true;
			for(int i=0; i<barr4.length; i++) {
				System.out.print(barr4[i]+ " ");
			}
			
			
	
}
}

		
	


