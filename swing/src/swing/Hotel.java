package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Hotel {

	protected static final String String = null;
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	String ans;
	String op;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hotel window = new Hotel();
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
	public Hotel() {
				initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblHotelManagementSystem = new JLabel("Hotel Management System");
		lblHotelManagementSystem.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblHotelManagementSystem.setBounds(185, 11, 249, 24);
		frame.getContentPane().add(lblHotelManagementSystem);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 56, 365, 281);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblChickenBurger = new JLabel("Chicken Burger");
		lblChickenBurger.setBounds(20, 26, 103, 14);
		panel.add(lblChickenBurger);
		
		textField = new JTextField();
		textField.setBounds(154, 23, 133, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblChickenBurgerMeal = new JLabel("Chicken Burger Meal");
		lblChickenBurgerMeal.setBounds(20, 68, 103, 14);
		panel.add(lblChickenBurgerMeal);
		
		textField_1 = new JTextField();
		textField_1.setBounds(154, 65, 133, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblChjeeseBurger = new JLabel("Cheese Burger");
		lblChjeeseBurger.setBounds(20, 106, 103, 14);
		panel.add(lblChjeeseBurger);
		
		textField_2 = new JTextField();
		textField_2.setBounds(153, 103, 134, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(20, 157, 282, 2);
		panel.add(separator);
		
		JLabel lblDrink = new JLabel("Drink");
		lblDrink.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblDrink.setBounds(20, 175, 61, 14);
		panel.add(lblDrink);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"tea", "coffee"}));
		comboBox.setBounds(20, 200, 103, 20);
		panel.add(comboBox);
		
		JLabel lblQty = new JLabel("Qty");
		lblQty.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblQty.setBounds(211, 175, 46, 14);
		panel.add(lblQty);
		
		JCheckBox chckbxHomeDelivery = new JCheckBox("Home Delivery");
		chckbxHomeDelivery.setBounds(20, 238, 97, 23);
		panel.add(chckbxHomeDelivery);
		
		JCheckBox chckbxTax = new JCheckBox("Tax");
		chckbxTax.setBounds(190, 238, 97, 23);
		panel.add(chckbxTax);
		
		textField_11 = new JTextField();
		textField_11.setBounds(154, 200, 133, 20);
		panel.add(textField_11);
		textField_11.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 348, 365, 133);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblCostOfDrinks = new JLabel("Cost of Drinks");
		lblCostOfDrinks.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCostOfDrinks.setBounds(10, 11, 99, 14);
		panel_1.add(lblCostOfDrinks);
		
		JLabel lblNewLabel = new JLabel("Cost of Meal");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(10, 46, 87, 14);
		panel_1.add(lblNewLabel);
		
		JLabel lblYofDelie = new JLabel("Cost of Delivery");
		lblYofDelie.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblYofDelie.setBounds(10, 81, 99, 14);
		panel_1.add(lblYofDelie);
		
		textField_3 = new JTextField();
		textField_3.setBounds(156, 9, 132, 20);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(156, 46, 132, 20);
		panel_1.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(156, 79, 132, 20);
		panel_1.add(textField_5);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(397, 56, 277, 281);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblCurrencyConverter = new JLabel("Currency Converter");
		lblCurrencyConverter.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCurrencyConverter.setBounds(76, 21, 153, 14);
		panel_2.add(lblCurrencyConverter);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"USA", "China", "Nepal", "England"}));
		comboBox_2.setBounds(39, 71, 204, 20);
		panel_2.add(comboBox_2);
		
		textField_6 = new JTextField();
		textField_6.setBounds(39, 135, 204, 20);
		panel_2.add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double USA=67.00;
				double China=23.00;
				double Nepal=34.00;
				double England=58.00;

				double bp=Double.parseDouble(textField_9.getText());
				if(comboBox_2.getSelectedItem().equals("USA"));
				{
				String c=String.format("Rs%.2f",bp*USA);
				textField_6.setText(c);
				}
				if(comboBox.getSelectedItem().equals("China"));
				{
				String c=String.format("Rs%.2f",bp*China);
				textField_6.setText(c);
				}
				if(comboBox.getSelectedItem().equals("Nepal"));
				{
				String c=String.format("Rs%.2f",bp*Nepal);
				textField_6.setText(c);
				}
				if(comboBox.getSelectedItem().equals("England"));
				{
				String c=String.format("Rs%.2f",bp*England);
				textField_6.setText(c);
				}
				
			}
		});
		btnConvert.setBounds(27, 197, 89, 23);
		panel_2.add(btnConvert);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_6.setText(null);
			}
		});
		btnClose.setBounds(164, 197, 89, 23);
		panel_2.add(btnClose);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(397, 348, 277, 121);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTax.setBounds(10, 11, 46, 14);
		panel_3.add(lblTax);
		
		JLabel lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSubTotal.setBounds(10, 48, 76, 14);
		panel_3.add(lblSubTotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTotal.setBounds(10, 84, 46, 14);
		panel_3.add(lblTotal);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(123, 9, 132, 20);
		panel_3.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(123, 46, 132, 20);
		panel_3.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(123, 82, 132, 20);
		panel_3.add(textField_9);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(961, 56, -265, 413);
		frame.getContentPane().add(tabbedPane);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(684, 56, 267, 413);
		frame.getContentPane().add(tabbedPane_1);
		
		JPanel panel_4 = new JPanel();
		tabbedPane_1.addTab("Calculator", null, panel_4, null);
		panel_4.setLayout(null);
		
		textField_10 = new JTextField();
		textField_10.setBounds(10, 23, 242, 63);
		panel_4.add(textField_10);
		textField_10.setColumns(10);
		
		JButton btnB = new JButton("B");
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String b=null;
				if(textField.getText().length()>0)
				{
					StringBuilder strB=new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length()-1);
					b=strB.toString();
					textField.setText(b);
				}
			}
			
		});
		btnB.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnB.setBounds(10, 97, 59, 47);
		panel_4.add(btnB);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1=(int) Double.parseDouble(textField.getText());
				textField.setText("");
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnC.setBounds(71, 97, 59, 47);
		panel_4.add(btnC);
		
		JButton button = new JButton("...");
		button.setFont(new Font("Tahoma", Font.BOLD, 13));
		button.setBounds(132, 97, 59, 47);
		panel_4.add(button);
		
		JButton button_1 = new JButton("+");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				String op = "+";
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_1.setBounds(193, 97, 59, 47);
		panel_4.add(button_1);
		
		JButton button_2 = new JButton("7");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number1=textField.getText()+button_2.getText();
				textField.setText(number1);
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_2.setBounds(10, 155, 59, 43);
		panel_4.add(button_2);
		
		JButton button_3 = new JButton("8");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number1=textField.getText()+button_3.getText();
				textField.setText(number1);
			}
		});
		button_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_3.setBounds(71, 155, 59, 43);
		panel_4.add(button_3);
		
		JButton button_4 = new JButton("9");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number1=textField.getText()+button_4.getText();
				textField.setText(number1);
			}
		});
		button_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_4.setBounds(132, 155, 59, 43);
		panel_4.add(button_4);
		
		JButton button_5 = new JButton("-");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				String op = "-";
			}
		});
		button_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_5.setBounds(193, 155, 59, 43);
		panel_4.add(button_5);
		
		JButton button_6 = new JButton("4");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number1=textField.getText()+button_6.getText();
				textField.setText(number1);
			}
		});
		button_6.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_6.setBounds(10, 209, 59, 43);
		panel_4.add(button_6);
		
		JButton button_7 = new JButton("5");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number1=textField.getText()+button_7.getText();
				textField.setText(number1);
			}
		});
		button_7.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_7.setBounds(71, 209, 59, 43);
		panel_4.add(button_7);
		
		JButton button_8 = new JButton("6");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number1=textField.getText()+button_8.getText();
				textField.setText(number1);
			}
		});
		button_8.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_8.setBounds(132, 209, 59, 43);
		panel_4.add(button_8);
		
		JButton button_9 = new JButton("*");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				String op = "*";
			}
		});
		button_9.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_9.setBounds(193, 209, 59, 43);
		panel_4.add(button_9);
		
		JButton button_10 = new JButton("1");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number1=textField.getText()+button_10.getText();
				textField.setText(number1);
			}
		});
		button_10.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_10.setBounds(10, 263, 59, 43);
		panel_4.add(button_10);
		
		JButton button_11 = new JButton("2");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number1=textField.getText()+button_11.getText();
				textField.setText(number1);
			}
		});
		button_11.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_11.setBounds(71, 263, 59, 43);
		panel_4.add(button_11);
		
		JButton button_12 = new JButton("3");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number1=textField.getText()+button_12.getText();
				textField.setText(number1);
			}
		});
		button_12.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_12.setBounds(132, 263, 59, 43);
		panel_4.add(button_12);
		
		JButton button_13 = new JButton("/");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				String op = "/";
			}
		});
		button_13.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_13.setBounds(193, 263, 59, 43);
		panel_4.add(button_13);
		
		JButton button_14 = new JButton("0");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number1=textField.getText()+button_14.getText();
				textField.setText(number1);
			}
		});
		button_14.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_14.setBounds(10, 317, 59, 43);
		panel_4.add(button_14);
		
		JButton button_15 = new JButton(".");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number1=textField.getText()+button_15.getText();
				textField.setText(number1);
			}
		});
		button_15.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_15.setBounds(71, 317, 59, 43);
		panel_4.add(button_15);
		
		JButton button_16 = new JButton("00");
		button_16.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_16.setBounds(132, 317, 59, 43);
		panel_4.add(button_16);
		
		JButton button_17 = new JButton("=");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double num2 = Double.parseDouble(textField.getText());
				Object result;
				double num1 = 0;
				
				
				if(op=="+")
				{
				result=num1+num2;
				ans=String.format("%.2f", result);
				textField.setText(ans);
				}
				if(op=="-")
				{
				result=num1-num2;
				ans=String.format("%.2f", result);
				textField.setText(ans);
				}
				if(op=="*")
				{
				result=num1*num2;
				ans=String.format("%.2f", result);
				textField.setText(ans);
				}
				if(op=="/")
				{
				result=num1/num2;
				ans=String.format("%.2f", result);
				textField.setText(ans);
				}
				if(op=="%")
				{
				result=num1%num2;
				ans=String.format("%.2f", result);
				textField.setText(ans);
				}
			}
		});
		button_17.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_17.setBounds(193, 317, 59, 43);
		panel_4.add(button_17);
		
		JPanel panel_5 = new JPanel();
		tabbedPane_1.addTab("New tab", null, panel_5, null);
		panel_5.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(0, 11, 252, 363);
		panel_5.add(textArea);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(10, 480, 941, 71);
		frame.getContentPane().add(panel_6);
		panel_6.setLayout(null);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ChicBurger=Double.parseDouble(textField.getText());
				double costcb=50;
				double burger=(ChicBurger*costcb);
				String cb=String.format("%.2f",burger);
				textField_4.setText(cb);
				double ChicBurgmeal=Double.parseDouble(textField_1.getText());
				double costcmb=75;
				double burgemeal=(ChicBurgmeal*costcmb);
				String cmb=String.format("%.2f",burgemeal+burger);
                textField_4.setText(cmb);
                double Cheeseburger=Double.parseDouble(textField_2.getText());
				double costchb=95;
				double burgecheese=(Cheeseburger*costchb);
				String chb=String.format("%.2f",burgecheese+burgemeal+burger);
                textField_4.setText(chb);
                
				double deliver=25;
				if(chckbxHomeDelivery.isSelected())
				{
					String hmedeliver=String.format("%.2f",deliver);
					textField_5.setText(hmedeliver);
				}
				else
				{
					textField_5.setText("0");

				}
				double drinks=Double.parseDouble(textField_11.getText());
				double tea=3*drinks;
				double coffee=4*drinks;
				if(comboBox.getSelectedItem().equals("tea"))
				{
					String ctea=String.format("%.2f",tea);
					textField_3.setText(ctea);	
				}
				if(comboBox.getSelectedItem().equals("coffee"))
				{
					String ccoffee=String.format("%.2f",coffee);
					textField_3.setText(ccoffee);	
				}
				
				
				double t1=Double.parseDouble(textField_3.getText());
				double t2=Double.parseDouble(textField_4.getText());
				double t3=Double.parseDouble(textField_5.getText());
				double total=(t1+t2+t3);
				double tax=((total*18)/100);
				if(chckbxTax.isSelected())
				{
					String ttax=String.format("%.2f",tax);
					textField_7.setText(ttax);	
				}
				double t4=Double.parseDouble(textField_7.getText());
				double subTotal=(t1+t2+t3);
				String nsubTotal=String.format("%.2f",subTotal);
				textField_8.setText(nsubTotal);
				double alltotal=(t1+t2+t3+t4);
				String ntotal=String.format("%.2f",alltotal);
				textField_9.setText(ntotal);
				String taxtotal=String.format("%.2f",t4);
				textField_7.setText(taxtotal);
				
			}
		});
		btnTotal.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnTotal.setBounds(205, 26, 89, 23);
		panel_6.add(btnTotal);
		
		JButton btnReceipt = new JButton("Receipt");
		btnReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double q1=Double.parseDouble(textField.getText());
				double q2=Double.parseDouble(textField_1.getText());
				double q3=Double.parseDouble(textField_2.getText());
				textArea.append("Restaurant Management Systems\n"
					    +"\nChicken Burger:\t"+textField.getText()
						+"\nChicken Burger Meal:\t"+textField_1.getText()
						+"\nCheese Burger:\t\t"+textField_2.getText()
						+"\n\nThanks for using Job Estimator\n"
			);
			}
			
		});
		btnReceipt.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnReceipt.setBounds(360, 26, 89, 23);
		panel_6.add(btnReceipt);
		
		JButton btnNewButton = new JButton("Reset");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(514, 27, 89, 23);
		panel_6.add(btnNewButton);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame=new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame,"Confirm","Exit",JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION) {
			System.exit(0);			}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnExit.setBounds(655, 27, 89, 23);
		panel_6.add(btnExit);
	}
}
