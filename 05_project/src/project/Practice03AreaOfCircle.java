package project;

import java.util.Scanner;

public class Practice03AreaOfCircle {

	public static void main(String[] args) {
		// 원의 면적 ((반지름*반지름)*원주율(3.14))
		
		double radius;
		double area;
		double pi = 3.14;
		Scanner sc = new Scanner(System.in);
		System.out.println("반지름을 입력하시오.");
		radius = sc.nextDouble();
		area = (radius*radius*pi);
		System.out.printf("반지름은 : %.1f인 원의 면적은 : %.1f", radius, area);
		
	}

}
