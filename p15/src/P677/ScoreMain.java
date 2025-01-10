package P677;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class ScoreMain {

	public static void main(String[] args) {
		// 비교클래스
		
		TreeMap<Integer, Score> map = new TreeMap<>();
		
		Score s1 = new Score(12, 100);
		Score s2 = new Score(13, 90);
		Score s3 = new Score(14, 80);
		Score s4 = new Score(15, 70);
		Score s5 = new Score(16, 85);
		
		map.put(s1.getHakbun(), s1);
		map.put(s2.getHakbun(), s2);
		map.put(s3.getHakbun(), s3);
		map.put(s4.getHakbun(), s4);
		map.put(s5.getHakbun(), s5);

		
	}

}
