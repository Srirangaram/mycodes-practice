package com.practiceapi.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practiceapi.demo.model.Student;
import com.practiceapi.demo.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;
	
	public List<Student> getStudentDetails(Long id){
		
		return (List<Student>) studentRepository.findAll();
	}
	
	public Student saveStudentDetails(Student student) {
		
		return studentRepository.save(student);
	}

	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
		studentRepository.deleteById(id);
	}

	public Student updateDetails(Long id, Student student) {
		
		Student studentEntity = studentRepository.findById(id).get();
		
		if(!student.getStudentName().isBlank()) {
			studentEntity.setStudentName(student.getStudentName());
		}
		if(!student.getMobileNo().equals(null)) {
			studentEntity.setMobileNo(student.getMobileNo());
		}
		
		return studentRepository.save(studentEntity);
	}
}
