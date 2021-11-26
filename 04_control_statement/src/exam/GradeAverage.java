package exam;

import java.util.Scanner;

public class GradeAverage {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int score = 0;
		int ave = 0;
		for(int i=1; i<=5; i++) {
			System.out.println("성적을 입력하시오");
			int number = sc.nextInt();
			score = number + score;
		}
		ave = score / 5;
		System.out.println("평군 성적은"+ave+"입니다");
	}
}
