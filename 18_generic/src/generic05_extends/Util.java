package generic05_extends;

public class Util {
	public static <T extends Number> int compare(T t1, T t2) {
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		if(v1 > v2) {
			return (int)v1;
		}else {
			return (int)v2;
		}
	}
}
