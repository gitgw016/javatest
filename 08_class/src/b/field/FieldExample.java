package b.field;

public class FieldExample {

	public static void main(String[] args) {
		Field f = new Field(); // heap에 Field.java의 내용이 들어감
		System.out.println(f.a); // 값이 자동으로 초기화
		System.out.println(f.b);
	}

}
