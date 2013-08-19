package businessTier;

import java.util.ArrayList;

import businessTier.User.User;
import businessTier.User.UserRole;

import dataTier.UserAdministration;

public class SessionControl 
{
	private SessionControl()
	{		
	}
	
	private User _user;
	private static SessionControl _instance;
	public static SessionControl Instance()
	{
		if(null == _instance)
		{
			_instance = new SessionControl();
		}
		return _instance;
	}
	
	public static void Login(String userName, String password)
	{
		ArrayList<String> singleResult = UserAdministration.GetSingleUserInformation(userName, password);
		
		//The length of the list has to be 3 because there are stored: name (index 0), password(index 1) and role(index 2)
		if(singleResult.size()==3)
		{
			if(PasswordsAreEqual(singleResult.get(1),password))
			{
				CreateSession(singleResult.get(0),singleResult.get(1),singleResult.get(2));
			}	
		}
	}
	
	private static boolean PasswordsAreEqual(String actualPassword, String insertPassword)
	{
		if(actualPassword.equals(insertPassword))
		{
			return true;
		}
		return false;
	}
	
	private static void CreateSession(String userName, String password, String role)
	{
		UserRole test = UserRole.valueOf(role);
		Instance()._user = new User(userName, password, test);
	}
	
	public User getUser()
	{
		return _user;
	}
}
