package b.throwss;

public class ThrowsExample {

	public static void main(String[] args) {
		System.out.println("Main 시작");
		try {
			findClass("java.lang.String2");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Main 종료");
	}
	
	public static void findClass(String path) throws ClassNotFoundException {
		Class clazz = Class.forName(path);
		System.out.println(clazz);	
	}
}
