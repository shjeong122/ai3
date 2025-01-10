package payproject;

public class Staff extends Employee {
	public String title;
	public long staffPay;
	
	public Staff() {}  //기본생성자 _ 데이터를 보유한 것이 아니라, 입력받아서 진행하므로 내용없이 기본 생성자
	
	public long getstaffPay() {
		return staffPay;
	}
	public void setstaffPay(long staffPay) {
		this.staffPay = staffPay;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "이름: " + name + ", 사원번호: " + sno + ", 직급: " + title + ", 급여액: " + staffPay;
	}
	@Override
	public long earnings() {
		// TODO Auto-generated method stub
		return staffPay + 20;
	}

}
