package in.cdac;

import java.sql.Connection;
import java.sql.DriverManager;

public class FirstJdbc {

	public static void main(String[] args) {
		try {
			String driver = "com.mysql.cj.jdbc.Driver";

			// String url = "jdbc:mysql://localhost:3306/test";
			String url = "jdbc:mysql://192.168.64.4:3306/test";
			String username = "mysql"; // root
			String password = "mysql"; // ""

			// STEP 1
			Class.forName(driver);
			
			// STEP - 2
			Connection con = DriverManager.getConnection(url, username, password);
			
			System.out.println("Connection Success");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
