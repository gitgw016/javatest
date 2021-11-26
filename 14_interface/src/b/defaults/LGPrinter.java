package b.defaults;

public class LGPrinter implements Printable{
	
	public void printLG() {
		System.out.println("LG프린터가 출력");
	}

	@Override
	public void print() {
		System.out.println("LG프린터 출력");
	}

}
