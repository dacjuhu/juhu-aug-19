package in.mumbai;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class UserDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public boolean create(User user) {

		String sql = "INSERT INTO USER (USERNAME, PASSWORD, EMAIL) VALUES (?, ?, ?)";
		jdbcTemplate.update(sql, user.getUsername(), user.getPassword(), user.getEmail());

		return true;
	}

	public boolean update(User user) {

		String sql = "UPDATE USER SET USERNAME=? WHERE ID=?";
		jdbcTemplate.update(sql, user.getUsername(), user.getId());

		return true;
	}

	public boolean delete(User user) {

		String sql = "DELETE FROM USER WHERE ID=?";
		jdbcTemplate.update(sql, user.getId());

		return true;
	}
	
	
	
	public List<User> read() {
		
		String sql = "SELECT * FROM USER";
		List<User> list  = jdbcTemplate.query(sql, new UserRowMapper());
		
		return list;
		
	}

}











