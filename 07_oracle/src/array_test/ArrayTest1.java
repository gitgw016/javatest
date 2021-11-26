package array_test;

import java.util.Scanner;

public class ArrayTest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] scores = new int[5];
		double avg = 0;
		for(int i=0; i<5; i++) {
			System.out.print("성적을 입력하시오 :");
			scores[i] = sc.nextInt();
			avg += scores[i];
		}
		avg = avg/5;
		System.out.println("평균 성적은"+avg+"입니다." );
	}

}
