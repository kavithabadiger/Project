package com.virtusa.trainingmanagement.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.virtusa.trainingmanagement.daoimplementations.EmpprofilesImpl;
import com.virtusa.trainingmanagement.daointerfaces.Emp_profileDAO;
import com.virtusa.trainingmanagement.models.Emp_profile;

/**
 * Servlet implementation class Emp_profilecontroller
 */
@WebServlet("/EmpProfileServlet")
public class EmpProfileServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		/*String employeeId=request.getParameter("employeeId");
		String userName=request.getParameter("userName");
		String emailId=request.getParameter("emailId");
		int phoneNumber=Integer.parseInt(request.getParameter("phoneNumber"));
		String designation=request.getParameter("designation");*/
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		 HttpSession session=request.getSession();  
	     session.setAttribute("employeeId",request.getParameter("employeeId")); 
	     session.setAttribute("employeeuserName",request.getParameter("userName"));
	     session.setAttribute("employeeEmailid",request.getParameter("emailId"));
	     session.setAttribute("employeePhone",Integer.parseInt(request.getParameter("phoneNumber")));
	     session.setAttribute("employeeDesignation",request.getParameter("designation"));
	  
		Emp_profile empprofile=new Emp_profile();
		empprofile.setEmpid(request.getParameter("employeeId"));
		empprofile.setEmpusername(request.getParameter("userName"));
		empprofile.setEmpemail(request.getParameter("emailId"));
		empprofile.setEmpphone(Integer.parseInt(request.getParameter("phoneNumber")));
		empprofile.setEmpdesignation(request.getParameter("designation"));
		
		Emp_profileDAO empprofileDao = new EmpprofilesImpl();
		
		String result = empprofileDao.editprofile(empprofile);
		
		if(result.equals("success")) 
		 {
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Profile Updated sucessfully');");
			out.println("location='Emp_Home.jsp';");
			out.println("</script>");
		}
		 else
		 {
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Unsucessfull');");
			out.println("location='Emp_error.jsp';");
			out.println("</script>");
		 }		

	}

}
