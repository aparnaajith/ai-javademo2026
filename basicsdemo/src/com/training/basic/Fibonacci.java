package com.training.basic;

public class Fibonacci {

	public static void main(String[] args) {
		int a=0;int b=1;
		while (a<=100) {
			System.out.println(a);
			int c=a+b;
			a=b;
			b=c;
			
		}

	}

}
