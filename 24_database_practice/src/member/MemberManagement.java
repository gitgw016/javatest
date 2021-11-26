package member;

import java.util.ArrayList;

import dao.MemberDAO;
import util.DBHelper;

public class MemberManagement extends AppBase{
	
	protected MemberManagement(MemberDAO dao) {
		super(dao);
	}
	
	@Override
	protected void isRun() {
		while(isRun) {
			System.out.println("====================================================================");
			System.out.println("1.회원가입 | 2.로그인 | 3.회원정보 | 4.회원정보수정 | 5.회원탈퇴 | 6.탈퇴목록 | 7.종료");
			System.out.println("====================================================================");
			selectNo = getNumberData("메뉴 선택 >");
			
			switch(selectNo) {
			case 1 :
				System.out.println("== 회원가입 == ");
				join();
				break;
			case 2 :
				System.out.println("== 로그인 == ");
				login();
				break;
			case 3 :
				System.out.println("== 회원목록 == ");
				select();
				break;
			case 4 :
				System.out.println("== 회원정보수정 == ");
				update();
				break;
			case 5 :
				System.out.println("== 회원탈퇴 == ");
				delete();
				break;
			case 6 :
				System.out.println("== 탈퇴한 회원 목록 ==");
				deleteMember();
				break;
			case 7 :
				System.out.println("== 프로그램 종료 == ");
				terminate();
				break;
			default :
				System.out.println("해당 메뉴가 존재 하지 않습니다.");
			}
		}
	}
	// 탈퇴한 회원 정보
	// 관리자만 확인 가능
	private void deleteMember() {
		if(loginMember == null || !loginMember.getmId().equals("root")) {
			System.err.println("사용불가");
			return;
		}
		ArrayList<BackUpMember> deletes = dao.deleteMember();
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		for(BackUpMember m : deletes) {
			System.out.println(m);
		}
		System.out.println("--------------------------------------------------------------------------------------------------------------");
	}

	@Override
	protected void terminate() {
		isRun = false;
		DBHelper.close(DBHelper.getConnection());
	}

	@Override
	protected void join() {
		/* mId - 중복아이디 불가
		 * mPw == rePw - 일치하면 통과
		 * mName - 사용자 이름 입력
		 * 회원정보 등록
		 * 완료 시 등록된 회원 정보를 넘겨받아 출력
		 */
		String mId = getStringData("사용자 정보를 입력하라.\n아이디를 입력하라 >");
		String mPw = getStringData("비밀번호를 입력하라 >");
		String rePw = getStringData("비밀번호를 확인하라 >");
		// 아이디가 존재하거나 비밀번호가 일치하지 않는 경우
		if(!dao.selectMember(mId) || !mPw.equals(rePw)) {
			System.out.println("못쓴다.");
			return;
		}
		// 회원가입 진행
		String mName = getStringData("이름을 입력하라 >");
		Member m = dao.join(new Member(mName,mId,mPw));
		if(m != null) {
			System.out.println(m);
			System.out.println("회원가입 됐다.");
		}else {
			System.out.println("제대로 안됐다. 다시하라.");
		}
		
	}

	@Override
	protected void login() {
		/* mId
		 * mPw
		 * 아이디와 비밀번호가 일치하는 사용자가 존재할때 로그인 처리 - loginMember
		 */
		String mId = getStringData("아이디를 입력하라 >");
		String mPw = getStringData("비밀번호를 입력하라 >");
		Member member = dao.selectMember(mId,mPw);
		if(member == null) {
			System.out.println("로그인 실패");
			return;
		}
		
		loginMember = member;
		System.out.println(loginMember);
		if(loginMember.getmId().equals("root")) {
			System.err.println("관리자 로그인");
		}else {
			System.out.println("로그인 성공");
		}
	}
	

	@Override
	protected void select() {
		// 회원 목록 - 로그인한 회원(loginMember)
		// 관리자 - 전체회원목록 출력
		// 일반회원 - 자기자신의 정보만 출력
		// 비로그인 - 권한이 없다고 출력
		if(loginMember == null) {
			System.err.println("로그인 해라");
			return;
		}
		if(!loginMember.getmId().equals("root")) {
			System.out.println("로그인 회원 정보");
			System.out.println(loginMember);
		}else {
			System.out.println("---------------------------------------------------------------------------------");
			ArrayList<Member> list = dao.select();
			for(Member m : list) {
				System.out.println(m);
			}
			System.out.println("---------------------------------------------------------------------------------");
		}
	}

	@Override
	protected void update() {
		/* 회원정보 수정
		 * 로그인한 회원정보랑 일치하는지 비밀번호 확인 후 일치하는 사용자는 자기자신의 정보 수정
		 * 관리자일 경우 회원 번호로 이름정보를 수정
		 * 비로그인은 권한이 없다고 출력
		 */
		if(loginMember == null) {
			System.err.println("로그인 해라");
			return;
		}
		
		if(loginMember.getmId().equals("root")) {
			System.out.println("--- 회원 정보 수정 ---");
			select();
			int mNum = getNumberData("수정할 회원 번호를 입력하라 >");
			Member member = dao.selectMember(mNum);
			if(member == null) {
				System.err.println("없다.");
				return;
			}
			String name = getStringData(mNum+"번 : 변경 이름을 입력하라>");
			member.setmName(name);
			int result = dao.update(member);
			if(result != 1) {
				System.out.println("수정 실패");
			}else {
				System.out.println("수정 완료");
			}
		}else {
			System.out.println("--- 내 정보 수정 ---");
			String pw = getStringData("비밀번호를 입력하라 >");
			if(!loginMember.getmPw().equals(pw)) {
				System.out.println("안맞다.");
				return;
			}
			String name = getStringData("수정할 이름을 입력하라 >");
			loginMember.setmName(name);
			int result = dao.update(loginMember);
			String resultStr = (result !=1) ? "수정 실패" : "수정 완료";
			System.out.println(resultStr);
		}
	}

	@Override
	protected void delete() {
		/* 회원 탈퇴 - 삭제할려는 정보가 본인 정보와 일치할때만 삭제
		 * 관리자 계정은 삭제 불가
		 * 삭제 여부를 확인하여 확인 되었을때만 삭제
		 * 삭제된 회원 정보는 backup table에 저장
		 */
		if(loginMember == null || loginMember.getmId().equals("root")) {
			System.out.println("삭제 불가");
			return;
		}
		
		String pw = getStringData("삭제할거면 비밀번호를 입력하라 >");
		if(!pw.equals(loginMember.getmPw())) {
			System.out.println("정보 불일치");
			return;
		}
		
		String str = getStringData("삭제할거임? y/n");
		switch(str) {
			case "Y" : case "y" : case "ㅛ" :
				int result = dao.delete(loginMember.getmNum());
				if(result > 0) {
					loginMember = null;
					System.out.println("삭제완료");
				}else {
					System.out.println("삭제실패");
				}
				break;
			default :
				System.out.println("삭제 취소");
				break;
		}
	}
	

}
