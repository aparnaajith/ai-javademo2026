package com.training.dsa;

public class BinarySearch {
	private static int binarySearch(int[] array, int target) {
		int left = 0;
		int right = array.length - 1;

		while (left <= right) {
			int mid = (left + right) / 2;

			if (target==array[mid]) {
				return mid; // Target found
			} else if (target>array[mid]) {
				left = mid + 1; // Search right half
			} else {
				right = mid - 1; // Search left half
			}
		}

		 // Target not found
		return -1;
	}
	

	public static void main(String[] args) {
		int[] array = { 10, 25, 50, 75, 90 }; // Must be sorted
		int target = 75;

		int result = binarySearch(array, target);

		if (result != -1) {
			System.out.println("Element found at index: " + result);
		} else {
			System.out.println("Element not found");
		}
	}



}
