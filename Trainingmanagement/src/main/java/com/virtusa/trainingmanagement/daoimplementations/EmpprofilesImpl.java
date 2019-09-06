package com.virtusa.trainingmanagement.daoimplementations;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.virtusa.trainingmanagement.daointerfaces.Emp_profileDAO;
import com.virtusa.trainingmanagement.helper.OracleHelper;
import com.virtusa.trainingmanagement.models.Emp_profile;

public class EmpprofilesImpl implements Emp_profileDAO 
{
	public String editprofile(Emp_profile empprofile)
	{
		String eid=empprofile.getEmpid();
		String ename=empprofile.getEmpusername();
		String eemailid=empprofile.getEmpemail();
		int ephone=empprofile.getEmpphone();
		String edesignation=empprofile.getEmpdesignation();
		
		Connection con = null;
		try
		{
			con = OracleHelper.getConnection();
			PreparedStatement pt=con.prepareStatement("insert into Empprofile(Eid,Empusername,Empemailid,Empphone,Empdesignation)values(?,?,?,?,?)");
			pt.setString(1,eid);
			pt.setString(2,ename);
			pt.setString(3,eemailid);
			pt.setInt(4,ephone);
			pt.setString(5,edesignation);
			int i1=pt.executeUpdate();
			if(i1>0)
			{
				return "success";
			}
			else
			{
				return "unsuccess";
			}
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
		
		return null;
		
	}
}
