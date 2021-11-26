package octfirst;

import java.util.Scanner;

public class ForSumExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 >");
		int number = sc.nextInt();
		int sum = 0;
		int div = 0;
		for(int i=0; i<=number; i++) {
			sum += i;
			if(i % 3 == 0) {
				div += i;
			}
		}
		System.out.println("1부터 "+number+"까지의 총 합계 : " + sum);
		System.out.println("1부터 "+number+"까지의 3의 배수의 총 합계 : " + div);
	}

}
