package com.voterapp.main;

import com.voterapp.exceptions.LocalityNotFoundException;
import com.voterapp.exceptions.NotEligibleException;
import com.voterapp.exceptions.UnderAgeException;
import com.voterapp.exceptions.VoterIdNotFoundException;
import com.voterapp.services.ElectionBoothImpl;
import com.voterapp.services.IElectionBooth;

public class Voter {

	public static void main(String[] args) {
		IElectionBooth electionBooth=new ElectionBoothImpl();
		try {
			boolean isEligible=electionBooth.checkEligibility(18,"JP Nagar", 1001);
		    if(isEligible)
		    	System.out.println("You are eligible to vote");
		} catch(UnderAgeException |LocalityNotFoundException |VoterIdNotFoundException e){//Exceptions at same level 
			System.out.println(e.getMessage());
		} catch (NotEligibleException e) {
		 	System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
