package f.polymorphism;

public class Person {
	String name;
	int age;
	int weight;
	int height;
	
	public Person() {}

	public Person(String name, int age, int weight, int height) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", weight=" + weight + ", height=" + height + "]";
	}
	
	
}
