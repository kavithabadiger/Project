<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<title>FeedBack</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<style>
body {
  font-family: "Lato", sans-serif;
}


/* .container{
width:100px;
height:400px;
} */

#id1{
top:5px;
right:10px;
position:fixed;
}

.container{
background-color:white;
}
.tool{
background-color:#00bfff;
}

input[type=submit] {
  background-color: #4CAF50;
  color: white;
  padding: 12px 20px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #45a049;
}

/* .container {
  border-radius: 10px;
  background-color: #f2f2f2;
  padding: 20px;
} */

input[type=text], select, textarea {
  width: 100%;
  padding: 12px;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
  margin-top: 6px;
  margin-bottom: 16px;
  resize: vertical;
}

.container{
align:center;}

#con{
padding:100px;}

</style>
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
            <li><a href="empposttraining">Post</a></li>
          </ul>
        </li>
        <li><a href="empnotification.jsp">Notification</a></li>
        <li><a href="emphistory.jsp">History</a></li>
		<li class="active"><a href="#">feedback</a></li>
      </ul>
      
    </div>
  </div>
</nav>


<br>
<br>
<div class="container" id="con" align="center">
<form action="Emp_FeedBack" method="post" class="form-horizontal">
<h2>Feedback</h2>


<div class="form-group row">
<label for="full_name" class="col-md-4 col-form-label text-md-right">Name</label>
<div class="col-md-6">
<input type="text" id="name" class="form-control" name="name">
</div>
</div>

<div class="form-group row">
<label for="full_name" class="col-md-4 col-form-label text-md-right">Comments</label>
<div class="col-md-6">
<textarea id="subject" name="feedback" placeholder="Write something.." style="height:200px"></textarea>
</div>
</div>
<input type="submit" class="btn btn-success" value="Submit">
</form>
</div>


</body>
</html> 

