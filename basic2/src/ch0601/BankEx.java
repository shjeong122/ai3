package ch0601;

import java.util.Scanner;

public class BankEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean menuOK = true;
		Bank bank = new Bank() ;
		int i=0;
		while(menuOK) {
			System.out.println("1. 계좌개설");
			System.out.println("2. 입   금");
			System.out.println("3. 출   금");
			System.out.println("4. 계좌정보 전체출력");
			System.out.println("5. 프로그램 종료");
			System.out.print("선택 : ");
			int menu = sc.nextInt();
			switch(menu) {
				case 1 ://계좌개설
						System.out.print("계좌번호는? "); 
						String aN = sc.next();
						System.out.println("이름 ");
						String name = sc.next();
						
						bank.setAccNum(aN) ;
						bank.setName(name);
						break;
				case 2 ://입금
						System.out.println("입금액은? ");
						int in = sc.nextInt();
						bank.setIncome(in);
						//잔액=잔액 + 입금
						bank.setBalance(bank.getBalance()+in);
						break;
				case 3 ://출금
						System.out.println("출금액은");
						int wi = sc.nextInt();
						bank.setWithdraw(wi);
						//잔액 = 잔액 - 출금액
						if (bank.getBalance()<wi) {
							System.out.println("잔액이 모자랍니다.");
						}	else {
						bank.setBalance(bank.getBalance() - wi);
						}
						break;
				case 4 : System.out.println("계좌번호 "+bank.getAccNum());
						System.out.println("이름 " + bank.getName());
						System.out.println("잔액 " + bank.getBalance());
						System.out.println("최근 입금액 " + bank.getIncome());
						System.out.println("최근 출금액 " + bank.getWithdraw());
						
					
				case 5 : menuOK=false;
			}
		
		}

	}

}
