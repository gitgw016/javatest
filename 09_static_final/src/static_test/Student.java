package static_test;

public class Student {
	
	static String school;
	
	String name;
	int age;
	String grade;
	
	static void setGrade(String grade) {
		// this.grade = grade; : X, static이라 인스턴스 생성 불가
	}
	
	void setSchool(String school) {
		this.school = school;
	}
	
	static String getSchool(String school) {
		return Student.school;
	}
	
	static int sum(int x, int y) {
		return x+y;
	}
	
	int result;
	
	void sum(int x, int y, String message) {
		result = x+y;
		System.out.println(message);
	}
}
