package octfirst;

public class StudentInfo {

	public static void main(String[] args) {
		Student kim = new Student();
		kim.school = "koreaTE";
		kim.grade = 4;
		kim.name = "김유신";
		
		Student choi = new Student("한국기술교육직업전문학교",1,"최기근");
		System.out.println(choi.school);
		System.out.println(choi.grade);
		System.out.println(choi.name);
	}

}
