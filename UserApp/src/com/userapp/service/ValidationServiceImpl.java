package com.userapp.service;

import java.util.Iterator;

import com.userapp.exceptiom.NameExistsException;
import com.userapp.exceptiom.TooLongException;
import com.userapp.exceptiom.TooShortException;

public class ValidationServiceImpl implements IValidationService {

	@Override
	public boolean validatePassword(String password) throws TooShortException, TooLongException {
	if(password.length()<6) {
		throw new TooShortException("Password should contain atleast 6 characters");
	}
	if(password.length()>15) {
		throw new TooLongException("Password should not exceed 15 characters");
	}
		return true;
	}

	@Override
	public boolean validateUsername(String username) throws NameExistsException {
		String[] usenames= {"Sri","Priya","Joe","Kathy"};
		for (String name : usenames) {
			if (name.equalsIgnoreCase(username)) {
				throw new NameExistsException("Name already exists");
				
			}
		}
		return true;
	}

}
