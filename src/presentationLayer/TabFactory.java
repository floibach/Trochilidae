package presentationLayer;

import helpers.MyString;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;

import businessTier.User.UserRole;

import entities.MyDate;
import entities.MyTab;
import entities.Equipment.Equipment;
import entities.Equipment.Equipments;
import entities.Guest.Address;
import entities.Guest.Guest;
import entities.Guest.Guests;
import entities.PitchArea.Area;
import entities.PitchArea.Areas;
import entities.PitchArea.Pitch;
import entities.PitchArea.Pitches;
import entities.VehicularData.VehicularData;
import entities.VehicularData.VehicularDatas;
import entities.Reservation.Reservation;
import entities.Reservation.Reservations;

public class TabFactory 
{
	//Panel Background: .setBackground(new Color(51,153,255));
	//Panel Size: .setBounds(10, 11, 694, 430);
	
	
	private int _panelWidth = 694;
	private int _panelHeight = 430;
		
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
	JPanel myReservationPanel;
	public MyTab CreateReservation()
	{
		myReservationPanel = new JPanel();
		myReservationPanel.setLayout(null);
		myReservationPanel.add(Reservation());
		myReservationPanel.add(EditAGuest());
		myReservationPanel.add(SelectArea());
		return new MyTab(UserRole.Reception, myReservationPanel, "New Reservation");
	}
	
	private void ResetGuestValues()
	{	
		createGuestPreName.setText(MyString.Empty());
		createGuestLastName.setText(MyString.Empty());
		createGuestZipCode.setText(MyString.Empty());
		createGuestCity.setText(MyString.Empty());
		createGuestStreetNumber.setText(MyString.Empty());
		createGuestStreetName.setText(MyString.Empty());
		createGuestIdNumber.setText(MyString.Empty());
		createGuestBirthDay.setText(MyString.Empty());
		createGuestBirthMonth.setText(MyString.Empty());
		createGuestBirthYear.setText(MyString.Empty());
		
	}
	
