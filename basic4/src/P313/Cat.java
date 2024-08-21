package P313;

public class Cat extends Animal{
	String name;
	public Cat(String name) {
		this.name = name;
	}

	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println(name +"먹는다");
	}
	@Override
	void play() {
		System.out.println(name + "놀아준다");
	}

}
