package P482;
//사용자 예외 만들기

public class InsufficientEx extends Exception{
	public InsufficientEx() {}
	public InsufficientEx(String message) {
		super(message);
	}

}
