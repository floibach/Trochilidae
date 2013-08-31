package entities.Guest;

import dataTier.GuestAdministration;
import entities.MyDate;

public class Guest 
{
	private String _preName;
	private String _lastName;
	private String _idNumber;
	private MyDate _birthDay;
	private Address _address;
	private int _equipment;
	private int _vehicular;
	
	public Guest(String preName, String lastName, Address address, String idNumber, MyDate birthday, int equipment, int vehicular)
	{
		_preName = preName;
		_lastName = lastName;
		_address = address;
		_idNumber = idNumber;
		_birthDay = birthday;
		_equipment = equipment;
		_vehicular = vehicular;
	}
	
	protected void safeGuestToDB()
	{
		GuestAdministration.SafeGuest(this);
	}
	
	public int get_vehicular() {
		return _vehicular;
	}

	public String get_preName() {
		return _preName;
	}

	public String get_lastName() {
		return _lastName;
	}

	public Address getAddress()
	{
		return _address;
	}

	public String get_idNumber() {
		return _idNumber;
	}

	public MyDate get_birthDay() {
		return _birthDay;
	}

	public int get_equipment() {
		return _equipment;
	}
	
}
