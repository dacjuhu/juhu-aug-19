package in.mumbai.demo;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


@Component
public class UserDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	public boolean createUser() {
		String sql = "INSERT INTO USER (USERNAME, PASSWORD, EMAIL) VALUES (?, ?, ?)";
		
		jdbcTemplate.update(sql, "mumbai", "mumbai123", "mumbai@gmail.com");
		
		return true;
	}
	
	
	public void updateUser() {
		String sql = "UPDATE USER SET USERNAME=? WHERE ID=?";
		jdbcTemplate.update(sql, "ABCDE", 20);
		
	}
	
	
	public void deleteUser() {
		String sql = "DELETE FROM USER WHERE ID=?";
		jdbcTemplate.update(sql, 20);
		
		System.out.println("USER DELETED");
	}
	
	
	
	public void readUserVer1() {
		String sql = "SELECT * FROM USER";
		List<Map<String, Object>> list =  jdbcTemplate.queryForList(sql);
		
		System.out.println(list);
	} 
	
	
	public void readUserVer2() {
		String sql = "SELECT * FROM USER";
		List<User> list = jdbcTemplate.query(sql, new UserRowMapper());
		System.out.println(list);
		
	} 
	
	
	
	
	public void readSingleUser() {
		String sql = "SELECT * FROM USER WHERE ID=?";
		
		User user = (User) jdbcTemplate.queryForObject(sql, new Object[] {10}, new UserRowMapper());
		
		System.out.println(user);
	} 

}
