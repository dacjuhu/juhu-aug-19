package in.cdac.hellospring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloSpringApplication implements CommandLineRunner {
	
	// public UserManager ref = new UserManager();
	
	// DEPENDENCEY INJECTION :: IOC
	@Autowired
	public UserManager ref;
	

	public static void main(String[] args) {
		// LOADING THE SPRING FRAMEWORK
		SpringApplication.run(HelloSpringApplication.class, args);
	}
	
	

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello Spring!!!");
		
		
		this.ref.createUser();
		
	}

}
