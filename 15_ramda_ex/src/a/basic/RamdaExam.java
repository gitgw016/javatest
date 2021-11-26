package a.basic;

public class RamdaExam {

	public static void main(String[] args) {
		
		MyInterface myInterface = new MyInterface() {
			@Override
			public void method() {
				System.out.println("myInterface method 실행");
			}
		};
		myInterface.method();
		
		//람다식
		myInterface = ()-> System.out.println("ramda method 실행");
		System.out.println("두번째 실행문");
		myInterface.method();
		
		myInterface = ()->{
			String str = "method call";
			System.out.println(str+" 실행 블럭1");
			System.out.println("실행 블럭2");
		};
		myInterface.method();
	}

}
