package com.inher.quest3;

import java.util.Scanner;

public class OverMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("1. Cube");
		System.out.println("2. Cuboid");
		System.out.println("3. Oval");
		System.out.println("4. Cylinder");

		System.out.print("Enter your choice: ");
		int choice = sc.nextInt();

		System.out.print("Enter x: ");
		int x = sc.nextInt();

		System.out.print("Enter y: ");
		int y = sc.nextInt();

		Figures f;

		switch (choice) {

		case 1:
			f = new Cube();
			break;

		case 2:
			f = new Cuboid();
			break;

		case 3:
			f = new Oval();
			break;

		case 4:
			f = new Cylinder();
			break;

		default:
			System.out.println("Invalid choice");
			sc.close();
			return;
		}

		f.volume(x, y);

		sc.close();
	}

}
