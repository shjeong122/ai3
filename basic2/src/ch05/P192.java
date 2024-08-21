package ch05;

public class P192 {

	public static void main(String[] args) {
		// 잘 틀리는 부분
//		int[][] iarr = new int[2][];
//		iarr[0] = new int[2];  
//		
//		iarr[0][0] = 10;
//		iarr[0][1] = 20;   // 실행하면 에러 발생
		
		// =>
		int[][] iarr1 = new int[2][];
		iarr1[0] = new int[2];  //이부분이 필요하다.
		
		iarr1[0][0] = 10;
		iarr1[0][1] = 20;  
		
		// and
		int[][] iarr2 = new int[2][];
		iarr2[0] = new int[2];  //이부분이 필요하다.
		iarr2[1] = new int[2];
		
		iarr2[0][0] = 10;
		iarr2[0][1] = 20;
		iarr2[1][0] = 30;
		iarr2[1][1] = 40;
		
	}

}
