package com.bankingapp;

public class Current extends Account {
 
 String accountType;

 public Current(double balance, String accountType) {
	super(balance);
	this.accountType = accountType;
 }

 @Override
 void withdraw(double amount) {

	 System.out.println("Withdraw in Savings");
		balance=balance-amount-100;
	
 }

 @Override
 void deposit(double amount) {
	 System.out.println("Deposit in Savings");

	 balance=balance+amount+50;
	
 }
 String[] showLoanTypes() {
	return new String[]{"short term","long term","vehicle loan"};
 }




 

}
