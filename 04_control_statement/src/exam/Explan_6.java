package exam;

import java.util.Scanner;

public class Explan_6 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		boolean grade = true;
		while(grade) {
			System.out.println("점수를 입력해주세요.");
			int score = sc.nextInt();
			switch(score/10) {
			case 10 : case 9:
				System.out.println("A학점입니다.");
				break;
			case 8 :
				System.out.println("B학점입니다.");
				break;
			case 7 :
				System.out.println("C학점입니다.");
				break;
			case 6 :
				System.out.println("D학점입니다.");
				break;
			default :
				System.out.println("F학점입니다.");
				break;
			}
		}
	}
}
