package kus.controller;

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
		return "index";
	}
	
	@RequestMapping(value="/welcome",method = RequestMethod.GET)
	public String Hello3(){
		return "welcome";
	}
}
