package P676;

import java.util.TreeSet;

public class StudentMain {

	public static void main(String[] args) {
		// TreeSet객체생성_student
		TreeSet<Student> set1 = new TreeSet<Student> ();
		
		//채우기
		Student s1 = new Student(24,"홍길동");
		Student s2 = new Student(26,"홍길동");
		Student s3 = new Student(27,"홍길동");
		Student s4 = new Student(28,"홍길동");
		Student s5 = new Student(29,"홍길동");
		
		//TreeSet에 넣기
		set1.add(s1);
		set1.add(s2);
		set1.add(s3);
		set1.add(s4);
		set1.add(s5); //에러발생 Exception in thread "main" java.lang.ClassCastException
						// =>기준표명 1.class Person implements comparable
						//			2. 새로운 클래스 생성(클래스 복붙) class PersonComparator implements Comparator
		
		
		//------------------------
		//TreeSet
		TreeSet<Student2> set2 = new TreeSet<Student2>(new Student2Comparator());
		
		//채우기
		Student2 ss1 = new Student2(24,"홍길동");
		Student2 ss2 = new Student2(26,"홍길동");
		Student2 ss3 = new Student2(27,"홍길동");
		Student2 ss4 = new Student2(28,"홍길동");
		Student2 ss5 = new Student2(29,"홍길동");
		
		//TreeSet에 넣기
		set2.add(ss1);
		set2.add(ss2);
		set2.add(ss3);
		set2.add(ss4);
		set2.add(ss5);
		
				
		
		
		
		

	}

}
