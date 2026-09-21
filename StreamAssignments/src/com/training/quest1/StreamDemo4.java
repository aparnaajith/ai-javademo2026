package com.training.quest1;

import java.util.Arrays;
import java.util.List;

public class StreamDemo4 {

	public static void main(String[] args) {
    List<String> names=Arrays.asList("Anu","Rahul","Sneha","Sanjay","Aparna");
    
    names.stream()
    .map(name->name.length())
    .forEach(length->System.out.println(length));
	}

}
