package entities.Guest;

import java.util.ArrayList;

import dataTier.GuestAdministration;

public class Guests 
{
	
	private ArrayList<Guest> _guests;
	
	private Guests()
	{
		_guests = GuestAdministration.GetGuests();
	}
	
	private static Guests _instance;
	public static Guests Instance()
	{
		if(null == _instance)
		{
			_instance = new Guests();
		}
		return _instance;
	}
	
	public ArrayList<Guest> GetGuests()
	{
		return _guests;
	}
	
	public void AddGuest(Guest guest)
	{
		_guests.add(guest);
		guest.safeGuestToDB();
	}
	
	public void UpdateGuest(Guest guest)
	{
		
	}
}
