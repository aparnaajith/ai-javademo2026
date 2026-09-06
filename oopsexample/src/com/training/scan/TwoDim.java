package com.training.scan;

import java.util.Scanner;

public class TwoDim {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows:");
        int rows = sc.nextInt();

        System.out.println("Enter number of columns:");
        int columns = sc.nextInt();

        // Create 2D String array
        String[][] names = new String[rows][columns];

        // Populate 2D array using Scanner
        System.out.println("Enter " + (rows * columns) + " names:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                names[i][j] = sc.next();
            }
        }

        // Count names starting with 's'
        int count = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                if (names[i][j].toLowerCase().startsWith("s")) {
                    count++;
                }
            }
        }

        // Create 1D array
        String[] sNames = new String[count];

        // Populate 1D array with names starting with 's'
        int index = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                if (names[i][j].toLowerCase().startsWith("s")) {
                    sNames[index] = names[i][j];
                    index++;
                }
            }
        }

        // Print 1D array
        System.out.println("Names starting with 's':");

        for (int i = 0; i < sNames.length; i++) {
            System.out.println(sNames[i]);
        }

        sc.close();
    }
}