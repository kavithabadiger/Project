package com.virtusa.trainingmanagement.daoimplementations;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.virtusa.trainingmanagement.helper.OracleHelper;
import com.virtusa.trainingmanagement.models.Emp_posttraining;

public class EmpposttrainingImpl 
{
	public String post(Emp_posttraining posttraining)
	{
		String empid=posttraining.getEmpeid();
		String empname=posttraining.getEmpfullname();
		String empemail=posttraining.getEmpemail();
		int empphone=posttraining.getEmpphonenumber();
		String trainingtitle=posttraining.getTrainingname();
	
		Connection con = null;
		try
		{
			con = OracleHelper.getConnection();
			PreparedStatement pt=con.prepareStatement("insert into EPost(Empid,Empname,Email,Phone,Training_Title)values(?,?,?,?,?)");
			pt.setString(1,empid);
			pt.setString(2,empname);
			pt.setString(3,empemail);
			pt.setInt(4,empphone);
			pt.setString(5,trainingtitle);
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
	
	return "invalid";
	}
}
