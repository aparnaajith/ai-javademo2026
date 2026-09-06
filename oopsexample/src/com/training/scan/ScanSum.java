package com.training.scan;

import java.util.Arrays;
import java.util.Scanner;

public class ScanSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of an array");
		int n = sc.nextInt();
		int[] numbers = new int[n];
		System.out.println("Enter " + n + " numbers");
		for (int i = 0; i < n; i++) {
			numbers[i] = sc.nextInt();

		}
		System.out.println(Arrays.toString(numbers));

		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + numbers[i];

		}
	     double average = (double) sum / n;
		System.out.println("Sum = " + sum);
		System.out.println("Average = " + average);

		sc.close();

	}

}
