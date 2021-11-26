package project;

public class SystemPrintTest {

	public static void main(String[] args) {
		// print - 넘겨받은 값을 console에 출력하고 줄을 바꾸지 않음
		// println - 넘겨받은 값을 console에 출력하고 줄을 바꿈
		// printf - print format : 형식화된 출력문 printf는 줄바꿈이 이루어지지 않음
		/*
		 * 출력 후 줄바꿈을 하려면 지시자를 이용 (%n or \n 이스케이프 문자를 사용)
		 * 출력하려는 값(지시자)의 수만큼 값을 넣어줘야 한다.
		 * 예약되어 있는 지시자를 제외하고는 문자를 그대로 출력
		 * 지시자
		 * 
		 * %d : int(decimal) 10진법 정수 형식으로 출력
		 * %b : boolean 형식으로 출력
		 * %o : oct 8진법으로 출력
		 * %x : 16진법으로 출력
		 * %f : float - 실수 형태로 출력
		 * %c : character = 문자 형식으로 출력
		 * %s : string 문자 형태로 출력
		 * %n : 줄바꿈
		 * 
		 * %[-][0][n][.m]
		 * %[n] : 출력할 전체 자릿수를 지정(오른쪽 정렬) ex) %5d []1000
		 * %[0] : 전체 자릿수가 지정되어 있을경우 오른쪽으로 정렬하고 빈자리는 0으로 채움 ex) %05d , 1000 = 01000
		 * %[-] : 전체 자릿수가 지정된 경우에 왼쪽으로 졍렬하고 빈칸에 공백 출력
		 * %[.m] : 소수점 아래 자리수 지정. 잘리는 소수점 자리는 반올림
		 * %[0],%[-] : 정수에서만 사용 가능
		 */
		
		System.out.printf("%s의 교재는 %,020d원입니다. %n", "배민구", -10000000);
		// 배민구의 교재는 -00000000010,000,000원입니다.
		System.out.printf("%s의 교재는 %,20d원입니다. %n", "배민구", -10000000);
		// 배민구의 교재는          -10,000,000원입니다.
		System.out.printf("%s의 교재는 %,-20d원입니다. %n", "배민구", -10000000);
		// 배민구의 교재는 -10,000,000         원입니다.
		System.out.printf("%S의 교재는 %-20d원입니다. %n", "배민구bae", -10000000);
		// 배민구BAE의 교재는 -10000000           원입니다.
		
		System.out.printf("자릿수 지정 : %4d%n", 1);
		System.out.printf("자릿수 지정 : %4d%n", 10);
		System.out.printf("자릿수 지정 : %4d%n", 100);
		System.out.printf("자릿수 지정 : %4d%n", 1000);
		
		System.out.printf("자릿수 미지정 : %d%n", 1);
		System.out.printf("자릿수 미지정 : %d%n", 10);
		System.out.printf("자릿수 미지정 : %d%n", 100);
		System.out.printf("자릿수 미지정 : %d%n", 1000);
		
		// .%mf - 소수점 자리, 반올림
		System.out.printf("%.2f %n",1234.123);
		System.out.printf("%.2f %n",1234.127);
	}

}
