package programmieren.aufgabe4;

public class FibonacciRekursiv {
	
	public int fibonacci (int i) {
		if (i < 0) throw new IllegalArgumentException();
		if (i == 0  || i == 1) {
			return i;
		}
		
		return fibonacci(i - 1) + fibonacci(i - 2);
	}

}
