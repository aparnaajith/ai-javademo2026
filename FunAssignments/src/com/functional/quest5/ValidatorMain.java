package com.functional.quest5;

public class ValidatorMain {

	public static void main(String[] args) {
		String[] names={"Riya", "Anu", "Rahul", "Arun"};
		IValidator register = (name) -> {
			for (String n : names) {
				if (n.equalsIgnoreCase(name)) {
					return "Username already exists: " + name;
				}
			}
			return "You are registered " + name;
		};
		IValidator login = (name) -> {
			for (String n : names) {
				if (n.equalsIgnoreCase(name)) {
					return "You are logged in " + name;
				}
			}
			return "Username not found: " + name;
		};
		System.out.println(register.validateUser("Riya")); 
		System.out.println(register.validateUser("Surya")); 
		System.out.println(login.validateUser("Rahul")); 
		System.out.println(login.validateUser("John"));
}
}
