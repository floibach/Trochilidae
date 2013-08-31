package entities.PitchArea;

import java.util.ArrayList;

import dataTier.AreaAdministration;

public class Areas 
{
	private ArrayList<Area> _areas;
	
	private Areas()
	{
		_areas = AreaAdministration.GetAreas();	
	}
	
	private static Areas _instance;
	public static Areas Instance()
	{
		if(null == _instance)
		{
			_instance = new Areas();
		}
		return _instance;
	}
	public ArrayList<Area> getAreas() 
	{
		return _areas;
	}
	
}
