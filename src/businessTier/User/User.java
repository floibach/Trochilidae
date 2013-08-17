package businessTier.User;

public class User 
{
	private UserName _userName;
	private UserPassword _userPassword;
	private UserRole _userRole;
	
	public User(String userName, String userPassword, UserRole userRole)
	{
		_userName = new UserName(userName);
		_userPassword = new UserPassword(userPassword);
		_userRole = userRole;
	}

	
	
	
	public UserName getUserName() 
	{
		return _userName;
	}

	public UserPassword getUserPassword() 
	{
		return _userPassword;
	}

	public UserRole getUserRole() 
	{
		return _userRole;
	}
	
	
	
	
}
