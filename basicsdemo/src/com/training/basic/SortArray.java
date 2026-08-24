package com.training.basic;
import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {

        int[] arr = {50, 20, 40, 10, 30};

        Arrays.sort(arr);

        System.out.println("Sorted array");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}