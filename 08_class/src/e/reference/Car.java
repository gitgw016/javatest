package e.reference;

public class Car {
	String company;
	String model;
	
	Engine engine;
	
	void setEngine(Engine engine) {
		this.engine = engine;
	}
}

class Engine{
	int maxSpeed;
	int rpm;
	
}
