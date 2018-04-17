package com.virtualpairprogrammers.avalon.client;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.virtualpairprogrammers.avalon.domain.Book;
import com.virtualpairprogrammers.avalon.services.BookService;

public class Client 
{
	public static void main(String[] args)
	{
		
		ClassPathXmlApplicationContext container = new
				ClassPathXmlApplicationContext("application.xml");

		BookService bookService = 
				container.getBean("bookService", BookService.class);
		
		List<Book> allBooks = bookService.getEntireCatalogue();	
		
		for (Book  next: allBooks){
		
			System.out.println(next);
			
		}		
		container.close();
		
	}
}
