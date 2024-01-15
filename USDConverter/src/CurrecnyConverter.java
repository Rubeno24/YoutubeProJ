import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CurrecnyConverter extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField;
	private JComboBox comboBox;
	private JLabel  lblNewLabel_1 ;


	public CurrecnyConverter() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 611, 602);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		contentPane.setLayout(null);
		
		
		textField = new JTextField();
		textField.setBounds(123, 243, 207, 39);
		contentPane.add(textField);
		textField.setColumns(10);
		String [] choices = {" ","Dollars to Pesos","Pesos to Dollars","Dollars to Yen","Dollars to Euros"};
		comboBox = new JComboBox(choices);
		
		comboBox.setFont(new Font("Segoe UI", Font.BOLD, 12));
		comboBox.setBounds(346, 243, 123, 39);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("Enter a Number to Convert");
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel.setBounds(151, 187, 283, 44);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_1.setBounds(251, 292, 268, 39);
		contentPane.add(lblNewLabel_1);
		comboBox.addActionListener(this);
		
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String text =  textField.getText();
		double x =Double.parseDouble(text);
		if(e.getSource()==comboBox) {
			String selected = comboBox.getSelectedItem().toString();
			if(selected.equalsIgnoreCase("Dollars to Pesos")) {
				x=x*19.65595;
				String s = Double.toString(x);
				int result = s.indexOf(".");
				String output = s.substring(0,result+3);
				lblNewLabel_1.setText(output+" Pesos");
				
			}
			else if(selected.equalsIgnoreCase("Pesos to Dollars")) {
				x=x*0.050875198;
				String s = Double.toString(x);
				int result = s.indexOf(".");
				String output = s.substring(0,result+3);
				lblNewLabel_1.setText(output+" Pesos");
				
			}
			else if (selected.equalsIgnoreCase("Dollars to Yen")) {
				x=x*136.580;
				String s = Double.toString(x);
				int result = s.indexOf(".");
				String output = s.substring(0,result+3);
				lblNewLabel_1.setText(output+" Yen");
				
				
			}
			else if(selected.equalsIgnoreCase("Dollars to Euros")) {
				x=x* 0.948540;
				String s = Double.toString(x);
				int result = s.indexOf(".");
				String output = s.substring(0,result+3);
				lblNewLabel_1.setText(output+" Euros");
			}
			
			
		}
		
	}

}
