package com.inher.quest3;
public class Cuboid extends Figures {

    @Override
    void volume(int x, int y) {
        int length = x;
        int width = y;
        int height = 5;

        int volume = length * width * height;

        System.out.println("Volume of Cuboid = " + volume);
    }
}