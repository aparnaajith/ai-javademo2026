package com.over.quest1;

public class Employee {

	String name;
	String designation;
	public Employee(String name, String designation) {
		super();
		this.name = name;
		this.designation = designation;
	}
	
	   void calcBonus(double basicAllowance) {
	        System.out.println("Employee Name: " + name);
	        System.out.println("Designation: " + designation);
	        System.out.println("Basic Allowance: " + basicAllowance);
	        System.out.println("Bonus calculated with basic allowance");
	        System.out.println("-----------------------------");
	    }

	   
	    void calcBonus(double basicAllowance, String gift) {
	        System.out.println("Employee Name: " + name);
	        System.out.println("Designation: " + designation);
	        System.out.println("Basic Allowance: " + basicAllowance);
	        System.out.println("Gift: " + gift);
	        System.out.println("Bonus calculated with basic allowance and gift");
	        System.out.println("-----------------------------");
	    }

	 
	    void calcBonus(double basicAllowance, String gift, double housingAllowance) {
	        System.out.println("Employee Name: " + name);
	        System.out.println("Designation: " + designation);
	        System.out.println("Basic Allowance: " + basicAllowance);
	        System.out.println("Gift: " + gift);
	        System.out.println("Housing Allowance: " + housingAllowance);
	        System.out.println("Bonus calculated with basic allowance, gift and housing allowance");
	        System.out.println("-----------------------------");
	    }
}
