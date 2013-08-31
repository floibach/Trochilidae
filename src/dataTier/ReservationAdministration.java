package dataTier;

import java.util.ArrayList;

import entities.Reservation.Reservation;

public class ReservationAdministration 
{
	public static ArrayList<Reservation> GetReservations()
	{
		return new ArrayList<Reservation>();
	}
	
	public static void Safe(Reservation reservation)
	{
		String query =	"INSERT INTO `reservation` (`arrival`, `depature`, `guestId`, `PitchId`) VALUES ('" +
						reservation.get_arrival().GetSQLDate() + "', '" +
						reservation.get_depature().GetSQLDate() + "', '" +
						reservation.get_guest().get_idNumber()+"', '" +
						reservation.get_pitch().getId() + "');";
		DataBaseController.ExecuteQuery(query);
	}
}
