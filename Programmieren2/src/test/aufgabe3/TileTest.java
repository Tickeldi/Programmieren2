package test.aufgabe3;

import static org.junit.Assert.*;

import org.junit.Test;

import programmieren.aufgabe3.Tile;

public class TileTest {

	@Test(timeout=300)
	public void testColors() {
		assertTrue(Tile.R1.isRed());
		assertTrue(Tile.R2.isRed());
		assertTrue(Tile.R3.isRed());
		assertTrue(Tile.R4.isRed());
		assertTrue(Tile.R5.isRed());
		assertTrue(Tile.R6.isRed());
		
		assertFalse(Tile.B1.isRed());
		assertFalse(Tile.B2.isRed());
		assertFalse(Tile.B3.isRed());
		assertFalse(Tile.B4.isRed());
		assertFalse(Tile.B5.isRed());
		assertFalse(Tile.B6.isRed());
	}
	
	@Test(timeout=300)
	public void testNumbers() {
		assertEquals(1, Tile.R1.getNumber());
		assertEquals(2, Tile.R2.getNumber());
		assertEquals(3, Tile.R3.getNumber());
		assertEquals(4, Tile.R4.getNumber());
		assertEquals(5, Tile.R5.getNumber());
		assertEquals(6, Tile.R6.getNumber());
		
		assertEquals(1, Tile.B1.getNumber());
		assertEquals(2, Tile.B2.getNumber());
		assertEquals(3, Tile.B3.getNumber());
		assertEquals(4, Tile.B4.getNumber());
		assertEquals(5, Tile.B5.getNumber());
		assertEquals(6, Tile.B6.getNumber());
		
	}

}
