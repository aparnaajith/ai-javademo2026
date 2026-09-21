package com.training.quest1;

import java.util.stream.Stream;

public class StreamDemo8 {

	public static void main(String[] args) {
       Stream.generate(()->Math.random())
       .limit(5)
       .forEach(number->System.out.println(number));
	}

}
