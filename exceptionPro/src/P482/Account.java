package P482;

public class Account {
	private long balance = 0L; //잔액
	public Account() {
		
	}
	public long getBalance() {
		return balance;
	}
	public void deposit(int money) throws DepositException {
		balance = balance + money; //예금 
		if(balance >= 500000) {
			throw new DepositException("이 통장은 500,000원까지만 입금할 수 있습니다.");
		}
	}
	public void withdraw(int money) throws InsufficientEx { //출금
		if(balance < money) {
			// 예외 발생
			throw new InsufficientEx("잔고 부족 " + (money - balance) + "모자람");
		}
		balance = balance = money;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
}
