package com.inher.quest5;

class SmartPhone extends Mobile {

    @Override
    void call() {
        System.out.println("Smartphone can make calls using mobile network");
    }

    String[] apps() {

        String[] applications = {
            "WhatsApp",
            "Instagram",
            "YouTube",
            "Google Maps"
        };

        return applications;
    }
}