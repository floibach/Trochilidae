package entities.PitchArea;

public class Pitch 
{
	private int _xCoordinate;
	private int _yCoordinate;
	private String _area;
	private double _price;
	private boolean _isOccupied;
	private boolean _hasWater;
	private boolean _hasElecticity;
	
	public Pitch(int xCoordinate, int yCoordinate, String area, double price, boolean isOccupied, boolean hasWater, boolean hasElectricity)
	{
		_xCoordinate = xCoordinate;
		_yCoordinate = yCoordinate;
		_area = area;
		_price = price;
		_isOccupied = isOccupied;
		_hasWater = hasWater;
		_hasElecticity = hasElectricity;
	}
	
	public void OccupyPitch()
	{
		_isOccupied = true;
	}
	
	public void FreePitch()
	{
		_isOccupied = false;
	}
	

	public int get_xCoordinate() {
		return _xCoordinate;
	}

	public int get_yCoordinate() {
		return _yCoordinate;
	}

	public String get_area() {
		return _area;
	}

	public double get_price() {
		return _price;
	}

	public boolean is_isOccupied() {
		return _isOccupied;
	}

	public boolean is_hasWater() {
		return _hasWater;
	}

	public boolean is_hasElecticity() {
		return _hasElecticity;
	}
	
	
}
