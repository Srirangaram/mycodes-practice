package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LibraryController {
	
	@Autowired
	BookDAO bookDAO;
	
	@GetMapping("books")
	public ModelAndView getAllBooks() {
		ModelAndView mv = new ModelAndView();
		
		
		mv.setViewName("Library.jsp");
		
		return mv;
	}
	
	@RequestMapping("addBooks")
	public ModelAndView addUser(Book bk) {
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("bookDetails",bk);
		mv.setViewName("added.jsp");
		
		bookDAO.save(bk);
		
		return mv;
	}
	
	@RequestMapping("viewBooks")
	public ModelAndView display(Book bo) {
		Optional<Book> op = bookDAO.findById(bo.getId());
		Book book = op.get();
		
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("bookDetails",book);
		mv.setViewName("View.jsp");
		
		return mv;
	}
	
	@RequestMapping("deleteBooks")
	public ModelAndView deleteUser(Book boo) {
		ModelAndView mv = new ModelAndView();
		
		bookDAO.deleteById(boo.getId());
		
		mv.addObject( "bookDetails",boo);
		mv.setViewName("deleted.jsp");
		return mv;
	}

}
