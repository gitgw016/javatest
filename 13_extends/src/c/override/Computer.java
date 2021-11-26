package c.override;

public class Computer extends Calculator {
	// alt + s + v
	@Override
	public double circleArea(double radius) {
		return radius * radius * 3.141592;
	}
	
	
}
