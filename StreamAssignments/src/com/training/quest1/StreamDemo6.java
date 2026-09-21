package com.training.quest1;

import java.util.Arrays;
import java.util.List;

public class StreamDemo6 {

	public static void main(String[] args) {
List<String> names=Arrays.asList("Rahul","Anu");
	names.stream()
	.distinct()
	.findFirst()
	.ifPresent(namwe->System.out.println(names));
	}

}
