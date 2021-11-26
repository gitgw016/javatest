package b.string.stringtokenizer;

import java.util.StringTokenizer;

public class StringTokenizerExam {

	public static void main(String[] args) {
		String text = "배민구/오정만/홍재관/백만규";
		
		StringTokenizer st = new StringTokenizer(text,"/");
		int countTokens = st.countTokens();
		System.out.println(countTokens);
		for(int i=0; i<countTokens; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}
		System.out.println();
		
		text = "쉐민구|앗민구,오나만&재관홍\\밍구배\"앗정만";
		st = new StringTokenizer(text,"|,&\\\"");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}

}
