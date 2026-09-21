package com.training.quest5;

import java.util.Scanner;

public class Customer {
 /**
 * @param args
 */
/**
 * @param args
 */
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Do you want a touch screen or basic phone?");
	String choice=scanner.nextLine();
	if (choice.equalsIgnoreCase("basic")) {
		IFeaturePhone featurePhone= new BasicMobile();
        featurePhone.call();
        featurePhone.messaging();
	}else if(choice.equalsIgnoreCase("touch")) {
		ISmartPhone featurePhone= new TouchScreenMobile();
        featurePhone.call();
        featurePhone.messaging();
        featurePhone.showApps();
        featurePhone.cameraTypes();

		}else {
			System.out.println("Invalid choice");
		}
	

	
	scanner.close();
}
}
