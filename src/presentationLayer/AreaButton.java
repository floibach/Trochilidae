package presentationLayer;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

import entities.PitchArea.Area;

public class AreaButton extends JButton
{
	private static final long serialVersionUID = 1L;

	private Area _area;
	
	public AreaButton(Area area)
	{
		_area = area;
	}
	
	public Area GetArea()
	{
		return _area;
	}
	
	public void SetButtonProperties(int buttonWidth, int buttonHeight)
	{
		setText(_area.get_areaLetter());
		setFont(new Font("Tahoma", Font.PLAIN, 10));
		int row = 0;
		if(_area.get_areaId()%2==0)
		{
			row = 1;
		}
		int xMultiplier = (_area.get_areaId()-1)/2;
		int xCoordinate = xMultiplier * buttonWidth;
		int yCoordinate = buttonHeight * row;
		setBounds(xCoordinate, yCoordinate, buttonWidth, buttonHeight);			
		setBackground(new Color(153,255,153));
	}
}

