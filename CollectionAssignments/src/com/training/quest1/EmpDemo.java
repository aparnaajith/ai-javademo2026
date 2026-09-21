package com.training.quest1;



import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class EmpDemo {

    public static void main(String[] args) {

        Map<Course, List<Employee>> details = new HashMap<>();

        // Create 4 courses
        Course course1 = new Course("Spring", "Backend");
        Course course2 = new Course("HTML", "Frontend");
        Course course3 = new Course("Policies", "Finance");
        Course course4 = new Course("AI", "AI");

        // Create employees
        Employee emp1 = new Employee("Anu", "IT", "Kochi");
        Employee emp2 = new Employee("Rahul", "IT", "Bangalore");
        Employee emp3 = new Employee("Meera", "HR", "Chennai");
        Employee emp4 = new Employee("Arun", "Finance", "Kochi");
        Employee emp5 = new Employee("John", "Testing", "Trivandrum");
        Employee emp6 = new Employee("Priya", "IT", "Bangalore");

        // Create 3 employee lists
        List<Employee> springEmployees =
                Arrays.asList(emp1, emp2);

        List<Employee> htmlEmployees =
                Arrays.asList(emp3, emp4);

        List<Employee> policyEmployees =
                Arrays.asList(emp5, emp6);

        // Add employees list to 3 courses
        details.put(course1, springEmployees);
        details.put(course2, htmlEmployees);
        details.put(course3, policyEmployees);

        // Fourth course is null
        details.put(course4, null);

        // Iterate
        for (Map.Entry<Course, List<Employee>> entry : details.entrySet()) {

            System.out.println("Course Details:");
            System.out.println(entry.getKey());

            List<Employee> employees = entry.getValue();

            if (employees != null) {

                System.out.println("Employees:");

                for (Employee employee : employees) {
                    System.out.println(employee);
                }

            } else {
                System.out.println("Employees : null");
            }

            System.out.println("-------------------------");
        }
    }
}