 package Justpractise;

import java.awt.event.*;

import javax.swing.*;

public class Studentdetails {

	public static void main(String[] args) {
		JFrame frame=new JFrame();
		
		JLabel lFirstName=new JLabel("FristName :-");
		lFirstName.setBounds(100, 100, 150, 20);
		JTextField tfFirstName=new JTextField();
		tfFirstName.setBounds(200, 100, 150, 20);
		
		JLabel lLastName=new JLabel("LastName :-");
		lLastName.setBounds(100,200,150,20);
		JTextField tfLastName=new JTextField();
		tfLastName.setBounds(200,200,150,20);
		
		JLabel lEmailId=new JLabel("EmailId :-");
		lEmailId.setBounds(100,300,150,20); 
        JTextField tfEmailId=new JTextField();
        tfEmailId.setBounds(200,300,200,20);
		
		JButton button=new JButton("click");
		button.setBounds(500,500,100,40);
		
		button.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				
				tfFirstName.setText("pradnya");
				tfLastName.setText("Shelke");
			    tfEmailId.setText("pradnyashelke@gmail.com");
			}
		});
	    
		frame.add(button);
		frame.add(lFirstName);
		frame.add(tfFirstName);
		frame.add(lLastName);
		frame.add(tfLastName);
		frame.add(lEmailId);
		frame.add(tfEmailId);
		
		frame.setSize(1000,1000);
		frame.setLayout(null);
        frame.setVisible(true);		
		
		
	}		
}
