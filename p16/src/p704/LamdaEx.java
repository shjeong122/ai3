package p704;

public class LamdaEx {

	public static void main(String[] args) {
		Person person = new Person();
		
		//매개변수 2개
		person.action1((String name, String job) -> {
			System.out.println(name + "이 ");
			System.out.println( job + "을 합니다.");
		});
		person.action1((String name, String job) -> System.out.println(name + "이 " + job + "을 하지 않습니다."));

		//매개변수가 한 개일 경우
		person.action2((content) -> {
			System.out.println("\"" + content + "\"");
			System.out.println("라고 말합니다.");
		});
		person.action2((content) -> System.out.println("\"" + content + "\"" + "라고 외칩니다."));
	}
}
