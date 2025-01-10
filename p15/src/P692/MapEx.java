package P692;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MapEx {


	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>() ;
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;	
		
		
		//90구하기
		System.out.println(map.get("blue"));
		
		//평균 점수
		//키값들만 뽑아서 반복문으로 값의 합계 및 평균 구하기
		Set <String> keys = map.keySet();
		Iterator<String> it1 = keys.iterator();
		while(it1.hasNext()) {
			String key = it1.next() ;
			int value = map.get(key);
			totalScore += value;
			//totalScore = map.get(key);
		}
		
		//최고 점수
		Iterator<String> it2 = keys.iterator();
		while(it2.hasNext()) {
			String key = it2.next() ;
			if(maxScore<map.get(key)) {
				maxScore = map.get(key);
				name = key;
			}
			
		//최고 점수를 받은 아이디 : blue
	}		
		
		System.out.println("평균 점수 : " + totalScore/map.size());
		double avg = totalScore/ (double) (map.size());
		int avg2=(int) (avg*100);
		double avg3=avg2/100.00;
		System.out.println("소수점 둘째자리 평균 : " + avg3);
		System.out.println("최고 점수 : " + maxScore);
		System.out.println("최고 점수를 받은 아이디 : " +  name);
	}
}
