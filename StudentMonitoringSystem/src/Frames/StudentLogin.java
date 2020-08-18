package Frames;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Cursor;
import java.awt.Color;


public class StudentLogin extends JFrame implements ActionListener{

	JFrame SLframe;
	JButton bAttendance, bCourses, bTimeTable, bSchedule, bLEResults, bLogout;
	public JPanel panel2;
		
	public StudentLogin(){
		
		SLframe = new JFrame("Student Portal");
							
		JPanel panel1 = new JPanel();
		panel1.setBounds(0, 0, 212, 415);
		SLframe.add(panel1);
		panel1.setLayout(null);
//		panel1.setBorder(new TitledBorder("Buttons"));
		
		JLabel Background = new JLabel(new ImageIcon("C:\\Users\\yashs\\Desktop\\Yash's_Files\\Images\\BGLP6.jpg"));
		panel1.add(Background);
		Background.setBounds(0, 0, 212, 353);
		
		JLabel lblWelcome = new JLabel("Welcome");
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcome.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblWelcome.setBounds(40, 11, 139, 50);
		Background.add(lblWelcome);
		
		bAttendance = new JButton("Attendance");
		bAttendance.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bAttendance.setBorder(null);
		bAttendance.setContentAreaFilled(false);
		bAttendance.setForeground(Color.WHITE);
		bAttendance.setFont(new Font("Tahoma", Font.PLAIN, 16));
		bAttendance.setBounds(62, 138, 89, 23);
		Background.add(bAttendance);
		
		bCourses = new JButton("Courses");
		bCourses.setForeground(Color.WHITE);
		bCourses.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bCourses.setContentAreaFilled(false);
		bCourses.setBorder(null);
		bCourses.setFont(new Font("Tahoma", Font.PLAIN, 16));
		bCourses.setBounds(29, 74, 148, 50);
		Background.add(bCourses);
		bCourses.setVisible(true);
		
		bTimeTable = new JButton("Time table");
		bTimeTable.setBorder(null);
		bTimeTable.setContentAreaFilled(false);
		bTimeTable.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bTimeTable.setFont(new Font("Tahoma", Font.PLAIN, 16));
		bTimeTable.setForeground(Color.WHITE);
		bTimeTable.setBounds(62, 188, 89, 23);
		Background.add(bTimeTable);
		
		bSchedule = new JButton("Schedule");
		bSchedule.setForeground(Color.WHITE);
		bSchedule.setFont(new Font("Tahoma", Font.PLAIN, 16));
		bSchedule.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bSchedule.setContentAreaFilled(false);
		bSchedule.setBorder(null);
		bSchedule.setBounds(62, 244, 89, 23);
		Background.add(bSchedule);
		
		bLEResults = new JButton("Exam Result");
		bLEResults.setForeground(Color.WHITE);
		bLEResults.setFont(new Font("Tahoma", Font.PLAIN, 16));
		bLEResults.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bLEResults.setContentAreaFilled(false);
		bLEResults.setBorder(null);
		bLEResults.setBounds(42, 298, 117, 30);
		Background.add(bLEResults);
		
		panel2 = new JPanel();
		panel2.setBounds(212, 0, 500, 500);
		SLframe.add(panel2);
		panel2.setLayout(null);
		
		JLabel lblComingSoon = new JLabel("Coming Soon");
		lblComingSoon.setHorizontalAlignment(SwingConstants.CENTER);
		lblComingSoon.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblComingSoon.setBounds(291, 126, 194, 105);
		panel2.add(lblComingSoon);
				
//		JLabel lblWSP = new JLabel("Welcome to the Student Portal");
//		lblWSP.setHorizontalAlignment(SwingConstants.CENTER);
//		lblWSP.setFont(new Font("Tahoma", Font.BOLD, 14));
//		lblWSP.setBounds(270, 140, 250, 68);
////		panel1.add(lblWSP);
//		panel2.add(lblWSP);
		
		bLogout = new JButton("Logout");
		bLogout.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bLogout.setForeground(Color.WHITE);
		bLogout.setBackground(Color.RED);
		bLogout.setFont(new Font("Tahoma", Font.PLAIN, 13));
		bLogout.setBounds(500, 0, 75, 23);
//		panel1.add(bLogout);
		panel2.add(bLogout);
		
		bAttendance.addActionListener(this);
		bCourses.addActionListener(this);
		bTimeTable.addActionListener(this);
		bSchedule.addActionListener(this);
		bLEResults.addActionListener(this);
		bLogout.addActionListener(this);
		
		SLframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SLframe.setBounds(500, 110, 575, 392);
		SLframe.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		
//		JPanel rightPanel = new JPanel();
	
		if(ae.getSource()== bLogout)
		{
			try
			{
				SLframe.dispose();
				new MainPage();
			}
			catch(Exception ex)
			{
				JOptionPane.showMessageDialog(SLframe,ex.toString(),"ERROR",JOptionPane.ERROR_MESSAGE);
			}
		}
	
		else if(ae.getSource()== bAttendance)
		{
			JLabel lblComingSoon = new JLabel("Working");
			lblComingSoon.setHorizontalAlignment(SwingConstants.CENTER);
			lblComingSoon.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblComingSoon.setBounds(270,100, 200, 68);
//			SLframe.remove(panel2);
			panel2.removeAll();
//			panel2.add(lblComingSoon);
			panel2.revalidate();
			panel2.repaint(212, 0, 500, 500);
			
			panel2.add(lblComingSoon);
			panel2.add(bLogout);
//			rightPanel.add(lblComingSoon);
			
		}
	}

	public static void main(String arg[])
	{
		new StudentLogin();
	}
	
}