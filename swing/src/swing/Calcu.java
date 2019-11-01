package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JList;

public class Calcu {

	private JFrame frame;
	private JTextField textField;
	double num1;
	double num2;
	double result;
	String op;
	String ans;
	double USA=67.00;
	double China=23.00;
	double Nepal=34.00;
	double England=58.00;
	
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calcu window = new Calcu();
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
	public Calcu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * 
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 901, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmStandard = new JMenuItem("Standard");
		mntmStandard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setBounds(0, 0, 310, 20);
				frame.setBounds(100, 100, 337, 400);
				
			}
		});
		mnFile.add(mntmStandard);
		
		JMenuItem mntmScientific = new JMenuItem("Scientific");
		mntmScientific.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setBounds(100, 100, 628, 400);
				textField.setBounds(0, 0, 576, 20);
			}
		});
		mnFile.add(mntmScientific);
		
		JMenuItem mntmUnitConversion = new JMenuItem("Unit Conversion");
		mntmUnitConversion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setBounds(100, 100, 894, 400);
			}
		});
		mnFile.add(mntmUnitConversion);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame=new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame,"Confirm","Exit",JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION) {
			System.exit(0);
				}
			}
		});
		mnFile.add(mntmExit);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(0, 0, 576, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("<-");
		btnNewButton.setBounds(10, 31, 50, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("7");
		button.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				String number7=textField.getText()+button.getText();
				textField.setText(number7);

				
			}
		});
		button.setBounds(10, 72, 50, 23);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("2");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number2=textField.getText()+button_1.getText();
				textField.setText(number2);
			}
		});
		button_1.setBounds(75, 142, 50, 23);
		frame.getContentPane().add(button_1);
		
		JButton button_3 = new JButton("4");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number4=textField.getText()+button_3.getText();
				textField.setText(number4);
			}
		});
		button_3.setBounds(10, 106, 50, 23);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("1");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number1=textField.getText()+button_4.getText();
				textField.setText(number1);
			}
		});
		button_4.setBounds(10, 142, 50, 23);
		frame.getContentPane().add(button_4);
		
		JButton btnNewButton_1 = new JButton("5");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number5=textField.getText()+btnNewButton_1.getText();
				textField.setText(number5);
			}
			
		});
		btnNewButton_1.setBounds(75, 108, 50, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("8");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number8=textField.getText()+btnNewButton_2.getText();
				textField.setText(number8);
			}
		});
		btnNewButton_2.setBounds(76, 72, 49, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("CE");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String b="";
				if(textField.getText().length()>0)
				{
					StringBuilder strB=new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length()-1);
					b=strB.toString();
					textField.setText(b);
				}
			}
		});
		btnNewButton_3.setBounds(76, 31, 50, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("C");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btnNewButton_4.setBounds(136, 31, 49, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton button_2 = new JButton("9");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number9=textField.getText()+button_2.getText();
				textField.setText(number9);
			}
		});
		button_2.setBounds(135, 72, 49, 23);
		frame.getContentPane().add(button_2);
		
		JButton button_5 = new JButton("6");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number6=textField.getText()+button_5.getText();
				textField.setText(number6);
				
			}
		});
		button_5.setBounds(136, 106, 49, 23);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("3");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number3=textField.getText()+button_6.getText();
				textField.setText(number3);
			}
		});
		button_6.setBounds(136, 142, 49, 23);
		frame.getContentPane().add(button_6);
		
		JButton btnNewButton_5 = new JButton("0");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number0=textField.getText()+btnNewButton_5.getText();
				textField.setText(number0);
			}
		});
		btnNewButton_5.setBounds(10, 176, 115, 23);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton button_7 = new JButton(".");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String dot=textField.getText()+button_7.getText();
				textField.setText(dot);
				
			}
		});
		button_7.setBounds(136, 176, 49, 23);
		frame.getContentPane().add(button_7);
		
		JButton btnNewButton_6 = new JButton("+/-");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				num1=(num1-1.800);
				textField.setText(String.valueOf(num1));
			}
		});
		btnNewButton_6.setBounds(194, 31, 50, 23);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton button_8 = new JButton("/");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="/";
			}
			
		});
		button_8.setBounds(195, 72, 49, 23);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("*");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="*";
			}
		});
		button_9.setBounds(195, 106, 49, 23);
		frame.getContentPane().add(button_9);
		
		JButton btnNewButton_7 = new JButton("=");
		btnNewButton_7.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String ans;
				num2=Double.parseDouble(textField.getText());
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
				if(op=="/")
				{
				result=num1/num2;
				ans=String.format("%.2f", result);
				textField.setText(ans);
				}
				if(op=="*")
				{
				result=num1*num2;
				ans=String.format("%.2f", result);
				textField.setText(ans);
				}
				if(op=="%")
				{
				result=num1%num2;
				ans=String.format("%.2f", result);
				textField.setText(ans);
				}
                if(op=="cbr")
                {
                	result=(num1%num2)/100;
                	ans=String.format("%.2f", result);
    				textField.setText(ans);
                }


			}
			
		});
		btnNewButton_7.setBounds(254, 143, 65, 56);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnSqrt = new JButton("sqrt");
		btnSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				result=Math.sqrt(num1);
				ans=String.format("%.2f", result);
				textField.setText(ans);
			}
			
		});
		btnSqrt.setBounds(254, 31, 65, 23);
		frame.getContentPane().add(btnSqrt);
		
		JButton button_11 = new JButton("%");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="%";
			}
		});
		button_11.setBounds(254, 72, 65, 23);
		frame.getContentPane().add(button_11);
		
		JButton btnx = new JButton("1/x");
		btnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				result=(1/num1);
				ans=String.format("%.2f", result);
				textField.setText(ans);
				
			}
		});
		btnx.setBounds(254, 106, 65, 23);
		frame.getContentPane().add(btnx);
		
		JButton button_13 = new JButton("+");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="+";
			}
		});
		button_13.setBounds(195, 176, 49, 23);
		frame.getContentPane().add(button_13);
		
		JButton button_14 = new JButton("-");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="-";
			}
		});
		button_14.setBounds(195, 142, 49, 23);
		frame.getContentPane().add(button_14);
		
		JButton btnL = new JButton("L");
		btnL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
			    result=Math.log(num1);
			    String ans=String.format("%.2f",result);
			    textField.setText(ans);
				
			}
		});
		btnL.setBounds(329, 31, 59, 23);
		frame.getContentPane().add(btnL);
		
		JButton btnPi = new JButton("pi");
		btnPi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
			    result=num1*3.14;
			    String ans=String.format("%.2f",result);
			    textField.setText(ans);
			}
		});
		btnPi.setBounds(329, 72, 59, 23);
		frame.getContentPane().add(btnPi);
		
		JButton btnXy = new JButton("x^y");
		btnXy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				result=Math.pow(num1,num2);
				textField.setText(String.valueOf(result));
			}
		});
		btnXy.setBounds(329, 106, 59, 23);
		frame.getContentPane().add(btnXy);
		
		JButton btnX_1 = new JButton("x^2");
		btnX_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				num1=Math.pow(num1,num2);
				textField.setText(String.valueOf(num1));
			}
		});
		btnX_1.setBounds(329, 142, 59, 23);
		frame.getContentPane().add(btnX_1);
		
		JButton btnX = new JButton("x^3");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				num1=Math.pow(num1,3);
				textField.setText(String.valueOf(num1));
				
			}
		});
		btnX.setBounds(329, 176, 59, 23);
		frame.getContentPane().add(btnX);
		
		
				JButton btnsin = new JButton("Sin");
		        btnsin.addActionListener(new ActionListener() {
		            public void actionPerformed(ActionEvent e) {
		                num1=Double.parseDouble(textField.getText());
		                num1=Math.sin(num1);
		                textField.setText(String.valueOf(num1));
			}
		});
		btnsin.setBounds(398, 31, 59, 23);
		frame.getContentPane().add(btnsin);
		
		JButton btnCos = new JButton("Cos");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                num1=Math.cos(num1);
                textField.setText(String.valueOf(num1));
			}
		});
		btnCos.setBounds(398, 72, 59, 23);
		frame.getContentPane().add(btnCos);
		
		JButton btnTan = new JButton("Tan");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                num1=Math.tan(num1);
                textField.setText(String.valueOf(num1));
			}
	});
		btnTan.setBounds(398, 106, 59, 23);
		frame.getContentPane().add(btnTan);
		
		JButton btnCbr = new JButton("Cbr");
		btnCbr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				num1=Double.parseDouble(textField.getText());
				result=((num1/num2)*100);
                textField.setText(String.valueOf(result));

				}
		});
		btnCbr.setBounds(398, 142, 59, 23);
		frame.getContentPane().add(btnCbr);
		
		JButton btnBin = new JButton("Bin");
		btnBin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(textField.getText());
                textField.setText(Integer .toBinaryString(a));

			}
		});
		btnBin.setBounds(398, 176, 59, 23);
		frame.getContentPane().add(btnBin);
		
		JButton btnSinh = new JButton("Sinh");
		btnSinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				num1=Math.sinh(num1);
				 textField.setText(String.valueOf(num1));
			}
		});
		btnSinh.setBounds(467, 31, 67, 23);
		frame.getContentPane().add(btnSinh);
		
		JButton btnCosh = new JButton("Cosh");
		btnCosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				num1=Math.cosh(num1);
				 textField.setText(String.valueOf(num1));
			}
		});
		btnCosh.setBounds(467, 72, 67, 23);
		frame.getContentPane().add(btnCosh);
		
		JButton btnTanh = new JButton("Tanh");
		btnTanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				num1=Math.tanh(num1);
				 textField.setText(String.valueOf(num1));
			}
		});
		btnTanh.setBounds(467, 106, 67, 23);
		frame.getContentPane().add(btnTanh);
		
		JButton btnRund = new JButton("Rund");
		btnRund.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				num1=Math.round(num1);
				textField.setText(String.valueOf(num1));

			}
		});
		btnRund.setBounds(467, 142, 67, 23);
		frame.getContentPane().add(btnRund);
		
		JButton btnHex = new JButton("Hex");
		btnHex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(textField.getText());
                textField.setText(Integer .toHexString(a));
			}
		});
		btnHex.setBounds(467, 176, 65, 23);
		frame.getContentPane().add(btnHex);
		
		JButton btnNewButton_8 = new JButton("Mod");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="%";
			}
		});
		btnNewButton_8.setBounds(544, 31, 65, 23);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnInx = new JButton("lnx");
		btnInx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
			    result=Math.log(num1)/10;
			    String ans=String.format("%.2f",result);
			    textField.setText(ans);
			}
		});
		btnInx.setBounds(544, 72, 65, 23);
		frame.getContentPane().add(btnInx);
		
		JButton btnC = new JButton("C");
		btnC.setBounds(544, 106, 65, 23);
		frame.getContentPane().add(btnC);
		
		JButton btnpie = new JButton("2*pie");
		btnpie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
			    result=2*num1*3.14;
			    String ans=String.format("%.2f",result);
			    textField.setText(ans);

				
			}
		});
		btnpie.setBounds(544, 142, 65, 23);
		frame.getContentPane().add(btnpie);
		
		JButton btnOc = new JButton("Oc");
		btnOc.setBounds(544, 176, 65, 23);
		frame.getContentPane().add(btnOc);
		
		JPanel panel = new JPanel();
		panel.setBounds(619, 31, 255, 168);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblCurrencyConverter = new JLabel("Currency Converter");
		lblCurrencyConverter.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblCurrencyConverter.setBounds(69, 11, 162, 14);
		panel.add(lblCurrencyConverter);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"USA", "England", "China", "Nepal"}));
		comboBox.setBounds(60, 36, 171, 20);
		panel.add(comboBox);
		
		textField_1 = new JTextField();
		textField_1.setBounds(57, 67, 171, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setBounds(57, 98, 171, 14);
		panel.add(label);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double bp=Double.parseDouble(textField_1.getText());
				if(comboBox.getSelectedItem().equals("USA"));
				{
				String c=String.format("Rs%.2f",bp*USA);
				label.setText(c);
				}
				if(comboBox.getSelectedItem().equals("China"));
				{
				String c=String.format("Rs%.2f",bp*China);
				label.setText(c);
				}
				if(comboBox.getSelectedItem().equals("Nepal"));
				{
				String c=String.format("Rs%.2f",bp*Nepal);
				label.setText(c);
				}
				if(comboBox.getSelectedItem().equals("England"));
				{
				String c=String.format("Rs%.2f",bp*England);
				label.setText(c);
				}
				
			}
		});
		btnConvert.setBounds(37, 134, 106, 23);
		panel.add(btnConvert);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText("");
				textField_1.setText("");
			}
		});
		btnClear.setBounds(153, 134, 106, 23);
		panel.add(btnClear);
		
		JList list = new JList();
		list.setBounds(175, 340, 1, 1);
		frame.getContentPane().add(list);
	}
		}	
