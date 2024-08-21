package basic6;

public class P131 {

	public static void main(String[] args) {
		// while
//		while(조건식) {
//			조건식이 참이면 수행할 문장 ;
//		} 거짓이면 수행할 문장
		
		int i=0;
		while(i<=10) {
			System.out.print(i+" ");
			i++;
		} System.out.println();
//20~50, 1씩 증가 출력
// 합계 구하기
		i = 20;
		int sum = 0;
		while (20 <= i && i <= 50) {
			System.out.print(i + " ");
			sum += i;
			i++;
		}
		System.out.println();
		System.out.println("합계는 " + sum);
//100~50 5의 배수 
//개수 세기
//합계
//평균
//합계가 700이상이면 반복문 나오기

		i = 100;
		sum = 0;
		int cnt = 0;
		while (i >= 50) {
			System.out.print(i + " ");
			sum += i;
			cnt += 1;
			if (sum >= 700) {
				break;
			}
			i = i - 5; // i-=5
		}
		System.out.println();
		System.out.println("합계는 " + sum);
		System.out.println("개수는 " + cnt);
		System.out.println("평균은 " + sum / cnt);
		
		
	}

}
