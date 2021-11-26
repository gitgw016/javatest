package account.pstmt;

import java.sql.*;
import account.Account;
import dao.AccountDAO;
import util.DBHelper;

public class AccountPSTMTDAOImpl implements AccountDAO {
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	@Override
	public void insert(Account account) {
		String sql = "INSERT INTO tbl_account VALUES(?,?,?,?)";
		conn = DBHelper.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, account.getAno());
			pstmt.setString(2, account.getOwner());
			pstmt.setInt(3, account.getBalance());
			pstmt.setString(4, account.getPassword());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBHelper.close(pstmt);
		}
		
	}

	@Override
	public int update(Account account) {
		int result = 0;
		String sql = "UPDATE tbl_account SET balance = ? WHERE ano = ?";
		conn = DBHelper.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, account.getBalance());
			pstmt.setString(2, account.getAno());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBHelper.close(pstmt);
		}
		return result;
	}

	@Override
	public Account selectAccount(String ano) {
		Account account = null;
		conn = DBHelper.getConnection();
		String sql = "SELECT * FROM tbl_account WHERE ano = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ano);
			rs = pstmt.executeQuery();
			account = getAccount(rs);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBHelper.close(rs,pstmt);
		}
		return account;
	}
	
	public Account getAccount(ResultSet rs) throws SQLException {
		Account acc = null;
		if(rs.next()) {
			acc = new Account(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4));
		}
		return acc;
	}

	@Override
	public Account selectAccount(String ano, String password) {
		Account account = null;
		conn = DBHelper.getConnection();
		CallableStatement cstmt = null;
		try {
			cstmt = conn.prepareCall("CALL find_account(?,?)");
			cstmt.setString(1, ano);
			cstmt.setString(2, password);
			rs = cstmt.executeQuery();
			account = getAccount(rs);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBHelper.close(rs,cstmt);
		}
		return account;
	}

}
