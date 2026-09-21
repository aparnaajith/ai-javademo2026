package com.over.quest3;

public class ProcessMain {

	public static void main(String[] args) {
		Processor processor=new Processor();
		 // Square root
        processor.calculate(25.0);

        // Product
        processor.calculate(10, 5);

        // Difference
        processor.calculate(20.5, 10.5);

        // Power
        processor.calculate(2.0, 3);

        // Square
        processor.calculate(6);
    }
}
