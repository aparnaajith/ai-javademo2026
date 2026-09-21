package com.training.quest1;

import java.util.stream.IntStream;

public class StreamDemo1 {

	public static void main(String[] args) {
		int sum=IntStream.of(10,20,30,40,50).sum();
		System.out.println("Sum = "+sum);

	}

}
