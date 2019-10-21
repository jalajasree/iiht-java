package com.Course.Management.CourseManagement.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Course.Management.CourseManagement.models.Student;


@Controller

public class StudentController 
{

	/*
	 * @RequestMapping(value="/studentLogin",method=RequestMethod.GET) public String
	 * displayLogin() { return "studentLogin"; }
	 */
	
	@RequestMapping(value="/studentLogin",method=RequestMethod.GET)
 public String studentLogin(Model model) {
		Student s = new Student();
		model.addAttribute("student", s);
		
	 return "studentLogin";
 }
	@RequestMapping(value = "/std",method=RequestMethod.POST)
	public String login(@ModelAttribute("student")Student stu)
	{
		return "index";
	}
	/*
	 * @RequestMapping(value="/studentRegistration",method=RequestMethod.GET) public
	 * String displayRegister() { return "studentRegistration"; }
	 */
	
	@RequestMapping(value="/studentRegistration",method=RequestMethod.GET)
	public String studentRegister()
	{
		return "studentRegistration";
	}
	@RequestMapping(value = "/studentRegistration",method=RequestMethod.POST)
	public String register(@ModelAttribute("student")Student std )
	{
		return "studentLogin";
		
	}
}
