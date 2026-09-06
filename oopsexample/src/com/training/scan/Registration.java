package com.training.scan;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] usernames = {"Aparna", "Anjali", "Rahul", "Sneha", "Arun"};

        System.out.println("Enter name to register");
        String name = sc.next();

        boolean exists = false;

        for (int i = 0; i < usernames.length; i++) {
            if (usernames[i].equalsIgnoreCase(name)) {
                exists = true;
                break;
            }
        }

        if (exists) {
            System.out.println("Name is not unique");
        } else {
            System.out.println("You are registered");
        }

        sc.close();
    }
}