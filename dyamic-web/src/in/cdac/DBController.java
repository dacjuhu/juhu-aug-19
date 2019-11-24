package in.cdac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBController {
	public static String driver = "com.mysql.cj.jdbc.Driver";
	public static String url = "jdbc:mysql://192.168.64.4:3306/test";
	public static String username = "mysql"; // root
	public static String password = "mysql"; // ""
	
	
	public static List<User> readAlluser() throws Exception {
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, username, password);
			
			Statement st = con.createStatement();
			
			String sql = "SELECT * FROM USER";
			
			ResultSet  rs = st.executeQuery(sql);
			
			// user list
			List<User> list = new ArrayList<User>();
			while(rs.next()) {
				
				String username = rs.getString("USERNAME");
				String email = rs.getString("EMAIL");
				
				User user = new User();
				user.setEmail(email);
				user.setUsername(username);
				
				list.add(user);
			}
			
			con.close();
			
			return list;
		} catch(Exception e) {
			throw e;
		}
	} 
	
}
