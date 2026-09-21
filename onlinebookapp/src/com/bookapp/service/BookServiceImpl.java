package com.bookapp.service;

import java.util.ArrayList;
import java.util.List;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.util.BookDetails;

public class BookServiceImpl  implements IBookService{
    
	
	
	@Override
	public List<Book> getAll() {
		//call the static method
		List<Book> books=BookDetails.showBooks();
		return books;
	}

	@Override
	public Book getById(int bookId) {
		//get the list of books
		List<Book> books=BookDetails.showBooks();
		//iterate through the books
		for(Book book:books) 
			//get the bookId and check if it matches the bookId in parameter
			if(book.getBookId()==bookId) {
				return book;
			
		}
		//throw Exception -outside for loop
		throw new BookNotFoundException("invite id");
	
	}

	@Override
	public List<Book> getByTitleContains(String title) {
		//get the list of books
		List<Book> books=BookDetails.showBooks();
		//create a temporary array
		List<Book> booksByTitle=new ArrayList<>();
		//iterate through the orginal book list
		for(Book book:books) 
			//get the bookId and check if it is in the list
			if(book.getTitle().contains(title)) //checking for title like java
				//if yes add the book to the temporary list
				booksByTitle.add(book);
			
		
		//throw Exception -outside for loop--if list is empty
		if(booksByTitle.isEmpty()) {
			
		throw new BookNotFoundException("book containing this title does not exist");
		}
		//return the temp list booksByTitle
		return booksByTitle;
	}

	@Override
	public List<Book> getByAuthCategory(String author, String category) {
		//get the list of books
		List<Book> books=BookDetails.showBooks();
		//create a temporary array
		List<Book> booksByAuth=new ArrayList<>();
		//iterate through the orginal book list
		for(Book book:books) 
			//get the author and check if it is in the list
			if(book.getAuthor().equalsIgnoreCase(author) && book.getCategory().equalsIgnoreCase(category)) 
				//if yes add the book to the temporary list
				booksByAuth.add(book);
			
		
		//throw Exception -outside for loop--if list is empty
		if(booksByAuth.isEmpty()) {
			
		throw new BookNotFoundException("book with this auth does not exist");
		}
		//return the temp list booksByTitle
		return booksByAuth;
	}

	@Override
	public List<Book> getByLesserPrice(double price) {
		//get the list of books
		List<Book> books=BookDetails.showBooks();
		//create a temporary array
		List<Book> booksByLesserPrice=new ArrayList<>();
		//iterate through the orginal book list
		for(Book book:books) 
			//get the price and check if it is lesser than the price given
			if(book.getPrice()<price)
				//if yes add the book to the temporary list
				booksByLesserPrice.add(book);
			
		
		//throw Exception -outside for loop--if list is empty
		if(booksByLesserPrice.isEmpty()) {
			
		throw new BookNotFoundException("book with this auth does not exist");
		}
		//return the temp list booksByTitle
		return booksByLesserPrice;
	}

}
