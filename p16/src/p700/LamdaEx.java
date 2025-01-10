package p700;

public class LamdaEx {

	public static void main(String[] args) {
		Person person = new Person();
		
		person.action(() -> {
			System.out.println("출근합니다.");
			System.out.println("프로그래밍을 합니다.");
			
		});
		
		//실맹문이 한 개 일 경우 중괄호 생략 가능
		System.out.println("퇴근합니다.");
	}

}
