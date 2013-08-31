package entities.PitchArea;

public class Area 
{
	private int _areaId;
	private String _areaLetter;
	
	public Area(int areaId, String areaLetter)
	{
		_areaId = areaId;
		_areaLetter = areaLetter;
	}

	public int get_areaId() {
		return _areaId;
	}

	public String get_areaLetter() {
		return _areaLetter;
	}
}
