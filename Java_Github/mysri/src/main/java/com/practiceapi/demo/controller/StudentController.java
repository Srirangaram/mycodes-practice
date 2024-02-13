package com.practiceapi.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practiceapi.demo.model.Student;
import com.practiceapi.demo.service.StudentService;

@RestController
@RequestMapping("enter")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	//http://localhost:8080/enter/getDetails
	@GetMapping("/getDetails/{id}")
	public List<Student> getStudentDetails(@PathVariable("id") Long id){
		
		return studentService.getStudentDetails(id);
	}
	
	//http://localhost:8080/enter/saveDetails
	@PostMapping("saveDetails")
	public Student saveStudentDetails(@RequestBody Student student) {
		
		return studentService.saveStudentDetails(student);
	}
	
	
	//http://localhost:8080/enter/del/3
	@DeleteMapping("del/{id}")
	public String deleteStudentById(@PathVariable("id") Long id) {
		
		studentService.deleteById(id);
		
		return "deleted successfully!";
	}
	
	//http://localhost:8080/enter/update/2
	@PutMapping("/update/{id}")
	public Student updateStudentDetails(@PathVariable("id") Long id, @RequestBody Student student) {
		
		return studentService.updateDetails(id,student);
	}

}
