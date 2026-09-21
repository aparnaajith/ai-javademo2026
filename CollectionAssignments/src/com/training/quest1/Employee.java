package com.training.quest1;

public class Employee {

    private String empName;
    private String department;
    private String city;

    public Employee(String empName, String department, String city) {
        this.empName = empName;
        this.department = department;
        this.city = city;
    }

    public String getEmpName() {
        return empName;
    }

    public String getDepartment() {
        return department;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Employee Name = " + empName +
               ", Department = " + department +
               ", City = " + city;
    }
}