package entities.VehicularData;

public class VehicularData 
{
	private String _licensePlate;
	private String _vehicularType;
	
	public VehicularData(String licensePlate, String vehicularType)
	{
		_licensePlate = licensePlate;
		_vehicularType = vehicularType;
	}

	public String get_licensePlate() 
	{
		return _licensePlate;
	}

	public String get_vehicularType() 
	{
		return _vehicularType;
	}
}
