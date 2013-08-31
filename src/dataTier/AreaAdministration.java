package dataTier;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import entities.PitchArea.Area;

public class AreaAdministration 
{
	public static ArrayList<Area> GetAreas()
	{
		String query = "SELECT * FROM trochilidae.areas;";
		ArrayList<Area> results = ConvertResults(DataBaseController.GetResults(query)); 
		return results;
	}
	
	private static ArrayList<Area> ConvertResults(ResultSet rs)
	{
		ArrayList<Area> results = new ArrayList<Area>();
		
		try 
		{
			while(rs.next())
			{
				int id= rs.getInt(1);
				String letter = rs.getString(2);
				
				results.add(new Area(id, letter));
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		return results;
	}
}

