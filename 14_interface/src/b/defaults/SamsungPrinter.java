package b.defaults;

public class SamsungPrinter implements Printable{
	public void samsungPrint() {
		System.out.println("삼성 프린터가 출력.");
	}

	@Override
	public void print() {
		System.out.println("삼성 프린터 출력");
	}
}
