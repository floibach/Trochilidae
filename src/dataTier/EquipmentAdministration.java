package dataTier;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import entities.Equipment.Equipment;

public class EquipmentAdministration 
{
	
	public static ArrayList<Equipment> GetEquipments()
	{	
		String query = "SELECT * FROM trochilidae.equipment;";
		ArrayList<Equipment> results = ConvertResults(DataBaseController.GetResults(query));

		return results;
	}
	
	private static ArrayList<Equipment> ConvertResults(ResultSet resultSet)
	{
		ArrayList<Equipment> results = new ArrayList<Equipment>();
		try 
		{
			while (resultSet.next()) 
			{
				results.add(new Equipment(resultSet.getInt(1), resultSet.getString(2)));
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return results;
	}
	
}
