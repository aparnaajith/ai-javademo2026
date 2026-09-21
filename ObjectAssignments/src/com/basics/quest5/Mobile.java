package com.basics.quest5;


public class Mobile {

    String model;
    String brand;
    double price;

    // Parameterized constructor
    public Mobile(String model, String brand, double price) {
        this.model = model;
        this.brand = brand;
        this.price = price;
    }

    // Method to print mobile details
    public void getDetails() {
        System.out.println("Model: " + model);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("----------------------");
    }
}