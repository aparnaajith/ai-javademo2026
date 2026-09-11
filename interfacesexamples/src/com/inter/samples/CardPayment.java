package com.inter.samples;

public  abstract class CardPayment implements IPaymentProcessor{
    //concrete method-own method 
	void cardType(String type) {
		System.out.println("Card Type is"+ type);
	}
	
	
}

class CreditCardPayment extends CardPayment{
	
	@Override
	public void payAmount(double amount) {
		System.out.println("Paying through credit card"+amount);
		
	}
	//concrete method
	void cardLimit(double amount) {
		System.out.println("Card Limit is raised to "+amount);
	}
}

class DebitCardPayment extends CardPayment{

	@Override
	public void payAmount(double amount) {
		System.out.println("Paying throug debit card"+amount);
		
	}
	//this only will be called
	// default method-can be overridden in subclasses
		public void checkOffers() {
			System.out.println("offers only on purchase above 50000");

		}
	
}