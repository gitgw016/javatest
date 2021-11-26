package generic07_wildcard;

import java.util.Arrays;

public class CourseExample {
	public static void registerCourse(Course<?> course){
		System.out.println("["+course.getName()+" 수강생]");
		for(int i=0; i<course.getStudents().length; i++) {
			System.out.println(course.getStudents()[i]+" ");
		}
		System.out.println();
	}
	
	public static void registerStudent(Course<? extends Student> course) {
		System.out.println("["+course.getName()+" 수강생]");
		System.out.println(Arrays.toString(course.getStudents()));
		System.out.println();
	}
	
	public static void registerWorker(Course<? super Worker> course) {
		System.out.println("["+course.getName()+" 수강생]");
		System.out.println(Arrays.toString(course.getStudents()));
		System.out.println();
	}

	public static void main(String[] args) {
		Course<Person> personCourse = new Course<>("일반인 과정", 5);
		personCourse.add(new Person("일반인"));
		personCourse.add(new Student("학생"));
		personCourse.add(new HighSchool("고등학생"));
		personCourse.add(new Worker("직장인"));
		personCourse.add(new Person("일반인2"));
		registerCourse(personCourse);
		System.out.println("=========================================================");
		System.out.println();
		
		Course<Student> studentCourse = new Course<>("학생 과정", 5);
		studentCourse.add(new Student("일반학생"));
		studentCourse.add(new HighSchool("고등학생"));
		//studentCourse.add(new Person("민구학생"));
		registerStudent(studentCourse);
		// registerStudent(personCourse);
		
		Course<HighSchool> highSchoolCourse = new Course<>("고등학생 과정", 5);
		highSchoolCourse.add(new HighSchool("고등학생"));
		registerStudent(highSchoolCourse);
		registerCourse(highSchoolCourse);
		System.out.println("=========================================================");
		System.out.println();
		
		Course<Worker> workerCourse = new Course<>("직장인 과정",5);
		workerCourse.add(new Worker("직장인"));
		registerCourse(workerCourse);
		registerWorker(workerCourse);
		registerWorker(personCourse);
		registerWorker(new Course<Object>("전체교육과정",10));
	}

}
