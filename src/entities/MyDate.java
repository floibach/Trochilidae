package entities;

public class MyDate 
{
	private int _year;
	private int _month;
	private int _day;
	
	public MyDate(String year, String month, String day) throws Exception
	{
		if(Validate(month, day))
		{
			_year = Integer.parseInt(year);
			_month = Integer.parseInt(month);
			_day = Integer.parseInt(day);
			return;
		}
		throw new Exception("Hallo");
	}
	
	public MyDate(String date) throws Exception
	{
		String year = date.substring(0, 4);
		String month = date.substring(5, 7);
		String day = date.substring(8, 10);
		
		if(Validate(month, day))
		{
			_year = Integer.parseInt(year);
			_month = Integer.parseInt(month);
			_day = Integer.parseInt(day);
			return;
		}
		throw new Exception("Hallo");
	}
	
	public MyDate(int year, int month, int day) throws Exception
	{
		if(Validate(month, day))
		{
			_year = year;
			_month = month;
			_day = day;
			return;
		}
		throw new Exception("Hallaao");	
	}
	
	private boolean Validate(String month, String day)
	{
		return Validate(Integer.parseInt(month), Integer.parseInt(day));
	}
	
	//TODO: bei Zeit aktualisieren
	private boolean Validate(int month, int day)
	{
		if(month < 1)
		{
			return false;
		}
		
		if(month > 12)
		{
			return false;
		}
		
		if(day < 1)
		{
			return false;
		}
		
		if(month == 2)
		{
			if(day > 28)
			{
				return false;
			}
		}
		if(month == 1 | month == 3 | month == 5 | month == 7 | month == 8 | month == 10 | month == 12)
		{
			if(day > 31)
			{
				return false;
			}
		}
		
		
		
		return true;
	}

	
	public int getYear() 
	{
		return _year;
	}

	public int getMonth() 
	{
		return _month;
	}

	public int getDay() 
	{
		return _day;
	}
	
	public String GetSQLDate()
	{
		String date = _year + "-" + _month + "-" + _day+" 00:00:00";
		return date;
	}
	
	
}
