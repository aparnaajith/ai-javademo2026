package com.over.quest3;

public class Processor {
	// print the square root 
	void calculate(double x){
		System.out.println("Square root of " + x + " = " + Math.sqrt(x));
		} 
	// print the product
	void calculate(int x, int y){ 
		System.out.println("Product of " + x + " and " + y + " = " + (x * y));
	} 
	// print the difference 
	void calculate(double x, double y){
		System.out.println("Difference of " + x + " and " + y + " = " + (x - y));
	} 
	// print x power y 
	void calculate(double x,int y) {
		System.out.println(x + " power " + y + " = " + Math.pow(x, y));
	}
	// print the square
	void calculate(int x) {
		 System.out.println("Square of " + x + " = " + (x * x));
	}
	 
}
