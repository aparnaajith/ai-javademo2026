package com.functional.quest2;

public class CalcMain {

	public static void main(String[] args) {
		ICalculator sum=(x,y)->System.out.println("Sum = "+(x+y));
		
		sum.calculate(10, 5);
		ICalculator product=(x,y)->System.out.println("Product = "+(x*y));
		sum.calculate(10, 5);
		ICalculator squareRoot = (x, y) ->
        System.out.println("Square Root of " + x + " = " + Math.sqrt(x));
        squareRoot.calculate(25, 0);
        ICalculator cube=(x,y)->System.out.println("Product = "+(x*x*x));
        cube.calculate(3,0);

	}

}
