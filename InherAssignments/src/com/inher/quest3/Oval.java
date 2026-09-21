package com.inher.quest3;

public class Oval extends Figures {

    @Override
    void volume(int x, int y) {
        double radius1 = x;
        double radius2 = y;
        double radius3 = 5;

        double volume = (4.0 / 3.0) * Math.PI
                * radius1 * radius2 * radius3;

        System.out.println("Volume of Oval = " + volume);
    }
}