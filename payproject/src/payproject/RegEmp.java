package payproject;

public class RegEmp extends Employee {
	public String dept;
	public long regPay;
	public String regTitle;
	
	public RegEmp() {}

	public long getRegPay() {
		return regPay;
	}

	public void setRegPay(int regPay) {
		this.regPay = regPay;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "이름: " + name + ", 사원번호: " + sno + ", 부서: " + dept + ", 업무: " + regTitle + ", 급여액: " + regPay;
	}
	@Override
	public long earnings() {
		// TODO Auto-generated method stub
		return regPay + 10 ;
	}

}
