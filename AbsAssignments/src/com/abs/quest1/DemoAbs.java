package com.abs.quest1;



import java.util.Scanner;

public class DemoAbs {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Manager");
        System.out.println("2. Team Lead");
        System.out.println("3. Developer");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        Employee employee;

        switch (choice) {

            case 1:

                Manager manager = new Manager(
                        "Aparna",
                        80000,
                        101,
                        "Fun Activities"
                );

                // Superclass reference = subclass object
                employee = manager;

                employee.printDetails();

                employee.calcBonus(10000);

                System.out.println("Courses:");

                String[] managerCourses = employee.showCourses();

                for (String course : managerCourses) {
                    System.out.println(course);
                }

                employee.showProjects();

                employee.showRules();

                // Manager's own method
                manager.funClub();

                break;


            case 2:

                /*
                 * TeamLead is abstract,
                 * so we cannot create:
                 *
                 * new TeamLead()
                 *
                 * Therefore use Developer object
                 * through TeamLead reference.
                 */

                Developer teamLeadDeveloper = new Developer(
                        "Rahul",
                        90000,
                        102,
                        new String[]{"Reading", "Cricket"}
                );

                TeamLead teamLead = teamLeadDeveloper;

                teamLead.printDetails();

                teamLead.calcBonus(15000);

                System.out.println("Courses:");

                String[] teamLeadCourses = teamLead.showCourses();

                for (String course : teamLeadCourses) {
                    System.out.println(course);
                }

                teamLead.showProjects();

                teamLead.showRules();

                // TeamLead's own method
                teamLead.corporateServices();

                break;


            case 3:

                Developer developer = new Developer(
                        "John",
                        70000,
                        103,
                        new String[]{"Coding", "Music", "Travel"}
                );

                // Superclass reference = subclass object
                employee = developer;

                employee.printDetails();

                employee.calcBonus(8000);

                System.out.println("Courses:");

                String[] developerCourses = employee.showCourses();

                for (String course : developerCourses) {
                    System.out.println(course);
                }

                employee.showProjects();

                employee.showRules();

                // Developer's own method
                developer.showHobbies();

                break;


            default:

                System.out.println("Invalid choice");
        }

        sc.close();
    }
}