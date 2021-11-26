package project;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money = 0;
		boolean isRun = true;
		while(isRun) {
			System.out.println("=========================");
			System.out.println("1.예금|2.출금|3.잔액확인|4.종료");
			System.out.println("=========================");
			System.out.println("번호를 입력하라(1~4) >");
			int selectNo = sc.nextInt();
		switch(selectNo) {
		case 1:
			System.out.println("입금");
			System.out.println("입금하실 금액을 입력하세요.");
			int deposit = sc.nextInt();
			money = money + deposit;
			System.out.println(deposit + "입금이 완료되었습니다.");
			break;
		case 2:
			System.out.println("출금");
			System.out.println("출금하실 금액을 입력해주세요.");
			deposit = sc.nextInt();
			if(money < deposit) {
				System.out.println("출금 금액이 예금된 금액보다 클 수 없습니다.");
				continue;
			}
			money = money - deposit;
			System.out.println(deposit + "원 출금되었습니다.");
			break;
		case 3:
			System.out.println("잔액확인");
			System.out.println("잔액 : " + money + "원");
			break;
		case 4:
			System.out.println("종료");
			isRun = false;
			break;
			}
		}
	}
}
