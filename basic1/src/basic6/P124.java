package basic6;

public class P124 {

	public static void main(String[] args) {
		// 124
//		char grade = 'c';
//		switch(grade) {
//		case 'A' :
//		case 'a' :
//			System.out.println("우수 회원");
//			break;
//		case 'B' :
//		case 'b' :
//			System.out.println("일반 회원");
//			break;
//		default:
//			System.out.println("손님입니다.");
//	}
//		//람다식 Lambda
//		switch(grade) {
//		case 'A','a' -> System.out.println("우수 회원");  //java ver13부터 화살표 함수(람다) 추가
//		case 'B','b' -> System.out.println("일반 회원");
//		default -> System.out.println("손님입니다.");
//		}
		
		//요구사항 "A" 점수 100, "B"는 80, 나머지는 60
		
		char grade1 = 'A';
		int score1 = 0;
		if(grade1=='A') {
			score1 = 100;
		}else if(grade1 =='B') {
				score1 = 80;
		}else {
				score1 = 60;
				}
		System.out.println(score1);
			
			
		int score2 =switch(grade1) {
		case 'A','a' -> 100;
		case 'B','b' -> 80;
		default -> 60;
		};
		System.out.println(score2 + "~");	
		
		
		//for문
		
//python		
//		for i in range(10) :
//			print(i) 
//		
//java
//		for(초기값; 조건식; 증가값) {
//			반복할 내용;
//			}
//		for(int i=0; i<10; i++) {
//			System.out.print(i+"  ");	}
//		System.out.println();		
//파이썬 
//for i in range(10,0,-1)
		for(int i1 = 10 ; i1 > 0 ; i1--){
			System.out.print(i1 + " "); }
		System.out.println();	
//for i in range(10,100,20)
		for(int i2 = 10 ; i2 < 100; i2 += 20) {
			System.out.print(i2 + " "); }
		System.out.println();
//for i in range(1,200,5)
		for(int i3=1; i3<200; i3+=5) {
			System.out.print(i3+ " "); }
		System.out.println();
		
		
		
// 1~10까지 5번 출력
//		for(int k=1; k<=5; k++) {
//			for(int j=1; j<=10; j++) {
//				System.out.print(j + " ");	
//			} System.out.println();
//		}
//구구단
//		for(int i=1; i<=9; i++) {
//			for(int j=1; j<=9; j++) {
//				System.out.printf(" " + j+"X"+i+"=" + j*i);
//			}System.out.println();
//		}
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.printf("%2d X %1d = %2d"+" ", j, i, j*i);
			}System.out.println();
		}
		
}
}
		
		
	
	


