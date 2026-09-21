package com.training.quest1;

import java.util.Arrays;
import java.util.List;

public class StreamDemo5 {

	public static void main(String[] args) {
List<String> names=Arrays.asList("Anu","Rahul","Sneha","Sanjay");
	int sum=names.stream()
			.mapToInt(name->name.length())
			.sum();
	System.out.println("Sum of name lengths= "+sum);
	
	}

}
