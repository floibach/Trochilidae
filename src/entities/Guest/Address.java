package entities.Guest;

public class Address 
{
	private String _city;
	private int _zip;
	private String _street;
	private String _streetNumber;
	
	public Address(String city, int zip, String street, String streetNumber)
	{
		_city = city;
		_zip = zip;
		_street = street;
		_streetNumber = streetNumber;
	}

	public String get_city() {
		return _city;
	}

	public int get_zip() {
		return _zip;
	}

	public String get_street() {
		return _street;
	}

	public String get_streetNumber() {
		return _streetNumber;
	}
}
