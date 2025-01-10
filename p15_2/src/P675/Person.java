package P675;

public class Person implements Comparable<Person> {
	private String name; //이름
	private int age;    //나이
	private String phone; //전화번호
	
	public Person(String name, int age, String phone) {
		super();
		this.name = name;
		this.age = age;
		this.phone = phone;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode() + age + phone.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person p) {
			if(this.name.equals(p.name)&&this.age == p.age && this.phone.equals(p.phone)) {
				return true;
			}
		}
		return false;
	}
	
	
	//트리에 달아줄 기준 항목을 코드 함
	//나이 기준 항목 코드
	@Override
	public int compareTo(Person o) {
		/*if(age < o.age) return -1;
		else if(age == o.age) return 0;
		else return 1;*/
		return (name.hashCode() + age + phone.hashCode()) - (o.name.hashCode() + o.age  + o.phone.hashCode());
		
	}

	//이름 기준
//	@Override
//	public int compareTo(Person o) {
//		if(name.hashCode() < o.name.hashCode()) return -1;
//		else if (name.hashCode() == o.name.hashCode()) return 0;
//		else return 1;
//	}
	
	//전화번호 기준
//	@Override
//	public int compareTo(Person o) {
//		if(phone.hashCode() < o.phone.hashCode()) return -1;
//		else if (phone.hashCode() == o.phone.hashCode()) return 0;
//		else return 1;
//	}
	
	//동등객체 이름 = 나이 = 전화번호
	//생성자
	//getter/setter
	
}
