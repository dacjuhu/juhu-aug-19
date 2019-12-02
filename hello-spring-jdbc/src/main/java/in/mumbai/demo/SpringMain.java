package in.mumbai.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringMain implements CommandLineRunner {
	
	@Autowired
	private UserDao userDao;

	public static void main(String[] args) {
		SpringApplication.run(SpringMain.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		// CALLING DAO
		// this.userDao.createUser();
		this.userDao.readSingleUser();
	}
	
}
