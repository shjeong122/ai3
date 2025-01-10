package P649;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import p504.Student;

public class LinkedListEx {

	public static void main(String[] args) {
		List<Boolean> list1 = new LinkedList<Boolean>();
		
		List<Student> list2 = new LinkedList<Student>();
		list2.add(new Student(24, "a", "1234", "영업부"));
		list2.add(new Student(23, "b", "1235", "광고부"));
		list2.add(new Student(22, "c", "1236", "전산부"));
		
		System.out.println( list2.get(0).getHakbun() );
		System.out.println();
		
		//1번인덱스안에 21, "d", "1237", "총무부" 삽입
		list2.add(1, new Student(21, "d", "1237", "총무부"));
			
			//전체출력
			//iterator 사용
		Iterator<Student> it = list2.iterator();
		while( it.hasNext()) {
			Student st = it.next();
			System.out.println(st);
		}
		
		
		
		}
	}


