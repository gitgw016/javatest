package project;

import java.util.Scanner;

public class Practice07Pay {

	public static void main(String[] args) {
		// ctrl + shift + o
		Scanner sc = new Scanner(System.in);
		System.out.println("사원명을 입력해주세요 >");
		String 사원명 = sc.next();
		System.out.println("시급을 입력해주세요 >");
		int 시급 = sc.nextInt();
		System.out.println("근무시간을 입력해주세요 >");
		int 근무시간 = sc.nextInt();
		System.out.println("급여명세서");
		int 급여금액 = 시급 * 근무시간;
		System.out.println("급여금액 : " + 급여금액 + "원");
		int 공제합계 = 급여금액 * 3 / 100;
		System.out.println("공제합계 : " + 공제합계 + "원");
		int 실지급액 = 급여금액 - 공제합계;
		System.out.printf("실지급액 : %d원\n", 실지급액);
		System.out.println("====================");
		System.out.printf("급여금액:%,10d원%n",급여금액);
		System.out.printf("공제합계:%,10d원%n",공제합계);
		System.out.printf("실지급액:%,10d원%n",실지급액);
	}

}
