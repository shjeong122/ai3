package P691;

public class Student {
	public int studentNum;
	public String name;
	
	public Student(int sudentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}
	
	//동등객체 코드
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return studentNum;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student s) {
			if(studentNum==s.studentNum)
				return true;
		}
		return false;
	}
}
