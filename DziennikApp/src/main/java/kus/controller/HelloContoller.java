package kus.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloContoller {

	@RequestMapping(method = RequestMethod.GET)
	public String Hello(){
		
		return "index";
	}
	
	@RequestMapping(value="/index",method = RequestMethod.GET)
	public String Hello2(){
		
		User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	    String name = user.getUsername(); //get logged in username
	    System.out.println(user.getPassword());
	    System.out.println(user.getAuthorities());
	    System.out.println("User name: "+name);
		
		return "index";
	}
	
	@RequestMapping(value="/welcome",method = RequestMethod.GET)
	public String Hello3(){
		return "welcome";
	}
}
