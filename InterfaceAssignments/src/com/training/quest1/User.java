package com.training.quest1;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter s for student or e for Employee");
String choice=scanner.nextLine();
IInstitute institute;
if (choice.equalsIgnoreCase("s")) {
	institute=new StudentCourses();
	String[] courses=institute.showCourses();
	System.out.println("Student Courses: ");
	for (String course : courses) {
		System.out.println(course);
	}
	}else if(choice.equalsIgnoreCase("e")) {
		institute=new EmployeeCourses();
		String[] courses=institute.showCourses();
		System.out.println("Employee Courses: ");
		for (String course : courses) {
			System.out.println(course);
		}
	}else {
System.out.println("Invalid choice");
}
scanner.close();
	}

}
