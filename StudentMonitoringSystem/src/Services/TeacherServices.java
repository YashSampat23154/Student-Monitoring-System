package Services;

import Beans.SRBean;
import Beans.TRBean;
import Dao.SDao;
import Dao.TDao;

public class TeacherServices {

	public int TeacherRegister(String name, String Email, String Mno, String Address,
			String bloodGroup, String Qualifications, String Experience, String gender, String Subject, String dob, String password)
		{
		
		TRBean obj = new TRBean();
		TDao obj1 = new TDao();
		
		obj.setName(name);
		obj.setEmail(Email);
		obj.setMno(Mno);
		obj.setAddress(Address);
		obj.setBloodGroup(bloodGroup);
		obj.setSubject(Subject);
		obj.setDob(dob);
		obj.setExperience(Experience);
		obj.setQualifications(Qualifications);
		obj.setGender(gender);
		obj.setPassword(password);
		
		try {
		return (obj1.Tregister(obj));
		}
		catch(Exception ex)
		{
		System.out.println(ex.toString());
		return 0;
		}
		
	}
	
	public int checkUID(String UID)
	{
		TRBean obj = new TRBean();
		TDao obj1 = new TDao();
		
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
		TRBean obj = new TRBean();
		TDao obj1 = new TDao();
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
		TRBean obj = new TRBean();
		TDao obj1 = new TDao();
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
