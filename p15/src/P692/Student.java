package P692;

public class Student implements Comparable<Student>{
	public String id;
	public int score;
	
	public Student(String id, int score){
		super();
		this.id = id;
		this.score = score;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return score - o.score;
	}
	
	
	
}
