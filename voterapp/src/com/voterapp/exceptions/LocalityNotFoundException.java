package com.voterapp.exceptions;

//custom exception
public class LocalityNotFoundException extends NotEligibleException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;//somebody who make new changes need to make this value as 2L
	//add default and parameterized constructor

	public LocalityNotFoundException() {
		super();
		
	}

	public LocalityNotFoundException(String message) {
		super(message);
		
	}
}
