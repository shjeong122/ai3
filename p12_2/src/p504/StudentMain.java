package p504;

public class StudentMain {

	public static void main(String[] args) {
		Student s1 = new Student(1234, "a", "3124", "컴퓨터") ;
		Student s2 = new Student(1235, "a", "3125", "음악") ;
		Student s3 = new Student(1236, "b", "3126", "ai") ;
		Student s4 = new Student(1234, "a", "3124", "sports") ;
		
		System.out.println(s1 );
		System.out.println(s1.toString());
		
		//참조변수 찍으면 자동으로 학번, 이름 출력 => toString 재정의한다.
		
		
		//정책 : 학번과 핸드폰번호가 같으면 같은 사람으로 간주 s1=s4
		if(s1.hashCode() == s2.hashCode()) {
			System.out.println("s1, s2 동등 객체일 활률 있음. 1단계 통과");
			if(s1.equals(s2)) {
				System.out.println("동등객체입니다. 2단계 통과");
			}
		}if(s1.hashCode() == s3.hashCode()) {
			System.out.println("s1, s3 동등 객체일 활률 있음 1단계 통과");
			if(s1.equals(s3)) {
				System.out.println("동등객체입니다. 2단계 통과");
			}
		}if(s1.hashCode() == s4.hashCode()) {
			System.out.println("s1, s4 동등 객체일 활률 있음 1단계 통과");
			if(s1.equals(s4)) {
				System.out.println("동등객체입니다. 2단계 통과");
			}
		}if(s2.hashCode() == s3.hashCode()) {
			System.out.println("s2, s3 동등 객체일 활률 있음 1단계 통과");
			if(s2.equals(s3)) {
				System.out.println("동등객체입니다. 2단계 통과");
			}
		}if(s2.hashCode() == s4.hashCode()) {
			System.out.println("s2, s4 동등 객체일 활률 있음 1단계 통과");
			if(s2.equals(s4)) {
				System.out.println("동등객체입니다. 2단계 통과");
			}
		}if(s3.hashCode() == s4.hashCode()) {
			System.out.println("s3, s4 동등 객체일 활률 있음 1단계 통과");
			if(s3.equals(s4)) {
				System.out.println("동등객체입니다. 2단계 통과");
			}
		}
		
	}

}
