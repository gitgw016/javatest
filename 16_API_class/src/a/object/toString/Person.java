package a.object.toString;

public class Person extends Object {
	
	String name;
	int height;
	int weight;
	
	public Person(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", height=" + height + ", weight=" + weight + "]";
	}
	
	
	
	
}
