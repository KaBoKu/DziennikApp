package kus.controller;

import kus.hibernate.classes.Users;

import org.springframework.stereotype.Controller;
import javax.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class AddStudentController {
	
	
	@RequestMapping(value="addStudent", method=RequestMethod.GET)
	public String loadAddStudent(Model m){
		m.addAttribute("users", new Users());
		return "addStudent";
	}
	
	@RequestMapping(value="addStudent/add",method=RequestMethod.POST)
	public String addStudent(/*@ModelAttribute(value="users") Users user,*/@Valid Users user, BindingResult result)
    {
		if(result.hasErrors()) {
			System.out.println("Errors!");
            return "addStudent";
        }
	    System.out.println(user.getLogin());
	    System.out.println(user.getPassword());
		return "redirect:/addStudent";
	}
}
