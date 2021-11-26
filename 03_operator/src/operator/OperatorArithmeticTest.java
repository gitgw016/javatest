package operator;

public class OperatorArithmeticTest {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		 // 양의 정수 표현 - 없는것과 동일
		System.out.println(+num1);
		 // 음의 정수 표현
		System.out.println(-num2);
		System.out.println(num2);
		num2 = -num2;
		System.out.println(num2);
		
		double pi = -3.141592;
		System.out.println(pi);
		
		int i = 10;
		int i2 = 3;
		int result = i/i2;
		System.out.println("result : " + result);
		// 정수/정수라서 소수점 자리가 다 잘린 후 입력
		double d = i/i2;
		System.out.println("d result : " + d);
		
		double typeResult = i / 3.0;
		System.out.println("typeResult : " + typeResult);
		
		String s = "배민구";
		System.out.println(s + (num1 + num2));
		
		System.out.println(num1 + num2 + s);
		
		int a = 1;
		int b = 1;
		// c= a; a = a+1;
		int c = a++;
		System.out.println("c : " + c);
		// e = b; b = b-1;
		int e = b--;
		System.out.println("e : " + e);
		// f = a+=1;
		int f = ++a;
		System.out.println("f : " + f);
		// g = b-=1;
		int g = --b;
		System.out.println("g : " + g);
		
	}

}
