package com.abs.quest1;



public abstract class TeamLead extends Employee {

    // Parameterized constructor
    TeamLead(String empName, double salary, int empId) {

        super(empName, salary, empId);
    }

    // Override only calcBonus()
    @Override
    void calcBonus(double amount) {

        System.out.println("Team Lead Bonus = " + amount);
    }

    // Own method
    void corporateServices() {

        System.out.println("Team Lead handles corporate services");
    }
}