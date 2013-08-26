package dataTier;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import presentationLayer.Login;

public class DataBaseController 
{
	private static String username = "root";
	private static String password = "root";
	private static String driver = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://"+Login.getHostname()+":3306/trochilidae";
	private static Connection connection;
	
	private DataBaseController()
	{
		//connect();
	}
	
	
	public static ResultSet GetResults(String query) 
	{
		ResultSet results = null;
		
		connect();
				
		try 
		{
            Statement stmt = connection.createStatement();
            results = stmt.executeQuery(query);
        } 
		catch (SQLException e) 
        {
            System.err.println(e.toString());
        }
		
		//close();
		
		return results;
    }
	
	public static void ExecuteQuery(String query)
	{
		connect();
		
		try
		{
			Statement stmt = connection.createStatement();
			stmt.executeUpdate(query);
		}
		catch(SQLException e)
		{
			System.err.println(e.toString());
		}
	}
	
	private static void connect() 
	{
		try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url,
                    username, password);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error Connecting with User:" + username + " and Password:" + password);
        }
	}
	
	
//	private static void close() 
//	{
//        if (null != connection) 
//        {
//            try 
//            {
//                connection.close();
//            } 
//            catch (Exception e) 
//            {
//            }
//        }
//    }
	
}
