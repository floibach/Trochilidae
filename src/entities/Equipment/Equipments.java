package entities.Equipment;

import java.util.ArrayList;

import dataTier.EquipmentAdministration;

public class Equipments 
{	
	private ArrayList<Equipment> _equipments;

	private Equipments()
	{		
		_equipments = EquipmentAdministration.GetEquipments();
	}
	
	private static Equipments _instance;
	public static Equipments Instance()
	{
		if(null == _instance)
		{
			_instance = new Equipments();
		}
		return _instance;
	}
	
	public ArrayList<Equipment> GetEquipments()
	{
		return _equipments;
	}
}
