package helpers;

import java.text.DateFormat;
import java.util.Date;

public class DateFormatter 
{
	public static String GetDate(Date date)
	{
		DateFormat formater = DateFormat.getDateTimeInstance();
		String dateStirng = formater.format(date);	
		dateStirng = dateStirng.replace(".", "-");
		return dateStirng;
	}
	
	public static Date GetDate(String year, String month, String day)
	{
		int _year = Integer.parseInt(year);
		int _month = Integer.parseInt(month);
		int _day = Integer.parseInt(day);
		
		
		@SuppressWarnings("deprecation")
		Date date = new Date(_year,_month,_day);
		
		return date;
	}
}
