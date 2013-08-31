package presentationLayer;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import entities.PitchArea.Pitch;

public class PitchButton extends JButton
{
	private static final long serialVersionUID = 1L;
	
	private Pitch _pitch;
	
	public PitchButton(Pitch pitch)
	{
		_pitch = pitch;
	}
	
	public Pitch GetPitch()
	{
		return _pitch;
	}
	
	public void SetButtonProperties(int buttonWidth, int buttonHeight)
	{
		setText(_pitch.get_xCoordinate()+"/"+(_pitch.get_yCoordinate()));
		setFont(new Font("Tahoma", Font.PLAIN, 10));
		setBounds((_pitch.get_xCoordinate()-1)*buttonWidth, (_pitch.get_yCoordinate()-1)*buttonHeight, buttonWidth, buttonHeight);			
		setBackground(new Color(153,255,153));
		if(_pitch.is_isOccupied())
		{
			setBackground(Color.RED);
		}
		
		String text = 	"<html><head></head><body>free: "+ !_pitch.is_isOccupied() +
						"<br/>water - " + _pitch.is_hasWater() + 
						"<br/>electricity - " + _pitch.is_hasElecticity() +
						"<br/>price: " + _pitch.get_price() + 
						"</body>";
		setToolTipText(text);
	}
}
