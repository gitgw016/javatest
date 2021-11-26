package generic07_wildcard;

public class Person {

	private String name;

	public Person(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
}
