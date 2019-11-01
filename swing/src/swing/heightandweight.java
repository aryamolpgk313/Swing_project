package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class heightandweight {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	double height;
	double weight;
	double result1;
	double result2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					heightandweight window = new heightandweight();
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
	public heightandweight() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblHelp = new JLabel("Help");
		lblHelp.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblHelp.setBounds(10, 10, 45, 14);
		frame.getContentPane().add(lblHelp);
		
		JLabel lblAbout = new JLabel("About");
		lblAbout.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAbout.setBounds(50, 11, 46, 14);
		frame.getContentPane().add(lblAbout);
		
		JLabel lblUsMeasurement = new JLabel("US Measurement");
		lblUsMeasurement.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblUsMeasurement.setBounds(105, 77, 117, 14);
		frame.getContentPane().add(lblUsMeasurement);
		
		JLabel lblHeight = new JLabel("Height");
		lblHeight.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblHeight.setBounds(39, 110, 46, 14);
		frame.getContentPane().add(lblHeight);
		
		
		
		textField = new JTextField();
		textField.setText("");
		textField.setBounds(105, 105, 139, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblWeight = new JLabel("Weight");
		lblWeight.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblWeight.setBounds(39, 148, 46, 14);
		frame.getContentPane().add(lblWeight);
		
		textField_1 = new JTextField();
		textField_1.setText("");
		textField_1.setBounds(105, 145, 139, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		JLabel label1= new JLabel("");
		label1.setBounds(292, 149, 46, 14);
		frame.getContentPane().add(label1);
		
		JLabel label2 = new JLabel("");
		label2.setBounds(292, 110, 46, 14);
		frame.getContentPane().add(label2);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				height=Double.parseDouble(textField.getText());
				weight=Double.parseDouble(textField_1.getText());
				result1=height*.296;
				String ans1=String.format("%.02f",result1);
				label2.setText(ans1);
				result2=weight*0.45359237;
				String ans2=String.format("%.2f",result2);
				
				label1.setText(ans2);
			}
		});
		btnOk.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnOk.setBounds(92, 208, 89, 23);
		frame.getContentPane().add(btnOk);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCancel.setBounds(195, 208, 89, 23);
		frame.getContentPane().add(btnCancel);
		
		JLabel lblMetric = new JLabel("Metric");
		lblMetric.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblMetric.setBounds(292, 77, 46, 14);
		frame.getContentPane().add(lblMetric);
		
		
	}
}
