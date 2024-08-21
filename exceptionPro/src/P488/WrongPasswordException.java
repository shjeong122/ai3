package P488;

public class WrongPasswordException extends Exception {
	public WrongPasswordException() {}
	public WrongPasswordException(String message) {
		super(message); //부모생성자에게 자식 메세지 전달
		
	}
}
