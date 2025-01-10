package employeePay;

public class TempEmployee extends Employee { //임시직 사원
	
//	​1) 임시직 사원을 나타내는 자식 클래스
//	2) 추가 hdept, temphour필드와 TempEmployee()생성자
//	3) 변수의 값을 연결한 문자열을 반환하는 toString()메소드
//	4) 월 근무시간 수에 3만원을 곱하여 급여액을 계산하는 erinings()메소드로 구성된다.
//	<TestEmployee클래스> - 다음조건에 맞추어 직접 작성한다
	
	private String dept;
	private long tempHour;
	
	
	public TempEmployee(String name, String sno, String dept, long tempHour) {
		super(name, sno);
		this.dept = dept;
		this.tempHour = tempHour;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + dept + tempHour;
	}

	@Override
	public long earning() {
		// 월근무시간 수*3만원
		return tempHour*3;
	}
}
