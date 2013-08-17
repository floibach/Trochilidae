package businessTier.User;

public class UserName 
{
	private String _name;
	
	public UserName(String name)
	{
		this._name = name.toLowerCase();
	}
	
	public boolean Equals(String userName)
	{
		if(_name.equalsIgnoreCase(userName))
		{
			return true;
		}
		return false;
	}

	public String toString() {
		return _name;
	}
}
