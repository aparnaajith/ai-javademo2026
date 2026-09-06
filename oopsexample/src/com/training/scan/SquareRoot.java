package com.training.scan;

import java.util.Scanner;

public class SquareRoot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        // Create and populate the first array
        int[] numbers = new int[size];

        System.out.println("Enter " + size + " numbers:");

        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        // Create another array to store square roots
        double[] squareRoots = new double[size];

        // Calculate square root and populate the new array
        for (int i = 0; i < size; i++) {
            squareRoots[i] = Math.sqrt(numbers[i]);
        }

        // Print the new array
        System.out.println("Square roots:");

        for (int i = 0; i < squareRoots.length; i++) {
            System.out.println(squareRoots[i]);
        }

        sc.close();
    }
}