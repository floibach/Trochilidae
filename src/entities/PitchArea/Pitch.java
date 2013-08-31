package entities.PitchArea;

import dataTier.PitchAdministration;

public class Pitch 
{
	private int _id;
	private int _xCoordinate;
	private int _yCoordinate;
	private int _area;
	private int _price;
	private boolean _isOccupied;
	private boolean _hasWater;
	private boolean _hasElecticity;
	
	public Pitch(int id, int xCoordinate, int yCoordinate, int area, int price, boolean isOccupied, boolean hasWater, boolean hasElectricity)
	{
		_id = id;
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
		PitchAdministration.OccupiePitch(this);
	}
	
	public void FreePitch()
	{
		_isOccupied = false;
	}
	
	public int getId()
	{
		return _id;
	}
		
	public int get_xCoordinate() {
		return _xCoordinate;
	}

	public int get_yCoordinate() {
		return _yCoordinate;
	}

	public int get_area() {
		return _area;
	}

	public int get_price() {
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
