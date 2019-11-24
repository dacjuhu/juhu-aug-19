package in.cdac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class MAIN3 {
	public static String driver = "com.mysql.cj.jdbc.Driver";
	public static String url = "jdbc:mysql://192.168.64.4:3306/test";
	public static String username = "mysql"; // root
	public static String password = "mysql"; // ""

	public static void readAllUser() {
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, username, password);

			Statement stmt = con.createStatement();

			String sql = "SELECT * FROM USER";
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {

				int id = rs.getInt("ID");
				String username = rs.getString("USERNAME");
				String email = rs.getString("EMAIL");

				// System.out.println("ID :: " + id + " :: USERNAME :: " + username + " :: EMAIL
				// :: " + email);
				System.out.println(id + " " + username + " " + email);
			}

			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void insertUser(User user) {
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, username, password);

			String sql = "INSERT INTO USER (USERNAME, PASSWORD, EMAIL) VALUES (?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, user.getUserame());
			ps.setString(2, user.getPassword());
			ps.setString(3, user.getEmail());

			ps.executeUpdate();

			con.close();
			System.out.println("USER ADDED");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void updateUser(User user) {
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, username, password);

			String sql = "UPDATE USER SET USERNAME=?, EMAIL=? WHERE ID=?";

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, user.getUserame());
			ps.setString(2, user.getEmail());
			ps.setInt(3, user.getId());

			ps.executeUpdate();
			con.close();

			System.out.println("Updated Successfully!!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void deleteUser(User user) {
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, username, password);

			String sql = "DELETE FROM USER  WHERE ID=?";

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, user.getId());

			ps.executeUpdate();
			con.close();

			System.out.println("Delete Successfully!!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// readAllUser();

		User user = new User();
		
		// during update/delete only
		user.setId(5);
		
		user.setUserame("navimumbai-123");
		user.setEmail("navimumabi@gmail.com");
		user.setPassword("1234455");
		
		// insertUser(user);
		// updateUser(user);
		 deleteUser(user);
	}
}
