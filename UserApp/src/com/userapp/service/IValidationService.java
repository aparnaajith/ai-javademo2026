package com.userapp.service;

import com.userapp.exceptiom.NameExistsException;
import com.userapp.exceptiom.TooLongException;
import com.userapp.exceptiom.TooShortException;

public interface IValidationService {

	boolean validatePassword(String password) 
		throws TooShortException,TooLongException;
	
	boolean validateUsername(String username) throws NameExistsException;
}
