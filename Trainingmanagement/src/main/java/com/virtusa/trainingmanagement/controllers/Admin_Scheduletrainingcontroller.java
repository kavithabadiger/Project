package com.virtusa.trainingmanagement.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import com.virtusa.trainingmanagement.daoimplementations.AdminscheduletrainingImpl;
import com.virtusa.trainingmanagement.daointerfaces.Admin_ScheduletrainingDAO;
import com.virtusa.trainingmanagement.models.Admin_Scheduletraining;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Admin_Scheduletrainingcontroller")  
public class Admin_Scheduletrainingcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPostt(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String trainingid1=request.getParameter("trainingid");
		String trainingtitle1=request.getParameter("trainingtitle");
		String domain1=request.getParameter("domain");
		Date startdate1=Date.valueOf(request.getParameter("startdate"));
		Date enddate1=Date.valueOf(request.getParameter("enddate"));
        String venue1=request.getParameter("venue");
        
        PrintWriter out=response.getWriter();
        response.setContentType("text/html");
        
        Admin_Scheduletraining mobj=new Admin_Scheduletraining();
        mobj.setTrainingid(trainingid1);
        mobj.setTrainingtitle(trainingtitle1);
        mobj.setDomain(domain1);
        mobj.setStartdate(startdate1);
        mobj.setEnddate(enddate1);
        mobj.setVenue(venue1);  
        
        Admin_ScheduletrainingDAO dobj=new AdminscheduletrainingImpl();
        String result=dobj.trainingschedule(mobj );

        
        if(result.equals("success")) 
		 {
//			out.println("<script type=\"text/javascript\">");
			out.println("<script>alert('Posted Sucessfully');</script>");
			request.getRequestDispatcher("/Admin_scheduletraining.jsp");
			/*
			 * out.println("location='Admin_feedback.jsp';");
			 */			/*
			 * out.println("</script>");
			 */	/*
	 * request.getRequestDispatcher("/Emp_Home.jsp");//RequestDispatcher is used to
	 * send the control to the invoked page.
	 */		}
		 else
		 {
//			out.println("<script type=\"text/javascript\">");
			out.println("<script>alert('Unsucessfully')</script>;");
			request.getRequestDispatcher("/Admin_Scheduletraining.jsp");
			/*
			 * out.println("location='Admin_feedback.jsp';");
			 */ /*
				 * out.println("</script>");
				 */		 }				

		/*
		 * response.getWriter().append("Served at: ").append(request.getContextPath());
		 */
        
       }

}
