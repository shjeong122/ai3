package basic4;

public class P94 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int charCode = 'A';    //유니코드 65
		//int charCode = 'a';    // 97
		int charCode = '5';      //122

		if ( (65<=charCode)&& (charCode<=90)) {
			System.out.println("대문자이군요.");
		}
		if ( (97<=charCode)& (charCode<=122)) {
			System.out.println("소문자이군요.");
		}
		if ( (48<=charCode)&& (charCode<=57)) {
			System.out.println("0~9 숫자이군요.");
		}	
	//--------------------------------------------
		
		//int value = 6;
		int value = 7;
		if( (value%2 == 0) | (value%3 == 0) ) {
			System.out.println("2 또는 3의 배수이군요.");
		}
		boolean result = (value%2 == 0) | (value%3 == 0);
		if( !result ) {
			System.out.println("2 또는 3의 배수가 아니군요.");
		}	
		//삼항 연산자
		int a = -10;
		a= a+5;
		String answer;
		answer = (a>0) ? "양수" : "음수";
		System.out.println(answer);
		
		
		int score = 95;
		char grade = (score> 90) ? 'A' : ((score>80) ? 'B' : 'C');
		System.out.println(score + "점은 " + grade + "등급입니다.");
		
	}
}
