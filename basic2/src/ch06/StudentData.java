package ch06;

public class StudentData {
	// 학생 설계도
	// 학생교 교적관리 필드 : 학번, 학과명, 이름, 성적
	// 학생 메소드 : 모든 필드의 입/출력, 성적 합계, 등수, 학점계산, 재적상태
	
	//클래스의 필드
	int hakbon;
	String major;
	String name;
	int score;
	
	
	//클래스의 메소드
	//입력하기 void set-(자료형 매개변수)
	void setHakbon(int hakbon) {
		this.hakbon	= hakbon; //this는 클래스의 필드를 가르킨다.
	}	
	void setMajor(String major) {
		this.major = major;
	}
	void setName(String name) {
		this.name = name;
	}
	void setScore(int score) {
		this.score = score;
	}
	//출력하기 get-
	int getHakbon() {
		return hakbon;
	}
	String getMajor() {
		return major;
	}
	String getName() {
		return name;
	}
	int getScore() {
		return score;
	}
	
	//StudentData sd2 = new StudentData(202410, "영어학과", "이순신", 100);
	
	StudentData(int hakbon, String major, String name, int score ) {
		this.hakbon = hakbon;
		this.major = major;
		this.name = name;
		this.score = score;
		
	}StudentData() { }
	
	StudentData(int hakbon, String major, String name) {
		this.hakbon = hakbon;
		this.major = major;
		this.name = name;
	}
	StudentData(int hakbon, String major, int score) {
			this.hakbon = hakbon;
			this.major = major;
			this.score = score;
		
	}
}
