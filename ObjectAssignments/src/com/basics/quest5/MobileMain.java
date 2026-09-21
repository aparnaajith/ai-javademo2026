package com.basics.quest5;



public class MobileMain {

    public static void main(String[] args) {

        // Create 5 mobile objects
        Mobile mobile1 = new Mobile("Galaxy S25", "Samsung", 79999);
        Mobile mobile2 = new Mobile("iPhone 17", "Apple", 89999);
        Mobile mobile3 = new Mobile("Galaxy A56", "Samsung", 45999);
        Mobile mobile4 = new Mobile("Nord 5", "OnePlus", 34999);
        Mobile mobile5 = new Mobile("Galaxy S25 Ultra", "Samsung", 129999);

        // Create mobile array
        Mobile[] mobileArray = new Mobile[5];

        // Add objects to array
        mobileArray[0] = mobile1;
        mobileArray[1] = mobile2;
        mobileArray[2] = mobile3;
        mobileArray[3] = mobile4;
        mobileArray[4] = mobile5;

        // First for loop - print all mobile details
        System.out.println("All Mobile Details");
        System.out.println("===================");

        for (int i = 0; i < mobileArray.length; i++) {
            mobileArray[i].getDetails();
        }

        // Second for loop - print Samsung mobiles
        System.out.println("\nSamsung Mobiles");
        System.out.println("===================");

        for (int i = 0; i < mobileArray.length; i++) {

            if (mobileArray[i].brand.equals("Samsung")) {
                mobileArray[i].getDetails();
            }
        }
    }
}
