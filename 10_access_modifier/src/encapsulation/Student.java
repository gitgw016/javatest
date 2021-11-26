package encapsulation;

// encapsulation - 캡슐화
public class Student {
	public String name; // 이름
	private int age;		// 나이
	private int grade;	// 학년
	// alt + s + a
	public Student() {
		super();
	}
	
	// alt + s + r
	public void setAge(int age) {
		if(age < 1) {
			this.age = 1;
			return;
		}
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}
	
	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	// alt + s + s + s
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", grade=" + grade + "]";
	}
	
	
}
