package P658;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapSetEx {

	public static void main(String[] args) {
		Map<String, Integer> map = new Hashtable<String, Integer>();
		
		//삽입_HashMap(K, V)
		map.put( "a", 100);
		map.put( "b", 200);
		map.put( "c", 300);
		map.put( "d", 400);
		
		//size 구하기
		System.out.println(map.size());
	
		//"C" 찾기_658
		System.out.println(map.containsKey("c")); 
		
		//값 500 찾기
		System.out.println(map.containsValue(500));
		
		//200 출력
		System.out.println(map.get("b"));
		
		//전체값 출력
		//반복문_key 모아주는 메소드_.keyset
		Set <String> keys = map.keySet(); //Set은 순서가 없다.
		System.out.println(keys);
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String key = it.next() ;
				System.out.println(key + "==>" + map.get(key));
			
			
		}
		
	}
}
