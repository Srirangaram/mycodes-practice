package com.practiceapi.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.practiceapi.demo.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long>{

}
