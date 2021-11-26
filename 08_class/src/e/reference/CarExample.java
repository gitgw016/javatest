package e.reference;

public class CarExample {

	public static void main(String[] args) {
		// Car.java의 Car(){}
		Car car = new Car();
		System.out.println(car.company);
		System.out.println(car.model);
		System.out.println(car.engine);
		car.company = "민구자동차";
		car.model = "안섬";
		Engine engine = new Engine();
		car.setEngine(engine);
		//car.engine = new Engine();
		System.out.println(engine == car.engine);
		engine.rpm = 100;
		System.out.println(car.engine.rpm);
		
		Car car2 = new Car();
		car2.company = "오정만";
		car2.model = "나만";
		car2.engine = new Engine();
		car2.engine.maxSpeed = 10;
		Engine engine2 = new Engine();
		car2.setEngine(engine2);
		//car2.setEngine(new Engine());
	}

}
