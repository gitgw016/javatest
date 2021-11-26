package a.declaration;
// main method가 존재하는 실행 class
public class StudentExample {

	public static void main(String[] args) {
		Student s1; // 선언
		s1 = new Student();
		System.out.println("Student class를 참조하여 s1객체 생성 " +s1);
		Student s2 = new Student();
		System.out.println("Student class를 참조하여 s2객체 생성 " +s2);
		Bus bus = null;
		// bus = new Student();  : 불가능
		bus = new Bus();
		System.out.println(bus);
		System.out.println(s1 == s2);
	}

}
