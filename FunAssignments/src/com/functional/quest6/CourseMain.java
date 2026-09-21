package com.functional.quest6;

public class CourseMain {

	public static void main(String[] args) {
		ICourses frontend = (type) -> {
			if (type.equalsIgnoreCase("design")) {
				return new String[] { "HTML", "CSS", "Bootstrap", "Material" };
			} else if (type.equalsIgnoreCase("development")) {
				return new String[] { "HTML", "CSS", "React", "Angular" };
			} else
				return new String[] { "No courses available" };
		};

		ICourses backend = (type) -> {
			if (type.equalsIgnoreCase("java")) {
				return new String[] { "Spring", "Hibernate" };
			} else if (type.equalsIgnoreCase("python")) {
				return new String[] { "Django", "Flask" };
			} else
				return new String[] { "No courses available" };
		};
		ICourses database = (type) -> {
			if (type.equalsIgnoreCase("sql")) {
				return new String[] { "MySQL", "Oracle" };
			} else if (type.equalsIgnoreCase("nosql")) {
				return new String[] { "MongoDB", "CouchDB" };
			} else {
				return new String[] { "No courses available" };
			}
		};
		System.out.println("----- FRONTEND -----");
		String[] frontendCourses = frontend.printCourses("design");
		for (String course : frontendCourses) {
			System.out.println(course);
		}
		System.out.println("----- BACKEND -----");
		String[] backendCourses = backend.printCourses("java");
		for (String course : backendCourses) {
			System.out.println(course);
		}
		System.out.println("----- DATABASE -----");
		String[] databaseCourses = database.printCourses("sql");
		for (String course : databaseCourses) {
			System.out.println(course);
		}
	}

}
