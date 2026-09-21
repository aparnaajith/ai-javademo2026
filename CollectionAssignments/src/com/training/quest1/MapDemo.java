package com.training.quest1;



import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class MapDemo {

    public static void main(String[] args) {

        Map<String, List<String>> countries = new HashMap<>();

        countries.put("Kerala",
                Arrays.asList("Kochi", "Trivandrum", "Kozhikode"));

        countries.put("Tamil Nadu",
                Arrays.asList("Chennai", "Coimbatore", "Madurai"));

        countries.put("Karnataka",
                Arrays.asList("Bangalore", "Mysore", "Mangalore"));

        // Iterate and print
        for (Map.Entry<String, List<String>> entry : countries.entrySet()) {

            System.out.println("State : " + entry.getKey());
            System.out.println("Cities : " + entry.getValue());
            System.out.println();
        }
    }
}