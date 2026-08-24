package com.training.basic;

public class Duplicate {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 4, 1, 5};
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    count++;
                    break;
                }
            }
        }

        System.out.println("Number of duplicate elements: " + count);
    }
}