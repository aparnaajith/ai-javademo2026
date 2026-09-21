package com.training.quest2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>(
                Arrays.asList(
                        new Employee("Anu", 101, "Kochi"),
                        new Employee("Rahul", 102, "Bangalore"),
                        new Employee("Meera", 103, "Kochi"),
                        new Employee("Arun", 104, "Chennai"),
                        new Employee("Priya", 105, "Kochi")
                )
        );

        // Iterate using forEach
        employees.forEach(employee -> System.out.println(employee));

        System.out.println("-----------------------");

        // Particular city
        String city = "Kochi";

        // Temporary list
        List<Employee> employeesByCity = new ArrayList<>();

        // Iterate the employees list
        for (Employee employee : employees) {

            if (employee.getCity().equals(city)) {
                employeesByCity.add(employee);
            }
        }

        // Print employees belonging to particular city
        System.out.println("Employees from " + city + ":");

        employeesByCity.forEach(employee -> System.out.println(employee));
    }
}