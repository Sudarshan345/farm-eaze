<%@page import="java.util.Iterator"%>
<%@page import="Com.UserDetails.ProviderBean"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
				<link rel="stylesheet" type="text/css" href="farmeaze.css">
				<style>
table {
 
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #decfcf;
  text-align: left;
  padding: 8px;
  text-align:center;
}

tr:nth-child(even) {

  background-color: #dddddd;
}
thead,th {
	background-color: #337ab7;
	color:white;
}
				</style>
</head>
<body>
<div>

<nav class="navbar navbar-default navbar-fixed-top">
  <div class="container-fluid">
    <div class="navbar-header">
  
      <a class="navbar-brand" href="farmeaze.html">FARMEAZE</a>
    </div>
    <ul class="nav navbar-nav">
     <li class="active"><a href="farmeaze.html">Home</a></li>
      <li><a href="#">About Us</a></li>
      <li><a href="#">Equipments</a></li>
    <li><a href="Admin_login.html">Admin</a></li>
       <li><a href="Providerdetails.html">Providers</a></li>
        <li><a href="userlogin.html">Users</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="#"><span class="glyphicon glyphicon-user"></span> Login</a></li>
      <li><a href="#"><img src="images/contact.png" height="20px"> Contact Us</a></li>
    </ul> 
  </div>
</nav>
</div>
<br>
<br>


<div class="sidenav">
  <ul style="list-style:none">
<li><a href="Providerdetails.html"><img src="images/adduser.png" height="30px" width="30px"> Add Provider</a></li>
 <li  class="active"> <a href="provider_view.html"><img src="images/list.png" height="30px" width="30px"> Provider View</a></li>
 <li> <a href="userlogin.html"><img src="images/adduser.png" height="30px" width="30px"> User Create</a></li>
 <li> <a href="user_view.html"><img src="images/list.png" height="30px" width="30px"> User View</a></li>
  <li> <a href="settings.html"><img src="images/settings.png" height="30px" width="30px"> Settings</a></li>
   <li> <a href="logout.html"><img src="images/logout.png" height="30px" width="30px"> Logout</a></li>

</ul>
</div>


<div class="main">
	<h3>All providers list</h3>
		<table>
			<thead>
			<tr>
				
				<th>Name</th>
				<th>Mobile No</th>
					<th>Tractor Registration number</th>
				<th>Pincode</th>
				<th colspan="4">Operations</th>
				
			</tr>
		</thead>
		
			
		<tbody>
		<% List<ProviderBean> pb = (List<ProviderBean>) request.getAttribute("prlist") ;
		for(ProviderBean pblist : pb){
			
			%>
			<tr>
				<td><%=pblist.provider_name%></td>
				<td><%=pblist.mobile_no%></td>
				<td><%=pblist.Tractor%></td>
				<td><%=pblist.Pincode%></td>
				<td>
			
				<a href=<%="\"ProviderequipmentlistServlet?name=" + pblist.provider_name + "&mno=" + pblist.mobile_no+ "\""%>><button class="btn btn-primary">Equipment</button></a>
				</td>
				<td><button class="btn btn-primary">Update</button></td>
				<td><button class="btn btn-success">View</button></td>
				<td><button class="btn btn-danger">Delete</button></td>
			</tr>
			<% 
		}
		%>
		
		</tbody>
		</table>
</div>

<div class="footer">
  <p> FarmEaze Copy-right @ 2019</p>
</div>
</body>
</html>