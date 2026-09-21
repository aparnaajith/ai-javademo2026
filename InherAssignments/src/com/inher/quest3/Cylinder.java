package com.inher.quest3;

public class Cylinder extends Figures {

    @Override
    void volume(int x, int y) {
        int radius = x;
        int height = y;

        double volume = Math.PI * radius * radius * height;

        System.out.println("Volume of Cylinder = " + volume);
    }
}