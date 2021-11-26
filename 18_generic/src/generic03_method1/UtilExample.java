package generic03_method1;

class Util{
	public static <T> Box<T> boxing(T t){
		Box<T> box = new Box<>();
		box.setType(t);
		return box;
	}
}

public class UtilExample {

	public static void main(String[] args) {
		Box<String> box1 = Util.<String>boxing("배민구");
		System.out.println(box1.getType());
		
		Box<String> box2 = Util.boxing("오정만");
		System.out.println(box2.getType());
		
		// Type이 틀림으로 인한 오류
		// Box<String> errorBox = Util.boxing(1);
		
		Box<Integer> box3 = Util.<Integer>boxing(3);
		int i = box3.getType();
		System.out.println(i);
	}

}
