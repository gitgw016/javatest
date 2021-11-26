package octlast;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("문자열을 입력해 주세요 >>");
			String value = sc.nextLine();
			StringTokenizer st = new StringTokenizer(value,"java",true);
			int count = st.countTokens();
			ArrayList<String> array = new ArrayList<>();
			for(int i=0; i<count; i++) {
				String tok = st.nextToken();
				array.add(tok);
			}
			boolean check = array.contains("j");
			check = array.contains("a");
			check = array.contains("v");
			check = array.contains("a");
			if(check == true) {
				System.out.println("java가 존재 합니다.");
				System.err.println("시스템을 종료합니다.");
				return;
			}else {
				System.out.println("java가 존재하지 않습니다.");
			}
			
		}
	}

}
