package programmieren.aufgabe3;

public class SpecialArray <T> {
	
	private T[] data;
	
	public SpecialArray (T[] data) {
		this.data = data;
	}
	
	public T get(int i) {
		if (i <= 0 || i >= this.data.length - 1) throw new ArrayIndexOutOfBoundsException();
		
		return this.data[i];
	}

}
