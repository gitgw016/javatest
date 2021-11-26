package a.try_catch;

import java.util.Scanner;

public class TryCatchExample {

	public static void main(String[] args) {
		System.out.println("Main Start");
		int[] scores = new int[5];
		Scanner scan = new Scanner(System.in);
		
		try {
		System.out.println("변경하실 인덱스 번호를 입력하세요");
		String a = scan.next();
		int index = Integer.parseInt(a);
		System.out.println("변경하실 값을 입력하세요 >");
		scores[index] = scan.nextInt();
		System.out.println(scores[index]+"값으로 변경되었습니다.");
		System.out.println("Try block End");
		}catch(NumberFormatException e) {
			e.printStackTrace();
			System.out.println("NumberFormatException 발생");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println("ArrayIndexOutOfBoundsException 발생");
		}finally {
			System.out.println("오류 발생여부에 상관없이 무조건 실행");
		}
		System.out.println("Main End");
	}

}
