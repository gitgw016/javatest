package c.method;
// 객체의 동작 - 기능들을 정의

public class Method {
// 반환형 메소드이름(매개변수...){실행문들...}
	void methodA() {
		System.out.println("반환하는 값은 없고 기능만 수행");
	
	}
	
	int methodB() {
		System.out.println("int type의 값을 반환");
		return 0; // 타입이 존재할 경우 return을 꼭 입력
		// System.out.println("배배배배배"); return으로 반환하였기 때문에 실행문 작성 불가
	}
	
	double methodC(int x, int y) {
		return x / y;
	}
	
	String methodD(char a, char b, char c) {
		return a +":"+b+":"+c;
	}
	
	public static void main(String[] args) {
		Method m1 = new Method();
		m1.methodA();
		// int a = m1.methodA(); 반환하는 값이 없어서 오류
		int result = m1.methodB();
		System.out.println(result);
		// string s = m1.methodB(); == string s = m1.methodB(); 해당하는 값이 반환되는 타입과 일치하지 않으면 오류 발생
		double r = m1.methodC(10, 30);
		System.out.println(r);
		String s = m1.methodD('배', '민', '구');
		System.out.println(s);
	}

}
