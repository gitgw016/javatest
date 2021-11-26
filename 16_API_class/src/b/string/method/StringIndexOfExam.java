package b.string.method;

public class StringIndexOfExam {

	public static void main(String[] args) {
		String str = "민구 평생안서는것 민구!";
		// indexOf(앞에서부터 검색) lastIndexOf(뒤에서부터 검색)
		//매개변수로 넘겨받은 값이 문자열에 존재하는지 확인하고 시작 인덱스 값을 반환, 해당되는 값이 없으면 -1을 반환
		int location = str.indexOf("평생안서는것");
		System.out.println(location);
		
		if(str.indexOf("민구") != -1) {
			System.out.println("배민구가 안섭니다.");
		}else {
			System.out.println("배민구는 고자가 됐습니다.");
		}
		System.out.println(str.indexOf("민구"));
		System.out.println(str.lastIndexOf("민구"));
		
		String fileName = "bae.png";
		int index = fileName.lastIndexOf(".");
		System.out.println(index);
		String ext = fileName.substring(index+1);
		System.out.println(ext);
	}

}
