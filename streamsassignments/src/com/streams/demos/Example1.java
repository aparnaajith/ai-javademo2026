package com.streams.demos;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Example1 {
	public static void main(String[] args) {
		// get the nmaes containing r
		List<String> names = Arrays.asList("Raju", "Manav", "Shaily", "Arun", "Roni", "Monu", "Anu");
		/*
		 * Predicate<String> pred=name->{ if(name.contains("r")) return true; return
		 * false;
		 * 
		 * }; List<String> newNames=names.stream() .filter(pred)
		 * .collect(Collectors.toList()); System.out.println(newNames);
		 */

		List<String> newNames = names.stream().filter(str -> str.startsWith("R")).collect(Collectors.toList());
		System.out.println(newNames);

		// get the first five names only ,sort it and p2rint directly
		// limit,sorted
		names.stream().sorted().limit(5).sorted().forEach(str -> System.out.println(str.toUpperCase()));

		System.out.println();
		// get the names and convert to uppercase
		names.stream().map(str -> str.toUpperCase()).forEach(str -> System.out.println(str));

		// input is str-> output is length of each string value
		names.stream().map(s -> s.length()).forEach(num -> System.out.println(num));

		// convert list to stream,filter by names having o,sort them
		// add hello with each element and print them o/p is->Hello Manav,Hello Raju
		names.stream().filter(n -> n.contains("o")).sorted().map(str -> "Hello" + str)
				.forEach(str -> System.out.println(str));
	}
}
