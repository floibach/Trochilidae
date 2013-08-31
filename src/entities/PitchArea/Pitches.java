package entities.PitchArea;

import java.util.ArrayList;

import dataTier.PitchAdministration;

public class Pitches 
{
	private ArrayList<Pitch> _pitches;
	
	private Pitches()
	{
		_pitches = PitchAdministration.GetPitches();
	}
	
	private static Pitches _instance;
	public static Pitches Instance()
	{
		if(null == _instance)
		{
			_instance = new Pitches();
		}
		return _instance;
	}
	public ArrayList<Pitch> getPitches() 
	{
		return _pitches;
	}
	
	
}
