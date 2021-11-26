package f.polymorphism.method;

public class Vehicle {
	public void run() {
		System.out.println("탈것이 달린다.");
	}
}

class Bus extends Vehicle{
	public void run() {
		System.out.println("버스가 승객을 태우고 달린다.");
	}
}

class Mingu extends Vehicle{
	public void run() {
		System.out.println("민구가 고추를 떼고 달린다.");
	}
}