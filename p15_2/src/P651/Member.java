package P651;

public class Member {
	private String name;
	private int age;
	
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if( obj instanceof Member m ) {
			if( this.name.equals (m.name) && this.age == m.age) {
				return true;
			}
		}
		return false;
	}
	
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
