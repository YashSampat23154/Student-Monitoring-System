package Frames;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Services.StudentServices;

public class StudentRegistration extends JFrame implements ActionListener, ItemListener{

	String Gender = "";
	JFrame SRframe ;
	JTextField tName, tEmail, tMno,tBloodGroup, tHeight, tWeight, tDepartment, tDob;
	JTextArea tAddress;
	JComboBox cbGender;
	JButton bRegister, bBack;
	
	public StudentRegistration() {
		
		SRframe = new JFrame("New Student Registration");
		SRframe.setLayout(null);
		
		JLabel background = new JLabel(new ImageIcon("C:\\Users\\yashs\\Desktop\\Yash's_Files\\Images\\BGLP6.jpg"));
		background.setBounds(0, 0, 600, 450);
		SRframe.add(background);
		background.setLayout(null);
		
		JLabel lHeading, lName, lEmail, lMno, lAddress, lBloodGroup;
		JLabel lHeight, lWeight, lGender, lDepartment, lDob;
		
		lHeading = new JLabel("New Student Registration ");
		lName = new JLabel("Name :");
		lEmail = new JLabel("E-mail :");
		lMno = new JLabel("Mobile_no :");
		lAddress = new JLabel("Address :");
		lBloodGroup = new JLabel("Blood Group :");
		lHeight = new JLabel("Height :");
		lWeight = new JLabel("Weight :");
		lGender = new JLabel("Gender :");
		lDepartment = new JLabel("Department :");
		lDob = new JLabel("DOB :");
		
		lHeading.setFont(new Font("Tahoma", Font.BOLD, 17));
		lHeading.setBounds(130, 11, 250, 20);
		lHeading.setForeground(Color.black);
		lHeading.setHorizontalAlignment(SwingConstants.CENTER);
		lName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lName.setBounds(31, 71, 100, 14);
		lName.setForeground(Color.white);
		lEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lEmail.setBounds(31, 106, 100, 14);
		lEmail.setForeground(Color.white);
		lMno.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lMno.setBounds(31, 141, 100, 14);
		lMno.setForeground(Color.white);
		lAddress.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lAddress.setBounds(31, 176, 100, 14);
		lAddress.setForeground(Color.white);
		lBloodGroup.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lBloodGroup.setBounds(31, 249, 100, 26);
		lBloodGroup.setForeground(Color.white);
		lHeight.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lHeight.setBounds(257, 61, 100, 35);
		lHeight.setForeground(Color.white);
		lWeight.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lWeight.setBounds(257, 102, 100, 20);
		lWeight.setForeground(Color.white);
		lGender.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lGender.setBounds(257, 143, 100, 14);
		lGender.setForeground(Color.white);
		lDepartment.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lDepartment.setBounds(253, 178, 100, 14);
		lDepartment.setForeground(Color.white);
		lDob.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lDob.setBounds(257, 209, 100, 14);
		lDob.setForeground(Color.white);
		
		
		tName = new JTextField();
		tEmail = new JTextField();
		tMno = new JTextField();
		tBloodGroup = new JTextField();
		tHeight = new JTextField();
		tWeight = new JTextField();
		tDepartment = new JTextField();
		tDob = new JTextField();
		
		tName.setColumns(10);
		tName.setBounds(131, 70, 100, 20);
		tEmail.setColumns(10);
		tEmail.setBounds(131, 105, 100, 20);
		tMno.setColumns(10);
		tMno.setBounds(131, 140, 100, 20);
		tBloodGroup.setColumns(10);
		tBloodGroup.setBounds(131, 255, 100, 20);
		tHeight.setColumns(10);
		tHeight.setBounds(349, 70, 100, 20);
		tWeight.setColumns(10);
		tWeight.setBounds(349, 100, 100, 20);
		tDepartment.setColumns(10);
		tDepartment.setBounds(349, 175, 100, 20);
		tDob.setColumns(10);
		tDob.setBounds(349, 206, 100, 20);
		
		tAddress = new JTextArea();
		tAddress.setLineWrap(true);
		tAddress.setBounds(131, 173, 100, 55);
		
		cbGender = new JComboBox();
		cbGender.setModel(new DefaultComboBoxModel(new String[] {"Select","Male", "Female","Other"}));
		cbGender.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cbGender.setBounds(349, 140, 100, 20);
		
		cbGender.addItemListener(this); 
		
		
		bRegister = new JButton("Register");
		bBack = new JButton("Back");
		
		
		bBack.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bBack.setForeground(Color.BLACK);
		bBack.setFont(new Font("Tahoma", Font.PLAIN, 15));
		bBack.setBounds(10, 11, 66, 23);
		bRegister.setFont(new Font("Tahoma", Font.PLAIN, 16));
		bRegister.setBounds(171, 300, 120, 30);
		
		bBack.addActionListener(this);
		bRegister.addActionListener(this);
		
		background.add(lHeading);
		background.add(lName);
		background.add(lEmail);
		background.add(lMno);
		background.add(lAddress);
		background.add(lBloodGroup);
		background.add(lHeight);
		background.add(lWeight);
		background.add(lGender);
		background.add(lDepartment);
		background.add(lDob);
		
		background.add(tName);
		background.add(tEmail);
		background.add(tMno);
		background.add(tAddress);
		background.add(tBloodGroup);
		background.add(tHeight);
		background.add(tWeight);
		background.add(cbGender);
		background.add(tDepartment);
		background.add(tDob);
		
		background.add(bRegister);
		background.add(bBack);
		
		
		SRframe.setVisible(true);
		SRframe.setBounds(500, 100, 500, 380);
		SRframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}
	
