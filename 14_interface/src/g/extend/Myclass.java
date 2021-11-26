package g.extend;

public class Myclass implements C{

	@Override
	public void printA() {
	}

	@Override
	public void printB() {
	}

	@Override
	public void printC() {
	}
	
	public static void main(String[] args) {
		// 익명 구형 객체 : 귀찮다.
		A a = new A() {
			@Override
			
			public void printA() {
				System.out.println("배민구");
			}
		};
		
		A a1 = new Aclass();
		a1.printA();
	}

}
