package P670;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		//treeMap 컬렉션 생성
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		
		//엔트리 저장
		treeMap.put("apple", 10);
		treeMap.put("forever", 60);
		treeMap.put("description", 40);
		treeMap.put("ever", 50);
		treeMap.put("zoo", 80);
		treeMap.put("base", 20);
		treeMap.put("guess", 70);
		treeMap.put("guess", 70);
		treeMap.put("cherry", 30);
		treeMap.put("c", 50);
		treeMap.put("h", 60);
		treeMap.put("zoo", 180);
		
		//전체 출력 방법1
		//1. 키만 뽑아내기
		Set<String> keys = treeMap.keySet() ;
		Iterator<String> it = keys.iterator();
		while(it.hasNext() ) {
			String key = it.next();
			//2. get안에 key 넣어서 출력
			System.out.println(key + " - " + treeMap.get(key));
		}
		System.out.println();
		//전체 출력 방법2_ Entry(key+value) 출력
		//1. 엔트리 출력
		Set <Entry <String, Integer>> es = treeMap.entrySet();
		Iterator <Entry <String, Integer>> it1 = es.iterator();
		while(it1.hasNext()) {
			Entry <String, Integer> entry = it1.next();
			System.out.println(entry.getKey() + " - " + entry.getValue());	
		}
		System.out.println();
		
		//특정키 값 가져왹
		//제일 앞에 엔트리 _ firstentry
		Entry <String, Integer> fe= treeMap.firstEntry();
		System.out.println(fe.getKey() + " - " + fe.getValue());
		System.out.println(fe);
		
		//제일 높은 엔트리 _ lastEntry
		Entry <String, Integer> le = treeMap.lastEntry();
		System.out.println(le);
		
		//내림차순 정렬하기
		NavigableMap<String, Integer> dm = treeMap.descendingMap();
		Set <Entry <String, Integer>> dmEs = dm.entrySet();
		Iterator <Entry <String, Integer>> it3 = dmEs.iterator();
		while(it3.hasNext()) {
			Entry <String, Integer> it3En = it3.next();
			System.out.println(it3En.getKey() + " - " + it3En.getValue());					
		}
		System.out.println();
		
		//c~h사이의 단어 검색
		System.out.println("c이상~ h미만의 단어 검색");
		SortedMap <String, Integer> chSearch = treeMap.subMap("c", "h"); //c이상~ h미만
		for(Entry<String, Integer> c : chSearch.entrySet()) {
			System.out.println(c);
		}
		System.out.println();
		
		System.out.println("c이상~ h이하(모두 포함)의 단어 검색");
		 chSearch = treeMap.subMap("c", true, "h", true); //c이상~ h이하(모두 포함)
		for(Entry<String, Integer> c : chSearch.entrySet()) {
			System.out.println(c);
		}
		
		System.out.println("c오버~ h미안(모두 미포함)의 단어 검색");
		 chSearch = treeMap.subMap("c", false, "h", false); //c오버~ h미안(모두 미포함)
		for(Entry<String, Integer> c : chSearch.entrySet()) {
			System.out.println(c);
		}
		System.out.println();
		
		//k <= 검색 <= 마지막 tailMap()
		System.out.println("k <= 검색 <= 마지막");
		NavigableMap <String, Integer> kSearch = treeMap.tailMap("k", true);
		for(Entry<String, Integer> k : kSearch.entrySet()) {
			System.out.println(k);
		}
		System.out.println();
		
		//처음 <= 검색 <=h headMap()
		System.out.println("처음 <= 검색 <=h");
		NavigableMap <String, Integer> hSearch = treeMap.headMap("h", true);
		for(Entry<String, Integer> h : hSearch.entrySet()) {
			System.out.println(h);
		}
		
	}

}
