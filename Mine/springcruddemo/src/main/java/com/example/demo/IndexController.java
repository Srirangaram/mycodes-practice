package com.example.demo;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	
	@Autowired
	StudentDAO studentDAO;
	
	@RequestMapping("meow")
	public ModelAndView index(String st) {
		
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("welcome1.jsp");
		return mv;
	}
	
	@RequestMapping("addCustomer")
	public ModelAndView addUser(Student stud) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("studentReport",stud);
		mv.setViewName("added1.jsp");
		studentDAO.save(stud);       //this method used for save to database
		return mv;
	}
	
	@RequestMapping("viewCustomer")
	public ModelAndView viewUser(Student std) {
		
		Optional<Student> op = studentDAO.findById(std.getRollNo());
		Student student = op.get();
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("studentReport",student);
		mv.setViewName("display1.jsp");
		
		return mv;
	}
	
	@RequestMapping("deleteCustomer")
	public ModelAndView deleteUser(Student ste) {
		
		ModelAndView mv = new ModelAndView();
		
		studentDAO.deleteById(ste.getRollNo());
		
		mv.addObject("studentReport",ste);
		mv.setViewName("deleted1.jsp");
		return mv;
	}
	
	@RequestMapping("updateCustomer")
	public ModelAndView updateUser(Student stn) {
		ModelAndView mv = new ModelAndView();
		
		studentDAO.deleteById(stn.getRollNo());
		
		mv.addObject("studentReport",stn);
		mv.setViewName("updated1.jsp");
		return mv;
	}
}
