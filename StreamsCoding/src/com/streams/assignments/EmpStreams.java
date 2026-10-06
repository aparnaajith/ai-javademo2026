package com.streams.assignments;

import java.util.Collections;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import com.streams.assignments.EmployeeNotFoundException;
public class EmpStreams {
	public static void main(String[] args) {
		// get all the employees
		List<Employee> employees = EmployeeDetails.getAllEmployees();
		// get the employees by city
		// create a temp list-iterate through the list
		// check if emp.getcity is equals 'Banglore' add to list
		// return the list

		// using streams
		// convert lsit to a stream
		employees.stream().filter(emp -> emp.getCity().equals("Banglore")).forEach(emp -> System.out.println(emp));

		// by salary greater than 10000 and print the names
		employees.stream().filter(emp -> emp.getSalary() > 20000).map(emp -> emp.getEmpName())
				.forEach(emp -> System.out.println(emp));
		System.out.println();
		System.out.println("Employees names in alphabetical order and sorted");
		employees.stream().map(emp -> emp.getEmpName().toUpperCase())
		.sorted((str1,str2)->str2.compareTo(str1)).forEach(emp -> System.out.println(emp));
		System.out.println();
		System.out.println("in alpha order");
		employees.stream()
		          .sorted((e1,e2)->e1.getEmpName().compareTo(e2.getEmpName())).forEach(emp->System.out.println(emp));
		          System.out.println();
		          System.out.println("Get the Salary sorted by ascending order");
		          employees.stream().map(emp->emp.getSalary())
		          .sorted().forEach(sal->System.out.println(sal));
		         
		          System.out.println();
		          System.out.println("employee sorted by Salary in descending order");
		          employees.stream()
		          //.sorted((e1,e2)->((Double)e1.getSalary()).compareTo(e2.getSalary()))
		          .sorted((e1,e2)->e1.getCity().compareTo(e2.getCity()))//sort by city
		          .sorted((e1,e2)->Double.compare(e2.getSalary(),e1.getSalary()))//sort by sal in desc
		          .forEach(emp->System.out.println(emp));
	
		          //get by id 101 if not throw exception
	System.out.println("get by id 101 if not throw exception");
	Employee emp1=employees.stream().
	filter(emp->emp.getEmpId()==111)
	.findFirst()
	.orElseThrow(()->new EmployeeNotFoundException("No Emp Found"));
  System.out.println(emp1);
  
	}
}


