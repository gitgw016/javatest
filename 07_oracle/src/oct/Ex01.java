package oct;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] scores = new int[5];
		for(int i=0; i<scores.length; i++) {
			System.out.print("성적을 입력하세요 >");
			scores[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i : scores) {
			sum+=i;
		}
		double avg = (double)sum/scores.length;
		System.out.println("평균성적은"+avg+"입니다");
	}

}
