package c.method;

public class MethodOverloading {
	
	public void methodA() {
		System.out.println("methodA 호출");
	}
	
	public void methodA(int a) {
		System.out.println("method A 호출 : " +a);
	}
	
	public void methodA(double a) {
		System.out.println("method A 호출 : " +a);
	}
	
	public void methodA(int a, int b) {
		System.out.println("method A 호출 : " +a+ "b : "+b);
	}
	
	public void methodA(int a, double b) {
		System.out.println("method A 호출 : " +a+"b : "+b);
	}
	
	public void methodA(double a, int b) {
		System.out.println("method A 호출 : " +a+"b : "+b);
	}
	
	String methodB(char a, char b , char c) {
		return a+":"+b+":"+c;
	}
	
	String methodF(String s, int a, double... d) {
		double bae = 0;
		for(int i=0; i<d.length; i++) {
			bae += d[i];
		}
		return s+a+bae;
	}
	
	// char타입의 배열 a
	String methodB(char... a) {
		String result = null;
		for(int i=0; i<a.length; i++) {
			result += a[i] +":";
		}
		return result;
	};

	public static void main(String[] args) {
		MethodOverloading m1 = new MethodOverloading();
		String result = m1.methodB('배', '민', '구');
		System.out.println(result);
		result = m1.methodB('A');
		System.out.println(result);
		result = m1.methodB('A','B');
		System.out.println(result);
		result = m1.methodB('A','B','C','D','E');
		System.out.println(result);
		result = m1.methodF("배민구", 3 , 0.3, 0.4, 5);
		System.out.println(result);
	}

}
