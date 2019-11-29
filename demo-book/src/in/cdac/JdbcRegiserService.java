package in.cdac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcRegiserService {
	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String url = "jdbc:mysql://192.168.64.4:3306/test";
	private static String username = "mysql"; // root
	private static String password = "mysql"; // ""
	
	public static void regiserUser(User user) throws Exception {
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, username, password);

			String sql = "INSERT INTO JDBC_USER (USERNAME, PASSWORD, EMAIL, MOBILE) VALUES (?, ?, ?, ?)";
			PreparedStatement ps =  con.prepareStatement(sql);
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());
			ps.setString(3, user.getEmail());
			ps.setString(4, user.getMobile());
			
			ps.executeUpdate();
			return;
		} catch(Exception e) {
			throw e;
		}
	}

}
