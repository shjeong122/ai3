package payproject;

public class TempEmp extends Employee {
	public String dept;
	public int tempHour;
	
	public TempEmp() {} 

	public long getTempHour() {
		return tempHour;
	}

	public void setTempHour(int tempHour) {
		this.tempHour = tempHour;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "사원번호: " + name + ", 사원번호: " + sno + ", 부서: " + dept + "월 근무시간: " + tempHour;
	}
	@Override
	public long earnings() {
		// TODO Auto-generated method stub
		return tempHour * 3;
	}


}
