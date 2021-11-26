package e.array;

public class Car {
	String model;
	String color;
	int speed;
	
	Tire[] tires;
	
	public Car() {
		tires = new Tire[] {
			new HankookTire(),
			new HankookTire(),
			new KumhoTire(),
			new KumhoTire()
		};
	}

	public void run() {
		for(Tire tire : tires) {
			tire.roll();
		}
	}

	
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.run();
		myCar.tires[0] = new KumhoTire();
		myCar.tires[1] = new KumhoTire();
		myCar.run();

	}
}









