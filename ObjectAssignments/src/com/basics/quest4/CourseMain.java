package com.basics.quest4;

import java.util.Scanner;

public class CourseMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Training training = new Training();

       
        System.out.print("Enter first trainer name: ");
        String trainer1 = sc.nextLine();

        System.out.print("Enter second trainer name: ");
        String trainer2 = sc.nextLine();

        // Calling showTrainers() using varargs
        training.showTrainers(trainer1, trainer2);

        // Calling showTrainers() directly with given names
        training.showTrainers("Rohan", "Sathya");

        // Calling showCourses()
        String[] courses = training.showCourses();

        System.out.println("\nAvailable Courses:");

        
        for (String course : courses) {
            System.out.println(course);
        }

        sc.close();
    }
}