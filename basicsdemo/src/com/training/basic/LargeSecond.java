package com.training.basic;

public class LargeSecond {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int largest = Integer.MIN_VALUE;
		int secondlargest = Integer.MIN_VALUE;
		for (int num : arr) {
			if (num > largest) {
				secondlargest = largest;
				largest = num;
			} else if (num > secondlargest && num != largest) {
				secondlargest = num;
			}

		}
		System.out.println("largest:" + largest);
		System.out.println("secondlargest:" + secondlargest);
	}

}
