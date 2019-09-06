<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="java.sql.*" %>
<%@ page import="java.sql.DriverManager" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>History</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
     <!-- <a href="#" data-toggle="modal" class="profile-edit-btn">Virtusa</a> -->
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav navbar-right">
        <li><a href="emphome.jsp">Home</a></li>
        <li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="#">Training<span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="/TrainingProject3/Demo">Apply</a></li>
            <li><a href="empposttraining.jsp">Post</a></li>
          </ul>
        </li>
        <li><a href="empnotification.jsp">Notification</a></li>
        <li class="active"><a href="#">History</a></li>
		<li><a href="empgivefeedback.jsp">feedback</a></li>
      </ul>
      
    </div>
  </div>
</nav>


<form>
<input type="text" id="myInput" onkeyup="myFunction()" placeholder="Search for names.." title="Type in a name">

<%
try{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","kavi","k123");
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select * from Adminp"); 
ResultSet rs1=st.executeQuery("select Empid,Ename from ptraining");

%>
<table id="myTable">
<tr class="header">
<th style="width:60; font-weight:bold;">Training ID</th>
<th style="width:60; font-weight:bold;">Training Name</th>
<th style="width:40; font-weight:bold;">Domain</th>
<th style="width:40; font-weight:bold;">Start Date</th>
<th style="width:40; font-weight:bold;">End Date</th>
<th style="width:40; font-weight:bold;">Venue</th>
<th style="width:40; font-weight:bold;">Status</th>
</tr>
<%
while(rs.next())
{
%>
<tr>
<td>
<%=rs.getString(1)
%>
</td>
<td>
<%=rs.getString(2)
%>
</td>
<td>
<%=rs.getString(3)
%>
</td>
<td>
<%=rs.getString(4)
%>
</td>
<td>
<%=rs.getString(5)
%>
</td>
<td>
<%=rs.getString(6)
%>
</td>
<td>
<a href="#" class="btn btn-success">APPLY</a>
</td>
</tr>

<%
}
%>
</tbody>
</table>
<%

}
catch(Exception e)
{
e.printStackTrace();
}
%>
</form>


</body>
</html>