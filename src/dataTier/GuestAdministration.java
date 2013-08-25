package dataTier;

import java.sql.ResultSet;
import java.util.ArrayList;

import entities.MyDate;
import entities.Guest.Address;
import entities.Guest.Guest;


public class GuestAdministration 
{	
	public static ArrayList<Guest> GetGuests()
	{
		String query = "SELECT * FROM trochilidae.guests;";
		ArrayList<Guest> results = ConvertResults(DataBaseController.GetResults(query));
		return results;
	}
	
	private static ArrayList<Guest> ConvertResults(ResultSet rs) 
	{
		ArrayList<Guest> results = new ArrayList<Guest>();
		try 
		{
			while (rs.next()) 
			{
				String id = rs.getString(1);
				String preName = rs.getString(2);
				String lastName = rs.getString(3);
				int zip = rs.getInt(4);
				String city = rs.getString(5);
				String street = rs.getString(6);
				String Streetnumber = rs.getString(7);
				MyDate birthday;
				birthday = new MyDate(rs.getString(8));
				int equipment = rs.getInt(9);
				Address address = new Address(city,zip,street,Streetnumber);
				results.add(new Guest(preName,lastName,address,id,birthday,equipment));


			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return results;
	}

	public static void SafeGuest(Guest guest)
	{
		String query = 	"INSERT INTO `trochilidae`.`guests` (`id`, `peName`, `lastName`, `zipcode`, `city`, `street`, " +
						"`streetNumber`, `birthday`, `equipmentID`)" + "VALUES ('" + guest.get_idNumber() + "', '" + guest.get_preName() +
						"', '" + guest.get_lastName() + "', '" + guest.getAddress().get_zip() + "', '" + guest.getAddress().get_city() + 
						"', '" + guest.getAddress().get_street() + "', '" + guest.getAddress().get_streetNumber() + 
						"', '" + guest.get_birthDay().GetSQLDate() + "', '" + guest.get_equipment() + "');";
		DataBaseController.ExecuteQuery(query);
	}
	
	public static void UpdateGuest()
	{
		
	}
}
