package Dao;

import Beans.SRBean;
import Beans.TRBean;
import java.io.Serializable;
import java.sql.*;

import javax.swing.JFrame;


public class TDao {
	
	JFrame frame = new JFrame();
	
	public int Tregister(TRBean obj) throws SQLException {
		
		Connection con = null;
		PreparedStatement pstmt1 = null, pstmt2 = null, pstmt3 = null;
		ResultSet rs = null;
		
		int result1, result2;		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/SMS","root","root"); 
		     
		    String ins_str = 
		    		"INSERT INTO Teacher_Info(tname, temail, tMno, tAddress, tBloodGroup, tQualifications, tExperience, tGender, tSubject, tDOB) VALUES(?,?,?,?,?,?,?,?,?,?)";
			  
			  pstmt1 = con.prepareStatement(ins_str);
			  
			  pstmt1.setString(1,obj.getName());
			  pstmt1.setString(2,obj.getEmail());
			  pstmt1.setString(3,obj.getMno());
			  pstmt1.setString(4,obj.getAddress());
			  pstmt1.setString(5,obj.getBloodGroup());
			  pstmt1.setString(6,obj.getQualifications());
			  pstmt1.setString(7,obj.getExperience());
			  pstmt1.setString(8,obj.getGender());
			  pstmt1.setString(9,obj.getSubject());
			  pstmt1.setString(10,obj.getDob());
			  			 			  
			   result1 = pstmt1.executeUpdate();
			   
			   String ins_str2 = "INSERT INTO TPassword(tPassword) VALUES(?)";
				  
			   pstmt2 = con.prepareStatement(ins_str2);
				  
			   pstmt2.setString(1,obj.getPassword());
				  
			   result2 =  pstmt2.executeUpdate();
			   
			   String ins_str3 =
						  "SELECT UID FROM Teacher_Info WHERE tname = ? AND temail = ? AND tMno = ? AND tAddress = ? AND tBloodGroup = ? AND tQualifications = ? AND tExperience = ? AND tGender = ? AND tSubject = ? AND tDOB = ?";
				  
				  pstmt3 = con.prepareStatement(ins_str3);
				  
				  pstmt3.setString(1,obj.getName());
				  pstmt3.setString(2,obj.getEmail());
				  pstmt3.setString(3,obj.getMno());
				  pstmt3.setString(4,obj.getAddress());
				  pstmt3.setString(5,obj.getBloodGroup());
				  pstmt3.setString(6,obj.getQualifications());
				  pstmt3.setString(7,obj.getExperience());
				  pstmt3.setString(8,obj.getGender());
				  pstmt3.setString(9,obj.getSubject());
				  pstmt3.setString(10,obj.getDob());
			  
				  rs = pstmt3.executeQuery();
				  
				  rs.last();
				  
				  			  
				  if(result1 == 1 && result2 == 1)
				  {
					  return rs.getInt("UID");
				  }
			  
		}
		catch(Exception ex)
		{
			System.out.println(ex.toString());
			return 0;
		}
		finally
		{
			con.close();
		}
		return 0;
			
	}
	
	public int checkingUID(TRBean obj) throws SQLException
	{
		Connection con = null;
		PreparedStatement pstmt1 = null;
		ResultSet rs = null;
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/SMS","root","root"); 
		     
		    String ins_str1 = 
				  "SELECT UID FROM Teacher_Info where UID = ?";
			  
			  pstmt1 = con.prepareStatement(ins_str1);
			  
			  pstmt1.setString(1,obj.getUID());
			  
			  rs = pstmt1.executeQuery();
			  
			  if(rs.next())
			  {
				  return 1;
			  }
			  else
			  {
				  return 0;
			  }
		}
		catch(Exception ex)
		{
			System.out.println(ex.toString());
			return 0;
		}
		finally
		{
			con.close();
		}
		
	}
	
	public String gettingPassword(TRBean obj) throws SQLException
	{
		Connection con = null;
		PreparedStatement pstmt1 = null;
		ResultSet rs = null;
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/SMS","root","root"); 
		     
		    String ins_str1 = 
				  "SELECT tPassword FROM tPassword where UID = ?";
			  
			  pstmt1 = con.prepareStatement(ins_str1);
			  
			  pstmt1.setString(1,obj.getUID());
			  
			  rs = pstmt1.executeQuery();
			  
			  if(rs.next())
			  {
				  return rs.getString(1);
			  }
			  else
			  {
				  return null;
			  }
		}
		catch(Exception ex)
		{
			System.out.println(ex.toString());
			return null;
		}
		finally
		{
			con.close();
		}
		
	}
	
}
