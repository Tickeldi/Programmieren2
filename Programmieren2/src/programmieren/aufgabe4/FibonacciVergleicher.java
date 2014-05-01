package programmieren.aufgabe4;

public class FibonacciVergleicher {
	FibonacciRekursiv fibrec = new FibonacciRekursiv();
	FibonacciIterativ fibit = new FibonacciIterativ();
	 	

		public double verhaeltnisRekursivIterativ (int n) {
	
			double vorher = System.nanoTime();
			for(int i = 0; i < 10; i++) {
					fibrec.fibonacci(n);
			}
			double durchschnittRekursiv = (System.nanoTime() - vorher);
			
			vorher = System.nanoTime();
			for(int i = 0; i < 10; i++) {
				fibit.fibonacci(n);
			}			
			double durchschnittIterativ = (System.nanoTime() - vorher);
			
			return durchschnittRekursiv / durchschnittIterativ;
		}
	
}
