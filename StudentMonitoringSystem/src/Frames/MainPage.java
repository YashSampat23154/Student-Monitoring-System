package Frames;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import Beans.SRBean;
import Beans.TRBean;
import Services.StudentServices;
import Services.TeacherServices;

import java.awt.Font;
import javax.swing.JRadioButton;
import java.awt.Cursor;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class MainPage extends JFrame implements ActionListener{

	JFrame MPframe;
	JTextField tU;
	JPasswordField pfPassword;
	JRadioButton rbS;
	JRadioButton rbT;
	JButton bL,bNRS,bNRT, bfP;
	
	public MainPage() {
		
		MPframe = new JFrame();
								
		JLabel Background = new JLabel(new ImageIcon("C:\\Users\\yashs\\Desktop\\Yash's_Files\\Images\\BGLP6.jpg"));
		Background.setBounds(0, 0, 515, 356);
		MPframe.add(Background);
		
		ButtonGroup buttonGroup = new ButtonGroup();
		
		tU = new JTextField();
		tU.setOpaque(false);
		tU.setForeground(Color.WHITE);
		tU.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tU.setBorder(null);
		tU.setBounds(195, 95, 175, 20);
		Background.add(tU);
		tU.setColumns(10);
				
		JLabel lblUniqueId = new JLabel("Unique Id :");
		lblUniqueId.setHorizontalAlignment(SwingConstants.CENTER);
		lblUniqueId.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblUniqueId.setForeground(Color.WHITE);
		lblUniqueId.setBounds(113, 95, 81, 23);
		Background.add(lblUniqueId);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(195, 116, 175, 2);
		Background.add(separator);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPassword.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		lblPassword.setBounds(113, 140, 81, 20);
		Background.add(lblPassword);
		
		pfPassword = new JPasswordField();
		pfPassword.setOpaque(false);
		pfPassword.setBorder(null);
		pfPassword.setForeground(Color.WHITE);
		pfPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pfPassword.setBounds(195, 141, 151, 20);
		Background.add(pfPassword);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(195, 158, 175, 2);
		Background.add(separator_1);
		
		rbT = new JRadioButton("Teacher");
		rbT.setFocusPainted(false);
		buttonGroup.add(rbT);
		rbT.setOpaque(false);
		rbT.setForeground(Color.WHITE);
		rbT.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbT.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		rbT.setBorder(null);
		rbT.setBounds(261, 55, 109, 23);
		Background.add(rbT);
		
		rbS = new JRadioButton("Student");
		rbS.setFocusPainted(false);
		buttonGroup.add(rbS);
		rbS.setBorder(null);
		rbS.setForeground(Color.WHITE);
		rbS.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rbS.setOpaque(false);
		rbS.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		rbS.setBounds(140, 55, 81, 23);
		Background.add(rbS);
		
		bfP = new JButton("Forgot Password");
		bfP.setForeground(Color.BLACK);
		bfP.setFont(new Font("Tahoma", Font.PLAIN, 13));
		bfP.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bfP.setBorderPainted(false);
		bfP.setBorder(null);
		bfP.setBounds(94, 199, 162, 23);
		Background.add(bfP);
		
		bL = new JButton("Login");
		bL.setBorderPainted(false);
		bL.setBorder(null);
		bL.setForeground(Color.BLACK);
		bL.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
//		bL.setBackground(Color.WHITE);
		bL.setFont(new Font("Tahoma", Font.PLAIN, 13));
		bL.setBounds(306, 199, 89, 23);
		Background.add(bL);
		
		JLabel lblAreYouA = new JLabel("Are you a new User?");
		lblAreYouA.setHorizontalAlignment(SwingConstants.CENTER);
		lblAreYouA.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAreYouA.setForeground(Color.WHITE);
		lblAreYouA.setBounds(160, 245, 191, 23);
		Background.add(lblAreYouA);
		
		JLabel welcome_to_login = new JLabel("Welcome to Login Page");
		welcome_to_login.setFont(new Font("Tahoma", Font.BOLD, 17));
		welcome_to_login.setHorizontalAlignment(SwingConstants.CENTER);
		welcome_to_login.setBounds(130, 11, 225, 33);
		Background.add(welcome_to_login);
		
		bNRS = new JButton(" New Student");
		bNRS.setBorder(null);
		bNRS.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bNRS.setFont(new Font("Tahoma", Font.PLAIN, 13));
		bNRS.setBounds(107, 279, 134, 23);
		Background.add(bNRS);
		
		bNRT = new JButton("New Teacher");
		bNRT.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bNRT.setBorder(null);
		bNRT.setFont(new Font("Tahoma", Font.PLAIN, 13));
		bNRT.setBounds(261, 279, 134, 23);
		Background.add(bNRT);
		
		bL.addActionListener(this);
		bNRS.addActionListener(this);
		bNRT.addActionListener(this);
		bfP.addActionListener(this);
		
		MPframe.setBounds(500, 100, 524, 360);
		MPframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MPframe.setVisible(true);
		MPframe.getContentPane().setLayout(null);
		
	}
	
	public void actionPerformed(ActionEvent ae)	{
		
		char ch[] = new char[30];
		String password, UID, choice;
		
		if(ae.getSource() == bL)
		{
			try
			{
				if(tU.getText().equals("") || pfPassword.getPassword().length == 0)
				{
					JOptionPane.showMessageDialog(MPframe,"Please enter all values","Attention",JOptionPane.ERROR_MESSAGE);
				}
				else
				{
					if(rbS.isSelected())
					{
						StudentServices Ss = new StudentServices();
						if(Ss.checkUID(tU.getText()) == 1)
						{
							ch = pfPassword.getPassword();
							password = new String(ch);
							
							if(Ss.checkPassWord(tU.getText(),password) == 1)
							{
								SRBean sbean = new SRBean();
								sbean.setUID(tU.getText());
								JOptionPane.showMessageDialog(MPframe,"Login Successful","Success",JOptionPane.INFORMATION_MESSAGE);
								MPframe.dispose();
								new StudentLogin();
								
							}
							else
							{
								JOptionPane.showMessageDialog(MPframe,"Invalid Password","Error",JOptionPane.ERROR_MESSAGE);
							}
						}
						else
						{
							JOptionPane.showMessageDialog(MPframe,"Invalid Unique Id","Error",JOptionPane.ERROR_MESSAGE);
						}
						
					}
					else if(rbT.isSelected())
					{
						TeacherServices Ts = new TeacherServices();
						if(Ts.checkUID(tU.getText()) == 1)
						{
							ch = pfPassword.getPassword();
							password = new String(ch);
							
							if(Ts.checkPassWord(tU.getText(),password) == 1)
							{
								TRBean tbean = new TRBean();
								tbean.setUID(tU.getText());
								JOptionPane.showMessageDialog(MPframe,"Login Successful","Success",JOptionPane.INFORMATION_MESSAGE);
								new TeacherLogin();
								
							}
							else
							{
								JOptionPane.showMessageDialog(MPframe,"Invalid Password","Error",JOptionPane.ERROR_MESSAGE);
							}
						}
						else
						{
							JOptionPane.showMessageDialog(MPframe,"Invalid Unique Id","Error",JOptionPane.ERROR_MESSAGE);
						}
					}
					else
					{
						JOptionPane.showMessageDialog(MPframe,"Student or Teacher login not Specified","Attention",JOptionPane.ERROR_MESSAGE);
					}
				}
			}
			catch(Exception ex)
			{
				JOptionPane.showMessageDialog(MPframe,ex.toString(),"ERROR",JOptionPane.ERROR_MESSAGE);
			}
		}
		
		else if(ae.getSource()==bNRS)
		{
			try
			{
				MPframe.dispose();
				new StudentRegistration();
			}
			catch(Exception ex)
			{
				JOptionPane.showMessageDialog(MPframe,ex.toString(),"ERROR",JOptionPane.ERROR_MESSAGE);
			}
		}
		
		else if(ae.getSource()==bNRT)
		{
			try
			{
				MPframe.dispose();
				new TeacherRegistration();
			}
			catch(Exception ex)
			{
				JOptionPane.showMessageDialog(MPframe,ex.toString(),"ERROR",JOptionPane.ERROR_MESSAGE);
			}
			
		}
		
		else if(ae.getSource() == bfP)
		{
			try
			{
				choice = JOptionPane.showInputDialog(MPframe, "Enter S if Student and T if Teacher");
				
				if(choice.equals("s") || choice.equals("S"))
				{
					UID = JOptionPane.showInputDialog(MPframe, "Enter Unique Id");
					if(UID.isEmpty())
					{
						JOptionPane.showMessageDialog(MPframe,"Unique Id cannot be blank","ERROR",JOptionPane.ERROR_MESSAGE);
					}
					else
					{
						StudentServices Ss = new StudentServices();
						if(Ss.checkUID(UID)== 1)
						{
							password = Ss.recievePassword(UID);
							if(!password.equals("NULL"))
							{
								JOptionPane.showMessageDialog(MPframe,"Current Password is : "+password,"Success",JOptionPane.INFORMATION_MESSAGE);
							}
						}
						else
						{
							JOptionPane.showMessageDialog(MPframe,"Invalid Unique Id","Error",JOptionPane.ERROR_MESSAGE);
						}
						
					}
				}
				else if(choice.equals("t") || choice.equals("T"))
				{
					UID = JOptionPane.showInputDialog(MPframe, "Enter Unique Id");
					if(UID.isEmpty())
					{
						JOptionPane.showMessageDialog(MPframe,"Unique Id cannot be blank","ERROR",JOptionPane.ERROR_MESSAGE);
					}
					else
					{
						TeacherServices Ts = new TeacherServices();
						if(Ts.checkUID(UID)== 1)
						{
							password = Ts.recievePassword(UID);
							if(!password.equals("NULL"))
							{
								JOptionPane.showMessageDialog(MPframe,"Current Password is : "+password,"Success",JOptionPane.INFORMATION_MESSAGE);
							}
						}
						else
						{
							JOptionPane.showMessageDialog(MPframe,"Invalid Unique Id","Error",JOptionPane.ERROR_MESSAGE);
						}
						
					}
				}
				else
				{
					JOptionPane.showMessageDialog(MPframe,"Invalid Choice","Error",JOptionPane.ERROR_MESSAGE);
				}
			}
			
			catch(Exception ex)
			{
				JOptionPane.showMessageDialog(MPframe,ex.toString(),"ERROR",JOptionPane.ERROR_MESSAGE);
			}
			
		}
		
		
	}
	
	public static void main(String[] args) {
		 new MainPage();
	}		
		
}