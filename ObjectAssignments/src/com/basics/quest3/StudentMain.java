package com.basics.quest3;

import java.util.Scanner;

public class StudentMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ---------------- Student 1 ----------------

        System.out.println("Enter details of Student 1");

        System.out.print("Enter name: ");
        String name1 = sc.nextLine();

        System.out.print("Enter ID: ");
        int id1 = sc.nextInt();

        sc.nextLine(); // consume newline

        System.out.print("Enter department: ");
        String department1 = sc.nextLine();

        int[] marks1 = new int[5];

        System.out.println("Enter 5 marks:");

        for (int i = 0; i < marks1.length; i++) {

            System.out.print("Mark " + (i + 1) + ": ");
            marks1[i] = sc.nextInt();
        }

        // Create Student 1 object
        Student student1 =
                new Student(name1, department1, id1);


        // ---------------- Student 2 ----------------

        sc.nextLine(); // consume newline

        System.out.println("\nEnter details of Student 2");

        System.out.print("Enter name: ");
        String name2 = sc.nextLine();

        System.out.print("Enter ID: ");
        int id2 = sc.nextInt();

        sc.nextLine(); // consume newline

        System.out.print("Enter department: ");
        String department2 = sc.nextLine();

        int[] marks2 = new int[5];

        System.out.println("Enter 5 marks:");

        for (int i = 0; i < marks2.length; i++) {

            System.out.print("Mark " + (i + 1) + ": ");
            marks2[i] = sc.nextInt();
        }

        // Create Student 2 object
        Student student2 =
                new Student(name2, department2, id2);


        // ---------------- Display Student 1 ----------------

        System.out.println("\n========== STUDENT 1 ==========");

        student1.printDetails();

        System.out.println("\nGrade Details:");

        student1.getGrades(marks1);


        // ---------------- Display Student 2 ----------------

        System.out.println("\n========== STUDENT 2 ==========");

        student2.printDetails();

        System.out.println("\nGrade Details:");

        student2.getGrades(marks2);

        sc.close();
    }
}