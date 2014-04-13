package programmieren.aufgabe1;

public class DNS {
	
	public Pair <String , String > lookup ( String name ) {
		switch(name) {
			case "www.ostfalia.de":
				return new Pair <>(name,"141.41.9.237");
			case "www.sonia.de":
				return new Pair <>(name,"141.41.1.249");
			case "www.tu-braunschweig.de":
				return new Pair <>(name,"134.169.15.1");
			default:
				return new Pair <>(null,null);
		}
	}
}
