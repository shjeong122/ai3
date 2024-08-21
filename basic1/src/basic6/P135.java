package basic6;

public class P135 {

	public static void main(String[] args) {
		//135
// do-while
//		do {
//			처리할 내용;
//		}while(조건식);
		
		int i=10;
		do {
			System.out.print(i + " ");
			i--;
		}while(i>0);
		System.out.println();
//50~80까지 출력
		i=50;
		do {
			System.out.print(i + " ");
			i++;
		}while(i<=80);
		
//123 4번 반복
		int j=1;
		Out : do {
			System.out.println();
		i = 1;
		do {
			System.out.print(i + " ");
			if(i==2) break Out;
			i++;
		}	while(i<=3);
			j++;
	}	while(j<=4);
	
		
		OutK : for(int k=10; k<=20; k++) {
			OutM : for(int m=20; m<=25; m++) {
				for(int n=1; n<=2; n++) {
					System.out.println("n="+ n +","+ "m="+ m+"," + "k="+ k );
					if(n==2&&m==21) {
						System.out.println("~~~~~~~~~~");
						break OutM;
					}
				}System.out.println("n반복문 끝");
			} System.out.println("m반복문 끝");
		}System.out.println("k반복문 끝");
			
}
}

