package com.training.basic;

public class Factorial {

	
	public static void main(String[] args) {
		int num = 4;
		int result = 1;
		for (int i = 1; i <= num; i++) {
			result *= i;
			
		}
		System.out.println("Factorial :" + result);
	}

}
