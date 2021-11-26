package GUIDE.member;

import java.util.Scanner;

public class MemberManagement{

	// 사용자 입력
	private Scanner sc = new Scanner(System.in);
	
	// 회원정보 저장
	private Member[] members = new Member[100];
	
	// 관리자 계정
	private Member master = new Member(100,"master","root","root");
	
	// 로그인한 회원
	private Member loginMember = null;
	
	// 프로그램 flag (true : 진행 , false : 종료) 
	private boolean isRun = true;
	
	// 메뉴 번호 선택
	private int selectNo;

	// 프로그램 실행용 생성자
	public MemberManagement() {
		members[members.length-1] = master;
		isRun();
	}
	
	int num = 1;
	
	/*
	 * 기능 관리 
	 */
	
	// 프로그램 실행
	private void isRun() {
		while(isRun) {
			System.out.println("========================================================");
			System.out.println("1.회원가입|2.로그인|3.회원목록|4.회원정보수정|5.회원탈퇴|6.프로그램종료");
			System.out.println("========================================================");
			System.out.println("번호입력 >");
			selectNo = sc.nextInt();
			switch(selectNo) {
				case 1:
					System.out.println("회원가입 >");
					join();
					break;
				case 2:
					System.out.println("로그인 >");
					login();
					break;
				case 3:
					System.out.println("회원목록 >");
					select();
					break;
				case 4:
					System.out.println("회원정보수정 >");
					update();
					break;
				case 5:
					System.out.println("회원탈퇴 >");
					delete();
					break;
				case 6:
					System.out.println("프로그램종료 >");
					terminate();
					break;
				default:
					System.out.println("올바른 번호가 아니다.");
					break;
			}
		}
		
	}
	
	// 프로그램 종료
	private void terminate() {
		this.isRun = false;
		
	}

	// 회원 가입
	private void join() {
		System.out.println("사용정보를 입력해주세요-------------------");
		System.out.println("아이디를 입력해주세요");
		String id = sc.next();
		System.out.println("비밀번호를 입력해주세요");
		String pw = sc.next();
		System.out.println("비밀번호를 확인해주세요");
		String rePw = sc.next();
		if(!memberIdCheck(id) || !pw.equals(rePw)) {
			System.out.println("사용할 수 없는 아이디거나 또는 비밀번호가 일치하지 않음");
			return;
		}
		System.out.println("이름을 입력해주세요");
		String name = sc.next();
		for(int i=0; i<members.length; i++) {
			if(members[i] == null) {
				members[i] = new Member((i+1),name,id,pw);
				System.out.println("회원가입 완료");
				break;
			}
		}
	}
	
	// 로그인
	private void login() {
		System.out.println("아이디를 입력해주세요 >");
		String id = sc.next();
		System.out.println("비밀번호를 입력해주세요 >");
		String pw = sc.next();
		
		Member member = findMember(new Member(id,pw));
		if(member != null) {
			System.out.println("로그인 완료");
			loginMember = member;
			System.out.println(loginMember.toString());
			if(loginMember == master) {
				System.out.println("관리자 로그인");
			}
			return;
		}
		System.out.println("틀림");
		/*
		Member m = new Member(id,pw);
		Member member = findMember(m);
		*/
		
		/*
		for(Member mem : members) {
			if(mem != null && mem.getmId().equals(id) && mem.getmPw().equals(pw)) {
				loginMember = mem;
				System.out.println("로그인 완료");
				System.out.println(loginMember.toString());
				if(loginMember == master) {
					System.out.println("관리자 로그인");
				}
				return;
			}
		}
		System.out.println("틀림");
		*/
	}

	// 회원목록 - 로그인한 회원이 관리자 일때만 노출 
	private void select() {
		if(loginMember != master){
			// err : 빨간색으로 출력
			System.err.println("관리자만 가능");
			return;
		}
		for(Member m : members) {
			if(m != null) {
			System.out.println(m.toString());
			}
		}
	}
	
	// 회원정보 수정 - 로그인한 회원 정보랑 일치 하거나 관리자 일때만 수정(이름정보만 수정)
	private void update() {
		if(loginMember == null) {
			System.out.println("로그인 먼저 하라");
			return;
		}
		if(loginMember == master) {
			System.out.println("관리자 권한 정보수정");
			select();
			System.out.println("수정할 회원번호");
			int num = sc.nextInt();
			for(int i=0; i<members.length; i++) {
				if(members[i] != null && members[i].getmNum() == num) {
					System.out.println("수정할 회원의 이름");
					String name = sc.next();
					members[i].setmName(name);
					System.out.println("수정완료");
					return;
				}
			}
			System.out.println("그런 회원은 없다");
		}else {
			System.out.println("내 정보 수정 >");
			System.out.println("비밀번호를 입력해주세요");
			String pw = sc.next();
			if(!loginMember.getmPw().equals(pw)) {
				System.err.println("비밀번호가 틀리다");
				return;
			}
			System.out.println("바꿀 이름을 입력하라");
			String name = sc.next();
			loginMember.setmName(name);
			System.out.println("수정완료");
			System.out.println(loginMember.toString());
		}
	}
	
	// 회원탈퇴 - 삭제 할려는 정보가 본인 정보일때만 삭제
	private void delete() {
		if(loginMember == null) {
			System.out.println("로그인 먼저 하라");
			return;
		}
		
		if(loginMember == master) {
			System.err.println("관리자 탈퇴 불가");
			return;
		}
		System.out.println("진짜 탈퇴할거? y/n");
		char str = sc.next().charAt(0);
		switch(str) {
			case 'y': case 'Y': case 'ㅛ':
				deleteMember();
				System.out.println("삭제완료");
				break;
			default:
				System.out.println("삭제취소");
				break;
		}
		
	}
	
	// 사용자 아이디 중복 체크
	private boolean memberIdCheck(String mId) {
		for(Member m : members) {
			if(m != null && m.getmId().equals(mId)) {
				return false;
			}
		}		
		return true;
	}
	
	// 회원 아이디와 비밀번호로 회원 찾기
	private Member findMember(Member m) {
		for(Member member : members) {
			if(member != null && member.equals(m)) {
				return member;
			}
		}
		return null;
	}
	
	// 회원 정보 삭제
	private void deleteMember() {
		for(int i=0; i<members.length; i++) {
			if(members[i].equals(loginMember)) {
				members[i] = null;
				loginMember = null;
				System.out.println("회원탈퇴 완료");
				return;
			}
		}
	}
}
