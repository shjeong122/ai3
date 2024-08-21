package basic4;

public class P109 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 확인문제
		
	//1. 출력결과 확인
		int x = 10;
		int y = 20;
		int z = (++x) +(y--);
		System.out.println(z);
		
	//2. 출력결과 확인
		int score = 85;
		String result = (!(score>90))?"가":"나";
		System.out.println(result);
		
	//3. 연필 534자루 30명에게 똑같은 개수로 나누어줄때 1인당 갖는 연필 수와 나머지
		int pen = 534;
		int stud = 30;
		
		int penPerstud = (pen/stud);
		System.out.println(penPerstud);
		
		int leftPen = (pen%stud);
		System.out.println(leftPen);
		
	//4. 십의 자리 이하를 버리는 코드
		int value = 356;
		System.out.println((value/100)*100);
				
	//5. 사다리골의 넓이, 정확히 소수 자릿수 나올수 있도록
		
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = (lengthTop+lengthBottom)*height/2.0;
		System.out.println(area);
		
	//6. 연산자 출력결과
		int x1=10 ;
		int y1=5;
		
		System.out.println((x1>7)&& (y1<=5));
		System.out.println((x1%3 ==2)||(y1%2 !=1 ));
		
	//7. NaN값을 검사해서 올바른 결과가 출력되도록
		double x2=5.0;
		double y2= 0.0;
		double z2 = 5%y2;
		if (Double.isNaN(z2)) {
			System.out.println("0.0으로 나눌 수 없습니다.");
		} else {
			double result2 = z2 +10;
			System.out.println("결과: " + result2);
			
		}
				
	}

}
