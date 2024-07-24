package application;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;

public class DatabaseConnection {
	
	public Connection Connect() throws SQLException {

		String jdbcURL = "jdbc:derby:TeacherStudentSystem3;create=true";
		
		return DriverManager.getConnection(jdbcURL);
		
	}
	
	
}