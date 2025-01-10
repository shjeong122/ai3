package p563;

import java.util.HashSet;

public class StudentEx {

	public static void main(String[] args) {
		//Student를 저장하는 HashSet 생성
		HashSet<Student> hashSet = new HashSet<Student>();
		
		//Student 저장
		//같은 학번은 중복 저장 x
		//Set은 똑같은것은 한번만 넣어주는 역할
		hashSet.add(new Student("1"));
		hashSet.add(new Student("1"));
		hashSet.add(new Student("2"));
		
		//저장된 Student 수 출력
		System.out.println("저장된 Student 수 : " + hashSet.size());
	}
}
