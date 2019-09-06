<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Post Training</title>
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
            <li class="active"><a href="#">Post</a></li>
          </ul>
        </li>
        <li><a href="empnotification.jsp">Notification</a></li>
        <li><a href="emphistory.jsp">History</a></li>
		<li><a href="empgivefeedback.jsp">feedback</a></li>
      </ul>
    </div>
  </div>
</nav>
<div class="col-sm-6 col-sm-offset-3">

<div class="panel panel-info">
<div class="panel-heading">Enter training details</div>
<div class="panel-body">

<form action="Emp_PostTraining" method="post">

<div class="form-group row">
<label for="full_name" class="col-md-4 col-form-label text-md-right">Full Name</label>
<div class="col-md-6">
<input type="text" id="full_name" class="form-control" name="fullname">
</div>
</div>

<div class="form-group row">
<label for="email_address" class="col-md-4 col-form-label text-md-right">E-Mail Address</label>
<div class="col-md-6">
<input type="text" id="email_address" class="form-control" name="emailaddress">
</div>
</div>

<div class="form-group row">
<label for="user_name" class="col-md-4 col-form-label text-md-right">Employee ID</label>
<div class="col-md-6">
<input type="text" id="user_name" class="form-control" name="Empid">
</div>
</div>

<div class="form-group row">
<label for="phone_number" class="col-md-4 col-form-label text-md-right">Phone Number</label>
<div class="col-md-6">
<input type="number" id="phone_number" class="form-control" name="phonenumber">
</div>
</div>

<div class="form-group row">
<label for="c_name" class="col-md-4 col-form-label text-md-right">Training Name</label>
<div class="col-md-6">
<input type="text" id="permanent_address" class="form-control" name="cname">
</div>
</div>

<div class="panel-footer">
<div class="col-md-6 offset-md-4">
<button type="submit" class="btn btn-primary">Apply</button>
<button type="button" class="btn btn-danger">Cancel</button>
</div>
</div>
</form>
</div>
</div>
</div>

</body>
</html>