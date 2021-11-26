package a.object.equals;

import java.util.Scanner;

public class MemberExam {

	public static void main(String[] args) {
		Member member = new Member("idmingu");
		Scanner sc = new Scanner(System.in);
		System.out.println("ID를 입력해주세요.");
		String id = sc.next();
		Member loginMember = new Member(id);
		if(member == loginMember) {
			System.out.println("일치함.");
		}else {
			System.out.println("일치하지 않다.");
		}
		
		if(member.equals(loginMember)) {
			System.out.println("논리적으로 일치함.");
		}else {
			System.out.println("논리적으로 아니다.");
		}
	}

}
