package Dao;

import Beans.SRBean;
import java.io.Serializable;
import java.sql.*;

import javax.swing.JFrame;


public class SDao {
	
	JFrame frame = new JFrame();
		
	public int Sregister(SRBean obj) throws SQLException {
		
		Connection con = null;
		PreparedStatement pstmt1 = null, pstmt2 = null, pstmt3 = null;
		ResultSet rs = null;
		
		int result1, result2;
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/SMS","root","root"); 
		     
		    String ins_str1 = 
				  "INSERT INTO Student_Info(sname, semail, sMno,sAddress, sBloodGroup, sHeight, sWeight, sGender, sDepartment, sDOB) VALUES(?,?,?,?,?,?,?,?,?,?)";
			  
			  pstmt1 = con.prepareStatement(ins_str1);
			  
			  pstmt1.setString(1,obj.getName());
			  pstmt1.setString(2,obj.getEmail());
			  pstmt1.setString(3,obj.getMno());
			  pstmt1.setString(4,obj.getAddress());
			  pstmt1.setString(5,obj.getBloodGroup());
			  pstmt1.setInt(6,obj.getHeight());
			  pstmt1.setInt(7,obj.getWeight());
			  pstmt1.setString(8,obj.getGender());
			  pstmt1.setString(9,obj.getDepartment());
			  pstmt1.setString(10,obj.getDob());
			  			  
			  result1 =  pstmt1.executeUpdate();
			  
			  String ins_str2 = "INSERT INTO SPassword(sPassword) VALUES(?)";
			  
			  pstmt2 = con.prepareStatement(ins_str2);
			  
			  pstmt2.setString(1,obj.getPassword());
			  
			  result2 =  pstmt2.executeUpdate();
			  
			  String ins_str3 =
					  "SELECT UID FROM Student_Info WHERE sname = ? AND semail = ? AND sMno = ? AND sAddress = ? AND sBloodGroup = ? AND sHeight = ? AND sWeight = ? AND sGender = ? AND sDepartment = ? AND sDOB = ?";
			  
			  pstmt3 = con.prepareStatement(ins_str3);
			  
			  pstmt3.setString(1,obj.getName());
			  pstmt3.setString(2,obj.getEmail());
			  pstmt3.setString(3,obj.getMno());
			  pstmt3.setString(4,obj.getAddress());
			  pstmt3.setString(5,obj.getBloodGroup());
			  pstmt3.setInt(6,obj.getHeight());
			  pstmt3.setInt(7,obj.getWeight());
			  pstmt3.setString(8,obj.getGender());
			  pstmt3.setString(9,obj.getDepartment());
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
	
	public int checkingUID(SRBean obj) throws SQLException
	{
		Connection con = null;
		PreparedStatement pstmt1 = null;
		ResultSet rs = null;
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/SMS","root","root"); 
		     
		    String ins_str1 = 
				  "SELECT UID FROM Student_Info where UID = ?";
			  
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
	
	public String gettingPassword(SRBean obj) throws SQLException
	{
		Connection con = null;
		PreparedStatement pstmt1 = null;
		ResultSet rs = null;
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/SMS","root","root"); 
		     
		    String ins_str1 = 
				  "SELECT sPassword FROM sPassword where UID = ?";
			  
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
