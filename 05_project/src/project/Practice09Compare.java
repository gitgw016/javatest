package project;

import java.util.Scanner;

public class Practice09Compare {

	public static void main(String[] args) {
		int x, y, max;
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");
		x = sc.nextInt();
		System.out.println();
		System.out.print("두번째 정수 입력 : ");
		y = sc.nextInt();
		/*
		if(x > y) {
			max = x;
		}else {
			max = y;
		}
		*/
		max = (x > y) ? x : y;
		System.out.println("큰 수는 :" + max);
	}

}
