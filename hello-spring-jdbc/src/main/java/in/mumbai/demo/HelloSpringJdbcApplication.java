package in.mumbai.demo;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class HelloSpringJdbcApplication implements CommandLineRunner {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringJdbcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello World");
		
		// this.createUser();
		// this.updateUser();
		// this.deleteUser();
		
		// this.readUserVer1();
		// this.readUserVer2();
		 this.readSingleUser();
	}
	
	
	public void createUser() {
		String sql = "INSERT INTO USER (USERNAME, PASSWORD, EMAIL) VALUES (?, ?, ?)";
		jdbcTemplate.update(sql, "NEW_USER", "NEW_PASSWORD", "NEW@email.com");
		
		System.out.println("USER CREATED");
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
