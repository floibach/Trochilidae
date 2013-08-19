package entities.Equipment;

public class Equipment 
{
	private int _priority;
	private String _label;
	
	public Equipment(int priority, String label)
	{
		_priority = priority;
		_label = label;
	}

	public int GetPriority() 
	{
		return _priority;
	}

	public String GetLabel() 
	{
		return _label;
	}
	
	
}
