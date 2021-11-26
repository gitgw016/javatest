package c5_tree_comparable;

public class Person implements Comparable<Person> {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Person o) {
		//내림차순
		/*
		if(this.age > o.age) {
			return -1;
		}else if(this.age == o.age) {
			return 0;
		}else {
			return 1;
		}
		*/
		//return o.age - this.age;
		return this.age - o.age;
	}
	
}
