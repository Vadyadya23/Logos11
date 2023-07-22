package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.TimeZone;

import org.apache.log4j.xml.DOMConfigurator;


public class ConnectionUtils {
	
	private static String USER_NAME = "Vadym";
	private static String USER_PASSWORD = "230103va";
	private  static String URL = "jdbc:mysql://localhost/magazine?serverTimezone=" + TimeZone.getDefault().getID();
		
	public static Connection  openConnection() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		DOMConfigurator.configure("loggerConfig.xml");
		Class.forName ("com.mysql.cj.jdbc.Driver").newInstance ();
		return DriverManager.getConnection (URL, USER_NAME, USER_PASSWORD);
	}	
}
