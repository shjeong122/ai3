package P313;

public class Main {

	public static void main(String[] args) {
		Animal a = new Animal() ;
		a.eat();
		a.play();
		
		Animal a1 = new Cat("야옹이 ");
		a1.eat();
		a1.play();
		
		Animal a2 = new Dog("멍멍이 ");
		a2.eat();
		a2.play();

	}

}
