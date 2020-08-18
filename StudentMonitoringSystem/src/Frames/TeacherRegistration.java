package Frames;
import javax.swing.JFrame;
import Services.TeacherServices;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Cursor;


public class TeacherRegistration extends JFrame implements ActionListener, ItemListener {

	String Gender = "", Subject = "", BloodGroup = "";
	
	JFrame TRframe ;
	JTextField tName, tEmail, tMno, tDob, tQualification, tExperience;
	JTextArea tAddress;
	JComboBox cbBloodGroup, cbGender, cbSubject;
	JButton bRegister, bBack;
	

	public TeacherRegistration() {
		
		TRframe = new JFrame();
		TRframe.setTitle("Teachers Registration");
				
		JLabel Background = new JLabel(new ImageIcon("C:\\Users\\yashs\\Desktop\\Yash's_Files\\Images\\BGLP6.jpg"));
		Background.setBounds(0, 0, 515, 356);
		TRframe.add(Background);
				
		JLabel lblNewUserRegistration = new JLabel("New Teacher Registration");
		lblNewUserRegistration.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewUserRegistration.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewUserRegistration.setBounds(151, 11, 235, 50);
		Background.add(lblNewUserRegistration);
		
		JLabel lblName = new JLabel("Name");
		lblName.setForeground(Color.WHITE);
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblName.setBounds(50, 78, 50, 19);
		Background.add(lblName);
		
		tName = new JTextField();
		tName.setBorder(null);
		tName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tName.setBounds(151, 79, 110, 20);
		Background.add(tName);
		tName.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEmail.setBounds(50, 114, 50, 19);
		Background.add(lblEmail);
		
		tEmail = new JTextField();
		tEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tEmail.setBorder(null);
		tEmail.setBounds(151, 115, 110, 20);
		Background.add(tEmail);
		tEmail.setColumns(10);
		
		JLabel lblMobileNo = new JLabel("Mobile no.");
		lblMobileNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblMobileNo.setForeground(Color.WHITE);
		lblMobileNo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMobileNo.setBounds(20, 153, 100, 32);
		Background.add(lblMobileNo);
		
		tMno = new JTextField();
		tMno.setBorder(null);
		tMno.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tMno.setBounds(151, 161, 110, 20);
		Background.add(tMno);
		tMno.setColumns(10);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddress.setForeground(Color.WHITE);
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAddress.setBounds(40, 200, 65, 24);
		Background.add(lblAddress);
		
		tAddress = new JTextArea();
		tAddress.setFont(new Font("Tahoma", Font.PLAIN, 13));
		tAddress.setBorder(null);
		tAddress.setBounds(151, 202, 110, 74);
		Background.add(tAddress);
		
		JLabel lblBloodGroup = new JLabel("Blood Group");
		lblBloodGroup.setHorizontalAlignment(SwingConstants.CENTER);
		lblBloodGroup.setForeground(Color.WHITE);
		lblBloodGroup.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblBloodGroup.setBounds(20, 287, 100, 32);
		Background.add(lblBloodGroup);
		
		cbBloodGroup = new JComboBox();
		cbBloodGroup.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cbBloodGroup.setModel(new DefaultComboBoxModel(new String[] {"Select", "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"}));
		cbBloodGroup.setBorder(null);
		cbBloodGroup.setFont(new Font("Tahoma", Font.PLAIN, 15));
		cbBloodGroup.setBounds(151, 295, 110, 20);
		Background.add(cbBloodGroup);
		
		JLabel lblQualification = new JLabel("Qualification	");
		lblQualification.setForeground(Color.WHITE);
		lblQualification.setHorizontalAlignment(SwingConstants.CENTER);
		lblQualification.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblQualification.setBounds(300, 75, 86, 25);
		Background.add(lblQualification);
		
		tQualification = new JTextField();
		tQualification.setBorder(null);
		tQualification.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tQualification.setBounds(431, 79, 101, 20);
		Background.add(tQualification);
		tQualification.setColumns(10);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setHorizontalAlignment(SwingConstants.CENTER);
		lblGender.setForeground(Color.WHITE);
		lblGender.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblGender.setBounds(310, 121, 66, 21);
		Background.add(lblGender);
		
		cbGender = new JComboBox();
		cbGender.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cbGender.setModel(new DefaultComboBoxModel(new String[] {"Select", "Male", "Female", "Other"}));
		cbGender.setBorder(null);
		cbGender.setFont(new Font("Tahoma", Font.PLAIN, 15));
		cbGender.setBounds(431, 125, 101, 20);
		Background.add(cbGender);
		
		JLabel lblExperience = new JLabel("Experience");
		lblExperience.setHorizontalAlignment(SwingConstants.CENTER);
		lblExperience.setForeground(Color.WHITE);
		lblExperience.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblExperience.setBounds(295, 159, 101, 31);
		Background.add(lblExperience);
		
		tExperience = new JTextField();
		tExperience.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tExperience.setBorder(null);
		tExperience.setBounds(431, 168, 101, 20);
		Background.add(tExperience);
		tExperience.setColumns(10);
		
		JLabel lblSubjectPrefer = new JLabel("Subject Prefered");
		lblSubjectPrefer.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubjectPrefer.setForeground(Color.WHITE);
		lblSubjectPrefer.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSubjectPrefer.setBounds(290, 219, 121, 27);
		Background.add(lblSubjectPrefer);
		
		cbSubject = new JComboBox();
		cbSubject.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cbSubject.setFont(new Font("Tahoma", Font.PLAIN, 15));
		cbSubject.setBorder(null);
		cbSubject.setModel(new DefaultComboBoxModel(new String[] {"Select", "M3", "ECCF", "DLDA", "DM", "OOPM"}));
		cbSubject.setBounds(431, 226, 101, 20);
		Background.add(cbSubject);
		
		JLabel lblDob = new JLabel("DOB");
		lblDob.setHorizontalAlignment(SwingConstants.CENTER);
		lblDob.setForeground(Color.WHITE);
		lblDob.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDob.setBounds(310, 262, 66, 23);
		Background.add(lblDob);
		
		tDob = new JTextField();
		tDob.setBorder(null);
		tDob.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tDob.setBounds(431, 266, 101, 20);
		Background.add(tDob);
		tDob.setColumns(10);
		
		bBack = new JButton("Back");
		bBack.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bBack.setForeground(Color.BLACK);
		bBack.setFont(new Font("Tahoma", Font.PLAIN, 15));
		bBack.setBounds(10, 11, 66, 23);
		Background.add(bBack);
		
		bRegister = new JButton("Register");
		bRegister.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bRegister.setBorder(null);
		bRegister.setFont(new Font("Tahoma", Font.PLAIN, 16));
		bRegister.setBounds(240, 338, 94, 32);
		Background.add(bRegister);
		
		
		cbGender.addItemListener(this); 
		cbSubject.addItemListener(this); 
		cbBloodGroup.addItemListener(this);
		
		bBack.addActionListener(this);
		bRegister.addActionListener(this);
		
		TRframe.setBounds(500, 100, 600, 450);
		TRframe.setVisible(true);
		TRframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}

