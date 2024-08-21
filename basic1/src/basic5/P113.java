package basic5;

public class P113 {

	public static void main(String[] args) {
		// if문
/*		
		if(조건식) {
			참이면 정리할 내용
		}
		if(조건식) {
			참이면 처리할 내용
		}else {
			거짓이면 처리할 내용
		}
		
		if(조건식1)  {
			1번 조건이 참
		}else if(조건식2) {
			2번째 조건이 참
		}else {
			거짓
		}
*/
		// 요구사항 a가 0이면 0입니다 출력
		int a = 10;
		if(a==0) {
			System.out.println("a는 0입니다.");
		}else {
			System.out.println("a는 0이 아닙니다.");
		}	
		//요구사항 b가 10~20사이에 있으면 "오른쪽, 아니면 "왼쪽" 출력
		int b = 15;
		if(10<=b && b<=20) {
			System.out.println("오른쪽");
		}else {
			System.out.println("중간");
		}
		// 요구사항 c변수에 "kor"이 있으면 "한국"을 출력, "eng"가 있으면 "미국" 출력
		// 다른 것이면 "기타" 출력
		String c="eng";
		if(c=="kor") {
			System.out.println("한국");
		}else if(c=="eng") {
			System.out.println("미국");
		}else {
			System.out.println("기타");
		}
	
		
	}

}
