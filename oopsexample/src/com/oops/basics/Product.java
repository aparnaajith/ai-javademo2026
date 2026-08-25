package com.oops.basics;

public class Product {

	String[] showProducts(){

	//create an array of products and return it
//		String[] products=new String[] {"Laptop","Mouse","Mobile","Pen"};
//		return products;
		return new String[] {"Laptop","Mouse","Mobile","Pen"};
	}
	
	//takes array as parameter
	void printCategories(String[] categories) {
		//iterate array using foreach and print
	   for(String cat:categories) {
		   System.out.println(cat);
	   }
	}
	
	String offerDetails() {
		return "Onam offers available";
	}
	
	public static void main(String[] args) {
		//create an object of product;
		Product product=new Product();
		//call showProduct
		String[] all=product.showProducts();
		for(String prod:all)
			System.out.println(prod);
		
		//call product details
		String offers=product.offerDetails();
		System.out.println(offers);
		
		//create an array of categories
		String[] categories=new String[] {"Electronics","Books","Toys"};
	 //pass this as parameter
		product.printCategories(categories);
	}
	
	
}
