package iteration_statement;

import java.util.Scanner;

public class WhileStatementTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isRun = true;
		while(isRun) {
			System.out.println("구구단의 단수를 입력하라");
			isRun = sc.hasNextInt();
			if(isRun) {
			int i = sc.nextInt();
			System.out.println(i);
			System.out.print(i+"단");
			for(int j=1; j<10; j++) {
				System.out.println(i+"*"+j+"="+(i*j)+"\t");
			}
			System.out.println();
			}
		}//while
	}// main

}