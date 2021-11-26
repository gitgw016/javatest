package g.format;

import java.text.DecimalFormat;

public class DecimalFormatExample {

	public static void main(String[] args) {
		
		double num = 1234567.849;
		DecimalFormat df = new DecimalFormat("0");  // 반올림
		String str = df.format(num);
		System.out.println(str);
		
		df = new DecimalFormat("0.0");
		str = df.format(num);
		System.out.println(str);
		// 소수점 두번째 자리까지 표현하고 남은 정수 자리는 0으로 채움
		df = new DecimalFormat("00000000000.00");
		str = df.format(num);
		System.out.println(str);
		
		df = new DecimalFormat("#,###,###.##");
		str = df.format(num);
		System.out.println(str);
		
		// \u00A4 == 유니코드 원화표시
		df = new DecimalFormat("\u00A4 #,###원");
		str = df.format(num);
		System.out.println(str);
		
		df = new DecimalFormat("$ #,###");
		str = df.format(num);
		System.out.println(str);
		
	}

}
