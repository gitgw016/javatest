package exam;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("반지름을 입력하시오 : ");
		double pi = 3.14;
		double radius = sc.nextDouble();
		double area = 0;
		area = radius*radius*pi;
		System.out.println(area);
		
		
	}

}
