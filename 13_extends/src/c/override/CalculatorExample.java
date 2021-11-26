package c.override;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		double area = calc.circleArea(5);
		System.out.println(area);
		
		Computer computer = new Computer();
		area = computer.circleArea(5);
		System.out.println(area);
	}

}
