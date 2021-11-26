package b.string.stringtokenizer;

public class StringSplitExam {

	public static void main(String[] args) {
		String text = "배민구&오정만,홍재관,백만규,느그홍-심뭐시";
		String[] names = text.split("&|,|-");
		for(String s : names) {
			System.out.print(s + " ");
		}
	}

}
