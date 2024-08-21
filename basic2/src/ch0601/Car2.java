package ch0601;

public class Car2 {
//필드 선언
	int gas;
	//리턴값이 없는 메소드
	void setGas(int gas) {
		this.gas = gas;
	}
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}	
	void run() {
		while (true) {
			if (gas >0) {
			System.out.println("달립니다.(gas잔량 : " + gas + ")");
			gas -= 1;
		}	else {
			System.out.println("멈춥니다.(gas잔량 : " + gas + ")" );
			return; //메소드 종료
			}
	}
		
	}
}
