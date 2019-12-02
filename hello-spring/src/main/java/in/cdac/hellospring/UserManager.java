package in.cdac.hellospring;

import org.springframework.stereotype.Component;

@Component
public class UserManager {

	public boolean createUser() {
		
		System.out.println("I will Create one User!!!");
		
		return false;
	}
	
}
