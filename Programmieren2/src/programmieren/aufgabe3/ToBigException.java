package programmieren.aufgabe3;

public class ToBigException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long summand;
	
	public ToBigException(long summand) {
		this.summand = summand;
	}
	
	public ToBigException() {
	}

	public long getSummand() {
		return this.summand;
	}
}
