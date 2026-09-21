package com.basics.quest2;

public class Bank {
	 double balance;

	 public Bank(double balance) {
		super();
		this.balance = balance;
	 }
	 void withdraw(double amount) {
		 if(amount<=balance) {
			 balance=balance-amount;
			 System.out.println("Amount withdrawn :"+ balance);
		 }else {
			 System.out.println("Insufficient balance");
		 }
	 }
	 void deposit(double amount) {
		 balance=balance+amount;
		 System.out.println("Amount deposited :"+balance);
	 }
	 double getBalance() {
		 return balance;
	 }
}
