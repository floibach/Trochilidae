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
		String query = "SELECT * FROM guests;";
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
				int vehicular = rs.getInt(10);
				Address address = new Address(city,zip,street,Streetnumber);
				
				results.add(new Guest(preName,lastName,address,id,birthday,equipment,vehicular));


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
		String query = 	"INSERT INTO `guests` (`id`, `preName`, `lastName`, `zipcode`, `city`, `street`, " +
						"`streetNumber`, `birthday`, `equipmentID`, `vihicularDataID`)" + "VALUES ('" + guest.get_idNumber() + "', '" + guest.get_preName() +
						"', '" + guest.get_lastName() + "', '" + guest.getAddress().get_zip() + "', '" + guest.getAddress().get_city() + 
						"', '" + guest.getAddress().get_street() + "', '" + guest.getAddress().get_streetNumber() + 
						"', '" + guest.get_birthDay().GetSQLDate() + "', '" + guest.get_equipment() + 
						"', '"+ guest.get_vehicular() + "');";
		DataBaseController.ExecuteQuery(query);
	}
	
	public static void UpdateGuest(Guest oldGuest, Guest newGuest)
	{
		String query = 	"UPDATE `guests` SET " +
						"`id`='" + newGuest.get_idNumber() +
						"', `preName`='" + newGuest.get_preName() + 
						"', `lastName`='" + newGuest.get_lastName() + 
						"', `zipcode`='" + newGuest.getAddress().get_zip() + 
						"', `city`='" + newGuest.getAddress().get_city() +
						"', `street`='" + newGuest.getAddress().get_street() +
						"', `streetNumber`='" + newGuest.getAddress().get_streetNumber() + 
						"', `birthday`='" + newGuest.get_birthDay().GetSQLDate() +
						"', `equipmentID`='" + newGuest.get_equipment() + 
						"', `vihicularDataID`='" + newGuest.get_vehicular() +
						"' WHERE `id`='" + oldGuest.get_idNumber() + "';";
		DataBaseController.ExecuteQuery(query);
	}
}
