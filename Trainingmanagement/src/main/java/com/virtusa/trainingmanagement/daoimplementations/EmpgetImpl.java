
package com.virtusa.trainingmanagement.daoimplementations;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


import com.virtusa.trainingmanagement.helper.OracleHelper;
import com.virtusa.trainingmanagement.models.Admin_Scheduletraining;

public class EmpgetImpl 
{
	Connection conn = null;
    Statement stmt = null;
    ResultSet res = null;  
    
	public ArrayList<Admin_Scheduletraining> getdata()
	{
		 ArrayList<Admin_Scheduletraining> ee = new ArrayList<Admin_Scheduletraining>();
		 try
		 {
		 conn = OracleHelper.getConnection();
	        stmt = conn.createStatement();
	         
	        res = stmt.executeQuery("select * from Adminp"); 
	                     
	        while(res.next())
	        {   
	         
	                Admin_Scheduletraining e = new Admin_Scheduletraining();                
	                e.setTrainingid(res.getString(1));
	                e.setTrainingtitle(res.getString(2));
	                e.setDomain(res.getString(3));
	                e.setStartdate(res.getDate(4));
	                e.setStartdate(res.getDate(5));
	                e.setVenue(res.getString(6));
	                ee.add(e);
	                                     
	         }                   
	       
	        conn.close();
	                          
	    }          
	 
	    catch (SQLException se)
	    {
	        se.printStackTrace();
	     
	    }
		return ee;
		
	}

}
