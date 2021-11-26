package account;

import java.util.Scanner;

import account.pstmt.AccountPSTMTDAOImpl;
import dao.AccountDAO;

public class BankApplication {
	
	Scanner sc = new Scanner(System.in);
	
	AccountDAO dao;
	
	BankApplication(){
		// dao = new AccountSTMTDAOImpl();
		dao = new AccountPSTMTDAOImpl();
		run();
	}
	
	void run() {
		// 1. 계좌생성
		// 2. 계좌조회 
		// 3. 예금
		// 4. 출금
		// 5. 종료
		boolean isRun = true;
		
		while(isRun) {
			System.out.println("========================================");
			System.out.println("1.계좌생성 2.계좌조회 3.예금 4.출금 5.종료");
			System.out.println("========================================");
			
			int selectNo = sc.nextInt();
			if(selectNo == 1) {
				// 계좌생성
				createAccount();
			}else if(selectNo ==2) {
				// 계좌조회
				selectAccount();
			}else if(selectNo ==3) {
				// 예금
				deposit();
			}else if(selectNo ==4) {
				// 출금
				withdraw();
			}else if(selectNo ==5) {
				// 종료
				isRun = false;
				sc.close();
			}
		}
		System.out.println("프로그램 종료");
	}
	
	
	//계좌생성
	void createAccount() {
		System.out.println("계좌 생성 >");
		System.out.println("계좌 번호 >");
		String ano = sc.next();
		System.out.println("계좌주 >");
		String owner = sc.next();
		System.out.println("초기 입금액 >");
		int balance = sc.nextInt();
		System.out.println("비밀번호 >");
		String password = sc.next();
		
		Account acc = dao.selectAccount(ano);
		if(acc != null) {
			System.out.println("이미 있는 계좌번호다.");
			return;
		}
		acc = new Account(ano,owner,balance,password);
		dao.insert(acc);
		System.out.println("계좌 등록 완료");
	}
	// 계좌조회
	void selectAccount() {
		System.out.println("계좌 조회 > ");
		System.out.println("계좌 번호 > ");
		String ano = sc.next();
		System.out.println("비밀번호 > ");
		String password = sc.next();
		
		Account acc = dao.selectAccount(ano,password);
		if(acc != null) {
			System.out.println(acc);
		} else {
			System.out.println("정보가 존재하지 않는다.");
		}
	}
	
	// 예금
	void deposit() {
		System.out.println("입금");
		System.out.println("계좌번호 >");
		String ano = sc.next();
		System.out.println("입금 금액 >");
		int money = sc.nextInt();
		Account acc = dao.selectAccount(ano);
		if(acc != null) {
			acc.setBalance(acc.getBalance()+money);
			int result = dao.update(acc);
			if(result >0) {
				System.out.println(acc.getOwner()+"의 계좌에 정상입금.");
			}
		} else {
			System.out.println("정보가 존재하지 않는다.");
		}
		
	}
	//출금
	void withdraw() {
		System.out.println("출금");
		System.out.println("계좌번호 >");
		String ano = sc.next();
		System.out.println("비밀번호 >");
		String password = sc.next();
		
		Account acc = dao.selectAccount(ano,password);
		if(acc == null) {
			System.out.println("없는 계좌다.");
			return;
		}
		System.out.println("출금 금액 >");
		int money = sc.nextInt();
		int result = acc.getBalance() - money;
		if(result <0) {
			System.out.println("잔액부족");
			return;
		}
		acc.setBalance(result);
		dao.update(acc);
		System.out.println(acc.getOwner()+"의 계좌에"+money+"원 출금");
	}
	
	public static void main(String[] args) {
		new BankApplication();
	}
}
