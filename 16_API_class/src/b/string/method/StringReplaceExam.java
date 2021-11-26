package b.string.method;

public class StringReplaceExam {

	public static void main(String[] args) {
		String oldStr = "민구는 안선다! 민구는 절대로 서지않아!";
		String newStr = oldStr.replace("민구", "BaeMinGu");
		System.out.println(oldStr);
		System.out.println(newStr);
	}

}
