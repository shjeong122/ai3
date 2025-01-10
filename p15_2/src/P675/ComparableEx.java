package P675;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableEx {

	public static void main(String[] args) {
		TreeSet<Person> t1 = new TreeSet<Person>();
		
		Person p1 = new Person("홍길동1", 60, "1234");
		Person p2 = new Person("홍길동2", 20, "1235");
		Person p3 = new Person("홍길동3", 10, "1236");
		Person p4 = new Person("홍길동4", 40, "1237");
		Person p5 = new Person("홍길동5", 50, "1239");
		Person p6 = new Person("홍길동6", 60, "1238");
		Person p7 = new Person("홍길동6", 60, "1238");
		
		t1.add(p1);
		t1.add(p2);
		t1.add(p3);
		t1.add(p4);
		t1.add(p5);
		t1.add(p6);
		t1.add(p7);
		
		//에러발생 Comparable
		//일반 Person객체를 트리에 달아 줄 때 기준 항목을 코드해야 한다.
		
		//전체 출력하기
		Iterator<Person> it = t1.iterator();
		while(it.hasNext()) {
			Person p = it.next();
			System.out.println( p.getAge() + " " + p.getName());

		}
	}
}
