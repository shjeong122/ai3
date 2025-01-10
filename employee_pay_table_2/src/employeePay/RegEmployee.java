package employeePay;

public class RegEmployee extends Employee { //정규직사원
	private String dept;
	private long regpay;
	private String regtitle;
	

	public RegEmployee(String name, String sno, String dept, String regtitle, long regpay) {
		super(name, sno);
		this.dept = dept;
		this.regpay = regpay;
		this.regtitle = regtitle;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+ dept + regtitle + regpay;
	}

	@Override
	public long earning() {
		//earning = ;
		return regpay + 10;
	}

}
