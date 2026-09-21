package com.basics.quest4;

public class Training {
	String[] showCourses() {
		String[] courses = { "Java", "Spring Boot", "Microservices", "SQL" };

		return courses;
	}

	void showTrainers(String... names) {

		for (String name : names) {
			System.out.println("Trainer: " + name);
		}
	}

}
