package kus.controller;

import kus.hibernate.classes.Students;
import kus.hibernate.classes.Users;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class AddStudentPhase2Controller {
	
	@RequestMapping(value="addStudent2", method=RequestMethod.GET)
	public String loadAddStudent(Model m){
		m.addAttribute("student", new Students());
		return "addStudent2";
	}
	
}
