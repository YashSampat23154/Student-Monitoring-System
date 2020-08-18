package Services;

import Beans.SRBean;
import Dao.SDao;

public class StudentServices {

	public int studentRegister(String name, String Email, String Mno, String Address, String bloodGroup,
								String gender,  int height, int weight, String department, String dob , String password)
	{
		
		SRBean obj = new SRBean();
		SDao obj1 = new SDao();
		
		obj.setName(name);
		obj.setEmail(Email);
		obj.setMno(Mno);
		obj.setAddress(Address);
		obj.setBloodGroup(bloodGroup);
		obj.setDepartment(department);
		obj.setDob(dob);
		obj.setHeight(height);
		obj.setWeight(weight);
		obj.setGender(gender);
		obj.setPassword(password);
		
		try {
			return (obj1.Sregister(obj));
		}
		catch(Exception ex)
		{
			System.out.println(ex.toString());
			return 0;
		}
		
	}
	
	public int checkUID(String UID)
	{
		SRBean obj = new SRBean();
		SDao obj1 = new SDao();
		
		obj.setUID(UID);
		
		try 
		{
			return obj1.checkingUID(obj);
		}
		catch(Exception ex)
		{
			System.out.println(ex.toString());
			return 0;
		}
	}
	
	public int checkPassWord(String UID , String Password)
	{
		SRBean obj = new SRBean();
		SDao obj1 = new SDao();
		String password1;
		
		obj.setUID(UID);
		
		try 
		{
			password1 = obj1.gettingPassword(obj);
			
			if(password1.equals(Password))
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
		
	}
	
	public String recievePassword(String UID)
	{
		SRBean obj = new SRBean();
		SDao obj1 = new SDao();
		String password1;
		
		obj.setUID(UID);
		
		try 
		{
			password1 = obj1.gettingPassword(obj);
			return(password1);
		
		}
		catch(Exception ex)
		{
			System.out.println(ex.toString());
			return("NULL");
		}
	}
	
}
