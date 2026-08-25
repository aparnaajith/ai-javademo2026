package com.oops.basics;

import java.util.Iterator;

public class Greeter {
	void printMessage(String...names) {
//iterate and print the message as "Great Day as"Great Day,Riya!!!"
	  for (String name:names) {
		  System.out.println("Great Day "+ name+"!!!");
	  }
	}
	
void greetUser(String name,String...messages) {
		//iterate through messages and print as "message 1"+name =>Hello Riya,Welcome Riya,Bye Bye Riya
	for(String message:messages) {
		System.out.println(message + " " +name);
	}
	}

}
