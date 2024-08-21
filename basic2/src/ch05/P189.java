package ch05;

public class P189 {

	public static void main(String[] args) {
		// 배열 복사
		
		int[] oldIntArray = {1,2,3};
		int[] newIntArray = new int[5];
		
//		for(int i=0; i<oldIntArray.length; i++) {
//			newIntArray[i] = oldIntArray[i];
//		}
		for(int i=0; i<newIntArray.length; i++) {
			System.out.print(newIntArray[i] + " ");
		}System.out.println();
	
		//190
//		System.arraycopy(oldIntArray, 0, newIntArray, 0, 2);   //void : return하지 않는다, 변수에 값을 얹지도 출력하지도 못한다.
//	                   // 원본배열명 복사시작인덱스 사본배열명 인덱스번호 개수 
//		for(int i=0; i<newIntArray.length; i++) {
//			System.out.print(newIntArray[i] + " ");
//		}System.out.println();

		System.arraycopy(oldIntArray, 2, newIntArray, 1, 1);  
		for(int i=0; i<newIntArray.length; i++) {
			System.out.print(newIntArray[i] + " ");
} System.out.println();
		System.out.println("---------------------");
		for( int i :newIntArray) {
			System.out.print(i+" ");
			
		}System.out.println();
		System.out.println("---------------------");
		int[][] iArr1 = {{1,2,3},{4,5,6}};
		//일반 for문
		for(int i=0; i<iArr1.length; i++) {
			for(int j=0; j<iArr1[i].length; j++) {
				System.out.print(iArr1[i][j]+" ");
			}
			System.out.println();
		}System.out.println("---------------------");
		//향상된 for문
		for(int[] iAr : iArr1) {
			for(int i : iAr) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		
		
		//3차원
      int[][][] iArr5 = { { {10,20},{30,40} },{ {50,60},{70,80} } };
      //일반for문으로 출력하기
      for( int i=0; i<iArr5.length; i++) {
         for(int j=0; j<iArr5[i].length; j++) {
            for( int k=0; k<iArr5[i][j].length ; k++) {
               System.out.print(iArr5[i][j][k]+ "  ");
            }
            System.out.println();
         }
         System.out.println();
      }
      //향상된 for문
      for( int[][] iAr : iArr5) {
         for( int[] iA  : iAr ) {
            for(int i : iA ) {
               System.out.print( i + " ");
            }
            System.out.println();
         }
         System.out.println();
      }

}	
}
