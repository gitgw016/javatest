
public class variableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 한줄주석
		
		/*
		 *  comments 다중 행 주석
		 */
		// byte type의 bNum 변수 선언
		byte bNum;
		// System.out.println(넘겨받은 값)
		// 넘겨받은 값을 console에 출력
		// bNum 변수의 값을 127로 초기화
		
		// bNum 변수의 값을 127로 초기화
		bNum = 127;
		bNum = 60;
		System.out.println(bNum);
		// byte == 1byte의 저장 공간 -128 ~ 127
		// bNum = 128; 값의 범위가 벗어나서 문법 오류 발생
		// byte bNum = 127; 변수 이름은 중복 불가
		// byte type의 변수 b1,b2,b3을 한번에 선언
		byte b1,b2,b3;
		b1 = 10;
		b2 = -10;
		b3 = (byte)-b2;
		System.out.println(b1+b2+b3);
		
		//2byte  저장공간을 가지는
		// short, char(character)
		// 65536가지의 값을 표현
		short sNum;
		//sNum= 34000;
		sNum = 20000;
		
		// 2byte크기로 유니코드 한개의 문자를 표현하는 데이터 타입
		char cNum = '배';
		System.out.println(cNum);
		// 한개의 문자만 가능 ''는 한개의 문자 ""는 문자열
		char cNum2 = 'B';
		System.out.println(cNum2);
		// 문자를 표현하기 때문에 음수가 없다. 유니코드
		char cNum3 = 66;
		System.out.println(cNum3);
		
		// Integer 4byte 정수
		// 정수타입의 기본 literal
		int iNum = 2100000000;
		int iNum2 = 2100000000;
		System.out.println(iNum + iNum2);
		
		// l,L = long타입으로 저장하라는 의미
		long lNum = 2200000000L + iNum2;
		System.out.println(lNum);
		long lNum2 = 3200000000000l;
		System.out.println(lNum2);
		lNum2 = 2100000000;
		System.out.println(lNum2);
		
		// 실수 decimal
		// float 4byte - 소수점 7자리
		float f = 3.14f;
		System.out.println(f);
		// double 8byte 소수점 15자리 - 실수형 기본 literal
		double d = 3.14;
		System.out.println(d);
		double fNum = f+d;
		System.out.println(fNum);
		
		int result = 10/4;
		System.out.println(result);
		
		// 1byte에 논리값을 저장 true, false
		boolean isTrue = false;
		System.out.println(isTrue);
		isTrue = true;
		System.out.println(isTrue);
		
		String s = "문자열을 저장하는 민구";
		System.out.println(s);
	}
}
