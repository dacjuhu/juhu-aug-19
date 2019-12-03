package in.mumbai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class UserDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public boolean create(User user) {
		
		String sql = "INSERT INTO USER (USERNAME, EMAIL, PASSWORD) VALUES (?, ?, ?)";
		jdbcTemplate.update(sql, user.getUsername(), user.getEmail(), user.getPassword());
		
		return true;
	}
	
	
	public boolean validateUser(User user) {
		
		String sql = "SELECT * FROM USER WHERE USERNAME=? AND PASSWORD=?";
		User dbuser = jdbcTemplate.queryForObject(sql, new Object[] {user.getUsername(), user.getPassword()}, new UserRowMapper());
		
		if(dbuser == null) {
			return false;
		}
		
		return true;
		
	}
	
}
