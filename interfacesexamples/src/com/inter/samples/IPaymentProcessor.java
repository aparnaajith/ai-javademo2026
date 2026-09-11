package com.inter.samples;

public interface IPaymentProcessor {
	
	//public static and final-can be called using Interface name and cannot be called using any implementation class name
	String message="Payment Gateway App";
	
	// abstarct method
	void payAmount(double amount);

	// static method-can be called only by interface name
	// common for all implementation classes
	static void printReceipt(double amount) {
		System.out.println("Receipt for amount paid" + amount);
	}

	// default method-can be overridden in subclasses
	default void checkOffers() {
		System.out.println("offers on dinning and movies");

	}
}
