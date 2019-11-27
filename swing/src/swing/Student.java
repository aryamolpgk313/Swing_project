package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Student {

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
	private JTextField textField_12;
	private JTextField textField_13;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Student window = new Student();
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
	public Student() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 900, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 11, 598, 424);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblStudentid = new JLabel("Student_ID");
		lblStudentid.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblStudentid.setBounds(10, 43, 84, 14);
		panel.add(lblStudentid);
		
		textField = new JTextField();
		textField.setBounds(116, 37, 129, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblFirstname = new JLabel("Firstname");
		lblFirstname.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblFirstname.setBounds(10, 88, 84, 14);
		panel.add(lblFirstname);
		
		textField_1 = new JTextField();
		textField_1.setBounds(116, 86, 129, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblSurname = new JLabel("Surname");
		lblSurname.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSurname.setBounds(10, 133, 84, 14);
		panel.add(lblSurname);
		
		textField_2 = new JTextField();
		textField_2.setBounds(116, 131, 129, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Course Code");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(10, 173, 84, 14);
		panel.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"CS456","EC234", "SD435", "VG738", "DF778", "VB653", "VF564", "GH68"}));
		comboBox.setBounds(116, 171, 129, 20);
		panel.add(comboBox);
		
		JLabel lblTotalScore = new JLabel("Total Score");
		lblTotalScore.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTotalScore.setBounds(10, 262, 84, 14);
		panel.add(lblTotalScore);
		
		textField_3 = new JTextField();
		textField_3.setBounds(114, 260, 131, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Ranking");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(10, 348, 84, 18);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Average");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(10, 308, 84, 20);
		panel.add(lblNewLabel_2);
		
		textField_4 = new JTextField();
		textField_4.setBounds(116, 306, 129, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(116, 346, 129, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblMaths = new JLabel("Maths");
		lblMaths.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblMaths.setBounds(295, 44, 46, 14);
		panel.add(lblMaths);
		
		textField_6 = new JTextField();
		textField_6.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char num=evt.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    evt.consume();
                }
			}
		});
		textField_6.setBounds(384, 41, 129, 20);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblEnglish = new JLabel("English");
		lblEnglish.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEnglish.setBounds(295, 89, 46, 14);
		panel.add(lblEnglish);
		
		textField_7 = new JTextField();
		textField_7.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char num=evt.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    evt.consume();
                }
			}
		});
		textField_7.setBounds(384, 86, 129, 20);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblBiology = new JLabel("Biology");
		lblBiology.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblBiology.setBounds(295, 132, 59, 17);
		panel.add(lblBiology);
		
		textField_8 = new JTextField();
		textField_8.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char num=evt.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    evt.consume();
			}
			}
		});
		textField_8.setBounds(384, 131, 129, 20);
		panel.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblComputer = new JLabel("Computer");
		lblComputer.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblComputer.setBounds(295, 174, 75, 14);
		panel.add(lblComputer);
		
		textField_9 = new JTextField();
		textField_9.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char num=evt.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    evt.consume();
                }
			}
		});
		textField_9.setBounds(384, 171, 129, 20);
		panel.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblChemistry = new JLabel("Chemistry");
		lblChemistry.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblChemistry.setBounds(295, 216, 75, 14);
		panel.add(lblChemistry);
		
		textField_10 = new JTextField();
		textField_10.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char num=evt.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    evt.consume();
			}
			}
		});
		textField_10.setBounds(383, 214, 130, 20);
		panel.add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblPhysics = new JLabel("Physics");
		lblPhysics.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPhysics.setBounds(295, 262, 67, 14);
		panel.add(lblPhysics);
		
		textField_11 = new JTextField();
		textField_11.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char num=evt.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    evt.consume();
			}
			}
		});
		textField_11.setBounds(384, 260, 129, 20);
		panel.add(textField_11);
		textField_11.setColumns(10);
		
		JLabel lblTamil = new JLabel("Tamil");
		lblTamil.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTamil.setBounds(295, 308, 46, 14);
		panel.add(lblTamil);
		
		textField_12 = new JTextField();
		textField_12.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char num=evt.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    evt.consume();
			}
			}
		});
		textField_12.setBounds(384, 306, 129, 20);
		panel.add(textField_12);
		textField_12.setColumns(10);
		
		JLabel lblMalayalam = new JLabel("Malayalam");
		lblMalayalam.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblMalayalam.setBounds(295, 349, 75, 14);
		panel.add(lblMalayalam);
		
		textField_13 = new JTextField();
		textField_13.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char num=evt.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    evt.consume();
                }
			}
		});
		textField_13.setBounds(384, 346, 129, 20);
		panel.add(textField_13);
		textField_13.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(623, 11, 251, 424);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(0, 0, 241, 373);
		panel_1.add(textArea);
		
		JButton btnClear = new JButton("    Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnClear.setBounds(63, 384, 89, 23);
		panel_1.add(btnClear);
		
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.DARK_GRAY);
		panel_2.setBounds(10, 446, 874, 98);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		/*table = new JTable();
		table.setBounds(351, 5, 0, 0);
		panel_2.add(table);*/
		
		table_1 = new JTable();
		table_1.setBounds(10, 11, 854, 64);
		panel_2.add(table_1);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"Student_ID", "Course Code", "Maths", "English", "Biology", "Computer", "Chemistry", "Physics", "Tamil", "Malayalam", "Total Score", "Average", "Ranking"},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		
		JButton button = new JButton("Add Report");
		button.setBounds(60, 22, 112, 23);
		panel_2.add(button);
		button.setForeground(Color.GREEN);
		button.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.DARK_GRAY);
		panel_3.setBounds(0, 555, 864, 125);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JButton button_1 = new JButton("Add Report");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a[]=new double[20];
				a[0]=Double.parseDouble(textField_6.getText());
				a[1]=Double.parseDouble(textField_7.getText());
				a[2]=Double.parseDouble(textField_8.getText());
				a[3]=Double.parseDouble(textField_9.getText());
				a[4]=Double.parseDouble(textField_10.getText());
				a[5]=Double.parseDouble(textField_11.getText());
				a[6]=Double.parseDouble(textField_12.getText());
				a[7]=Double.parseDouble(textField_13.getText());
				a[8]=(a[0]+a[1]+a[2]+a[3]+a[4]+a[5]+a[6]+a[7]);
				a[9]=(a[0]+a[1]+a[2]+a[3]+a[4]+a[5]+a[6]+a[7])/8;
				String total=String.format("%.2f",a[8]);
				textField_3.setText(total);
				String avg=String.format("%.2f",a[9]);
				textField_4.setText(avg);
				if(a[8]>700)
				{
					textField_5.setText("1");
				}
				else if(a[8]>600&&a[8]<700)
				{
					textField_5.setText("2");
				}
				else if(a[8]<600&&a[8]>500) {
					textField_5.setText("3");
					}
				else if(a[8]<500&&a[8]>400) {
					textField_5.setText("5");
					}
				else {
					textField_5.setText("6");
				}
			    
				DefaultTableModel model=(DefaultTableModel) table_1.getModel();
				model.addRow(new String[] {
				textField.getText(),
				(String)comboBox.getSelectedItem(),
				textField_6.getText(),
				textField_7.getText(),
				textField_8.getText(),
				textField_9.getText(),
				textField_10.getText(),
				textField_11.getText(),
				textField_12.getText(),
				textField_13.getText(),
				textField_3.getText(),
				textField_4.getText(),
				textField_5.getText(),
									
		});
			
			
		    
			}
		});
		button_1.setForeground(Color.GREEN);
		button_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_1.setBounds(77, 39, 112, 23);
		panel_3.add(button_1);
		
		JButton button_2 = new JButton("Delete");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				DefaultTableModel model=(DefaultTableModel)table_1.getModel();
				int row=table_1.getSelectedRow();
		          model.removeRow(row);
				
			}
		});
		button_2.setForeground(Color.RED);
		button_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_2.setBounds(226, 39, 112, 23);
		panel_3.add(button_2);
		
		JButton button_3 = new JButton("Show Report");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("Student Record\n"
			    +"Student Name:\t\t"+textField_1.getText()+" "+textField_2.getText()
				+"\nMaths:\t\t"+textField_6.getText()
				+"\nEnglish:\t\t"+textField_7.getText()
				+"\nBiology:\t\t"+textField_8.getText()
				+"\nComputer:\t\t"+textField_9.getText()
				+"\nChemistry:\t\t"+textField_10.getText()
				+"\nPhysics:\t\t"+textField_11.getText()
				+"\nTamil:\t\t"+textField_12.getText()
				+"\nMalayalam:\t\t"+textField_13.getText()
				+"\n================================================================="
				+"\nTotal:\t\t"+textField_3.getText()
				+"\nAverage:\t\t"+textField_4.getText()
				+"\nRanking:\t\t"+textField_5.getText()
				
				
				
						
						);
				
			}			
			});
		button_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_3.setBounds(373, 39, 117, 23);
		panel_3.add(button_3);
		
		JButton button_4 = new JButton("Exit");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame=new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame,"Confirm","Exit",JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION) {
			System.exit(0);			}
			}
		});
		button_4.setForeground(Color.RED);
		button_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_4.setBackground(Color.LIGHT_GRAY);
		button_4.setBounds(549, 39, 89, 23);
		panel_3.add(button_4);
		
		JButton button_5 = new JButton("Reset");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
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
				textField_12.setText("");
				textField_13.setText("");
			}
		});
		button_5.setForeground(Color.MAGENTA);
		button_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_5.setBounds(686, 39, 89, 23);
		panel_3.add(button_5);
			}
		}
