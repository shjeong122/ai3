package P668;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		//TreeSet 컬렉션 생성
		Set<Integer> treeSet = new TreeSet<Integer> ();
		
		//Integer 객체 저장_데이터입력
		treeSet.add(3);
		treeSet.add(8);
		treeSet.add(10);
		treeSet.add(12);
		treeSet.add(9);
			
		//전부 출력
		//left - root - right : 오름차순 정렬
		Iterator<Integer> it = treeSet.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
		
		//정렬 Integer 객체 하나씩 가져오기
		for(Integer s : treeSet) {
			System.out.print(s + " ");
		}
		System.out.println("\n");
		
		//내림차순 출력
		//부모메소드를 다운캐스팅하여 사용
		// =>treeSet 변수의 주소를 TreeSet 자료형으로 넣어주기
		TreeSet t1 = (TreeSet) treeSet;
		//Set사용
		NavigableSet<Integer> destreeSet = t1.descendingSet();
		for(Integer s : destreeSet) {
			System.out.print(s + " ");
		}
		System.out.println();
		//iterator 사용
		Iterator<Integer> it1 = t1.descendingIterator();
		while(it1.hasNext()) {
			System.out.print(it1.next() + " ");
		}
		System.out.println();
		
		//제일 낮은 객체
		System.out.println(t1.first());
		
		//제일 높은 객체
		System.out.println(t1.last());
		
		//10 바로 위의 객체, 10포함
		System.out.println(t1.ceiling(11));
		
		//3 바로 아래 객체, 3포함
		System.out.println(t1.floor(3));
	}
}