	public void actionPerformed(ActionEvent ae)	{
		
		String Name, Email, Mno, Address, BloodGroup, Department, Dob, password1, password2;
		int Height, Weight, Uid;
		
		if(ae.getSource()== bBack)
		{
			try
			{
				SRframe.dispose();
				new MainPage();
			}
			catch(Exception ex)
			{
				JOptionPane.showMessageDialog(SRframe,ex.toString(),"ERROR",JOptionPane.ERROR_MESSAGE);
			}
		}
		else if(ae.getSource()== bRegister)
		{
			try
			{
				
				if(tName.getText().equals("") || tEmail.getText().equals("") || tMno.getText().equals("") || 
						tBloodGroup.getText().equals("") || tHeight.getText().equals("") || tWeight.getText().equals("") 
						|| tDepartment.getText().equals("") || tDob.getText().equals("") || tAddress.getText().equals("") || 
						Gender.equals("") || Gender.equals("Select") )
				{					
					JOptionPane.showMessageDialog(SRframe,"Please enter all values","Attention",JOptionPane.ERROR_MESSAGE);
				}
				else
				{
					while(true) {
					
						password1 = JOptionPane.showInputDialog(SRframe, "Enter New Password");
						if(password1.isEmpty())
						{
							JOptionPane.showMessageDialog(SRframe,"Password cannot be blank","ERROR",JOptionPane.ERROR_MESSAGE);
							continue;
						}
						
						password2 = JOptionPane.showInputDialog(SRframe, "Re-Enter New Password");
						if(password2.isEmpty() || !(password1.equals(password2)))
						{
							JOptionPane.showMessageDialog(SRframe,"Passwords do not match","ERROR",JOptionPane.ERROR_MESSAGE);
							continue;
						}
						else
						{
							break;
						}
					}					
					Name = tName.getText();
					Email = tEmail.getText();
					Mno = tMno.getText();
					BloodGroup = tBloodGroup.getText();
					Department = tDepartment.getText();
					Dob = tDob.getText();
					Address = tAddress.getText();
					
					Height = Integer.parseInt(tHeight.getText());
					Weight = Integer.parseInt(tWeight.getText());
					
					StudentServices Ss = new StudentServices();
					try 
					{
						 Uid =  (Ss.studentRegister(Name,Email,Mno,Address,BloodGroup, Gender, Height, Weight, Department, Dob, password1));

						 JOptionPane.showMessageDialog(SRframe,"New Student Registered","Success", JOptionPane.INFORMATION_MESSAGE);
						 JOptionPane.showMessageDialog(SRframe,"Unique Id : "+Uid,"Important", JOptionPane.INFORMATION_MESSAGE);
						 SRframe.dispose();
						 new MainPage();
					}
					catch(Exception ex)
					{
						JOptionPane.showMessageDialog(SRframe,ex.toString(),"ERROR",JOptionPane.ERROR_MESSAGE);
					}
				
				}
			}
			catch(Exception ex)
			{
				JOptionPane.showMessageDialog(SRframe,ex.toString(),"ERROR",JOptionPane.ERROR_MESSAGE);
			}
			
		}
	}
	
	 public void itemStateChanged(ItemEvent e) 
	    { 
		 	if (e.getSource() == cbGender)
		 	{
		 		Gender = (String) cbGender.getSelectedItem(); 
	        } 
	    }
	

}
