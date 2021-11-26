package c.method;

public class Account {
	// 최소 에금액
	int minDeposit;
	// 최대 에금액
	int maxDeposit = 1000000;
	// 잔고
	int balance;
	
	// 예금
	void deposit(int amount) {
		if(amount > maxDeposit || amount < minDeposit) {
			System.out.println("예금할 수 있는 금액이 아니다.");
		}else {
			balance += amount;
		}
	}
	// 출금
	void withdraw(int amount) {
		int result = balance - amount;
		if(result < 0) {
			System.out.println("출금할 수 있는 금액이 아니다.");
		}else {
			balance -=amount;
		}
	}

}
