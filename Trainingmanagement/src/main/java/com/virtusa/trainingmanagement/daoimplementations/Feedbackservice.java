package com.virtusa.trainingmanagement.daoimplementations;

import java.sql.Connection;
import java.sql.PreparedStatement;


import com.virtusa.trainingmanagement.models.Feedback;
import com.virtusa.trainingmanagement.helper.OracleHelper;

public class Feedbackservice 
{
	public String getuser(Feedback feedback)
	{
		
		String empname=feedback.getName();
		String empcomments=feedback.getComments();
		
		Connection con = null;
		try
		{
			con = OracleHelper.getConnection();
			PreparedStatement pt=con.prepareStatement("insert into FeedBack(name,comments)values(?,?)");
			pt.setString(1,empname);
			pt.setString(2,empcomments);
			
			int i1=pt.executeUpdate();
			if(i1>0)
			{
				return "success";
				/*out.println("<script type=\"text/javascript\">");
				out.println("alert('Posted Sucessfully');");
				out.println("location='Emp_Home.jsp';");
				out.println("</script>");*/
			}
			else {
				return "unsuccessfull";
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return "invalid";

	}
}
