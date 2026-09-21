package com.training.quest2;


import java.util.Arrays;
import java.util.List;

public class MobileMain {

    public static void main(String[] args) {

        List<Mobile> mobiles = Arrays.asList(

                new Mobile("S25", "Samsung", 75000, 10),

                new Mobile("iPhone 16", "Apple", 70000, 11),

                new Mobile("Nord 5", "OnePlus", 35000, 12),

                new Mobile("A56", "Samsung", 30000, 13),

                new Mobile("iPhone 15", "Apple", 60000, 14)
        );

        // a. Print all mobiles using forEach
        System.out.println("All Mobiles:");

        mobiles.forEach(mobile -> System.out.println(mobile));

        System.out.println("--------------------------");

        // b. Get mobiles by brand
        System.out.println("Samsung Mobiles:");

        mobiles.stream()
                .filter(mobile -> mobile.getBrand().equals("Samsung"))
                .forEach(mobile -> System.out.println(mobile));

        System.out.println("--------------------------");

        // c. Get mobiles by brand and sort by model
        System.out.println("Samsung Mobiles sorted by model:");

        mobiles.stream()
                .filter(mobile -> mobile.getBrand().equals("Samsung"))
                .sorted((m1, m2) -> m1.getModel().compareTo(m2.getModel()))
                .forEach(mobile -> System.out.println(mobile));

        System.out.println("--------------------------");

        // d. Get mobile by id 10
        System.out.println("Mobile with ID 10:");

        Mobile mobile = mobiles.stream()
                .filter(m -> m.getMobileId() == 10)
                .findFirst()
                .orElseThrow(() ->
                        new RuntimeException("Mobile with ID 10 not found"));

        System.out.println(mobile);

        System.out.println("--------------------------");

        // e. Get mobiles by brand and price less than 20000
        System.out.println("Samsung mobiles with price less than 20000:");

        mobiles.stream()
                .filter(m -> m.getBrand().equals("Samsung"))
                .filter(m -> m.getPrice() < 20000)
                .forEach(m -> System.out.println(m));

        System.out.println("--------------------------");

        // f. Get mobiles by brand,
        // sort by model and print only mobile names

        System.out.println("Samsung mobile models:");

        mobiles.stream()
                .filter(m -> m.getBrand().equals("Samsung"))
                .sorted((m1, m2) ->
                        m1.getModel().compareTo(m2.getModel()))
                .map(m -> m.getModel())
                .forEach(model -> System.out.println(model));
    }
}