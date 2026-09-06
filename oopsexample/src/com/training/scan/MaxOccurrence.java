package com.training.scan;
import java.util.Scanner;

public class MaxOccurrence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = sc.next();

        char maxChar = word.charAt(0);
        int maxCount = 0;

        for (int i = 0; i < word.length(); i++) {

            char currentChar = word.charAt(i);
            int count = 0;

            for (int j = 0; j < word.length(); j++) {

                if (word.charAt(j) == currentChar) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                maxChar = currentChar;
            }
        }

        System.out.println("Maximum occurring letter is: " + maxChar);
        System.out.println("Occurrence: " + maxCount);

        sc.close();
    }
}