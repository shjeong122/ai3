package employeePay;

public class Staff extends Employee { //관리자
	private String title;
	private long staffpay;
	

	public Staff(String name, String sno, String title, long staffpay) {
		super(name, sno);
		this.title = title;
		this.staffpay = staffpay;
	}
	
	public void Employee(String name, String sno) {
		this.ename = name;
		this.esno = sno;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + title + staffpay;
	}

	@Override
	public long earning() {
		// TODO Auto-generated method stub
		return staffpay + 20;
	}

}
