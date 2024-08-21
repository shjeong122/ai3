package ch05;

public class P185Rank {

	public static void main(String[] args) {
		// MultidimensionalArrayNyNewExample
		//각 반의 학생 수가 3명으로 동일할 경우 점수 저장을 위한 2차원 배열 생성
		int[][] mathScores = new int[2][3];
		int[] rank = new int[6] ;
		//배열 항목 초기값 출력
		System.out.println();
		//배열 항목 값 변경
		mathScores[0][0] = 100 ;
		mathScores[0][1] = 83 ;
		mathScores[0][2] = 85 ;
		mathScores[1][0] = 96 ;
		mathScores[1][1] = 90 ;
		mathScores[1][2] = 72 ;
		
		for(int i=0; i<mathScores.length; i++) { // 반의 수만큼 반복
			for(int k=0; k<mathScores[i].length; k++) { //각 반의 학생 수만큼 반복
				System.out.println("mathScores["+i+"]["+k+"] : "+mathScores[i][k]);				
			}
		}
		int cnt=1;
	      for(int i=0;i<mathScores.length;i++) {
	         for(int j=0;j<mathScores[i].length;j++) {
	            for(int k=0;k<mathScores.length;k++) {  //비교
	               for(int l=0;l<mathScores[k].length;l++) {
	                  if(mathScores[i][j]<mathScores[k][l]) {
	                     cnt +=1;
	                  }
	               }
	            }
	            System.out.println(mathScores[i][j]+"점의 등수는 " +cnt+"등");
	            cnt=1;
	         }
	     
	      }
}
}