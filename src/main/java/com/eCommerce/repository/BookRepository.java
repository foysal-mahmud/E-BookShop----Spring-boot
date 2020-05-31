package com.eCommerce.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.eCommerce.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long>{
	
List<Book> findByCategory(String category);
	
	List<Book> findByTitleContaining(String title);

}
