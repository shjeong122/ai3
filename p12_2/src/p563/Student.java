package p563;

public class Student {
	private String studentNum;
	
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}
	public String getStudentNum() {
		return studentNum;
	}
	@Override
	public int hashCode() {
		// 리턴타입 int != String
		return studentNum.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student s) {
			if(this.studentNum.equals(s.getStudentNum())) {
				return true;
			}
		}
		return false;
	}
}
