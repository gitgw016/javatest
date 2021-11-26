package mysql.b_book.pstmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import mysql.b_book.BookVO;
import mysql.dao.BookDAO;

public class BookPSTMTDAOImpl implements BookDAO {
	
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	
	

	public BookPSTMTDAOImpl() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/smart","smart","12345");
		} catch (ClassNotFoundException e) {
		} catch (SQLException e) {}
	}
	// book 정보를 삽입하고 삽입된 행의 개수를 반환
	@Override
	public int insert(BookVO book) {
		int result = 0;
		try {
			String sql = "INSERT INTO tbl_book(title,author)"+"VALUES(?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,book.getTitle());
			pstmt.setString(2,book.getAuthor());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("query 오류");
		} finally {
			try {
				if(pstmt != null) pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	@Override
	public ArrayList<BookVO> select() {
		ArrayList<BookVO> books = new ArrayList<>();
		String sql = "SELECT * FROM tbl_book ORDER BY num DESC";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int num = rs.getInt("num");
				String title = rs.getString("title");
				String author = rs.getString("author");
				Date regdate = rs.getTimestamp("regdate");
				BookVO book = new BookVO(num,title,author,regdate);
				books.add(book);
			}
		} catch (SQLException e) {
			System.out.println("query"+e.getMessage());
		} finally {
			DBHelper.close(rs,pstmt);
		}
		return books;
	}

	@Override
	public int update(BookVO book) {
		int result = 0;
		String sql = "UPDATE tbl_book SET title = ?, author = ? WHERE num = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, book.getTitle());
			pstmt.setString(2, book.getAuthor());
			pstmt.setInt(3, book.getNum());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("query?"+e.getMessage());
		} finally {
			DBHelper.close(pstmt);
		}
		return result;
	}

	@Override
	public BookVO selectBook(int num) {
		BookVO book = null;
		try {
			String sql = "SELECT * FROM tbl_book WHERE num = ? ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				book = new BookVO(
						rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getTimestamp(4)
						);
			}
		} catch (SQLException e) {
			System.out.println("query 오류");
		} finally {
			try {
				if(rs != null) rs.close(); 
				if(pstmt != null) pstmt.close();
			} catch (SQLException e) {}
		}
		return book;
	}

	@Override
	public int delete(int num) {
		int result = 0;
		String sql = "DELETE FROM tbl_book WHERE num = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("query?"+e.getMessage());
		} finally {
			DBHelper.close(pstmt);
		}
		return result;
	}

}
