package in.mumbai;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/read")
public class ReadInputController {

	
	@GetMapping("/")
	public String readInputVer1(HttpServletRequest request) {
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		
		return "Hello Output :: " + name + ":: " + email;
	}
	
	
	@GetMapping("/ver2")
	public String readInputVer2(String name, String email) {
		return "READ INPUT VER2 :: " + name + " :: " + email;
	}
	
	
	
	@GetMapping("/ver3")
	public String readInputVer3(User user) {
		return "READ INPUT VER2 :: ";
	}
}
