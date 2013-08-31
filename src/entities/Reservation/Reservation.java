package entities.Reservation;

import dataTier.ReservationAdministration;

import entities.MyDate;
import entities.Guest.Guest;
import entities.PitchArea.Pitch;

public class Reservation 
{
	private Guest _guest;
	private Pitch _pitch;
	private MyDate _arrival;
	private MyDate _depature;
	
	public Reservation(Guest guest, Pitch pitch, MyDate arrival, MyDate depature)
	{
		_guest = guest;
		_pitch = pitch;
		_arrival = arrival;
		_depature = depature;
	}
	
	protected void SafeToDb()
	{
		ReservationAdministration.Safe(this);
	}
	
	public Guest get_guest() {
		return _guest;
	}

	public Pitch get_pitch() {
		return _pitch;
	}

	public MyDate get_arrival() {
		return _arrival;
	}

	public MyDate get_depature() {
		return _depature;
	}

	
}

