package programmieren.aufgabe1;

public class Pair <L, R> {
	//...
	// Kein Default - Konstruktor !
	R rechts;
	L links;

	public Pair (L left , R right ) {
		links = left;
		rechts = right;
	}
	//...

	public L getLeft () {
		return links;
	}

	public R getRight () {
		return rechts;
	}
	
	public String toString () {
		return "(" + links + ", " + rechts + ")";
	}

	/*
	@Override
	public boolean equals (Object input) {
		if (input == null) {
			return false;
		}
		if (input.getClass() == this.getClass()) {
			Pair <L,R> paar = (Pair <L,R>) input;
			if(input.getLeft().equals(links) &&	input.getRight().equals(rechts)) {
				return true;
			}
		}
		
		return false;
	}
	*/

	
	
	//Diese Zeilen wurden von Eclipse generiert
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((links == null) ? 0 : links.hashCode());
		result = prime * result + ((rechts == null) ? 0 : rechts.hashCode());
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
		Pair<?,?> other = (Pair<?,?>) obj;
		if (links == null) {
			if (other.links != null)
				return false;
		} else if (!links.equals(other.links))
			return false;
		if (rechts == null) {
			if (other.rechts != null)
				return false;
		} else if (!rechts.equals(other.rechts))
			return false;
		return true;
	}

	
}

