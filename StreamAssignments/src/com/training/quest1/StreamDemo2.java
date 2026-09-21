package com.training.quest1;

import java.util.stream.IntStream;

public class StreamDemo2 {

	public static void main(String[] args) {

		IntStream.range(1, 101)
		.filter(number->number%2==0)
		.forEach(number->System.out.println(number));
	}

}
