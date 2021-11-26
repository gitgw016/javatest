package f.polymorphism;

public class Teacher extends Person {
	
	String tNumber;		// 교번
	String subject;		// 담당과목
	String grade;		// 담당학년
	
	public Teacher(String name, int age, int weight, int height, String tNumber, String subject, String grade) {
		super(name, age, weight, height);
		this.tNumber = tNumber;
		this.subject = subject;
		this.grade = grade;
	}
	
	public void teach() {
		System.out.println(super.name+"는 "+this.subject+"를 가르친다.");
	}

	@Override
	public String toString() {
		return "Teacher [tNumber=" + tNumber + ", subject=" + subject + ", grade=" + grade + ", name=" + name + ", age=" + age + ", weight=" + weight + ", height=" + height + "]";
	}
	
	
}
