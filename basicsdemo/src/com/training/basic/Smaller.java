package com.training.basic;

public class Smaller {

	public static void main(String[] args) {
		// create three nums
		int x = 10;
		int y = 20;
		int z = 30;
		if (x < y && x < z)
			System.out.println("Smaller number is " + x);
		else if (y < z)
			System.out.println("Smaller number is " + y);
		else
			System.out.println("Smaller number is " + z);

	}

}
