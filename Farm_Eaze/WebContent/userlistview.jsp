<%@page import="java.util.List"%>
<%@page import="com.reg.servlets.Userbean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
   
<title>Insert title here</title>
<style>
.navbar-default {
background-image: url('green.jpg');
background-repeat: no-repeat;
background-size: cover; 
}

.navbar-default .navbar-brand {
    color: white;
}
.navbar-default .navbar-nav>li>a {
    color: white;}
.footer {
   position: fixed;
   left: 0;
   bottom: 0;
   width: 100%;
 
   color: white;
   text-align: center;
   background-image: url('green.jpg');
background-repeat: no-repeat;
background-size: cover;}
tr{border:1px solid black; font-size:22px}
th{border:1px solid black; font-size:22px}
table{margin-top:100px; margin-left:400px}
</style>

</head>
<body style="background-image: url(userview.png);background-size:cover">

<nav class="navbar navbar-default navbar-fixed-top">
  <div class="container-fluid">
    <div class="navbar-header">
  
      <a class="navbar-brand" href="farmeaze.html">FARMEAZE</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="farmeaze.html">Home</a></li>
      <li><a href="#">About Us</a></li>
      <li><a href="#">Equipments</a></li>
      <li><a href="#">Admin</a></li>
       <li><a href="#">Providers</a></li>
        <li><a href="#">Users</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="#"><span class="glyphicon glyphicon-user"></span> Login</a></li>
      <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Contact Us</a></li>
    </ul> 
  </div>
</nav>
<h2 style="color: black ;margin-top:150px;margin-left:530px">User Details</h2>
	<table>
		<tr><thead>
			<th > user_name </th>
			<th> mobile_number </th>
			<th> pincode </th>
			<th> village </th>
		</thead></tr>
		<tbody><%
		List<Userbean> u =(List<Userbean>) request.getAttribute("userlist");
		for(Userbean U:u) {
				%>
		<tr>
			<th><%=U.getuser_name() %></th>
			<th><%=U.getmobile_number() %></th>
			<th><%=U.getpincode() %></th>
			<th><%=U.getvillage() %></th>
		<%} %>
		</tr>
		</tbody>
	</table>
	<div class="footer">
  <p> FarmEaze Copy-right @ 2019</p>
</div>
	
</body>
</html>