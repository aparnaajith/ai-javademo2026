package com.basics.quest3;

public class Student {

	String name;
	String department;
    int id;

	public Student(String name, String department,int id) {
		super();
		this.name = name;
		this.department = department;
		this.id = id;
	}

	void printDetails() {
		System.out.println("Student Name :" + name);
		System.out.println("Student department :" + department);
	}

	String getGrades(int[] marks) {
		String grade;
		int sum = 0;
		for (int mark : marks) {
			sum = sum + mark;
		}
		double average = (double) sum / marks.length;
		if (average >= 90 && average < 100) {
			grade = "A";

		} else if (average >= 80) {
			grade = "B";

		} else if (average >= 70) {

			grade = "C";

		} else if (average >= 60) {

			grade = "D";

		} else if (average >= 50) {

			grade = "E";

		} else {

			grade = "Fail";
		}

		System.out.println("Total Marks : " + sum);
		System.out.println("Average     : " + average);
		System.out.println("Grade       : " + grade);
		return grade;

	}
}
