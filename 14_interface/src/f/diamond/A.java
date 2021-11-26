package f.diamond;

public interface A {
	default void methodA() {
		System.out.println("A methodA");
	}
	
	void methodB();
}
