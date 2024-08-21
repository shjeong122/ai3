package ch05;

public class P180 {

	public static void main(String[] args) {
		// 180 3차원 면/행/열
		int[][][] iarr1 = {{{1,2},{3,4},{5,6}},{{7,8},{9,10},{11,12}}}; //2*3*2
		int[][][] iarr2 = {{{1},{2}},{{3},{4}},{{5},{6}}}; //3*2*1
		int[][][] iarr3 = {{{1,2},{3,4}},{{5,6},{7,8}}};  //2*2*2
		
		int[][][] iarr4 = new int[3][2][1];
		int[][][] iarr5 = new int[2][][];
		iarr5[0] = new int[2][];
		iarr5[1] = new int[4][];
		iarr5[0][0] = new int[2];
		iarr5[0][0][0] =1;
		iarr5[0][0][1] =2;
		
		iarr5[0][1] =new int[2];
		iarr5[0][1][0] =3;
		iarr5[0][1][1] =4;
		
		iarr5[1][0] = new int[4];
		iarr5[1][0][0] = 5;
		iarr5[1][0][1] = 6;
		iarr5[1][0][2] = 7;
		iarr5[1][0][3] = 8;
	}

}
