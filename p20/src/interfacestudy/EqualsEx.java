package interfacestudy;

import java.util.Objects;

public class EqualsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("번" + "sss"=="sss");
		System.out.println("2번" + new String("sss") == new String("sss"));
		System.out.println("3번" +new String("sss").equals(new String("sss")));
		
		System.out.println("================");
		System.out.println("4번" + new Sim(19,"sim", "osan").equals(new Sim(19,"sim", "suwon")));
	}
}
//하나의 파일아래 class여러개 만드는것은 좋지 않으나, 예제 편의를 위해 생성
class Sim{
	int hb;
	String name;
	String addr;
	public Sim() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Sim(int hb, String name, String addr) {
		super();
		this.hb = hb;
		this.name = name;
		this.addr = addr;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(addr, hb, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sim other = (Sim) obj;
		return Objects.equals(addr, other.addr) && hb == other.hb && Objects.equals(name, other.name);
	}
	
	String k="a"
			syso
	
}