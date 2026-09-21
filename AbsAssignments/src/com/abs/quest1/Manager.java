package com.abs.quest1;


public class Manager extends Employee {

    String activity;

    // Parameterized constructor
    Manager(String empName, double salary, int empId, String activity) {

        super(empName, salary, empId);

        this.activity = activity;
    }

    // Override printDetails()
    @Override
    void printDetails() {

        super.printDetails();

        System.out.println("Activity      : " + activity);
    }

    // Override calcBonus()
    @Override
    void calcBonus(double amount) {

        System.out.println("Manager Bonus = " + amount);
    }

    // Override showCourses()
    @Override
    String[] showCourses() {

        String[] courses = {
            "Management",
            "Leadership",
            "Project Management"
        };

        return courses;
    }

    // Override showProjects()
    @Override
    void showProjects() {

        System.out.println("Manager handles multiple projects");
    }

    // Own method of Manager
    void funClub() {

        System.out.println("Activity " + activity);
    }
}