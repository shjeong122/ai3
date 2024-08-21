package ch05;

public class P178 {

	public static void main(String[] args) {
		//178
		//2차원 : = new 자료형[행][열]
		//int[][] iarr5; //스택에 이름이 올라가고, 힙에 값은 없는 상태
				
		int[][] iarr5 = null; //스택에 올라간 배열명은 초기값이 자동으로 안들어 간다 => null로 직접 입력
		System.out.println(iarr5);
		
		//배열 선언하자마자 값 넣기
		int[][] iarr6 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}}; //3*4
		int[][] iarr7 = {{1,2,3},{4,5,6}}; //2*3
		int[][] iarr8 = {{1,2},{1,2},{1,2},{1,2}}; //4*2
		int[][] iarr9 = {{1,2,3},{1,2,3},{1,2,3},{1,2,3},{1,2,3}}; //5*3
		int[][] iarr10 = {{1,2,3,4}}; //1*4
		//new로 배열 만들기
		int[][] iarr11 = new int[3][4];
		int[][] iarr12 = new int[2][3];
		int[][] iarr13 = new int[4][2];
		int[][] iarr14 = new int[5][3];
		int[][] iarr15 = new int[1][4];
		
		int[][] iarr16 = {{1,2,3},{4,5},{6,7,8,9}};
		
		//===========================================
		//출력하기
		System.out.println("배열명 : " + iarr6); //배열명 주소가 출력됨
		System.out.println("배열명의 길이 : "+ iarr6.length); //배열 길이 행의 개수
		System.out.println("0행의 열의 개수 : "+ iarr6[0].length);//0행의 열의 개수
		System.out.println("0행의 2열 : "+ iarr6[0][2]);
		
		System.out.println("배열명 : " + iarr16);//iarr16배열명 출력
		System.out.println("행의 개수 : " + iarr16.length);//행의 개수 출력
		System.out.println("0행의 열의 개수 : " + iarr16[0].length);//0행의 열의 개수 출력
		System.out.println("1행의 열의 개수 : "+ iarr16[1].length);//1행의 열의 개수 출력
		System.out.println("2행의 열의 개수 : "+ iarr16[2].length);//2행의 열의 개수 출력
		
		for(int i=0; i<iarr16.length; i++) {
			for(int j=0; j<iarr16[i].length; j++) {
				System.out.print(iarr16[i][j]+" ");
			}
		}System.out.println();
		
		//iarr8 전체 출력
		//iarr9 전체 출력
		
		}
					
	}


