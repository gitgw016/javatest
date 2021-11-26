package exam;

import java.util.Scanner;

public class Comparison {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("첫번째 정수 : ");
		int first = sc.nextInt();
		System.out.println("두번째 정수 : ");
		int second = sc.nextInt();
		if(first > second) {
			System.out.println("큰 수는 " + first);
		}else {
			System.out.println("큰 수는 " + second);
		}
	}
}
