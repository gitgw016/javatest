package account.pstmt;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import util.DBHelper;

public class DBHelperTest {

	public static void main(String[] args) throws SQLException {
		Connection conn = DBHelper.getConnection();
		System.out.println("연결 됐다 : "+conn);
		Connection conn2 = DBHelper.getConnection();
		System.out.println("연결 됐다 : "+conn2);
		
		Statement stmt = conn.createStatement();
		PreparedStatement pstmt = conn.prepareStatement("");
		DBHelper.close(stmt,pstmt,conn);
//		DBHelper.close(pstmt);
//		DBHelper.close(stmt);
//		DBHelper.close(conn2);

		// DBHelper.close(conn2);
		/*
		try {
		if(conn2 != null) {
			conn2.close();
		}
		} catch (SQLException e) {}
		*/
	}

}
