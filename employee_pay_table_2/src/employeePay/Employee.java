package employeePay;

public class Employee {
	//관리자 : Staff, TempEmployee, RegEmployee
	
	public String ename ; //사원이름
	public String esno;   //사원번호
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ename + esno ;
	}
	
	public long earning() {
		//수당 
		//관리자 
		// 임시직 : 시간당3만원
		// (+) 관리자:20만원, 정규직:10만원
		return earning();
	}
	
	public Employee(String name, String sno) {
		super();
		this.ename = name;
		this.esno = sno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEsno() {
		return esno;
	}

	public void setEsno(String esno) {
		this.esno = esno;
	}


	
}
