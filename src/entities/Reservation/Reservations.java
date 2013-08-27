package entities.Reservation;

import java.util.ArrayList;

import dataTier.ReservationAdministration;

public class Reservations 
{
	private ArrayList<Reservation> _reservations;
	
	public Reservations()
	{
		_reservations = ReservationAdministration.GetReservations();
	}
	
	private static Reservations _instance;
	public static Reservations Instance()
	{
		if(null == _instance)
		{
			_instance = new Reservations();
		}
		return _instance;
	}
	public ArrayList<Reservation> getReservations() 
	{
		return _reservations;
	}	
	
	public void SafeReservation(Reservation reservation)
	{
		reservation.SafeToDb();
		_reservations.add(reservation);
	}
}
