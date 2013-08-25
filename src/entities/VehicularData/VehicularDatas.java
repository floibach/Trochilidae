package entities.VehicularData;

import java.util.ArrayList;

import dataTier.VehicularDataAdministration;

public class VehicularDatas 
{
	private ArrayList<VehicularData> _vehicularDatas;
	
	private VehicularDatas()
	{
		_vehicularDatas = VehicularDataAdministration.GetVehicularData();
	}
	
	private static VehicularDatas _instance;
	public static VehicularDatas Instance()
	{
		if(null == _instance)
		{
			_instance = new VehicularDatas();
		}
		return _instance;
	}
	
	public ArrayList<VehicularData> getVehicularDatas() 
	{
		return _vehicularDatas;
	}
	
	public void AddGuest(VehicularData vd)
	{
		_vehicularDatas.add(vd);
		//Safe to db has not to be implemented
	}
}
