package programmieren.aufgabe3;

public class IntegerCalculator {
	
	public long add(long a, long b) throws ToBigException {
		try {
			if(a > Integer.MAX_VALUE || a < Integer.MIN_VALUE) {
				throw new ToBigException(a);
			}
			
			if(b > Integer.MAX_VALUE || b < Integer.MIN_VALUE) {
				throw new ToBigException(b);
			}
			return a+b;
		}
		catch (ToBigException e) {
			System.out.println(e.getSummand() + " ist groesser als " + Integer.MAX_VALUE + " oder kleiner als " + Integer.MIN_VALUE + "!");
			throw new ToBigException();
		}
			
			
	}

}
