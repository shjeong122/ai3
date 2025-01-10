package P651;

import java.util.HashSet;
import java.util.Set;

public class PersonMain {

	public static void main(String[] args) {
		// 5개 객체화, 동등2개, 사이즈 출력=4
		//동등 - 오버라이드
		
		Set<Person> person = new HashSet<Person>() ;
		Person p1 = new Person (20, 1234, "홍길동");
		Person p2 = new Person (21, 1235, "김길동");
		Person p3 = new Person (22, 1236, "류길동");
		Person p4 = new Person (23, 1237, "차길동");
		Person p5 = new Person (20, 1234, "홍길동");
		
		person.add(p1);
		person.add(p2);
		person.add(p3);
		person.add(p4);
		person.add(p5);
		
		System.out.println(person.size());
		}
		

	}


