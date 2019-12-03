package in.mumbai;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {
	
	@RequestMapping("/")
	public String demo() {
		return "DEMO";
	}
	
	

	@RequestMapping("/second")
	public String demoAgain() {
		return "DEMO AGAIN";
	}
}
