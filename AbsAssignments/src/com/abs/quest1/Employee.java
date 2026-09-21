package com.abs.quest1;

public abstract class Employee {

    String empName;
    double salary;
    int empId;

    final String COMPANYNAME = "ABC Technologies";

    // Parameterized constructor
    Employee(String empName, double salary, int empId) {
        this.empName = empName;
        this.salary = salary;
        this.empId = empId;
    }

    // Concrete method
    void printDetails() {
        System.out.println("Employee Name : " + empName);
        System.out.println("Salary        : " + salary);
        System.out.println("Employee ID   : " + empId);
        System.out.println("Company Name  : " + COMPANYNAME);
    }

    // Abstract method
    abstract void calcBonus(double amount);

    // Concrete method
    String[] showCourses() {

        String[] courses = {
            "Java",
            "Spring Boot",
            "Microservices"
        };

        return courses;
    }

    // Abstract method
    abstract void showProjects();

    // Final method
    final void showRules() {

        officeHours();

        System.out.println("Leave policies");
        System.out.println("OD policies");
    }

    // Private method
    private void officeHours() {
        System.out.println("14 hours per day");
    }
}