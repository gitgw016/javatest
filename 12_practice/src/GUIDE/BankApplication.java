package GUIDE;

import java.util.Scanner;

public class BankApplication {
	// 계좌주 정보를 저장하는 배열
	Account[] account = new Account[100];
	
	Scanner sc = new Scanner(System.in);
	
	BankApplication(){
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
		Account acc = new Account();
		System.out.println("----------------");
		System.out.println("     계좌생성");
		System.out.println("----------------");
		System.out.print("계좌주 : ");
		acc.owner = sc.next();
		System.out.print("계좌번호 : ");
		acc.ano = sc.next();
		System.out.print("초기입금액 : ");
		acc.balance = sc.nextInt();
		System.out.print("비밀번호 : ");
		acc.password = sc.next();
		System.out.println(acc.toString());
		for(int i=0; i<account.length; i++) {
			if(account[i] != null && acc.ano.equals(account[i].ano)) {
				System.out.println("이미 존재하는 계좌번호다.");
				return;
			}
		}
		
		for(int i=0; i<account.length; i++) {
			if(account[i] == null) {
				account[i] = acc;
				break;
			}
		}
		
	}
	// 계좌조회
	void selectAccount() {
		System.out.println("----------------");
		System.out.println("     계좌조회");
		System.out.println("----------------");
		System.out.print("계좌번호 : ");
		String ano = sc.next();
		System.out.print("비밀번호 : ");
		String password = sc.next();
		Account acc = findAccount(ano,password);
		
		if(acc == null) {
			System.out.println("계좌가 없다.");
		}else {
			System.out.println(acc.toString());
		}
	}
	
	// 예금
	void deposit() {
		System.out.println("----------------");
		System.out.println("      예 금");
		System.out.println("----------------");
		System.out.print("계좌번호 : ");
		String ano = sc.next();
		System.out.print("비밀번호 : ");
		String password = sc.next();
		System.out.print("예금액 : ");
		int money = sc.nextInt();
		
		Account acc = findAccount(ano,password);
		if(acc != null) {
			acc.balance += money;
			System.out.println(acc.owner+"의 계좌에"+money+"원이 입금.");
		}else {
			System.out.println("계좌가 없다.");
		}
	}
	//출금
	void withdraw() {
		System.out.println("----------------");
		System.out.println("      출 금");
		System.out.println("----------------");
		System.out.print("계좌번호 : ");
		String ano = sc.next();
		System.out.print("비밀번호 : ");
		String password = sc.next();
		System.out.print("출금액 : ");
		int money = sc.nextInt();
		
		Account acc = findAccount(ano,password);
		if(acc == null) {
			System.out.println("계좌가 없다.");
			return;
		}
		int result = acc.balance - money;
		if(result < 0) {
			System.out.println("대출 못한다.");
			return;
		}
		acc.balance = result;
		System.out.println(acc.owner+"의 계좌에"+money+"원이 출금.");
		
	}
	
	// 계좌번호와 비밀번호가 일치하는 Account 객체를 찾아서 반환 
	Account findAccount(String ano, String password) {
		for(int i=0; i<account.length; i++) {
			Account acc = account[i];
			if(acc != null && acc.ano.equals(ano) && password.equals(password)) {
				return acc;
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		new BankApplication();
		System.out.println("프로그램 끝");
	}
}
