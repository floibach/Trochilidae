package presentationLayer;

import helpers.CharArray;

import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

import businessTier.SessionControl;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Login {

	private JFrame frame;
	private JPasswordField password;
	private TextField userName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					Login window = new Login();
					window.frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @wbp.parser.entryPoint
	 */
	public Login() {		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.getContentPane().setBackground(new Color(51, 153, 255));
		frame.setBounds(100, 100, 339, 213);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setIconImage(new ImageIcon("./Lib/ico.png").getImage());
		
		userName = new TextField();
		userName.setBounds(91, 52, 225, 22);
		frame.getContentPane().add(userName);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(21, 60, 46, 14);
		frame.getContentPane().add(lblName);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(21, 96, 66, 14);
		frame.getContentPane().add(lblPassword);
		
		Button button = new Button("Login");
		button.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				Validate();
			}
		});
		button.setBounds(246, 143, 70, 22);
		frame.getContentPane().add(button);
		
		JLabel lblTrochilidae = new JLabel("Trochilidae");
		lblTrochilidae.setForeground(new Color(255, 255, 255));
		lblTrochilidae.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTrochilidae.setBounds(129, 11, 111, 27);
		frame.getContentPane().add(lblTrochilidae);
		
		password = new JPasswordField();
		password.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) 
			{
				if(e.getKeyCode()==10)
				{
					Validate();
				}
			}
		});
		password.setBounds(91, 92, 225, 22);
		frame.getContentPane().add(password);
	}
	
	private void Validate()
	{
		SessionControl.Login(userName.getText(), CharArray.ToString(password.getPassword()));
		if(null == SessionControl.Instance().getUser())
		{
			JOptionPane.showMessageDialog(null, "NEIN", "Nein", 0);
		}
		if(null != SessionControl.Instance().getUser())
		{
			JOptionPane.showMessageDialog(null, "Jou", "Nein", 3);
			frame.setVisible(false);
			new TabCreator();
		}
		
	}
}
