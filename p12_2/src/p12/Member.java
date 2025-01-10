package p12;

public class Member {
//Object 클래스의 자식 클래스
	String id;
	String name;
	
	@Override
		public int hashCode() {
		System.out.println("이곳은 hashCOde()함수 부분");
			int r = id.hashCode() + name.hashCode();
			return r;
		}
	
		void hashCodePrint( ) {
			System.out.println("id.hashCode() ==>" + id.hashCode());
			System.out.println("name.hashCode() ==>" + name.hashCode());
		}
	
	@Override
		public boolean equals(Object obj) {
			if(obj instanceof Member m) {
				if(this.id.equals(m.getId())&& this.name.equals(m.getName())) {
					return true;
				}else {
					return false;
				}
			}
			return false;
		}
	
	
	public Member(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
