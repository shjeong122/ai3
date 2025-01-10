package P677;

import java.util.Comparator;

public class ScoreComparator implements Comparator<Score> {

	@Override
	public int compare(Score o1, Score o2) {
		// 비교클래스
		// 비교 학번 기준
		return o1.getHakbun() - o2.getHakbun();
	}
	
	
	
}
