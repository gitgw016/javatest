package test;

public abstract class Driver {
	String name;
	public abstract void drive();
}

class BusDriver extends Driver{
	public void drive() {
		System.out.println(name + "님이 버스를 운전합니다.");
	}
}

class TexiDriver extends Driver{
	public void drive() {
		System.out.println(name + "님이 택시를 운전합니다.");
	}
}
