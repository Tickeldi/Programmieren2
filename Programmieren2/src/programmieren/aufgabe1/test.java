package programmieren.aufgabe1;


public class test {

	/**
	 * @param args
	 */

	public static void main(String[] args) {

		Pair <String, String> x = new Pair<> ("hallo", "huhu");
		Pair <String, String> y = new Pair<> ("hallo", "huhu");
		Pair <String, String> z = new Pair<> ("was????", "DAS!!!");
		
		System.out.println(x.equals(y));
		System.out.println(x.equals(z));
		
		DNS b = new DNS();
		Pair<String, String> a = b.lookup("www.tu-braunschweig.de");

		System.out.println(a.getLeft());
		System.out.println(a.getRight());
	
		
		System.out.println(Fibonacci.getFibonacciPaerchen(-1));
	
	}
	

}
