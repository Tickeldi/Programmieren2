package test.aufgabe3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import programmieren.aufgabe3.SpecialArray;

public class SpecialArrayTest {
	
	SpecialArray<?> a;
	
	@Before
	public void setUp() throws Exception {
		String data[] = new String[] {"1","2","3"};
		a = new SpecialArray<>(data);
	}

	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void testArrayIndexOutOfBoundsExceptionLow() {
		if(a.get(0) == "1") System.out.println("Erstes Element nicht geschützt.");
	}
	
	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void testArrayIndexOutOfBoundsExceptionHigh() {
		if(a.get(2) == "3") System.out.println("Letztes Element nicht geschützt.");
	}
	
	@Test(timeout=300)
	public void testGet() {
		assertEquals("Kann Element nicht bekommen!", "2", a.get(1));
	}
	
}
