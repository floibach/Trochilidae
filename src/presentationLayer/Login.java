package presentationLayer;

import helpers.CharArray;

import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

import businessTier.SessionControl;

public class Login {

	private JFrame frame;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(51, 153, 255));
		frame.setBounds(100, 100, 339, 213);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		final TextField userName = new TextField();
		userName.setBounds(91, 52, 225, 22);
		frame.getContentPane().add(userName);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(21, 60, 46, 14);
		frame.getContentPane().add(lblName);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(21, 118, 66, 14);
		frame.getContentPane().add(lblPassword);
		
		Button button = new Button("Login");
		button.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				if(null == SessionControl.Instance().getUser())
				{
					JOptionPane.showMessageDialog(null, "d","Hallo", JOptionPane.PLAIN_MESSAGE);
				}
				
				SessionControl.Login(userName.getText(), CharArray.ToString(password.getPassword()));
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
		password.setBounds(91, 114, 225, 22);
		frame.getContentPane().add(password);
	}
}
