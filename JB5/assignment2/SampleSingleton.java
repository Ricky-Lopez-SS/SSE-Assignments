import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * 
 */

/**
 * @author Lopez
 *
 */



public class SampleSingleton {

	private static Connection conn = null;
	
	private static SampleSingleton instance = null;
	
	public static SampleSingleton getInstance() {
		
		if(instance == null) {
			synchronized(instance) {
				if(instance == null) {
					return new SampleSingleton();
				}
			}
			
		}
		
		return instance;

	}
	
}
