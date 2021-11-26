package t04_synchronized;

class User1Thread extends Thread{
	private Calculator calc;
	public void setCalculator(Calculator calc) {
		this.calc = calc;
	}
	
	public void run() {
		calc.setMemory(50);
	}
}

class User2Thread extends Thread{
	private Calculator calc;
	public void setCalculator(Calculator calc) {
		this.calc = calc;
	}
	
	public void run() {
		calc.setMemory(100);
	}
}

public class SynchronizedTest {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		User1Thread u1 = new User1Thread();
		u1.setCalculator(calc);
		User2Thread u2 = new User2Thread();
		u2.setCalculator(calc);
		u1.start();
		u2.start();
	}

}
