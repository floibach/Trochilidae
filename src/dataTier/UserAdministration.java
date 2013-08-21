package dataTier;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserAdministration 
{
	public static ArrayList<String> GetSingleUserInformation(String userName, String userPassword)
	{		
		String query = "SELECT * FROM user where user.userName = '"+userName + "'";		
		ArrayList<String> singleResult = ConvertResults(DataBaseController.GetResults(query));
		
		return singleResult;
	}
	
	public static boolean CreateNewUser() throws Exception
	{
		
		throw new Exception("Not implemented");
	}
	
	private static ArrayList<String> ConvertResults(ResultSet resultSet)
	{
		ArrayList<String> results = new ArrayList<String>();
		try 
		{
			while (resultSet.next()) 
			{
				String name = resultSet.getString(2).toString();
				String password = resultSet.getString(3).toString();
				String role = resultSet.getString(4).toString();
				
				results.add(name);
				results.add(password);
				results.add(role);
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return results;
	}
}
