package in.mumbai;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserDao userDao;
	
	@PostMapping("/create")
	public boolean create(User user) {
		
		this.userDao.create(user);
		return true;
	}
	
	
	@PutMapping("/update")
	public boolean update(User user) {
		// WE ARE NOT DOING ANY VALIDATION
		this.userDao.update(user);
		return true;
	}
	
	
	@DeleteMapping("/delete")
	public boolean delete(User user) {
		this.userDao.delete(user);
		return true;
	}
	
	
	@GetMapping("/read")
	public List<User> read(User user) {
		return this.userDao.read();
	}

}
