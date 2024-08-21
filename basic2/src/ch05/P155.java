package ch05;

public class P155 {

	public static void main(String[] args) {
		// 155
		
		String hobby = "여행";   
		hobby = null;             // hobby : 여행 => null, 쓰여진 힙의 여행 => Garbage
		String kind1 = "자동차";
		String kind2 = kind1;
		kind1 = null;
		System.out.println("kind2 : "+kind2);
		System.out.println("hobby : "+hobby);
		System.out.println("kind1 : "+kind1);

	}

}
