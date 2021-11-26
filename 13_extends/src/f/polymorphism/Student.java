package f.polymorphism;

public class Student extends Person{
	
	String classRoom;	// 교실
	String studentNum;	// 학번
	String grade;		// 학년
	
	public Student(String name, int age, int weight, int height, String classRoom, String studentNum, String grade) {
		super(name, age, weight, height);
		this.classRoom = classRoom;
		this.studentNum = studentNum;
		this.grade = grade;
	}

	public void study() {
		System.out.println(name+"학생은"+grade+"학년"+classRoom+"에서 공부를 한다.");
	}

	@Override
	public String toString() {
			  // 부모가가진 toString
		return super.toString()+" Student [classRoom=" + classRoom + ", studentNum=" + studentNum + ", grade=" + grade + "]";
	}
	
}
