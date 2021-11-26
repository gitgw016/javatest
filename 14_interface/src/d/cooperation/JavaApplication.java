package d.cooperation;

public class JavaApplication {

	public static void main(String[] args) {
		
		DatabaceAccessObject memberDAO = new MemberDAO();
		memberDAO.connection();
		memberDAO.select();
		memberDAO.close();
		
	}

}
