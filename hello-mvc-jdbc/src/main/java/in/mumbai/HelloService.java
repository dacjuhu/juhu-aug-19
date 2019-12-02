package in.mumbai;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloService {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	

	@RequestMapping("/")
	public String helloWorld() {
		return "Hello World";
	}
	
	
	@RequestMapping("/universe")
	public String helloUniverse() {
		return "Hello Universe";
	}
	
	
	@PostMapping("/post")
	public String hiee() {
		return "Hello POST";
	}
	
	
	
	@RequestMapping("/number")
	public int helloNumber() {
		return 100;
	}
	
	
	@RequestMapping("/str-list")
	public List<String> stringList() {
		
		List<String> list = new ArrayList<String>();
		list.add("kharghar");
		list.add("belapur");
		
		return list;
	}
	
	
	@RequestMapping("/str-map")
	public Map<String, String> stringMap() {
		
		Map<String, String> map = new HashMap<>();
		map.put("key1", "Value1");
		map.put("key2", "Value2");
		
		return map;
	}
	
	
	@RequestMapping("/user")
	public User getUser() {
		User user = new User();
		user.setId(1);
		user.setUsername("CDAC");
		
		return user;
	}
	
	
	
	@RequestMapping("/user-list")
	public List<User> getUserList() {
		List<User> list = new ArrayList<>();
		
		for(int i=0; i<10; i++) {
			User user = new User();
			user.setId(1);
			user.setUsername("CDAC");
			
			list.add(user);
		}
		
		
		return list;
	}
	
	
	@RequestMapping("/db-user-list")
	public List getUserListFromDB() {
		
		String sql = "SELECT * FROM USER";
		List list = jdbcTemplate.queryForList(sql);
		return list;
	}
	
}








