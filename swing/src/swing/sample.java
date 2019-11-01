package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JSeparator;
import javax.swing.DropMode;
import javax.swing.JProgressBar;
import javax.swing.JList;
import javax.swing.JPasswordField;
import javax.swing.JSpinner;

public class sample {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JCheckBox chckbxRemindMe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sample window = new sample();
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
	public sample() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(216, 191, 216));
		frame.getContentPane().setForeground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(46, 71, 133, -40);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(50, 205, 50));
		textField_1.setForeground(new Color(0, 0, 0));
		textField_1.setBounds(140, 27, 284, 37);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JPasswordField();
		textField_2.setBackground(new Color(233, 150, 122));
		textField_2.setBounds(140, 71, 284, 37);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setForeground(new Color(0, 0, 255));
		lblUsername.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblUsername.setBounds(56, 32, 134, 18);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(new Color(255, 0, 0));
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblPassword.setBounds(56, 77, 104, 23);
		frame.getContentPane().add(lblPassword);
		
		chckbxRemindMe = new JCheckBox("Remind Me");
		chckbxRemindMe.setBackground(new Color(244, 164, 96));
		chckbxRemindMe.setBounds(320, 115, 97, 23);
		frame.getContentPane().add(chckbxRemindMe);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(182, 172, 1, 2);
		frame.getContentPane().add(separator);
		
		JButton btnSignin = new JButton("Sign-In");
		btnSignin.setBackground(new Color(50, 205, 50));
		btnSignin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSignin.setFont(new Font("Traditional Arabic", Font.BOLD, 15));
		btnSignin.setBounds(152, 172, 133, 23);
		frame.getContentPane().add(btnSignin);
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.setBackground(new Color(255, 0, 0));
		btnSignUp.setFont(new Font("Traditional Arabic", Font.BOLD, 15));
		btnSignUp.setBounds(305, 172, 119, 23);
		frame.getContentPane().add(btnSignUp);
		
		JButton btnForgotPassword = new JButton("Forgot Password....");
		btnForgotPassword.setBackground(new Color(255, 255, 0));
		btnForgotPassword.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnForgotPassword.setBounds(232, 228, 192, 23);
		frame.getContentPane().add(btnForgotPassword);
	}
}
