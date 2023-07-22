package Homework5_Advanced.Homework5_Advanced;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {
	private static String USER_NAME = "Vadym";
    private static String USER_PASSWORD = "230103va";
    private static String URL = "jdbc:mysql://localhost/magazine";
    
    public static Connection openConnection() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
    Class.forName ("com.mysql.cj.jdbc.Driver");
    return DriverManager.getConnection (URL, USER_NAME, USER_PASSWORD);
    }
}
