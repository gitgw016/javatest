package a.object.toString;

public class ToStringExam {

	public static void main(String[] args) {
		Object obj = new Object();
		System.out.println(obj);
		System.out.println(obj.toString());
		
		obj = new Person("배민구",3,50);
		System.out.println(obj);
	}

}
