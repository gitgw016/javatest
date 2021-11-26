package exam;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//while문 반복 flag true = run, false = stop
		boolean isRun = true;
		// 사용자의 예금을 저장할 변수
		int money = 0;
		
		while(isRun) {
			System.out.println("=========================");
			System.out.println("1.예금|2.출금|3.잔액확인|4.종료");
			System.out.println("=========================");
			System.out.println("번호를 입력하라(1~4) >");
			int selectNo = sc.nextInt();
			/*
			 *  1. 예금 - 입금할 금액을 입력받아 money 변수에 누적 저장
			 *  2. 출금 - 출금할 금액을 입력받아 money 변수 값에서 차감 - 단 출금 금액은 예금 금액을 초과할 수 없다.
			 *  3. 잔액 - money 변수(입금액)을 출력
			 *  4. while문 종료 - 프로그램 종료
			 */
			if(selectNo == 1) {
				System.out.println("입금할 금액을 입력하라");
				int input = sc.nextInt();
				money = money + input;
				System.out.println("잔액 : "+money);
			}else if(selectNo == 2) {
				System.out.println("출금할 금액을 입력하라");
				int out = sc.nextInt();
				if(money < out) {
					System.out.println("금액초과");
					continue;
				}
				money = money - out;
				System.out.println("잔액 : "+money);
			}else if(selectNo == 3) {
				System.out.println("잔액 : "+money);
			}else if(selectNo == 4) {
				break;
			}
		}
		System.out.println("Main 종료");
	}// Main
}// class
