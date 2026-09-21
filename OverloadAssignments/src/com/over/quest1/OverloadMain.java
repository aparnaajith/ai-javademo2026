package com.over.quest1;

import java.util.Scanner;

public class OverloadMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Create employee array
		Employee[] employeeArray = new Employee[5];

		// Get input for 5 employees
		for (int i = 0; i < employeeArray.length; i++) {

			System.out.println("\nEnter details for Employee " + (i + 1));

			System.out.print("Enter employee name: ");
			String name = sc.nextLine();

			System.out.print("Enter designation (Manager/Programmer/Director): ");
			String designation = sc.nextLine();

			// Create employee object
			employeeArray[i] = new Employee(name, designation);
		}
		// Iterate employee array
		for (int i = 0; i < employeeArray.length; i++) {

			Employee employee = employeeArray[i];

			System.out.println("\nCalculating Bonus");
			System.out.println("=================");

			if (employee.designation.equalsIgnoreCase("Programmer")) {

				employee.calcBonus(10000);

			} else if (employee.designation.equalsIgnoreCase("Manager")) {

				employee.calcBonus(15000, "Gift Voucher");

			} else if (employee.designation.equalsIgnoreCase("Director")) {

				employee.calcBonus(20000, "Gold Watch", 25000);

			} else {

				System.out.println("Invalid designation");
			}
		}

		sc.close();
	}

}
