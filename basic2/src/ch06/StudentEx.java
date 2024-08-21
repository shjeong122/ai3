package ch06;

public class StudentEx {

	public static void main(String[] args) {
		// 자바프로그램의 시작점 메소드
		StudentData sd = new StudentData(); //인스턴스화
		sd.setHakbon(202405);
		sd.setMajor("생명과학");
		sd.setName("홍길동");
		sd.setScore(80);
		System.out.println(sd.getHakbon());
		System.out.println(sd.getMajor());
		System.out.println(sd.getName());
		System.out.println(sd.getScore());
	
		//오버로딩 : 매개변수를 다르게하여 생성자(매개변수)의 여러개 사용하는 것 
		//입력하고자 하는 값을 초기값으로 설정
		
		StudentData sd2 = new StudentData(202410, "영어학과", "이순신", 100);
		System.out.println(sd2.getHakbon() + " "+ sd2.getMajor() + " "+ sd2.getName() + " "+ sd2.getScore()+ " ");
	
		StudentData sd3 = new StudentData(202410, "AI학과", "최수진");
		System.out.println(sd3.getHakbon() + " "+ sd3.getMajor() + " "+ sd3.getName());
		
		StudentData sd4 = new StudentData(202410, "최수진", 80);
		System.out.println(sd4.getHakbon() + " "+ sd4.getMajor() + " "+ sd4.getScore());
	}
}


