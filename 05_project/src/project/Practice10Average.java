package project;

import java.util.Scanner;

public class Practice10Average {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int studentNum = 5;
		int sum = 0;
		for(int i=0; i < studentNum; i++) {
		System.out.print("성적을 입력하시오:");
			sum += sc.nextInt();
		}
		int avg = sum / studentNum;
		System.out.printf("평균 성적은 : %d입니다.",avg);
	}

}
