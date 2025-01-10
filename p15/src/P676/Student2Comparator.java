package P676;

import java.util.Comparator;

public class Student2Comparator implements Comparator<Student2> { 
	//comparetor가 부모 => 부모타입으로 받는다.

	@Override
	public int compare(Student2 o1, Student2 o2) {
		// o1 변수는 달려 있는 객체 주소, o2는 달고 싶은 객체 주소
		//학번 기준 비교
		//return o1.getHakbun()-o2.getHakbun();
		//이름 기준 비교
		return o1.getName().hashCode() - o2.getName().hashCode();
	
	}

}
