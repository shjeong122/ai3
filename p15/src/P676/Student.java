package P676;

public class Student implements Comparable<Student> {
	private int hakbun;
	private String name;

	@Override
	public int compareTo(Student o) {
		// 트리에 달린 것과 달아야하는 것(o)을 비교해서 작으면 음수 리턴, 같으면0, 크면 양수 리턴
		return hakbun-o.hakbun ;
	}
	
	public Student(int hakbun, String name) {
		super();
		this.hakbun = hakbun;
		this.name = name;
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



	
}
