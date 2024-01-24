package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface BookDAO extends CrudRepository<Book, Long>{

	
}
