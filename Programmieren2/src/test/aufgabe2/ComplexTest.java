package test.aufgabe2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import programmieren.aufgabe2.Complex;

public class ComplexTest {
	
	Complex a, b, c, d;
	@Before
	public void setUp() {
		a = new Complex(3.0, 2.0);
		b = new Complex(5.0, 5.0);
		c = new Complex(2.0, 5.0);
		d = new Complex(3.0, 7.0);
	}
		
	@Test(timeout=300)
	public void testAdd() {
		assertEquals("Addition", 8.0, a.add(b).getRealPart(), 0.001);
		assertEquals("Addition", 7.0, a.add(b).getImaginaryPart(), 0.001);
	}

	@Test(timeout=300)
	public void testSubstract() {
		assertEquals("Subtract", 2.0, b.subtract(a).getRealPart(), 0.001);
		assertEquals("Subtract", 3.0, b.subtract(a).getImaginaryPart(), 0.001);
	}

	@Test(timeout=300)
	public void testMultiply() {
		assertEquals("Multiply", -29.0, c.multiply(d).getRealPart(), 0.001);
		assertEquals("Multiply", 29.0, c.multiply(d).getImaginaryPart(), 0.001);
	}

	@Test(timeout=300)
	public void testDivide() {
		assertEquals("Divide", 41.0/58.0, c.divide(d).getRealPart(), 0.001);
		assertEquals("Divide", 1.0/58.0, c.divide(d).getImaginaryPart(), 0.001);
	}
	
	@Test(timeout=300)
	public void testSameObject() {
		assertNotSame("Objekt nicht immutable.", a.add(d), a);
	}
	
	

}
