package ch05;

public class P200 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = {
				{95,6},
				{83,92,96},
				{78,83,93,87,88}
			};
		System.out.println(array.length); //행의 개수
		System.out.println(array[2].length); // 2행의 열의 개수
		
		// 합계, 평균
		int sum = 0; 
		for (int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
			sum = sum + array[i][j];
			}
		}System.out.println("합계 : "+ sum);
		
		int sum1 = 0;
		double avg = 0.0; //평균
		int cnt = 0;
		for(int[] array1 :array ){
			for(int l : array1) {
				sum1 = sum1 + l;
				cnt++;
				System.out.print(l + " ");
			}	
		}System.out.println();
		System.out.println("합계는 " + sum1);
		avg=(double)sum1/cnt ;
		System.out.println("평균은 " +avg);
		
		
		int[] array2 = { 1,5,3,8,2}; 
		//최대값
		int max = -9999;
		for(int k=0; k <array2.length; k++) {
			if(max<array2[k]) {
				max = array2[k];
			}
		}
		System.out.println("최대값 : "+ max);
		
		}
	}
	

			
		
	


