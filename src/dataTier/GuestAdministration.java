package dataTier;

import java.sql.ResultSet;
import java.util.ArrayList;

import entities.Guest.Guest;


public class GuestAdministration 
{
//	public static ArrayList<Equipment> GetEquipments()
//	{	
//		String query = "SELECT * FROM trochilidae.equipment;";
//		ArrayList<Equipment> results = ConvertResults(DataBaseController.GetResults(query));
//
//		return results;
//	}
	
	public static ArrayList<Guest> GetGuests()
	{
		return new ArrayList<Guest>();
	}


	public static void SafeGuest(Guest guest)
	{
		String query = 	"INSERT INTO `trochilidae`.`guests` (`id`, `peName`, `lastName`, `zipcode`, `city`, `street`, " +
						"`streetNumber`, `birthday`, `equipmentID`)" + "VALUES ('" + guest.get_idNumber() + "', '" + guest.get_preName() +
						"', '" + guest.get_lastName() + "', '" + guest.get_zip() + "', '" + guest.get_city() + "', '" + guest.get_street() +
						"', '" + guest.get_streetNumber() + "', '" + guest.get_birthDay().GetSQLDate() + "', '" + guest.get_equipment() + "');";
		DataBaseController.ExecuteQuery(query);
	}
	
	public static void test(ResultSet rs)
	{
		
	}
	
	public static void UpdateGuest()
	{
		
	}
}
