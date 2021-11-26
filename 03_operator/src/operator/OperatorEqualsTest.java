package operator;

public class OperatorEqualsTest {

	public static void main(String[] args) {
		// 비교 or 관계연산자
		// >, >=, <, <= 좌, 우변의 값을 비교
		//동등 비교연산자
		// ==, !=
		int num1 = 10;
		int num2 = 20;
		
		boolean result = num1 > num2;
		System.out.println("num1 > num2 : " + result);
		result = num1 == num2;
		System.out.println("num1 == num2 : " + result);
		
		String s = "배민구";
		String s1 = "배민구";
		String s2 = "잠자는 배민구";
		System.out.println(s == s2);
		System.out.println(s == s1);
		System.out.println("-------------------------");
		System.out.println(s);
		System.out.println(s1);
		// new 때문에 false값 출력
		// new = 새로운 영역을 확보함(heap)
		String s3 = new String("배민구");
		System.out.println(s3);
		System.out.println(s == s3);
		// equals = 문자열끼리 비교
		result = s.equals(s3);
		System.out.println(result);
		result = s.equals(s2);
		System.out.println(result);

	}

}
