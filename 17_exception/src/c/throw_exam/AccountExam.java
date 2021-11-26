package c.throw_exam;

public class AccountExam {

	public static void main(String[] args) {
		Account account = new Account();
		account.deposit(10000);
		System.out.println("잔고:" + account.getBalance());
		
		try {
			account.withdraw(15000);
		} catch (BalanceInsufficientException e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		System.out.println("잔고:" + account.getBalance());
	}

}
