package programmieren.aufgabe3;

public final class Field {
	
	private int x;
	private int y;

	public Field(int x, int y) {
		if(x > 5 || y > 5 || x < 1 || y < 1) throw new IllegalArgumentException("Fehler: Nicht erlaubter Parameter.");
		this.x = x;
		this.y = y;
		
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Field other = (Field) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
