package P482;

import java.util.Scanner;

public class AccountMain {
	Account account = new Account();  //객체 사용 1. 함수밖으로 뺀다.
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws InsufficientEx, DepositException {
		
		AccountMain am = new AccountMain();
		int menu;
		while(true) {
			System.out.println("원하는 항목을 선택하세요");
			System.out.print("1. 입금, 2. 출금, 3. 잔액 확인, 4. 종료 : ");
			menu = am.sc.nextInt();
			switch(menu) {
				case 1 : 
					System.out.println("입금");
					am.deposit(); break; //객체 사용 2.함수 사용할때 제공한다.
				case 2 :
					System.out.println("출금");
					am.withdraw(); break;
				case 3 : 
					System.out.println("잔액 확인");
					am.allPrint(); break;
				case 4 : break;
			}
	}
	}

	private void allPrint() {
		System.out.println("잔액 : " + account.getBalance());
	}

	private void withdraw() throws InsufficientEx {
		System.out.println("출금할 금액은? ");
		 int money=sc.nextInt();
		 account.withdraw(money);
		System.out.println("잔액 : " + account.getBalance());
	}

	private void deposit() throws InsufficientEx, DepositException  {
		System.out.println("입금할 금액은? ");
		int money=sc.nextInt();
		account.deposit(money);
		System.out.println("잔액 : " + account.getBalance());
	
	}
}