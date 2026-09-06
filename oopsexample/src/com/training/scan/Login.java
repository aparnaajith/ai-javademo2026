package com.training.scan;


import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] usernames = {"Aparna", "Anjali", "Rahul", "Sneha", "Arun"};

        System.out.println("Enter username to login");
        String username = sc.next();

        boolean exists = false;

        for (int i = 0; i < usernames.length; i++) {

            if (usernames[i].equalsIgnoreCase(username)) {
                exists = true;
                break;
            }
        }

        if (exists) {
            System.out.println("You are logged in successfully");
        } else {
            System.out.println("Invalid username");
        }

        sc.close();
    }
}