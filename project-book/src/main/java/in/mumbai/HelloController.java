package in.mumbai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@Autowired
	private UserDao userDao;
	
	
	@GetMapping("/signup")
	public ModelAndView signUpPage() {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("signup");
		
		
		return mv;
	}
	
	
	@PostMapping("/signup")
	public ModelAndView registerUserToDb(User user) {
		
		this.userDao.create(user);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("signin");
		
		
		return mv;
	}
	
	
	
	@GetMapping("/signin")
	public ModelAndView signinPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("signin");
		
		return mv;
	}
	
	
	@PostMapping("/signin")
	public ModelAndView validateUser(User user) {
		
		ModelAndView mv = new ModelAndView();
		try {
			boolean auth = this.userDao.validateUser(user);
			
			if(auth) {
				mv.setViewName("home");
			} else {
				mv.setViewName("signin");
			}
			
			return mv;
		} catch(Exception e) {
			mv.setViewName("signin");
		}
		
		return  mv;
	}
	
	
	
	
	@GetMapping("/demo1")
	public String demo1() {
		
		return "signup";
	}
	
	
	@GetMapping("/demo2")
	public ModelAndView demo2() {
		ModelAndView  mv = new ModelAndView();
		
		mv.addObject("TITLE", "SPRING WEB MVC");
		mv.addObject("USERNAME", "SPRING_MVC");
		mv.setViewName("signup");
		
		return mv;
	}
	
	
	
	
}
