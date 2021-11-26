package b.string.string_builder;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExam {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "한글표현";
		System.out.println(str.length());
		
		byte[] bytes1 = str.getBytes("UTF-8");
		System.out.println("bytes1이 length : "+bytes1.length);
		
		byte[] bytes2 = str.getBytes("EUC-KR");
		System.out.println(bytes2.length);
		
		System.out.println(new String(bytes1));
		System.out.println(new String(bytes2));
	}

}
