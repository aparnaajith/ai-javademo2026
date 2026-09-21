package com.over.quest2;

public class Messenger {
	void sendMail(String message) {
		System.out.println("Sending mail...");
		System.out.println("Message: " + message);
		System.out.println("----------------------");
	}

	void sendMail(String tousername, String message) {
		System.out.println("Sending mail...");
		System.out.println("To: " + tousername);
		System.out.println("Message: " + message);
		System.out.println("----------------------");
	}

	void sendMail(String tousername, String message, String subject) {
		System.out.println("Sending mail...");
		System.out.println("To: " + tousername);
		System.out.println("Subject: " + subject);
		System.out.println("Message: " + message);
		System.out.println("----------------------");
	}
}
