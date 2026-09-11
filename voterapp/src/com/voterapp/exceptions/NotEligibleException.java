package com.voterapp.exceptions;

//custom exception
public class NotEligibleException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;//somebody who make new changes need to make this value as 2L
	//add default and parameterized constructor

	public NotEligibleException() {
		super();
		
	}

	public NotEligibleException(String message) {
		super(message);
		
	}
}
