package e.protected1.b;

import e.protected1.a.*;

public class D extends A // B{
{
	A a1 = new A();
	D(){
		// 부모의 인스턴스가 X 자신의 인스턴스라 적용 x
		//a1.a = 100;
		super.a = 100;
		//a1.methodA();
		
		// 부모의 methodA() 호출
		super.methodA();
		// 부모의 methodB() 호출		
		super.methodB();
		methodB();
		
		// 자기자신에게 overriding된 methodA()
		methodA();
		this.methodA();

	}
	
	// final 키워드가 붙어있는 부모 메소드는 자식객체에서 재정의 불가
	// protected void methodB() {}
	
	@Override
	protected void methodA() {
		System.out.println("D class의 methodA");
	}
	
	public static void main(String[] args) {
		new D();
		System.out.println();
	}
}
