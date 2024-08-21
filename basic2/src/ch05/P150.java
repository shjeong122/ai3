package ch05;

public class P150 {

	public static void main(String[] args) {
		// 150
		int[] arr1; //배열 정수만 넣을 수 있는 배열(리스트)
		int[] arr2;
		int[] arr3;
		
		arr1 = new int[] { 1,2,3 };
		arr2 = new int[] { 1,2,3 };
		arr3 = arr2;
		
		System.out.println(arr1 == arr2 );   // false
		System.out.println(arr2 == arr3 );   // true

		String refVar1 = "자바";              //약식
		String refVar2 = new String ("자바");   //표준
		String refVar3 = null;               //힙메모리 주소가 없는 상태
		System.out.println(refVar1.length());  //2
		System.out.println(refVar3);           //null
		System.out.println(refVar3.length());  //NullPorinterException
		
	}

}
