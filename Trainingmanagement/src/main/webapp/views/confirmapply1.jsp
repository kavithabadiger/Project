<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="java.sql.*" %>
<%@ page import="java.sql.DriverManager" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<center>
<form action="ConfirmApply1" method="post">
Employee ID:
<input type="text" name="terainid"><br>
Employee Name:
<input type="text" name="terainid"><br>
Training ID:
<input type="text" name="terainid" value="<%=request.getAttribute("tid")%>"><br>
Training name:
<input type="text" name="terainid" value="<%=request.getAttribute("tname")%>"><br>
Domain:
<input type="text" name="terainid" value="<%=request.getAttribute("tdom")%>"><br>
Start date:
<input type="text" name="terainid" value="<%=request.getAttribute("tsdate")%>"><br>
End date:
<input type="text" name="terainid" value="<%=request.getAttribute("tedate")%>"><br>
Venue:
<input type="text" name="terainid" value="<%=request.getAttribute("tvenue")%>"><br>

<input type="submit" value="Apply">
</form>
</center>
</body>
</html>