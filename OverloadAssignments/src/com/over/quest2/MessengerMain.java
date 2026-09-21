package com.over.quest2;



public class MessengerMain {

    public static void main(String[] args) {

        Messenger messenger = new Messenger();

        // Calling method with 1 argument
        messenger.sendMail("Welcome to Java training");

        // Calling method with 2 arguments
        messenger.sendMail(
            "rohan@gmail.com",
            "Welcome to the training"
        );

        // Calling method with 3 arguments
        messenger.sendMail(
            "sathya@gmail.com",
            "Your training starts tomorrow",
            "Training Schedule"
        );
    }
}