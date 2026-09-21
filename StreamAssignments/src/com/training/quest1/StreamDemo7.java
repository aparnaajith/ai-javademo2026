package com.training.quest1;

import java.util.Arrays;

public class StreamDemo7 {

	public static void main(String[] args) {
		String[] numbers = { "10", "20", "30", "40", "50" };

		int sum = Arrays.stream(numbers).mapToInt(number -> Integer.parseInt(number)).sum();
		System.out.println("Sum =" + sum);
	}

}
