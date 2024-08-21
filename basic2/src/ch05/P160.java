package ch05;

public class P160 {

	public static void main(String[] args) {
		// 160
		String ssn="9506244230123";
		char sex = ssn.charAt(6);  //해당 인덱스의 번호에 따른 문자 출력, 6번째 인덱스의 값을 리턴(반환)
		System.out.println(sex); 
		switch(sex) {
		case '1' :
		case '3' :
			System.out.println("남자입니다.");
		case '2' :
		case '4' :
			System.out.println("여자입니다.");
			
		}
	
		int lenth = ssn.length();
		System.out.println(lenth);
		
		if(lenth==13) {
			System.out.println("주민번호 맞는 자리수 입니다.");
		} else {
			System.out.println("주민번호 자리수가 틀립니다.");
			
		}
		String oldStr = "자바 문자열은 불변입니다. 자바 문자열은 String입니다.";
		String newStr = oldStr.replace("자바", "JAVA");
		
		System.out.println(oldStr);
		System.out.println(newStr);
		
		String san = "880815-1234567";
		String firstNum = san.substring(0, 6);
		String secondNum = san.substring(7);
		
		System.out.println(firstNum);
		System.out.println(secondNum);
		// 문자엺 잘라내기
		String phone="010-3214-5789";
		String firsTNum = phone.substring(0, 3);
		String seconDNum = phone.substring(4, 8);
		String tirthNum = phone.substring(9, 13);
		System.out.println(firsTNum);
		System.out.println(seconDNum);
		System.out.println(tirthNum);
		// 문자열 대체하기
		String seconDNum2 = seconDNum.replace("3214","4414");
		System.out.println(seconDNum2);
		// 문자열 출력하기(string -> int)
		int tirthNum2 = Integer.parseInt(tirthNum);
		System.out.println(tirthNum2+1000);
	
		String str10 = "abcdefg";
		//c가 몇번째 인덱스에 있는지 찾기 결과 2
		int str10CIndex = str10.indexOf("c");
		System.out.println("c의 인덱스 번호 : "+ str10CIndex);
		int str10FIndex = str10.indexOf("f");
		System.out.println("f의 인덱스 번호 : "+str10FIndex);
		int str10kIndex = str10.indexOf("k");
		System.out.println("f의 인덱스 번호 : "+str10kIndex);  //-1
		
		if(str10CIndex == -1) {
			System.out.println("없는 문자입니다.");
		} else {
			System.out.println("c의 인덱스 번호 : "+str10CIndex);
		}
	
		String board = "1. 자바 학습, 참조 타입 String을 학습하니다. , 홍길동";
		//문자열 분리
		String[] tokens = board.split(",");
		System.out.println(tokens);
		System.out.println(tokens[0]);
		System.out.println(tokens[1]);
		System.out.println(tokens[2]);
		
		for(int i=0; i<3; i++) {
			System.out.println(tokens[i]);
		}	
		for(String b : tokens) { //향상된 for 문 : 형식 for(자료형 변수명 : 배열명) {}
			System.out.println(b);
		}
		
		String word = "사과-바나나-복숭아-수박-딸기" ;
		String[] words = word.split("-");
				
		for(String c : words) {
			System.out.print(c);			
		}	System.out.println();
			System.out.println(words[0]);
		}
	
	
	}

	
