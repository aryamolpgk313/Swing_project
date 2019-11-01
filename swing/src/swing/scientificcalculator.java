package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class scientificcalculator {

	private JFrame frame;
	private JTextField textField;
	double num1;
	double num2;
	double result;
	String op;
	String ans;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					scientificcalculator window = new scientificcalculator();
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
	public scientificcalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 465, 311);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 18, 429, 31);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblEdit = new JLabel("Edit");
		lblEdit.setBounds(10, 2, 46, 14);
		frame.getContentPane().add(lblEdit);
		
		JLabel lblView = new JLabel("View");
		lblView.setBounds(40, 2, 46, 14);
		frame.getContentPane().add(lblView);
		
		JLabel lblNewLabel = new JLabel("Help");
		lblNewLabel.setBounds(73, 2, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 69, 206, 193);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(0, 11, 64, 33);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(59, 11, 72, 33);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(141, 11, 66, 33);
		panel.add(btnNewButton_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(226, 69, 213, 193);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton button_3 = new JButton("7");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number1=textField.getText()+button_3.getText();
				textField.setText(number1);
			}
			
		});
		button_3.setBounds(0, 11, 49, 34);
		panel_1.add(button_3);
		
		JButton button_4 = new JButton("8");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number1=textField.getText()+button_4.getText();
				textField.setText(number1);
			}
		});
		button_4.setBounds(59, 11, 39, 34);
		panel_1.add(button_4);
		
		JButton button_5 = new JButton("9");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number1=textField.getText()+button_5.getText();
				textField.setText(number1);
			}
		});
		button_5.setBounds(103, 12, 51, 34);
		panel_1.add(button_5);
		
		JButton button_6 = new JButton("/");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number1=textField.getText()+button_6.getText();
				textField.setText(number1);
			}
		});
		button_6.setBounds(164, 11, 51, 34);
		panel_1.add(button_6);
		
		JButton button_7 = new JButton("4");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number1=textField.getText()+button_7.getText();
				textField.setText(number1);
			}
		});
		button_7.setBounds(10, 51, 39, 34);
		panel_1.add(button_7);
		
		JButton button_8 = new JButton("5");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number1=textField.getText()+button_8.getText();
				textField.setText(number1);
			}
		});
		button_8.setBounds(53, 51, 39, 34);
		panel_1.add(button_8);
		
		JButton button_9 = new JButton("6");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number1=textField.getText()+button_9.getText();
				textField.setText(number1);
			}
		});
		button_9.setBounds(103, 51, 39, 34);
		panel_1.add(button_9);
		
		JButton button_10 = new JButton("*");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number1=textField.getText()+button_10.getText();
				textField.setText(number1);
				
			}
		});
		button_10.setBounds(152, 51, 39, 34);
		panel_1.add(button_10);
		
		JButton button_11 = new JButton("1");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number1=textField.getText()+button_11.getText();
				textField.setText(number1);
			}
		});
		button_11.setBounds(10, 96, 39, 34);
		panel_1.add(button_11);
		
		JButton button_12 = new JButton("2");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number1=textField.getText()+button_12.getText();
				textField.setText(number1);
			}
		});
		button_12.setBounds(54, 96, 40, 34);
		panel_1.add(button_12);
		
		JButton button_13 = new JButton("3");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number1=textField.getText()+button_13.getText();
				textField.setText(number1);
			}
		});
		button_13.setBounds(103, 96, 39, 34);
		panel_1.add(button_13);
		
		JButton button_14 = new JButton("-");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number1=textField.getText()+button_14.getText();
				textField.setText(number1);
			}
		});
		button_14.setBounds(152, 96, 39, 34);
		panel_1.add(button_14);
		
		JButton button_15 = new JButton("0");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number1=textField.getText()+button_15.getText();
				textField.setText(number1);
			}
		});
		button_15.setBounds(10, 141, 39, 34);
		panel_1.add(button_15);
		
		JButton button_16 = new JButton(".");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number1=textField.getText()+button_16.getText();
				textField.setText(number1);
			}
		});
		button_16.setBounds(54, 141, 39, 34);
		panel_1.add(button_16);
		
		JButton button_17 = new JButton("=");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number1=textField.getText()+button_17.getText();
				textField.setText(number1);
			}
		});
		button_17.setBounds(97, 141, 58, 34);
		panel_1.add(button_17);
		
		JButton button_18 = new JButton("+");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number1=textField.getText()+button_18.getText();
				textField.setText(number1);
			}
		});
		button_18.setBounds(162, 141, 41, 34);
		panel_1.add(button_18);
		
		JLabel lblScientific = new JLabel("Scientific");
		lblScientific.setBounds(20, 54, 46, 14);
		frame.getContentPane().add(lblScientific);
		
		JLabel lblStandard = new JLabel("Standard");
		lblStandard.setBounds(226, 54, 46, 14);
		frame.getContentPane().add(lblStandard);
	}
}