	JPanel editGuest;
	JButton btnCancel;
	JButton btnEditGuest;
	JTextField editGuestPreName;
	JTextField editGuestLastName;
	JTextField editGuestZipCode;
	JTextField editGuestCity;
	JTextField editGuestStreetNumber;
	JTextField editGuestStreetName;
	JTextField editGuestIdNumber;
	JTextField editGuestBirthDay;
	JTextField editGuestBirthMonth;
	JTextField editGuestBirthYear;
	JComboBox<String> editGuestEquipment;
	JComboBox<String> editGuestVehicularData;
	private JPanel EditAGuest()
	{
		editGuest = new JPanel();
		editGuest.setVisible(false);
		editGuest.setBounds(0, 0, 694, 430);	
		editGuest.setLayout(null);
		editGuest.setBackground(new Color(51,153,255));
		
		JLabel lblName = new JLabel("Prename*");
		lblName.setBounds(10, 11, 70, 14);
		editGuest.add(lblName);
		
		editGuestPreName = new JTextField();
		editGuestPreName.setBounds(180, 8, 273, 20);
		editGuest.add(editGuestPreName);
		editGuestPreName.setColumns(10);
		
		editGuestLastName = new JTextField();
		editGuestLastName.setBounds(180, 39, 273, 20);
		editGuest.add(editGuestLastName);
		editGuestLastName.setColumns(10);
		
		JLabel lblLastname = new JLabel("Lastname*");
		lblLastname.setBounds(10, 42, 70, 14);
		editGuest.add(lblLastname);
		
		editGuestZipCode = new JTextField();
		editGuestZipCode.setBounds(180, 67, 58, 20);
		editGuest.add(editGuestZipCode);
		editGuestZipCode.setColumns(10);
		
		editGuestCity = new JTextField();
		editGuestCity.setBounds(248, 67, 205, 20);
		editGuest.add(editGuestCity);
		editGuestCity.setColumns(10);
		
		editGuestStreetNumber = new JTextField();
		editGuestStreetNumber.setBounds(421, 101, 32, 20);
		editGuest.add(editGuestStreetNumber);
		editGuestStreetNumber.setColumns(10);
		
		editGuestStreetName = new JTextField();
		editGuestStreetName.setBounds(180, 101, 231, 20);
		editGuest.add(editGuestStreetName);
		editGuestStreetName.setColumns(10);
		
		JLabel lblZipCity = new JLabel("ZIP/City");
		lblZipCity.setBounds(10, 73, 46, 14);
		editGuest.add(lblZipCity);
		
		JLabel lblStreetNo = new JLabel("Street/No.");
		lblStreetNo.setBounds(10, 104, 66, 14);
		editGuest.add(lblStreetNo);
		
		editGuestIdNumber = new JTextField();
		editGuestIdNumber.setBounds(180, 132, 273, 20);
		editGuest.add(editGuestIdNumber);
		editGuestIdNumber.setColumns(10);
		
		JLabel lblIdNumber = new JLabel("ID number*");
		lblIdNumber.setBounds(10, 135, 66, 14);
		editGuest.add(lblIdNumber);
		
		editGuestBirthDay = new JTextField();
		editGuestBirthDay.setBounds(178, 163, 60, 20);
		editGuest.add(editGuestBirthDay);
		editGuestBirthDay.setColumns(10);
		
		JLabel lblBirthdayddmmyyyy = new JLabel("Birthday (DD.MM.YYYY)*");
		lblBirthdayddmmyyyy.setBounds(10, 166, 140, 14);
		editGuest.add(lblBirthdayddmmyyyy);
		
		editGuestBirthMonth = new JTextField();
		editGuestBirthMonth.setBounds(250, 163, 60, 20);
		editGuest.add(editGuestBirthMonth);
		editGuestBirthMonth.setColumns(10);
		
		editGuestBirthYear = new JTextField();
		editGuestBirthYear.setBounds(320, 163, 133, 20);
		editGuest.add(editGuestBirthYear);
		editGuestBirthYear.setColumns(10);
		
		editGuestEquipment = new JComboBox<String>();
		ArrayList<Equipment> equipments = Equipments.Instance().GetEquipments();
		for(Equipment equ : equipments)
		{
			editGuestEquipment.addItem(equ.GetLabel());
		}
		editGuestEquipment.setBounds(180, 200, 273, 20);
		editGuest.add(editGuestEquipment);
		
		JLabel lblEquipment = new JLabel("Equipment");
		lblEquipment.setBounds(10, 203, 66, 14);
		editGuest.add(lblEquipment);
		
		editGuestVehicularData = new JComboBox<String>();
		ArrayList<VehicularData> vehiculars = VehicularDatas.Instance().getVehicularDatas();
		for(VehicularData v : vehiculars)
		{
			editGuestVehicularData.addItem(v.get_licensePlate());
		}
		editGuestVehicularData.setBounds(180, 231, 273, 23);
		editGuest.add(editGuestVehicularData);
		
		JButton btnAddVehicular = new JButton("Add Vehicular");
		btnAddVehicular.setBounds(460, 231, 112, 23);
		btnAddVehicular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				JOptionPane.showMessageDialog(null, "not implemented");
			}
		});
		editGuest.add(btnAddVehicular);
		
		btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				editGuest.setVisible(false);
				reservation.setVisible(true);
			}
		});
		btnCancel.setBounds(268, 277, 89, 23);
		
		btnEditGuest = new JButton("Edit");
		btnEditGuest.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				editGuest.setVisible(false);
				reservation.setVisible(true);
				Guest oldGuest = Guests.Instance().GetGuests().get(guestList.getSelectedIndex());
				
				MyDate birthdate;
				Guest newGuest;
				if(ValidateRequiredFieldsEditGuest())
				{
					try 
					{
						birthdate = new MyDate(editGuestBirthYear.getText(), editGuestBirthMonth.getText(), editGuestBirthDay.getText()); 
						int zip = 0;
						if(editGuestZipCode.getText().length() > 0)
						{
							zip = Integer.parseInt(editGuestZipCode.getText());
						}
						Address address = new Address( 	editGuestCity.getText(),zip,editGuestStreetName.getText(), 
														editGuestStreetNumber.getText());
						newGuest = new Guest(	editGuestPreName.getText(),editGuestLastName.getText(),address, 
												editGuestIdNumber.getText(),birthdate,editGuestEquipment.getSelectedIndex(), 
												editGuestVehicularData.getSelectedIndex());
						ResetGuestValues();
						Guests.Instance().UpdateGuest(oldGuest, newGuest);
						RefreshGuests();
					} 
					catch (Exception ex) 
					{
						JOptionPane.showMessageDialog(null, ex.getMessage(), "Fehler",0);
						return;
					}	
				}
			}
		});
		btnEditGuest.setBounds(360, 277, 89, 23);
		
		editGuest.add(btnCancel);
		editGuest.add(btnEditGuest);
		
		JLabel lblVehicularPlate = new JLabel("Vehicular Plate");
		lblVehicularPlate.setBounds(10, 235, 112, 14);
		editGuest.add(lblVehicularPlate);
		
		return editGuest;
	}

	JPanel areaSelection;
	private JPanel SelectArea()
	{
		areaSelection = new JPanel();
		areaSelection = new JPanel();
		areaSelection.setBounds(0,0, _panelWidth, _panelHeight);
		areaSelection.setVisible(false);
		areaSelection.setBackground(new Color(51,153,255));
		areaSelection.setLayout(null);
		
		
		
		int buttonWidth = _panelWidth   / (Areas.Instance().getAreas().size()/2);
		int buttonHeight = _panelHeight / (Areas.Instance().getAreas().size()/2);
		
		for(Area a: Areas.Instance().getAreas())
		{
			AreaButton button = new AreaButton(a);
			button.SetButtonProperties(buttonWidth, buttonHeight);
			button.addMouseListener(new MouseAdapter() 
			{
				@Override
				public void mouseClicked(MouseEvent e) 
				{
					AreaButton clickedButton = ((AreaButton)e.getComponent());
					selectedArea = clickedButton.GetArea().get_areaId();
					myReservationPanel.add(SelectPitch());
					pitchSelection.setVisible(true);
					areaSelection.setVisible(false);
				}
			});
			areaSelection.add(button);
		}
		
		return areaSelection;
	}
	
	JPanel pitchSelection;
	ArrayList<JButton> pitchButtons;
	int selectedArea = 0;
	private JPanel SelectPitch()
	{
		pitchSelection = new JPanel();
		pitchSelection.setBounds(0,0, _panelWidth, _panelHeight);
		pitchSelection.setVisible(false);
		pitchSelection.setBackground(new Color(51,153,255));
		pitchSelection.setLayout(null);
		
		int buttonWidth = _panelWidth / 10;
		int buttonHeight = _panelHeight/10;
		pitchButtons = new ArrayList<JButton>();
		
		for(Pitch p : Pitches.Instance().getPitches())
		{
			if(p.get_area() == selectedArea)
			{
				PitchButton button = new PitchButton(p);
				button.SetButtonProperties(buttonWidth, buttonHeight);
				button.addMouseListener(new MouseAdapter() 
				{
					@Override
					public void mouseClicked(MouseEvent e) 
					{
						PitchButton clickedButton = ((PitchButton)e.getComponent());
						if(clickedButton.GetPitch().is_isOccupied())
						{
							JOptionPane.showMessageDialog(null, "pitch already taken");
							return;
						}
						pitchSelection.setVisible(false);
						reservation.setVisible(true);
						selectedPitches.SetPitch(clickedButton.GetPitch());
					}
				});
				pitchButtons.add(button);
			}
		}
		
		for(JButton b : pitchButtons)
		{
			pitchSelection.add(b);
		}
		
		return pitchSelection;
	}
	
	private void RefreshGuests()
	{
		guestList.removeAllItems();
		ArrayList<Guest> guests = Guests.Instance().GetGuests();
		for(Guest g : guests)
		{
			guestList.addItem(g.get_idNumber());
		}
	}
	
	private PitchTextField selectedPitches;
	private JTextField arrivalDay;
	private JTextField endDay;
	private JTextField arrivalMonth;
	private JTextField arrivalYear;
	private JTextField endMonth;
	private JTextField endYear;
	private JPanel reservation;
	private JLabel lblGuest;
	private JComboBox<String> guestList;
	private JLabel lblBegin;
	private JLabel lblEnd;
	private JLabel lblPitch;
	private JButton btnSafe;
	private JButton btnEdit;
	private JPanel Reservation()
	{
		reservation = new JPanel();
		reservation.setVisible(true);
		reservation.setBounds(0, 0, 694, 430);
		reservation.setBackground(new Color(51,153,255));
		reservation.setLayout(null);
		
		lblGuest = new JLabel("Guest ");
		lblGuest.setBounds(10, 11, 46, 14);
		reservation.add(lblGuest);
		
		guestList = new JComboBox<String>();
		guestList.setBounds(180, 8, 272, 20);
		guestList.addPopupMenuListener(new PopupMenuListener() 
		{
			public void popupMenuCanceled(PopupMenuEvent arg0) 
			{
			}
			public void popupMenuWillBecomeInvisible(PopupMenuEvent arg0) 
			{
			}
			public void popupMenuWillBecomeVisible(PopupMenuEvent arg0) 
			{
				RefreshGuests();
			}
		});
		RefreshGuests();
		reservation.add(guestList);
		
		lblBegin = new JLabel("Begin (DD.MM.YYYY)");
		lblBegin.setBounds(10, 76, 200, 14);
		reservation.add(lblBegin);
		
		lblEnd = new JLabel("End (DD.MM.YYYY)");
		lblEnd.setBounds(10, 107, 200, 14);
		reservation.add(lblEnd);
		
		lblPitch = new JLabel("Pitch");
		lblPitch.setBounds(10, 138, 79, 14);
		reservation.add(lblPitch);
		
		selectedPitches = new PitchTextField();
		selectedPitches.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				reservation.setVisible(false);
				areaSelection.setVisible(true);
			}
		});
		selectedPitches.setBounds(180, 135, 272, 20);
		reservation.add(selectedPitches);
		selectedPitches.setColumns(10);
		
		arrivalDay = new JTextField();
		arrivalDay.setBounds(180, 73, 60, 20);
		reservation.add(arrivalDay);
		arrivalDay.setColumns(10);
		
		endDay = new JTextField();
		endDay.setBounds(180, 104, 60, 20);
		reservation.add(endDay);
		endDay.setColumns(10);
				
		
		
		btnEdit = new JButton("edit");
		btnEdit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				reservation.setVisible(false);
				editGuest.setVisible(true);
				int index = guestList.getSelectedIndex();
				Guest guest = Guests.Instance().GetGuests().get(index);
				
				editGuestPreName.setText(guest.get_preName());
				editGuestLastName.setText(guest.get_lastName());
				editGuestZipCode.setText(guest.getAddress().get_zip()+"");
				editGuestCity.setText(guest.getAddress().get_city());
				editGuestStreetNumber.setText(guest.getAddress().get_streetNumber());
				editGuestStreetName.setText(guest.getAddress().get_street());
				editGuestIdNumber.setText(guest.get_idNumber());
				editGuestBirthDay.setText(guest.get_birthDay().getDay()+"");
				editGuestBirthMonth.setText(guest.get_birthDay().getMonth()+"");
				editGuestBirthYear.setText(guest.get_birthDay().getYear()+"");
				editGuestEquipment.setSelectedIndex(guest.get_equipment());
				editGuestVehicularData.setSelectedIndex(guest.get_vehicular());
			}
		});
		btnEdit.setBounds(363, 39, 89, 23);
		reservation.add(btnEdit);
		
		arrivalMonth = new JTextField();
		arrivalMonth.setBounds(250, 73, 60, 20);
		reservation.add(arrivalMonth);
		arrivalMonth.setColumns(10);
		
		arrivalYear = new JTextField();
		arrivalYear.setBounds(320, 73, 132, 20);
		reservation.add(arrivalYear);
		arrivalYear.setColumns(10);
		
		endMonth = new JTextField();
		endMonth.setBounds(250, 104, 60, 20);
		reservation.add(endMonth);
		endMonth.setColumns(10);
		
		endYear = new JTextField();
		endYear.setBounds(320, 104, 132, 20);
		reservation.add(endYear);
		endYear.setColumns(10);
		
		btnSafe = new JButton("Safe");
		btnSafe.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(ValidateReservation())
				{
					try 
					{
						int aYear = Integer.parseInt(arrivalYear.getText()+"");
						int aMonth = Integer.parseInt(arrivalMonth.getText());
						int aDay = Integer.parseInt(arrivalDay.getText());
						int dYear = Integer.parseInt(endYear.getText());
						int dMonth = Integer.parseInt(endMonth.getText());
						int dDay = Integer.parseInt(endDay.getText());
						
						MyDate arrival = new MyDate(aYear, aMonth, aDay);
						MyDate depature = new MyDate(dYear,dMonth, dDay);
						
						Reservation r= new Reservation(	Guests.Instance().GetGuests().get(guestList.getSelectedIndex()),
														selectedPitches.GetPitch(),
														arrival,
														depature);
						Reservations.Instance().SafeReservation(r);
						selectedPitches.GetPitch().OccupyPitch();
						JOptionPane.showMessageDialog(null, "success");
					} 
					catch (Exception e1) 
					{
						e1.printStackTrace();
					}
				}
			}
		});
		btnSafe.setBounds(363, 166, 89, 23);
		reservation.add(btnSafe);
		
		return reservation;
	}
	
	private boolean ValidateReservation()
	{
		if( selectedPitches.getText().equals(MyString.Empty()))
		{
			return false;
		}
		if( arrivalDay.getText().equals(MyString.Empty()))
		{
			return false;
		}
		if( endDay.getText().equals(MyString.Empty()))
		{
			return false;
		}
		if( arrivalMonth.getText().equals(MyString.Empty()))
		{
			return false;
		}
		if( arrivalYear.getText().equals(MyString.Empty()))
		{
			return false;
		}
		if( endMonth.getText().equals(MyString.Empty()))
		{
			return false;
		}
		if( endYear.getText().equals(MyString.Empty()))
		{
			return false;
		}
		
		return true;
	}
	

	JPanel createTheGuest;
	public MyTab CreateGuests()
	{
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		panel.add(CreateGuest());
		return new MyTab(UserRole.Reception, panel, "Create Guest");
	}
	
	private boolean ValidateRequiredFieldsEditGuest()
	{
		if(editGuestPreName.getText().equals(MyString.Empty()))
		{
			JOptionPane.showMessageDialog(null, "Prename is required", "Fehler",0);
			return false;
		}
		
		if(editGuestLastName.getText().equals(MyString.Empty()))
		{
			JOptionPane.showMessageDialog(null, "Lastname is required", "Fehler",0);
			return false;
		}
		
		if(editGuestIdNumber.getText().equals(MyString.Empty()))
		{
			JOptionPane.showMessageDialog(null, "ID number is required", "Fehler",0);
			return false;
		}
		
		if(		editGuestBirthYear.getText().equals(MyString.Empty()) | 
				editGuestBirthMonth.getText().equals(MyString.Empty()) | 
				editGuestBirthDay.getText().equals(MyString.Empty()))
		{
			JOptionPane.showMessageDialog(null, "Birthday is required", "Fehler",0);
			return false;
		}
		return true;
	}
	
	private boolean ValidateRequiredFieldsCreateGuest()
	{
		if(createGuestPreName.getText().equals(MyString.Empty()))
		{
			JOptionPane.showMessageDialog(null, "Prename is required", "Fehler",0);
			return false;
		}
		
		if(createGuestLastName.getText().equals(MyString.Empty()))
		{
			JOptionPane.showMessageDialog(null, "Lastname is required", "Fehler",0);
			return false;
		}
		
		if(createGuestIdNumber.getText().equals(MyString.Empty()))
		{
			JOptionPane.showMessageDialog(null, "ID number is required", "Fehler",0);
			return false;
		}
		
		if(createGuestBirthYear.getText().equals(MyString.Empty()) | createGuestBirthMonth.getText().equals(MyString.Empty()) | createGuestBirthDay.getText().equals(MyString.Empty()))
		{
			JOptionPane.showMessageDialog(null, "Birthday is required", "Fehler",0);
			return false;
		}
		return true;
	}
	
	
	
	JPanel createGuest;
	JTextField createGuestPreName;
	JTextField createGuestLastName;
	JTextField createGuestZipCode;
	JTextField createGuestCity;
	JTextField createGuestStreetNumber;
	JTextField createGuestStreetName;
	JTextField createGuestIdNumber;
	JTextField createGuestBirthDay;
	JTextField createGuestBirthMonth;
	JTextField createGuestBirthYear;
	JComboBox<String> createGuestEquipment;
	JComboBox<String> createGuestVehicularData;
	private JPanel CreateGuest()
	{
		createGuest = new JPanel();
		createGuest.setVisible(true);
		createGuest.setBounds(0, 0, 694, 430);	
		createGuest.setLayout(null);
		createGuest.setBackground(new Color(51,153,255));
		
		JLabel lblName = new JLabel("Prename*");
		lblName.setBounds(10, 11, 70, 14);
		createGuest.add(lblName);
		
		createGuestPreName = new JTextField();
		createGuestPreName.setBounds(180, 8, 273, 20);
		createGuest.add(createGuestPreName);
		createGuestPreName.setColumns(10);
		
		createGuestLastName = new JTextField();
		createGuestLastName.setBounds(180, 39, 273, 20);
		createGuest.add(createGuestLastName);
		createGuestLastName.setColumns(10);
		
		JLabel lblLastname = new JLabel("Lastname*");
		lblLastname.setBounds(10, 42, 70, 14);
		createGuest.add(lblLastname);
		
		createGuestZipCode = new JTextField();
		createGuestZipCode.setBounds(180, 67, 58, 20);
		createGuest.add(createGuestZipCode);
		createGuestZipCode.setColumns(10);
		
		createGuestCity = new JTextField();
		createGuestCity.setBounds(248, 67, 205, 20);
		createGuest.add(createGuestCity);
		createGuestCity.setColumns(10);
		
		createGuestStreetNumber = new JTextField();
		createGuestStreetNumber.setBounds(421, 101, 32, 20);
		createGuest.add(createGuestStreetNumber);
		createGuestStreetNumber.setColumns(10);
		
		createGuestStreetName = new JTextField();
		createGuestStreetName.setBounds(180, 101, 231, 20);
		createGuest.add(createGuestStreetName);
		createGuestStreetName.setColumns(10);
		
		JLabel lblZipCity = new JLabel("ZIP/City");
		lblZipCity.setBounds(10, 73, 46, 14);
		createGuest.add(lblZipCity);
		
		JLabel lblStreetNo = new JLabel("Street/No.");
		lblStreetNo.setBounds(10, 104, 66, 14);
		createGuest.add(lblStreetNo);
		
		createGuestIdNumber = new JTextField();
		createGuestIdNumber.setBounds(180, 132, 273, 20);
		createGuest.add(createGuestIdNumber);
		createGuestIdNumber.setColumns(10);
		
		JLabel lblIdNumber = new JLabel("ID number*");
		lblIdNumber.setBounds(10, 135, 66, 14);
		createGuest.add(lblIdNumber);
		
		createGuestBirthDay = new JTextField();
		createGuestBirthDay.setBounds(178, 163, 60, 20);
		createGuest.add(createGuestBirthDay);
		createGuestBirthDay.setColumns(10);
		
		JLabel lblBirthdayddmmyyyy = new JLabel("Birthday (DD.MM.YYYY)*");
		lblBirthdayddmmyyyy.setBounds(10, 166, 140, 14);
		createGuest.add(lblBirthdayddmmyyyy);
		
		createGuestBirthMonth = new JTextField();
		createGuestBirthMonth.setBounds(250, 163, 60, 20);
		createGuest.add(createGuestBirthMonth);
		createGuestBirthMonth.setColumns(10);
		
		createGuestBirthYear = new JTextField();
		createGuestBirthYear.setBounds(320, 163, 133, 20);
		createGuest.add(createGuestBirthYear);
		createGuestBirthYear.setColumns(10);
		
		createGuestEquipment = new JComboBox<String>();
		ArrayList<Equipment> equipments = Equipments.Instance().GetEquipments();
		for(Equipment equ : equipments)
		{
			createGuestEquipment.addItem(equ.GetLabel());
		}
		createGuestEquipment.setBounds(180, 200, 273, 20);
		createGuest.add(createGuestEquipment);
		
		JLabel lblEquipment = new JLabel("Equipment");
		lblEquipment.setBounds(10, 203, 66, 14);
		createGuest.add(lblEquipment);
		
		createGuestVehicularData = new JComboBox<String>();
		ArrayList<VehicularData> vehiculars = VehicularDatas.Instance().getVehicularDatas();
		for(VehicularData v : vehiculars)
		{
			createGuestVehicularData.addItem(v.get_licensePlate());
		}
		createGuestVehicularData.setBounds(180, 231, 273, 23);
		createGuest.add(createGuestVehicularData);
		
		JButton btnAddVehicular = new JButton("Add Vehicular");
		btnAddVehicular.setBounds(460, 231, 112, 23);
		btnAddVehicular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				JOptionPane.showMessageDialog(null, "not implemented");
			}
		});
		createGuest.add(btnAddVehicular);
		
		JButton safe = new JButton("Safe");
		safe.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				MyDate birthdate;
				
				if(ValidateRequiredFieldsCreateGuest())
				{
					try 
					{
						birthdate = new MyDate(createGuestBirthYear.getText(), createGuestBirthMonth.getText(), createGuestBirthDay.getText()); 
						int zip = 0;
						if(createGuestZipCode.getText().length() > 0)
						{
							zip = Integer.parseInt(createGuestZipCode.getText());
						}
						Address address = new Address( createGuestCity.getText(),zip,createGuestStreetName.getText(), createGuestStreetNumber.getText());
						Guest newGuest =  new Guest(	createGuestPreName.getText(),createGuestLastName.getText(),address, 
														createGuestIdNumber.getText(), birthdate,createGuestEquipment.getSelectedIndex(), 
														createGuestVehicularData.getSelectedIndex());
						Guests.Instance().AddGuest(newGuest);;
						ResetGuestValues();
						RefreshGuests();
						JOptionPane.showMessageDialog(null, "Success");
					} 
					catch (Exception e) 
					{
						JOptionPane.showMessageDialog(null, e.getMessage(), "Fehler",0);
					}	
				}
			}
		});
		safe.setBounds(480, 300, 89, 23);
		createGuest.add(safe);
		
		JLabel lblVehicularPlate = new JLabel("Vehicular Plate");
		lblVehicularPlate.setBounds(10, 235, 112, 14);
		createGuest.add(lblVehicularPlate);
		
		return createGuest;
	}
}
