package test.aufgabe3;

import org.junit.Test;

import programmieren.aufgabe3.IntegerCalculator;
import programmieren.aufgabe3.ToBigException;

public class IntegerCalculatorTest {

	@Test(expected=ToBigException.class)
	public void testToBigException() throws ToBigException {
		IntegerCalculator a = new IntegerCalculator();
		if(a.add((long)Integer.MAX_VALUE + 1L, (long)Integer.MIN_VALUE - 1L) == 0);
	}

}
