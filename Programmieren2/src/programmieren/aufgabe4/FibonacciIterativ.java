package programmieren.aufgabe4;

public class FibonacciIterativ {
	
	public int fibonacci (int i) {
		if (i < 0) throw new IllegalArgumentException();
		if (i == 0  || i == 1) {
			return i;
		}
		
		int ergebnis = 0;
		int vorgaenger = 1;
		int vorvorgaenger = 0;
		
		for(int x = 2; x <= i; x++) {
			ergebnis = vorgaenger + vorvorgaenger;
			vorvorgaenger = vorgaenger;
			vorgaenger = ergebnis;
		}
		
		return ergebnis;
	}

}
