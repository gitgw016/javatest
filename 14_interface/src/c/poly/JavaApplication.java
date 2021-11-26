package c.poly;

class MongoDB implements Connection{

	@Override
	public void connect() {
		System.out.println("Mongo DB 연결");
	}
	
}

class OracleDB implements Connection{

	@Override
	public void connect() {
		System.out.println("Oracle DB 연결");
	}
	
}

class MySQLDB implements Connection{

	@Override
	public void connect() {
		System.out.println("MySQL DB 연결");
	}
	
}

public class JavaApplication {

	public static void dbConnection(Connection conn) {
		conn.connect();
	}

	public static void main(String[] args) {
		dbConnection(new OracleDB());
		dbConnection(new MongoDB());
		dbConnection(new MySQLDB());
	}

}
