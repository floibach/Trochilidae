package presentationLayer;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;

import entities.MyTab;

import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;

import businessTier.SessionControl;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TabCreator {

	private JFrame frame;
	private ArrayList<MyTab> _tabs;
	private JTabbedPane _tabbedPane;
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenuItem mntmLogoff;
	private JMenuItem mntmRefresh;


	//	/**
//	 * Launch the application.
	//TODO: Remove Main Methode
//	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TabCreator window = new TabCreator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TabCreator() 
	{
		initialize();
		frame.setVisible(true);
		FillPanels();
		MakeTabsVisible();
	}

	private void MakeTabsVisible()
	{
		for(MyTab tab : _tabs)
		{
			//if(SessionControl.Instance().getUser().getUserRole()==tab.GetUserRole())
			{
				_tabbedPane.addTab("Create Guest",null, tab.GetPanel(), null);
			}
		}
	}
	
	private void FillPanels()
	{
		_tabs = new ArrayList<MyTab>();
		TabFactory tabFactory = new TabFactory();
		
		_tabs.add(tabFactory.CreateGuests());
	}


	private void initialize() 
	{
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 700, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setIconImage(new ImageIcon("./Lib/ico.png").getImage());
		
		_tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		_tabbedPane.setBounds(0, 22, 694, 430);
		frame.getContentPane().add(_tabbedPane);
				
		menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 694, 21);
		frame.getContentPane().add(menuBar);
		
		mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		mntmRefresh = new JMenuItem("Refresh");
		mnFile.add(mntmRefresh);
		
		mntmLogoff = new JMenuItem("Logoff");
		mntmLogoff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				SessionControl.Instance().Logout();
				frame.setVisible(false);
				new Login();
			}
		});
		mnFile.add(mntmLogoff);
		
		///////
		
	}
}
