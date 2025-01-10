package p590;

import p589.ChildPair;
import p589.Pair;

public class UtilEx {

	public static void main(String[] args) {
		//4
		Pair<String, Integer> pair = new Pair<>("홍길동", 35);
		Integer age = Util.getValue(pair, "홍길동");  //static 메소드
		System.out.println(age);
		
		ChildPair<String, Integer> childPair = new ChildPair<>("홍삼원", 20);
		Integer childAge = Util.getValue(childPair, "홍삼순");
		System.out.println(childAge);
		
		/*OtehrPair<Stirng, Integer> oterPair = new OterPair<>("홍삼원",20)	;
		int otherAge = Util.getValue(oterPair, "홍삼원");
		System.out.println(otherAge);*/

	}

}
