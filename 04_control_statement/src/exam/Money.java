package exam;

import java.util.Scanner;

public class Money {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int money = 0;
		int per = 0;
		int occur = 0;
		System.out.println("사원명을 입력하세요");
		String name = sc.next();
		System.out.println("시급을 입력하세요");
		int tm = sc.nextInt();
		System.out.println("근무시간을 입력하세요");
		int time = sc.nextInt();
		money = tm*time;
		per = money * 3/100;
		occur = money-per;
		System.out.println("급여명세서\n" + "사원명 : " + name);
		System.out.println("급여금액 :   " + money);
		System.out.println("공제합계 :   " + per);
		System.out.println("실지급액 :   " + occur);
		
		
	}

}
