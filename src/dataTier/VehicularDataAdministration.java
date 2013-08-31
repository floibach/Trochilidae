package dataTier;

import java.sql.ResultSet;
import java.util.ArrayList;

import entities.VehicularData.VehicularData;

public class VehicularDataAdministration 
{
	public static ArrayList<VehicularData> GetVehicularData()
	{
		String query = "SELECT * FROM vehiculardata;";
		ArrayList<VehicularData> results = ConvertResults(DataBaseController.GetResults(query));
		return results;
	}
	
	private static ArrayList<VehicularData> ConvertResults(ResultSet rs)
	{
		
		ArrayList<VehicularData> results = new ArrayList<VehicularData>();
		try 
		{
			while (rs.next()) 
			{
				int id = rs.getInt(1);
				String licensePlate = rs.getString(2);
				String vehicularType = rs.getString(3);
				results.add(new VehicularData(id,licensePlate,vehicularType));
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return results;
	}
}
