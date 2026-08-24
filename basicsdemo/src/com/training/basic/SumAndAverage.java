package com.training.basic;

public class SumAndAverage {

	public static void main(String[] args) {
		int[] arr = { 3, 5, 7, 9 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];

		}
		double avg = (double) sum / arr.length;
		System.out.println("Sum of digits: " + sum);
		System.out.println("Average of digits: " + avg);
	}

}
