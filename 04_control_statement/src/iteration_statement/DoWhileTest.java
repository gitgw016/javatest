package iteration_statement;

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isLogin = false;
		//false라서 실행 x
		while(isLogin) {
			System.out.println("while 실행");
		}
		// do 실행 후  while 실행(while이 거짓이면 작동종료) 최초의 실행 한번은 보장
		do {
			System.out.println("do while 실행");
			System.out.println("====로그인====");
			System.out.println("아이디를 입력해주세요>");
			String id = sc.next();
			System.out.println("비밀번호를 입력해주세요>");
			String pw = sc.next();
			if(id.equals("배민구") && pw.equals("오정만")) {
				System.out.println("로그인 성공");
				break;
			}else {
				isLogin = true;
			}
		}while(isLogin);
		System.out.println("Main 종료");
	}

}
