package a.aa;

public class AAName {
	AA aa = new AA("이순신");  //필드, 변수 사용
	
	void m() {
	aa.name = "최수진"; //동일 패키지안에 name이 있어서 사용 가능
	
	}
}
