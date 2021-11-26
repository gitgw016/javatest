package b.string.string_builder;

public class StringBuilderExam {

	public static void main(String[] args) {
		String a = "배민구";
		System.out.println(a.hashCode());
		a += " 절대로";
		System.out.println(a.hashCode());
		a += " 안선다";
		System.out.println(a.hashCode());
		
		StringBuilder sb = new StringBuilder("노답들 : ");
		sb.append("민구 ");
		sb.append("절대로 못세운다");
		System.out.println(sb.toString());
		System.out.println(sb.hashCode());
		// 문자열 4번째 인덱스에 ㅋ라는 문자열 추가
		sb.insert(4, "ㅋ");
		System.out.println(sb.toString());
		System.out.println(sb.hashCode());
		
		// 해당 인덱스 위치의 문자를 변경
		sb.setCharAt(4, 'ㅎ');
		System.out.println(sb.toString());
		System.out.println(sb.hashCode());
		// delete(시작 인덱스, 해당 자리까지) 문자열을 삭제
		sb.delete(4, 6);
		System.out.println(sb.toString());
		System.out.println(sb.hashCode());
	}

}
