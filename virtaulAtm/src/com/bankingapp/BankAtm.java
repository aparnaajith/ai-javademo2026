
package com.bankingapp;

import java.util.Iterator;
import java.util.Scanner;

public class BankAtm {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose for \'s\' savings and \'c\' for current");
		String choice = scanner.next();
		Account account = null;

		if (choice.equalsIgnoreCase("S"))
			// super class ref=sub class onject
			account = new Savings(20000);
		else {
			account = new Current(10000, "Current");
		//	long x =100;
		// call the overridden methods using account ref
			//create a ref of Current and downcast
		//	int y=(int)x;
			Current current=(Current)account;
			//call own method of current
			String[] loans=current.showLoanTypes();
			for(String loan:loans) {
				System.out.println(loan);
			}
			
		}
		for(;;) {
			System.out.println("""
					Enter 1.withdraw
					      2.deposit
					      3.Balance
					      4.Exit
					""");
			int type = scanner.nextInt();
			switch (type) {
			case 1:

				System.out.println("Enter Amount to withdraw");
				double amount = scanner.nextDouble();
				account.withdraw(amount);
				break;
			case 2:
				System.out.println("Enter Amount to deposit");

				double amount1 = scanner.nextDouble();
				account.deposit(amount1);
				break;
			case 3:
				System.out.println("Balance is" + account.getBalance());
                break;
			case 4:

				// scanner.close();
				System.exit(0);
			}
		}
	}

}
