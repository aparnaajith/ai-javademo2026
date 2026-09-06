package com.oops.basics;

public class CalculatorDemo {

	public static void main(String[] args) {
		 Calculator calculator= new Calculator();
		// int[] nums= {10,20,30,40};
		// calculator.sum(nums);
		 calculator.sum(10,20,30);
		 calculator.sum();
		 calculator.sum(10,20,30,40,50);
		 calculator.sum(10,20,30,40);
		 double result=calculator.square(5);
		 System.out.println("Square="+result);

		}

}
