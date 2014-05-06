package test.aufgabe4;

import static org.junit.Assert.*;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import java.util.Properties;

import org.junit.Test;

import de.pdbm.ewn.Position;

public class PositionTest {

	@Test
	public void test() {
		Reader reader = null;
		try
		{
		  reader = new FileReader( "ewn.properties" );

		  Properties prop2 = new Properties();
		  prop2.load( reader );
		  prop2.getProperty("position-implementation").getClass();
		}
		catch ( IOException e )
		{
		  e.printStackTrace();
		}
		finally
		{
		  try { reader.close(); } catch ( Exception e ) { }
		}
		
		
		//Position test 
		
		//Class theClass = NSClassFromString(classNameStr);
		//id myObject = [[theClass alloc] init];
	}

}
