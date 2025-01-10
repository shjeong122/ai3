package P651;

import java.util.*;

public class SetEx {

	public static void main(String[] args) {
		//객체화 및 삽입
		HashSet set1 = new HashSet();
		set1.add(10);
		set1.add("ab");
		set1.add(true);
		
		Set<Integer> set2 = new HashSet<Integer>();
		set2.add(10);
		set2.add(15);
		set2.add(20);
		
		//전체 출력 _ iterator 사용
		Iterator <Integer> it = set2.iterator();
		while( it.hasNext() ) {
			System.out.println(it.next());
	}
		System.out.println();
		//전체 수량 출력
		int count = set2.size();
		System.out.println("count : " + count);
	
		Set<Member> set3 = new HashSet<Member> ();
		Member m1 = new Member("홍길동", 23);
		Member m2 = new Member("김길동", 20);
		Member m3 = new Member("길길동", 33);
		Member m4 = new Member("최길동", 53);
		Member m5 = new Member("이길동", 23);
		Member m6 = new Member("박길동", 23);
		Member m7 = new Member("홍길동", 23);
		
		set3.add(m1);
		set3.add(m2);
		set3.add(m3);
		set3.add(m4);
		set3.add(m5);
		set3.add(m6);
		set3.add(m7);
		
		//1. hasCod Override
		//2. equals Override
		System.out.println("set3.size : " + set3.size());

	}

}
