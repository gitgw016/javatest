package g.format;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormatExam {

	public static void main(String[] args) {
		// 1000/1초 단위의 밀리세컨으로 시간에 대한 정보를 저장하고 문자열로 정보를 알려주는 객체
		// 시간 정보는 생성자의 매개변수 long type의 시간정보로 결정
		long time = System.currentTimeMillis();
		Date date = new Date(time);
		System.out.println(date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String now = sdf.format(date);
		System.out.println(now);
		
		date = new Date(0);
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 MM분 ss초");
		now = sdf.format(date);
		System.out.println(now);
		
		date = new Date(Long.MAX_VALUE);
		sdf = new SimpleDateFormat("yyyy-MM-dd E요일 HH:mm:ss");
		now = sdf.format(date);
		System.out.println(now);
		
		// 현재시간에 대한 정보를 제공하는 객체
		// Calendar는 new 연산자로 객체생성 불가
		// instance메소드를 이용하여 객체를 받아와서 사용가능
		// new Calendar();
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		// 주중 날짜
		int day = cal.get(Calendar.DAY_OF_WEEK);
		// 월중 날짜
		int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
		String strWeek = null;
		// Calendar.SUNDAY == 1
		// Calendar.MONDAY == 2
		// ...
		switch(day) {
			case Calendar.MONDAY :
				strWeek = "월";
				break;
			case Calendar.SUNDAY :
				strWeek = "일";
				break;
			case Calendar.TUESDAY :
				strWeek = "화";
				break;
			case Calendar.WEDNESDAY :
				strWeek = "수";
				break;
			case Calendar.THURSDAY :
				strWeek = "목";
				break;
			case Calendar.FRIDAY :
				strWeek = "금";
				break;
			case Calendar.SATURDAY :
				strWeek = "토";
				break;
		}
		
		int amPm = cal.get(Calendar.AM_PM);
		String strAmPm = null;
		if(amPm == Calendar.AM) {
			strAmPm = "오전";
		}else {
			strAmPm = "오후";
		}
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		System.out.println(year+"년");
		System.out.println(month+"월");
		System.out.println(dayOfMonth+"일");
		System.out.println(strWeek+"요일");
		System.out.println(strAmPm+" ");
		System.out.println(hour +"시");
		System.out.println(minute +"분");
		System.out.println(second+"초");
	}

}
