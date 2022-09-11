package com.ganesh.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ganesh.binding.Book;

@RestController
@CrossOrigin
public class BookController {
	
	@GetMapping("/books")
	public List<Book> getBooks(){
		Book b1  = new Book(101,"java",777.00);
		Book b2  = new Book(102,"adv-java",677.00);
		Book b3  = new Book(103,"spring",997.00);
		Book b4  = new Book(104,"aws",447.00);
		Book b5  = new Book(105,"devops",577.00);
		Book b6  = new Book(106,"teraform",887.00);
		Book b7  = new Book(107,"docker",877.00);
		
		List<Book> list = Arrays.asList(b1,b2,b3,b4,b5,b6,b7);
		
		return list;
		
	}
	
	@PostMapping("/bookk")
	public String addBook(@RequestBody Book book) {
		
		//logic to insert into database
		System.out.println(book);
		return "Book Added Successfully";
		
	}

}
