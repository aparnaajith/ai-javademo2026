package com.training.quest1;

import java.util.Arrays;

public class StreamDemo9 {
public static void main(String[] args) {
	int[][] numbers= {
			{10,20,30},
			{40,50,60},
			{70,80,90}
	};
	
	int sum=Arrays.stream(numbers)
			.flatMapToInt(row->Arrays.stream(row))
			.sum();
	
	System.out.println("Sum = "+ sum);
}
}
