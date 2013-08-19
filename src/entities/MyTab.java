package entities;

import javax.swing.JPanel;

import businessTier.User.UserRole;

public class MyTab 
{
	private UserRole _userRole;
	private JPanel _panel;
	private String _title;
	
	public MyTab(UserRole role, JPanel panel, String title)
	{
		_userRole = role;
		_panel = panel; 
		_title = title;
	}
	
	public UserRole GetUserRole()
	{
		return _userRole;
	}
	
	public JPanel GetPanel()
	{
		return _panel;
	}
	
	public String GetTitle()
	{
		return _title;
	}
}
