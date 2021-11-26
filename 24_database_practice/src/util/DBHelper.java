package util;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBHelper {
//	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
//	private static final String URL = "jdbc:mysql://localhost:3306/smart";
//	private static final String USER = "smart";
//	private static final String PASS = "12345";
	
	private DBHelper() {}
	
	private static Connection conn = null;
	
	public static Connection getConnection() {
		if(conn == null) {
			try {
				// Properties 파일을 이용하면 java 코딩을 변경하지 않고 교체 할 수 있다.
				Properties prop = new Properties();
				File file = new File("src/prop/mysql.properties");
				String path = file.getPath();
				System.out.println(path);
				prop.load(new FileReader(path));
				String driver = prop.getProperty("driver");
				String url = prop.getProperty("url");
//				String user = prop.getProperty("user");
//				String password = prop.getProperty("password");
				
				Class.forName(driver);
				// conn = DriverManager.getConnection(url,user,password);
				conn = DriverManager.getConnection(url,prop);
				
				// Class.forName(DRIVER);
				// conn = DriverManager.getConnection(URL,USER,PASS);
			} catch (IOException e) {
				System.out.println("read file?"+e.getMessage());
			} catch (ClassNotFoundException e) {
				System.out.println("Driver?");
			} catch (SQLException e) {
				System.out.println("DB?"+e.getMessage());
			}
		}
		return conn;
	}
	
	public static void close(AutoCloseable... closers) {
		for(AutoCloseable closer : closers) {
			try {
				if(closer != null) {
					closer.close();
				}
			} catch (Exception e) {}
		}
	}
	/*
	public static void close(Statement stmt) {
		try {
			if(stmt != null) stmt.close();
		} catch (SQLException e) {}
	}
	
	public static void close(Connection conn) {
		try {
			if(conn != null) conn.close();
		} catch (SQLException e) {}
	}
	*/
}

