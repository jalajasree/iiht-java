package com.Course.Management.CourseManagement.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@RequestMapping("/admin")
public class AdminController 
{
  @RequestMapping(value="/adminLogin",method=RequestMethod.GET)	
  public String adminLogin()
  {
	return "adminLogin";
	  
  }
	
}
