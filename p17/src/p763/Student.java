package p763;

public class Student implements Comparable<Student>{
	private String name;
	private String sex;
	private int score;
	
	//동등객체
		@Override
		public int hashCode() {
			// TODO Auto-generated method stub
			return name.hashCode();
		}

		@Override
		public boolean equals(Object obj) {
			if(obj instanceof Student s) {
				if(name.equals(s.name)) return true;
		}
			return false;
	}
	//비교할 코드 구현
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return name +" " +  sex + " " +  score;
	}
		@Override
		public int compareTo(Student o) { 
			return name.hashCode() - o.name.hashCode();
		}
	
	public Student(String name, String sex, int score) {
		super();
		this.name = name;
		this.sex = sex;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}

	public String getSex() {
		return sex;
	}
	
	public int getScore() {
		return score;
	}
	}