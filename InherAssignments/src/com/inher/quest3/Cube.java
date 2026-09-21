package com.inher.quest3;

public class Cube extends Figures {

	@Override
	void volume(int x, int y) {
		int side = x;
		int volume = side * side * side;

		System.out.println("Volume of Cube = " + volume);

	}

}
