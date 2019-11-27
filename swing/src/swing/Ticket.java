package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;

public class Ticket {

	private JFrame frame;
	private JTextField txtTick;
	private JTextField textField;
	private JCheckBox chckbxSingleTicket;
	private JCheckBox chckbxAdult;
	private JCheckBox chckbxFirstClass;
	private JCheckBox chckbxAc;
	private JCheckBox chckbxSleeper;
	private JCheckBox chckbxChild;
	private JSeparator separator;
	private JSeparator separator_1;
	private JLabel lblTax;
	private JTextField textField_1;
	private JLabel lblSubTotal;
	private JTextField textField_2;
	private JLabel lblTotal;
	private JTextField textField_3;
	private JSeparator separator_2;
	private JPanel panel;
	private JLabel lblName;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTable table;
	private JLabel lblTicketDetails;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ticket window = new Ticket();
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
	public Ticket() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 13));
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtTick = new JTextField();
		txtTick.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtTick.setText("   Ticket Booking");
		txtTick.setBounds(343, 11, 156, 32);
		frame.getContentPane().add(txtTick);
		txtTick.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBounds(10, 67, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(103, 66, 99, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Standard");
		chckbxNewCheckBox.setBounds(6, 104, 88, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		chckbxSingleTicket = new JCheckBox("single  Ticket");
		chckbxSingleTicket.setBounds(96, 104, 106, 23);
		frame.getContentPane().add(chckbxSingleTicket);
		
		chckbxAdult = new JCheckBox("Adult");
		chckbxAdult.setBounds(231, 104, 97, 23);
		frame.getContentPane().add(chckbxAdult);
		
		chckbxFirstClass = new JCheckBox("First Class");
		chckbxFirstClass.setBounds(6, 151, 89, 23);
		frame.getContentPane().add(chckbxFirstClass);
		
		chckbxAc = new JCheckBox("AC");
		chckbxAc.setBounds(97, 151, 53, 23);
		frame.getContentPane().add(chckbxAc);
		
		chckbxSleeper = new JCheckBox("Sleeper");
		chckbxSleeper.setBounds(146, 151, 68, 23);
		frame.getContentPane().add(chckbxSleeper);
		
		chckbxChild = new JCheckBox("Child");
		chckbxChild.setBounds(231, 151, 97, 23);
		frame.getContentPane().add(chckbxChild);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Andra Pradesh", "Kerala", "Arunachal Pradesh", "Tamil Nadu", "Delhi"}));
		comboBox.setBounds(10, 200, 75, 20);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Andra Pradesh", "Kerala", "Arunachal Pradesh", "Tamil Nadu", "Delhi"}));
		comboBox_1.setBounds(103, 200, 75, 20);
		frame.getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		comboBox_2.setBounds(201, 200, 75, 20);
		frame.getContentPane().add(comboBox_2);
		
		separator = new JSeparator();
		separator.setBounds(10, 92, 266, 2);
		frame.getContentPane().add(separator);
		
		separator_1 = new JSeparator();
		separator_1.setBounds(10, 247, 266, 2);
		frame.getContentPane().add(separator_1);
		
		lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTax.setBounds(10, 277, 46, 14);
		frame.getContentPane().add(lblTax);
		
		textField_1 = new JTextField();
		textField_1.setBounds(103, 275, 99, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSubTotal.setBounds(10, 317, 58, 14);
		frame.getContentPane().add(lblSubTotal);
		
		textField_2 = new JTextField();
		textField_2.setBounds(103, 315, 99, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTotal.setBounds(10, 355, 58, 14);
		frame.getContentPane().add(lblTotal);
		
		textField_3 = new JTextField();
		textField_3.setBounds(103, 353, 99, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		separator_2 = new JSeparator();
		separator_2.setBounds(10, 380, 266, 2);
		frame.getContentPane().add(separator_2);
		
		panel = new JPanel();
		panel.setBounds(318, 54, 435, 372);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		lblName = new JLabel("Name");
		lblName.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblName.setBounds(20, 46, 46, 14);
		panel.add(lblName);
		
		textField_4 = new JTextField();
		textField_4.setBounds(81, 44, 117, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblFrom = new JLabel("From");
		lblFrom.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblFrom.setBounds(20, 96, 46, 14);
		panel.add(lblFrom);
		
		textField_5 = new JTextField();
		textField_5.setBounds(94, 93, 105, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblTo.setBounds(20, 142, 46, 14);
		panel.add(lblTo);
		
		textField_6 = new JTextField();
		textField_6.setBounds(94, 139, 105, 20);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblDate.setBounds(20, 182, 46, 14);
		panel.add(lblDate);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblTime.setBounds(20, 226, 46, 14);
		panel.add(lblTime);
		
		textField_7 = new JTextField();
		textField_7.setBounds(94, 179, 105, 20);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(94, 223, 105, 20);
		panel.add(textField_8);
		
		JLabel lblTicketNo = new JLabel("Ticket No");
		lblTicketNo.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblTicketNo.setBounds(276, 86, 73, 14);
		panel.add(lblTicketNo);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(261, 111, 105, 20);
		panel.add(textField_9);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblPrice.setBounds(283, 142, 46, 14);
		panel.add(lblPrice);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(261, 167, 105, 20);
		panel.add(textField_10);
		
		JLabel lblRoute = new JLabel("Route");
		lblRoute.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblRoute.setBounds(283, 198, 46, 14);
		panel.add(lblRoute);
		
		textField_11 = new JTextField();
		textField_11.setBounds(261, 223, 105, 20);
		panel.add(textField_11);
		textField_11.setColumns(10);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String v="";
				if(chckbxAc.isSelected())
				{
					v="AC";
				}
				else
				{
					v="Non-AC";
				}
				
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				model.addRow(new String[] {
						textField.getText(),
						textField_9.getText(),
						(String)comboBox.getSelectedItem(),
						(String)comboBox_1.getSelectedItem(),
						(String)comboBox_2.getSelectedItem(),
						textField_8.getText(),
						textField_7.getText(),
                          v,
						textField_10.getText(),
				});
				
			}
		});
		btnConfirm.setBounds(164, 288, 105, 33);
		panel.add(btnConfirm);
		
		lblTicketDetails = new JLabel("Ticket Details");
		lblTicketDetails.setBounds(164, 11, 122, 14);
		panel.add(lblTicketDetails);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textField_4.setText(textField.getText());
				textField_5.setText((String) comboBox.getSelectedItem());
				textField_6.setText((String) comboBox_1.getSelectedItem());
			
				Calendar timer=Calendar.getInstance();
                timer.getTime();
                SimpleDateFormat tTime=new SimpleDateFormat("HH:mm:ss");
                textField_8.setText(tTime.format(timer.getTime()));
                
                SimpleDateFormat tdate= new SimpleDateFormat("dd-MMM-yyyy");
                textField_7.setText(tdate.format(timer.getTime()));
                int num =1;
                String route="";
                num=1325+(int)(Math.random()*4238);
				route+=num+1325;
				textField_9.setText(route);
				textField_11.setText("Any");
				double t=0,tx=0,total=0;
				String sub="",tax="",tot="";
				if(chckbxAc.isSelected())
				{
					t=t+500;
					tx=tx+200;
				}
				else {
					t=t+300;
					tx=tx+100;
				}
				if(chckbxSingleTicket.isSelected())
				{
					t=t+500;
				}
				else {
					t=t+300;
				}
				if(chckbxSleeper.isSelected())
				{
				   t=t+500;
				}
				else {
					t=t+300;
				}
				 String text=(String)comboBox_2.getSelectedItem();
				 int b=Integer.parseInt(text);
		         tax=tax+tx;
		         t=t*b;
		         sub=sub+t;	 
		         total=t+tx;
		         tot=tot+total;
		       textField_1.setText(tax);
		       textField_2.setText(sub);
		       textField_3.setText(tot);
		       
		       textField_10.setText(textField_3.getText());
			}
		});
		btnTotal.setBounds(10, 409, 89, 23);
		frame.getContentPane().add(btnTotal);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				chckbxNewCheckBox.setSelected(false);
				chckbxSingleTicket.setSelected(false);
				chckbxAdult.setSelected(false);
				chckbxFirstClass.setSelected(false);
				chckbxAc.setSelected(false);
				chckbxSleeper.setSelected(false);
				chckbxChild.setSelected(false);
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");
				textField_9.setText("");
				textField_10.setText("");
				textField_11.setText("");
								
			}
		});
		btnReset.setBounds(113, 409, 89, 23);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame=new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame,"Confirm","Exit",JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION) {
			System.exit(0);
			}
			}
		});
		btnExit.setBounds(219, 409, 89, 23);
		frame.getContentPane().add(btnExit);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLUE);
		panel_1.setBounds(10, 443, 743, 108);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"     Name", "  Booking No", "      From", "         To", "  No of Seats", "       Time", "       Date", " AC/NON AC", " Price"},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(10, 11, 717, 86);
		panel_1.add(table);
	}
}
