package com.virtusa.trainingmanagement.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

import com.virtusa.trainingmanagement.daoimplementations.Feedbackservice;
import com.virtusa.trainingmanagement.models.Feedback;
/**
 * Servlet implementation class Feedbackcontroller
 */
@WebServlet("/Emp_FeedBack")  
public class Feedbackcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
				String empname=request.getParameter("name");
				String empfeedback=request.getParameter("feedback");
				PrintWriter out=response.getWriter();
				response.setContentType("text/html");

				Feedback feedback = new Feedback();
				feedback.setName(empname);
				feedback.setComments(empfeedback);
			
				Feedbackservice feedbackDao = new Feedbackservice();
				
				String result = feedbackDao.getuser(feedback);
				
				if(result.equals("success")) 
				 {
					out.println("<script type=\"text/javascript\">");
					out.println("alert('Posted Sucessfully');");
					out.println("location='Emp_Home.jsp';");
					out.println("</script>");
			/*
			 * request.getRequestDispatcher("/Emp_Home.jsp");//RequestDispatcher is used to
			 * send the control to the invoked page.
			 */		}
				 else
				 {
					out.println("<script type=\"text/javascript\">");
					out.println("alert('Posted Sucessfully');");
					out.println("location='Emp_error.jsp';");
					out.println("</script>");
				 }				
	}
}
