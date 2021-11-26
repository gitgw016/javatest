package generic05_extends;

public class ExtendsExample {

	public static void main(String[] args) {
		int result = Util.<Integer>compare(10,20);
		System.out.println("result : "+result);
		
		result = Util.<Double>compare(3.14, 5.14);
		System.out.println("result : "+result);
		
		// Number를 상속받고 있지 않으면 컴파일 오류
		// Number Type의 하위 클래스만 가능하게 제약
		// Byte Short Integer Long Float Double
		// 수치 비교가 가능한 클래스만 제네릭 타입으로 가능하게 제약
		// result = Util.<String>compare("A","B");
		
		result = Util.compare(1.5, 5.5);
		System.out.println("result : "+result);
	}

}
