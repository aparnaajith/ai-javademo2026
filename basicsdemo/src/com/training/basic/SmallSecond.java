package com.training.basic;

public class SmallSecond {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		for (int num : arr) {
			if (num < smallest) {
				secondSmallest = smallest;
				smallest = num;
			} else if (num < secondSmallest && num != smallest) {
				secondSmallest = num;
			}

		}
		System.out.println("Smallest:" + smallest);
		System.out.println("secondSmallest:" + secondSmallest);
	}

}
