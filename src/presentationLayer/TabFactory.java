package presentationLayer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import businessTier.User.UserRole;

import entities.MyTab;
import entities.Equipment.Equipment;
import entities.Equipment.Equipments;

public class TabFactory 
{
	
	
	public MyTab CreateSearchTab()
	{
		JPanel panel = new JPanel();
		
		return new MyTab(UserRole.Invisible, panel, "Search");
	}
	
	public MyTab CreateArea()
	{
		JPanel panel = new JPanel();
		return new MyTab(UserRole.Reception, panel, "SelectArea");
	}
	
	public MyTab CreateReservation()
	{
		JPanel panel = new JPanel();
		return new MyTab(UserRole.Reception, panel, "New Reservation");
	}
	
	public MyTab CreatePitch()
	{
		JPanel panel = new JPanel();
		return new MyTab(UserRole.Invisible, panel, "Pitch");
	}
	
	public MyTab EditGuest()
	{
		JPanel panel = new JPanel();
		return new MyTab(UserRole.Invisible, panel, "EditGuest");
	}
	
	//TODO: return type panel und 2 Panels kombinieren
	public MyTab CreateGuestTab()
	{
		final JPanel createGuest = new JPanel();
		JTextField preName;
		JTextField lastName;
		JTextField zipCode;
		JTextField city;
		JTextField streetNumber;
		JTextField streetName;
		JTextField idNumber;
		JTextField birthDay;
		JTextField birthMonth;
		JTextField birthYear;
		
		final JPanel test1 = new JPanel();
		JLabel lblNameTest = new JLabel("Prename");
		lblNameTest.setBounds(10, 11, 46, 25);
		test1.add(lblNameTest);
		
		
		createGuest.setLayout(null);
		
		JButton safe = new JButton("Safe");
		safe.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				
			}
		});
		safe.setBounds(480, 300, 89, 23);
		createGuest.add(safe);
		
		JLabel lblName = new JLabel("Prename");
		lblName.setBounds(10, 11, 70, 14);
		createGuest.add(lblName);
		
		preName = new JTextField();
		preName.setBounds(180, 8, 273, 20);
		createGuest.add(preName);
		preName.setColumns(10);
		
		lastName = new JTextField();
		lastName.setBounds(180, 39, 273, 20);
		createGuest.add(lastName);
		lastName.setColumns(10);
		
		JLabel lblLastname = new JLabel("Lastname");
		lblLastname.setBounds(10, 42, 70, 14);
		createGuest.add(lblLastname);
		
		zipCode = new JTextField();
		zipCode.setBounds(180, 67, 58, 20);
		createGuest.add(zipCode);
		zipCode.setColumns(10);
		
		city = new JTextField();
		city.setBounds(248, 67, 205, 20);
		createGuest.add(city);
		city.setColumns(10);
		
		streetNumber = new JTextField();
		streetNumber.setBounds(421, 101, 32, 20);
		createGuest.add(streetNumber);
		streetNumber.setColumns(10);
		
		streetName = new JTextField();
		streetName.setBounds(180, 101, 231, 20);
		createGuest.add(streetName);
		streetName.setColumns(10);
		
		JLabel lblZipCity = new JLabel("ZIP/City");
		lblZipCity.setBounds(10, 73, 46, 14);
		createGuest.add(lblZipCity);
		
		JLabel lblStreetNo = new JLabel("Street/No.");
		lblStreetNo.setBounds(10, 104, 66, 14);
		createGuest.add(lblStreetNo);
		
		idNumber = new JTextField();
		idNumber.setBounds(180, 132, 273, 20);
		createGuest.add(idNumber);
		idNumber.setColumns(10);
		
		JLabel lblIdNumber = new JLabel("ID number");
		lblIdNumber.setBounds(10, 135, 66, 14);
		createGuest.add(lblIdNumber);
		
		birthDay = new JTextField();
		birthDay.setBounds(178, 163, 60, 20);
		createGuest.add(birthDay);
		birthDay.setColumns(10);
		
		JLabel lblBirthdayddmmyyyy = new JLabel("Birthday (DD.MM.YYYY)");
		lblBirthdayddmmyyyy.setBounds(10, 166, 140, 14);
		createGuest.add(lblBirthdayddmmyyyy);
		
		birthMonth = new JTextField();
		birthMonth.setBounds(250, 163, 60, 20);
		createGuest.add(birthMonth);
		birthMonth.setColumns(10);
		
		birthYear = new JTextField();
		birthYear.setBounds(320, 163, 133, 20);
		createGuest.add(birthYear);
		birthYear.setColumns(10);
		
		JComboBox<String> equipment = new JComboBox<String>();
		ArrayList<Equipment> equipments = Equipments.Instance().GetEquipments();
		for(Equipment equ : equipments)
		{
			equipment.addItem(equ.GetLabel());
		}
		equipment.setBounds(180, 200, 273, 20);
		createGuest.add(equipment);
		
		JLabel lblEquipment = new JLabel("Equipment");
		lblEquipment.setBounds(10, 203, 66, 14);
		createGuest.add(lblEquipment);
		
		return new MyTab(UserRole.Reception, createGuest, "Create Guest");
	}
}
