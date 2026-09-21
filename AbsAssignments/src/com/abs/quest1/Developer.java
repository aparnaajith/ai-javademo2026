package com.abs.quest1;


public class Developer extends TeamLead {

    String hobbies[];

    // Parameterized constructor
    Developer(String empName, double salary, int empId,
              String[] hobbies) {

        super(empName, salary, empId);

        this.hobbies = hobbies;
    }

    // Override printDetails()
    @Override
    void printDetails() {

        super.printDetails();

        System.out.println("Designation   : Developer");
    }

    // Override showCourses()
    @Override
    String[] showCourses() {

        String[] courses = {
            "Java",
            "Spring Boot",
            "Microservices",
            "Docker"
        };

        return courses;
    }

    // Override showProjects()
    @Override
    void showProjects() {

        System.out.println("Developer works on software projects");
    }

    // Own method of Developer
    void showHobbies() {

        for (String hobby : hobbies) {
            System.out.println(hobby + " is hobby");
        }
    }
}