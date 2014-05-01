package test.aufgabe4;

import programmieren.aufgabe4.FibonacciIterativ;
import programmieren.aufgabe4.FibonacciRekursiv;
import programmieren.aufgabe4.FibonacciVergleicher;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FibonacciRekursiv fibrec = new FibonacciRekursiv();
		FibonacciIterativ fibit = new FibonacciIterativ();
		
		FibonacciVergleicher vergleicher = new FibonacciVergleicher();

		
		for(int i = 0; i <= 7; i++) {
			System.out.print(fibrec.fibonacci(i));
			System.out.print(" ");
			System.out.print(fibit.fibonacci(i));
			System.out.println("");
		}
		
		
		System.out.println(vergleicher.verhaeltnisRekursivIterativ(35));

	}

}
