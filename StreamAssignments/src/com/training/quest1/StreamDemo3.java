package com.training.quest1;

import java.util.Arrays;
import java.util.List;

public class StreamDemo3 {

	public static void main(String[] args) {
List<String> names=Arrays.asList("Anu","Sneha","Sam","Rahul","Sneha","Sanjay","Anu");
names.stream()
.distinct()
.filter(name->name.startsWith("S"))
.forEach(name->System.out.println(name));
	}

}
