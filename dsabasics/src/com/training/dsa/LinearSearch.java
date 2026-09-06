package com.training.dsa;

public class LinearSearch {

		    public static int linearSearch(int[] array, int target) {
		        for (int i = 0; i < array.length; i++) {
		            if (array[i] == target) {
		                return i; // Target found
		            }
		        }
		        return -1; // Target not found
		    }

		    public static void main(String[] args) {
		        int[] numbers = {10, 25,  50, 75, 90};
		        int target = 50;

		        int result = linearSearch(numbers, target);

		        if (result != -1) {
		            System.out.println("Element found at index: " + result);
		        } else {
		            System.out.println("Element not found");
		        }
		    }
		

}


