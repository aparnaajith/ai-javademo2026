package com.inher.quest5;

public class MobMain {

    public static void main(String[] args) {

        // FeaturePhone
        FeaturePhone featurePhone = new FeaturePhone();

        featurePhone.call();


        // SmartPhone
        SmartPhone smartPhone = new SmartPhone();

        smartPhone.call();

        String[] applications = smartPhone.apps();

        System.out.println("Apps available in Smartphone:");

        for (String app : applications) {
            System.out.println(app);
        }
    }
}