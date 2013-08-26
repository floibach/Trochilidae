package entities.VehicularData;

public class VehicularData 
{
	private int _id;
	private String _licensePlate;
	private String _vehicularType;
	
	public VehicularData(int id, String licensePlate, String vehicularType)
	{
		_id = id;
		_licensePlate = licensePlate;
		_vehicularType = vehicularType;
	}

	public int get_id() {
		return _id;
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
