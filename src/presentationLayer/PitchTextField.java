package presentationLayer;

import javax.swing.JTextField;

import dataTier.PitchAdministration;

import entities.PitchArea.Pitch;

public class PitchTextField extends JTextField
{	
	private static final long serialVersionUID = 1L;
	
	private Pitch _pitch;
	
	public PitchTextField()
	{
	}
	
	public Pitch GetPitch()
	{
		return _pitch;
	}
	
	public void SetPitch(Pitch pitch)
	{
		_pitch = pitch;
		String caption = _pitch.get_area() + "-" + _pitch.get_xCoordinate() + _pitch.get_yCoordinate() + "";
		super.setText(caption);
	}
	
	public void OccupiePitch()
	{
		PitchAdministration.OccupiePitch(_pitch);
	}
	
}
