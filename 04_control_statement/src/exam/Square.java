package exam;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double twidth = 0;
		System.out.println("윗변값을 입력하시오");
		double top = sc.nextDouble();
		System.out.println("아랫변값을 입력하시오");
		double bottom = sc.nextDouble();
		System.out.println("높이를 입력하시오");
		double height = sc.nextDouble();
		twidth = ((top+bottom)*height)/2;
		System.out.println("넓이는 : " + twidth);
	}
}
