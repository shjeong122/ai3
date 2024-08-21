package ch06;

public class BankEx {

	public static void main(String[] args) {
		// 은행예금관리
		Bank bk = new Bank() ;
		
		//setter 이용해서 값 넣기
		bk.setAccNum("2450-3581");
		bk.setName("홍길동");
		bk.setBalance(50000);
		bk.setIncome(10000);
		bk.setWithdraw(20000);
		
		//getter 이용해서 출력하기
		System.out.println(bk.getAccNum());
		System.out.println(bk.getName());
		System.out.println(bk.getBalance());
		System.out.println(bk.getIncome());
		System.out.println(bk.getWithdraw());
			
		//명시적 생성자 : 매개변수안에 초기값을 넣은 것
		//설계도에서 명시적생성자를 프로그래머가 코드하면 기본생성자는 자동으로 안 만들어진다.
		Bank bank1 = new Bank("3214-98756");
		System.out.println(bank1.getAccNum());
		Bank bank2 = new Bank("3214-98756", "이순신");
		System.out.println(bank2.getAccNum() + " " + bank2.getName());
		Bank bank3 = new Bank("3214-98756", 50000);
		System.out.println(bank3.getAccNum() + " " + bank3.getBalance());
		Bank bank4 = new Bank("최수진", "3214-98756", 10000);
		System.out.println(bank4.getName() +" " + bank4.getAccNum() + " " + bank4.getIncome());
			

	}

}
