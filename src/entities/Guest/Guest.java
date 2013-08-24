package entities.Guest;

import dataTier.GuestAdministration;
import entities.MyDate;

public class Guest 
{
	private String _preName;
	private String _lastName;
	private int _zip;
	private String _city;
	private String _street;
	private String _streetNumber;
	private String _idNumber;
	private MyDate _birthDay;
	private int _equipment;
	
	public Guest(	String preName, String lastName, int zip, String city, 
					String street, String streetNumber, String idNumber, MyDate birthday, int equipment)
	{
		_preName = preName;
		_lastName = lastName;
		_zip = zip;
		_city = city;
		_street = street;
		_streetNumber = streetNumber;
		_idNumber = idNumber;
		_birthDay = birthday;
		_equipment = equipment;
		safeGuestToDB(_preName,_lastName,_zip,_city,_street,_streetNumber, _idNumber, _birthDay, _equipment);
	}
	
	private void safeGuestToDB(String preName, String lastName, int zip, String city, 
			String street, String streetNumber, String idNumber, MyDate birthday, int equipment)
	{
		GuestAdministration.SafeGuest(this);
	}

	public String get_preName() {
		return _preName;
	}

	public String get_lastName() {
		return _lastName;
	}

	public int get_zip() {
		return _zip;
	}

	public String get_city() {
		return _city;
	}

	public String get_street() {
		return _street;
	}

	public String get_streetNumber() {
		return _streetNumber;
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
