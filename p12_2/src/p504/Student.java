package p504;

public class Student {
	int hakbun; //학번
	String name; //이름
	String phone; //폰번호
	String dept; //학과명
	
	@Override
	public String toString() { 
		//참조변수를 출력할때 자동으로 붙는 메소드
		return hakbun + " " + name + " " + phone + " " + dept;
	}
	@Override
	public int hashCode() { 
		int r = hakbun + name.hashCode();
		return r ;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student s) {
			if(this.hakbun == s.getHakbun() && this.getPhone().equals(s.getPhone()) ) {
				return true;
			}
	}return false;
	}
	
	public Student(int hakbun, String name, String phone, String dept) {
		super();
		this.hakbun = hakbun;
		this.name = name;
		this.phone = phone;
		this.dept = dept;
	}	
		
	public int getHakbun() {
		return hakbun;
	}
	public void setHakbun(int hakbun) {
		this.hakbun = hakbun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	
}
