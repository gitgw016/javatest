package a6;

import a5.A;

public class C {
	public C() {
		A a = new A();
		a.field1 = 50;		// public
		//a.field2 = 30;	// default
		//a.field3 = 10;	// private
		System.out.println(a.method1());	// public
		//System.out.println(a.method2());	// default
		//System.out.println(a.method3());	// private
	}
}
