package c.method;

public class FunctionTest {
	// num1 / num2 연산 후 결과를 출력
	void divide(double num1, int num2) {
		if(num2 == 0) {
			System.out.println("나누는 수는 0이 될 수 없다.");
			return;
		}
		double result = num1 / num2;
		System.out.println(num1+"/"+num2+"="+result);
	}
	
	public static void main(String[] args) {
		FunctionTest f = new FunctionTest();
		f.divide(10, 0);
	}

}
