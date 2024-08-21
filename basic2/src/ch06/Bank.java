package ch06;

public class Bank {
	//은행예금관리 설계도
	//1. 계좌개설, 2.입금, 3.출금, 4.전체고객잔액조회
	//정책1.계좌중복불가(중복검사x), 2.입출금액은 무조건0보다 크다(오류검사x),
	//정책3.계좌정보:계좌번호/고객이름/고객의 잔액, 4.둘이상의 고객정보저장 5. 계좌번호는 정수형태
	
	//필드 : accountNum, name, balance, income, withdraw
	String accNum; //계좌
	String name; //이름
	int balance; //잔액
	int income; //입금
	int withdraw; //출금
	
	public String getAccNum() {
		return accNum;
	}
	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	public int getWithdraw() {
		return withdraw;
	}
	public void setWithdraw(int withdraw) {
		this.withdraw = withdraw;
	}Bank() {}
	
	Bank(String accNum){
		this.accNum = accNum;
	}	
	Bank(String accNum, String name){
		this.accNum = accNum;
		this.name = name;
	}
	Bank(String accNum, int balance){
		this.accNum = accNum;
		this.balance = balance;
	}
	Bank(String name, String accNum, int income){
		this.accNum = accNum;
		this.name = name;
		this.income = income;
	}
}
	//메소드 : 출금 후 잔액 계산
//	void setAccNum(int accNum) {
//		this.accNum = accNum ;
//	}
//	void setName(String name) {
//		this.name = name;
//	}
//	void setBalanve(int balance) {
//		this.balance = balance;
//	}
//	void setIncome(int income) {
//		this.income = income;
//	}
//	void setWithdraw(int withdraw) {
//		this.withdraw = withdraw;
//	}
//	int getAccNum() {
//		return accNum;
//	}
//	String getName() {
//		return name;
//	}
//	int getBalance() {
//		return balance;
//	}
//	int getIncome() {
//		return income;
//	}
//	int getWithdraw() {
//		return withdraw;
//	}

