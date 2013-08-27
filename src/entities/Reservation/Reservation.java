package entities.Reservation;

import java.util.ArrayList;

import dataTier.ReservationAdministration;

import entities.MyDate;
import entities.Guest.Guest;
import entities.PitchArea.Pitch;

public class Reservation 
{
	private Guest _guest;
	private ArrayList<Pitch> _pitches;
	private MyDate _arrival;
	private MyDate _depature;
	
	public Reservation(Guest guest, ArrayList<Pitch> pitches, MyDate arrival, MyDate depature)
	{
		_guest = guest;
		_pitches = pitches;
		_arrival = arrival;
		_depature = depature;
	}
	
	public void SafeToDb()
	{
		ReservationAdministration.Safe(this);
	}
	
	public Guest get_guest() {
		return _guest;
	}

	public ArrayList<Pitch> get_pitches() {
		return _pitches;
	}

	public MyDate get_arrival() {
		return _arrival;
	}

	public MyDate get_depature() {
		return _depature;
	}

	
}

