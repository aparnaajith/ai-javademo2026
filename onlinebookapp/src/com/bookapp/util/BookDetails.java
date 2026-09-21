package com.bookapp.util;

import java.util.Arrays;
import java.util.List;

import com.bookapp.model.Book;

public class BookDetails {
 //make the method static
	public  static List<Book> showBooks(){
		return Arrays.asList(
				new Book("Java in Action",1,"Stephen","Technical",1200),
				new Book("Conversation with god",2,"Joe","Selfhelp",850),
				new Book("Head First Java",1,"Kathy","Technical",920),

				new Book("Javascript for beginners",4,"Jacob","Technical",1100),
				new Book("Conversations",5,"Kathy","selfhelp",1002),
				new Book("Mind Matters",6,"Joe","selfhelp",650)
				);
	}
}
