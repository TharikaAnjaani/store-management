package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
//import app.GetDetails;

public class DBConnect {
	
	
	private Connection con;
	private Statement st;
	private ResultSet rs;
	
	public DBConnect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hv","root","");
			st = con.createStatement();
			
		}
		catch(Exception ex){
			System.out.println("Error "+ex);
		}
	}
	
	
	
}