	public void itemStateChanged(ItemEvent e) 
    { 
	 	if (e.getSource() == cbGender)
	 	{
	 		Gender = (String) cbGender.getSelectedItem(); 
        } 
	 	if (e.getSource() == cbSubject)
	 	{
	 		Subject = (String) cbSubject.getSelectedItem(); 
        } 
	 	if (e.getSource() == cbBloodGroup)
	 	{
	 		BloodGroup = (String) cbBloodGroup.getSelectedItem(); 
        } 
    }

	public void actionPerformed(ActionEvent ae)	{
		
		String Name, Email, Mno, Address, Experience, Dob, Qualification, password1, password2;
		int Uid;
		
		if(ae.getSource()== bBack)
		{
			try
			{
				TRframe.dispose();
				new MainPage();
			}
			catch(Exception ex)
			{
				JOptionPane.showMessageDialog(TRframe,ex.toString(),"ERROR",JOptionPane.ERROR_MESSAGE);
			}
		}
		else if(ae.getSource()== bRegister)
		{
			try
			{
				if(tName.getText().equals("") || tEmail.getText().equals("") || tMno.getText().equals("") ||
						tQualification.getText().equals("") || tExperience.getText().equals("") 
						|| tDob.getText().equals("") || tAddress.getText().equals("") || Gender.equals("") ||
						Gender.equals("Select") || Subject.equals("") || Subject.equals("Select") || BloodGroup.equals("") || BloodGroup.equals("Select") )
				{					
					JOptionPane.showMessageDialog(TRframe,"Please enter all values","Attention",JOptionPane.ERROR_MESSAGE);
				}
				else
				{
					while(true) 
					{
						password1 = JOptionPane.showInputDialog(TRframe, "Enter New Password");
						if(password1.isEmpty())
						{
							JOptionPane.showMessageDialog(TRframe,"Password cannot be blank","ERROR",JOptionPane.ERROR_MESSAGE);
							continue;
						}
						
						password2 = JOptionPane.showInputDialog(TRframe, "Re-Enter New Password");
						if(password2.isEmpty() || !(password1.equals(password2)))
						{
							JOptionPane.showMessageDialog(TRframe,"Passwords do not match","ERROR",JOptionPane.ERROR_MESSAGE);
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
					Experience = tExperience.getText();
					Dob = tDob.getText();
					Address = tAddress.getText();
					Qualification = tQualification.getText();
					
					
					TeacherServices Ts = new TeacherServices();
					
					try 
					{
						 Uid =  (Ts.TeacherRegister(Name,Email,Mno,Address,BloodGroup, Qualification, Experience, Gender, Subject, Dob , password1));
						
						 JOptionPane.showMessageDialog(TRframe,"New Teacher Registered","Success", JOptionPane.INFORMATION_MESSAGE);
						 JOptionPane.showMessageDialog(TRframe,"Unique Id : "+Uid,"Important", JOptionPane.INFORMATION_MESSAGE);
						 TRframe.dispose();
						 new MainPage();

					}
					catch(Exception ex)
					{
						JOptionPane.showMessageDialog(TRframe,ex.toString(),"ERROR",JOptionPane.ERROR_MESSAGE);
					}
				
				}
			}
	
			catch(Exception ex)
			{
				JOptionPane.showMessageDialog(TRframe,ex.toString(),"ERROR",JOptionPane.ERROR_MESSAGE);
			}
			
		}
		
	}
}
