package test;

public class Car {
	
	String color;
	int speed;
	int gear;
	
	void speedUp() {
		this.speed += 10;
	}
	
	void speedDown() {
		this.speed -= 10;
	}

	public String toString() {
		return "Car [color=" + color + ", speed=" + speed + ", gear=" + gear + "]";
	}
	
	
	
}
