package octlast;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Test4 {

	public static void main(String[] args) {
		String chars = "abcdefghijklmnopqrstuvwxyz";
		String num = "1234567890";
		System.out.println("문자나 숫자를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(str);
		String low = str.toLowerCase();
		ArrayList<String> array = new ArrayList<>();
		ArrayList<String> narray = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(chars,"abcdefghijklmnopqrstuvwxyz",true);
		StringTokenizer nst = new StringTokenizer(num,"1234567890",true);
		int count = st.countTokens();
		int ncount = nst.countTokens();
		for(int i=0; i<count; i++) {
			String tok = st.nextToken();
			array.add(tok);
		}
		for(int i=0; i<ncount; i++) {
			String nt = nst.nextToken();
			narray.add(nt);
		}
		boolean s = false;
		boolean n = false;
		
		for(int i=0; i<array.size(); i++) {
			if(array.get(i).equals(low)) {
				s = true;
			}
		}
		for(int i=0; i<narray.size(); i++) {
			if(narray.get(i).equals(low)) {
				n = true;
			}
		}
		System.out.println("영어문자 : "+s);
		System.out.println("숫자 : "+n);
		sc.close();
	}
}