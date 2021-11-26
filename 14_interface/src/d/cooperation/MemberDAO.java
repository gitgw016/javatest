package d.cooperation;

public class MemberDAO implements DatabaceAccessObject {

	@Override
	public void connection() {
		System.out.println("DB 연결");
	}

	@Override
	public void select() {
		System.out.println("사용자 정보 검색");
	}

	@Override
	public void insert() {
		System.out.println("사용자 정보 삽입");
	}

	@Override
	public void update() {
		System.out.println("사용자 정보 수정");
	}

	@Override
	public void delete() {
		System.out.println("사용자 정보 삭제");
	}

	@Override
	public void close() {
		System.out.println("연결 종료");
	}

}
