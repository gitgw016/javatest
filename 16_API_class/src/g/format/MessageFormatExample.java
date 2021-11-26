package g.format;

import java.text.MessageFormat;

public class MessageFormatExample {

	public static void main(String[] args) {
		String text = "회원 ID : {0} \n회원이름 : {1} \n전화번호 : {2}";
		System.out.println(text);
		System.out.println();
		
		String result = MessageFormat.format(text, "id안선다","배민구","none");
		System.out.println(result);
		System.out.println();
		
		String text2 = "INSERT INTO member VALUES({0},{1},{2})";
		Object[] arguments = {1,"배민구","none"};
		String result2 = MessageFormat.format(text2, arguments);
		System.out.println(result2);
	}

}
