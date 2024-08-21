package basic5;

public class P121 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 2;
		switch(i) {
			case 1 :
				System.out.println("1입니다");
			case 2 :
				System.out.println("2입니다.");
			case 3 :
				System.out.println("3입니다.");
		}
		int j = 2;
		switch(j) {
			case 1 :
				System.out.println("1입니다");
			case 2 :
				System.out.println("2입니다.");
				break;
			case 3 :
				System.out.println("3입니다.");
		}
		int k = 4;
		switch(k) {
			case 1 :
				System.out.println("1입니다");
			case 2 :
				System.out.println("2입니다.");
				break;
			case 3 :
				System.out.println("3입니다.");
			default :
				System.out.println("1,2,3 중 하나가 아니군요.");
		}
		
		String word ="c";
		switch(word) {
		case "a" :
			System.out.println("apple");
			break;
		case "b" :
			System.out.println("banana");
			break;
		case "c" :
			System.out.println("cat");
			break;
		default :
			System.out.println("다시 확인 하세요.");
		}
		
		//실수형 2.5 2.5입니다. 3.5 3.5입니다. 다시 입력하세요
		/*
		double num=2.5;  // 오류
		switch(num) {
		case 2.5 :
			System.out.println("2.5 입니다.");
		case 3.5 :
			System.out.println("3.5 입니다.");
		default :
			System.out.println("다시 확인 하세요.");
		}*/
		
		
		
}
}