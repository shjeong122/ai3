package ch0603;

public class P256KoreanEx {

	public static void main(String[] args) {
		// final
		P255Korean k1 = new P255Korean("12345-1234567", "김자바");
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
		System.out.println(k1.name);
		k1.name = "홍길동";
		System.out.println(k1.name);
		//k1.nation = "인천";
		//k1.ssn = "555";
	}

}
