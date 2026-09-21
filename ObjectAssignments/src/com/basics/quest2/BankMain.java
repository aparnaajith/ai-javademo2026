package com.basics.quest2;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 Bank bank = new Bank(10000);
		System.out.println("----- ATM -----");
		System.out.println("1. Withdraw");
		System.out.println("2. Deposit");
		System.out.println("Enter yor choice");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Enter amount to withdraw: ");
			double withdrawAmount=scanner.nextDouble();
			bank.withdraw(withdrawAmount);
			System.out.println("Current Balance: " + bank.getBalance());
			break;
		case 2:
			System.out.println("Enter amount to deposit: ");
			double depositAmount=scanner.nextDouble();
			bank.deposit(depositAmount);
			System.out.println("Current Balance: " + bank.getBalance());
			break;
		default:
			System.out.println("Invalid choice");
		}
		scanner.close();

	}

}
