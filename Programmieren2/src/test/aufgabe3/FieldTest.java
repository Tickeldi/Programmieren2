package test.aufgabe3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import programmieren.aufgabe3.Field;

public class FieldTest {
	
	Field a;
	Field b;
	Field c;

	@Before
	public void setUp() throws Exception {
		a = new Field(1,1);
		b = new Field(1,1);
	}

	@Test(timeout=300)
	public void testEquals() {
		assertTrue("Equals nicht überschrieben!", a.equals(b));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testIllegalArgumentException() {
		c = new Field(0,6);
	}
	
	

}
