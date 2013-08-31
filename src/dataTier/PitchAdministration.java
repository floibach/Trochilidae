package dataTier;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import entities.PitchArea.Pitch;

public class PitchAdministration 
{
	public static ArrayList<Pitch> GetPitches()
	{
		String query = "SELECT * FROM pitches;";
		ArrayList<Pitch> results = ConvertResults(DataBaseController.GetResults(query));
		return results;
	}
	
	private static ArrayList<Pitch> ConvertResults(ResultSet rs)
	{
		ArrayList<Pitch> results = new ArrayList<Pitch>();
		try 
		{
			while(rs.next())
			{
				int id = rs.getInt(1);
				int x = rs.getInt(2);
				int y = rs.getInt(3);
				int price = rs.getInt(4);
				boolean isOccupied = rs.getInt(5) == 0;
				boolean hasWater = rs.getInt(6) == 1;
				boolean hasElectricity = rs.getInt(7) == 1;
				int area = rs.getInt(8);
				
				results.add(new Pitch(id, x, y, area, price, isOccupied, hasWater, hasElectricity));
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return results;
	}
	
	public static void OccupiePitch(Pitch pitch)
	{
		String query = "UPDATE `pitches` SET `isOccupied`='0' WHERE `id`='" +
				pitch.getId() + "';";
		
		DataBaseController.ExecuteQuery(query);
	}
}
