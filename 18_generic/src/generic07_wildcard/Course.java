package generic07_wildcard;

public class Course<S> {

	private String name;
	private S[] students;
	
	public Course(String name, int capacity) {
		super();
		this.name = name;
		this.students = (S[])new Object[capacity];
	}

	public String getName() {
		return name;
	}

	public S[] getStudents() {
		return students;
	}
	
	public void add(S s) {
		for(int i=0; i<students.length; i++) {
			if(students[i] == null) {
				students[i] = s;
				break;
			}
		}
	}
	
}
