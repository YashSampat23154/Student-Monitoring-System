package Frames;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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


public class TeacherLogin extends JFrame implements ActionListener{

	JFrame TLframe;
	JPanel panel2;	
	JButton bCourses, bTimeTable, bSchedule, bExtraLecture, bAttendance, bLogout;

	public TeacherLogin() {
		
		TLframe = new JFrame("Teachers Portal");
		
		JPanel panel1 = new JPanel();
		panel1.setBounds(0, 0, 186, 381);
		TLframe.add(panel1);
		panel1.setLayout(null);
		
		JLabel Background = new JLabel(new ImageIcon("C:\\Users\\yashs\\Desktop\\Yash's_Files\\Images\\BGLP6.jpg"));
		panel1.add(Background);
		Background.setBounds(0, 0, 186, 381);
		
				
		JLabel lblWelcome = new JLabel("Welcome");
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcome.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblWelcome.setBounds(44, 26, 107, 40);
		Background.add(lblWelcome);
		
		bCourses = new JButton("Courses");
		bCourses.setForeground(Color.WHITE);
		bCourses.setContentAreaFilled(false);
		bCourses.setFont(new Font("Tahoma", Font.PLAIN, 15));
		bCourses.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bCourses.setBorder(null);
		bCourses.setBounds(46, 92, 89, 23);
		Background.add(bCourses);
		
		bTimeTable = new JButton("Timetable");
		bTimeTable.setContentAreaFilled(false);
		bTimeTable.setBorder(null);
		bTimeTable.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bTimeTable.setFont(new Font("Tahoma", Font.PLAIN, 15));
		bTimeTable.setForeground(Color.WHITE);
		bTimeTable.setBounds(46, 144, 89, 23);
		Background.add(bTimeTable);
		
		bSchedule = new JButton("Schedule");
		bSchedule.setForeground(Color.WHITE);
		bSchedule.setFont(new Font("Tahoma", Font.PLAIN, 15));
		bSchedule.setBorder(null);
		bSchedule.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bSchedule.setContentAreaFilled(false);
		bSchedule.setBounds(44, 197, 89, 23);
		Background.add(bSchedule);
		
		bAttendance = new JButton("Attendance");
		bAttendance.setForeground(Color.WHITE);
		bAttendance.setFont(new Font("Tahoma", Font.PLAIN, 15));
		bAttendance.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bAttendance.setContentAreaFilled(false);
		bAttendance.setBorder(null);
		bAttendance.setBounds(44, 252, 89, 23);
		Background.add(bAttendance);
		
		bExtraLecture = new JButton("Extra Lecture");
		bExtraLecture.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bExtraLecture.setContentAreaFilled(false);
		bExtraLecture.setForeground(Color.WHITE);
		bExtraLecture.setFont(new Font("Tahoma", Font.PLAIN, 15));
		bExtraLecture.setBounds(30, 309, 132, 23);
		Background.add(bExtraLecture);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Admin\\Desktop\\AISHWARYA ALBUM\\photo-1548755212-2b46ee259868.jpg"));
		label.setBounds(0, 0, 186, 381);
		Background.add(label);
		
		panel2 = new JPanel();
		panel2.setBounds(185, 0, 396, 381);
		TLframe.add(panel2);
		panel2.setLayout(null);
		
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
		bExtraLecture.addActionListener(this);
		bLogout.addActionListener(this);
		
		JLabel lblComingSoon = new JLabel("Coming Soon");
		lblComingSoon.setHorizontalAlignment(SwingConstants.CENTER);
		lblComingSoon.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblComingSoon.setBounds(291, 126, 194, 105);
		panel2.add(lblComingSoon);

//		JLabel lblWTP = new JLabel("Welcome to the Teacher Portal");
//		lblWTP.setHorizontalAlignment(SwingConstants.CENTER);
//		lblWTP.setFont(new Font("Tahoma", Font.BOLD, 14));
//		lblWTP.setBounds(270, 140, 250, 68);
////		panel1.add(lblWTP);
//		panel2.add(lblWTP);		
		
		TLframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		TLframe.setBounds(500, 100, 597, 419);
		TLframe.setVisible(true);
		
	}

	public void actionPerformed(ActionEvent ae) {
		
//		JPanel rightPanel = new JPanel();
	
		if(ae.getSource()== bLogout)
		{
			try
			{
				TLframe.dispose();
				new MainPage();
			}
			catch(Exception ex)
			{
				JOptionPane.showMessageDialog(TLframe,ex.toString(),"ERROR",JOptionPane.ERROR_MESSAGE);
			}
		}
	
		else if(ae.getSource()== bAttendance)
		{
			JLabel lblComingSoon = new JLabel("Coming Soon");
			lblComingSoon.setHorizontalAlignment(SwingConstants.CENTER);
			lblComingSoon.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblComingSoon.setBounds(270,100, 200, 68);
//			SLframe.remove(panel2);
			panel2.removeAll();
			panel2.repaint();
			panel2.revalidate();
			panel2.add(lblComingSoon);
//			rightPanel.add(lblComingSoon);
			
		}
	}
		
//	public static void main(String[] args) {
//		new TeacherLogin();
//	}
	
}