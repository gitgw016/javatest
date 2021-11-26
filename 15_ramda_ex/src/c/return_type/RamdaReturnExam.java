package c.return_type;

interface MyInterface{
	int method(int x, int y, String s);
}

public class RamdaReturnExam {

	public static void main(String[] args) {
		MyInterface bae = new MyInterface() {
			@Override
			public int method(int x, int y, String s) {
				System.out.println(s);
				return x*y;
			}
		};
		int result = bae.method(5, -20, "배민구");
		System.out.println("result : "+result);
		
		bae = (b,m,g)->{
			System.out.println(g);
			return b + m;
		};
		result = bae.method(20, -121, "민구배");
		System.out.println("result : "+result);
		System.out.println("result : " + bae.method(5, 10, "정만"));
		
		/*
		함수형 인터페이스
		Thread t = new Thread(()->{
			
		});
		*/
	}

}
