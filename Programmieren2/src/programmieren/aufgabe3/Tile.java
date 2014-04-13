package programmieren.aufgabe3;

public enum Tile {
	
	R1(1, Color.RED), R2(2, Color.RED), R3(3, Color.RED), R4(4, Color.RED), R5(5, Color.RED), R6(6, Color.RED),
	B1(1, Color.BLUE), B2(2, Color.BLUE), B3(3, Color.BLUE), B4(4, Color.BLUE), B5(5, Color.BLUE), B6(6, Color.BLUE);
	
	private final Color farbe;
	private final int nummer;
	
	private Tile (int nummer, Color farbe) {
		this.nummer = nummer;
		this.farbe = farbe;
	}
	
	public boolean isRed() {
		if (this.farbe == Color.RED) {
			return true;
		}
		return false;
	}
	
	public int getNumber() {
		return this.nummer;
	}
	
	public enum Color {
		RED, BLUE;
	}
}
