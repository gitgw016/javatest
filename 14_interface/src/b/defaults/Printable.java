package b.defaults;

public interface Printable {
	void print();
	
	default void colorPrint() {
		System.out.println("칼라프린터 출력");
	};
}
