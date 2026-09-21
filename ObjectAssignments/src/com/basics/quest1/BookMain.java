package com.basics.quest1;

public class BookMain {

	public static void main(String[] args) {
	Book book1=new Book("Java Programming",
            "James",
            750,
            "Programming");
	Book book2=new Book("Harry Potter",
            "JK",
            300,
            "Story");
	System.out.println("----Book1------");
	book1.getDetails();
	book1.checkBookType();
	System.out.println();
	System.out.println("----Book2------");
	book2.getDetails();
	book2.checkBookType();

	}

}
