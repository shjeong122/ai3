package p712;

public class MethodReferenceEx {

	public static void main(String[] args) {
		Person person = new Person();
		person.ordering(( a,  b) -> a.compareToIgnoreCase(b));
		person.ordering(String :: compareToIgnoreCase);
		

		
		//compareToIgnoreCase : a와 b문자열의 대소문자 상관없이 문자열 비교
		//a가 b보다 앞에 있으면 음수, 같으면 0, 뒤에있으면 양수 리턴
		String a = "kk";
		String b = "ak";
		System.out.println(a.compareToIgnoreCase(b)); 
		
		
		person.mm(() -> new Member("홍길동"));
		person.mm(Member :: new);
	}
}
