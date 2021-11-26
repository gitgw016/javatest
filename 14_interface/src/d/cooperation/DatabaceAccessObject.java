package d.cooperation;

public interface DatabaceAccessObject {
	// DB 연결 기능 구현
	void connection();
	void select();		// DB 정보 검색 기능
	void insert();		// DB 정보 삽입(추가)
	void update();		// DB 정보 수정
	void delete();		// DB 정보 삭제
	void close();		// DB 연결 종료
}
