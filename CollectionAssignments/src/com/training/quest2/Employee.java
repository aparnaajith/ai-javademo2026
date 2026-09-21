package com.training.quest2;



public class Employee {

    private String name;
    private int employeeId;
    private String city;

    public Employee(String name, int employeeId, String city) {
        this.name = name;
        this.employeeId = employeeId;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Name = " + name +
               ", Employee ID = " + employeeId +
               ", City = " + city;
    }
}