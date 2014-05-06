package programmieren.aufgabe4;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Properties;

public class propertyCreator {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		Writer writer = new FileWriter( "ewn.properties" );
		
		Properties properties = new Properties ();
		properties . setProperty ("position-implementation", "programmieren.aufgabe4.Spielfeld");

		PrintWriter printWriter = new PrintWriter ( writer );
		properties . store ( printWriter , "Abgabe 4");
		printWriter . close ();

	}

}
