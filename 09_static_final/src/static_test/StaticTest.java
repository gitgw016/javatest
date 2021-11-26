package static_test;

public class StaticTest {
	
	static int a;
	
	public static void main(String[] args) {
		
		System.out.println(StaticTest.a);
		Student.school = "한국기술교육직업전문학교";
		
		Student stu1 = new Student();
		stu1.age = 26;
		stu1.grade = "A급";
		stu1.name = "심아님";
		System.out.println(stu1.school);
		Student stu2 = new Student();
		stu2.age = 78;
		stu2.grade = "F급";
		stu2.name = "배민구";
		System.out.println(stu2.school);
		
		Student stu3 = new Student();
		// static 키워드가 없는 인스턴스 멤버는
		// heap instance 영역에 공간이 생성됨으로
		// class로 접근 불가 - 인스턴스가 생성되어야 접근 가능한 인스턴스멤버
		// Student.age;
		stu3.name = "홍재관";
		stu3.school = "학교?";
		System.out.println(Student.school);
		System.out.println(stu3.school);
		System.out.println(stu2.school);
		System.out.println(stu1.school);
		
		double d = Math.max(10.0, 20.0);
		System.out.println(d);
	}

}
