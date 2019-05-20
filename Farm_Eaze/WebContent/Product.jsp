
<%@page import="com.farmeaze.javafiles.ProviderBean"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="farmeaze.css">
<style>
body {
	background-image: url('images/agriculture-1845835_960_720.jpg');
	background-size: cover;
}

table {
	padding: 6px;
	text-align: center;
	color: black;
	font-family: Helvetica;
	font-size: 20px;
	font-weight: 600;
}

table th {
	color: green;
}

table th, table td {
	padding: 6px;
	background-color: #FFFFFF;
	opacity: .6;
}

.footer {
	position: fixed;
	left: 0;
	bottom: 0;
	width: 100%;
	background-image: url('images/green.jpg');
	color: white;
	text-align: center;
}
</style>
</head>
<body>
	<div>
		<nav class="navbar navbar-default navbar-fixed-top">
			<div class="container-fluid">
				<div class="navbar-header">
					<!--  <img src="images/logo.png">-->
					<a class="navbar-brand" href="farmeaze.html">FarmEaze</a>
				</div>
				<ul class="nav navbar-nav">
					<li class="active"><a href="farmeaze.html">Home</a></li>
					<li><a href="#">About Us</a></li>
					<li><a href="#">Equipments</a></li>
					<li><a href="#">Cart</a></li>
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<li><a href="#"><span class="glyphicon glyphicon-user"></span>
							Sign Up</a></li>
					<li><a href="#"><span class="glyphicon glyphicon-log-in"></span>
							Login</a></li>
				</ul>
			</div>
		</nav>
	</div>
	<br>
	<br>
	<div>

		<h1 class="heading">Providers' Details</h1>
		<table align="center" border="1px solid black" cellpadding="10"
			cellspacing="10">
			<tr>
				<th>Provider Name</th>
				<th>Mobile Number</th>
				<th>Product</th>
				<th>Manufacture Year</th>
				<th>Pincode</th>
				<th>Village</th>
				<th>Mandal</th>
				<th>District</th>
				<th>State</th>
				<th>Book Now</th>




			</tr>

			<%
				List<ProviderBean> providerlist = (List<ProviderBean>) request.getAttribute("disp");
				for (ProviderBean pinf : providerlist) {
			%>
			<tr>
				<td><%=pinf.provider_name%></td>
				<td><%=pinf.mobile_no%></td>
				<td><%=pinf.product%></td>
				<td><%=pinf.manufacturer_year%></td>
				<td><%=pinf.Pincode%></td>
				<td><%=pinf.village%></td>
				<td><%=pinf.mandal%></td>
				<td><%=pinf.district%></td>
				<td><%=pinf.state%></td>
				<td><a
					href=<%="\"SlotbookingServlet?mno=" + pinf.mobile_no + "&name=" + pinf.provider_name + "\""%>>
						bookSlot</a></td>
			</tr>
			<%
				}
			%>
		</table>


	</div>
	<div class="footer">
		<center>
			<p>FarmEaze copyright @2019</p>
		</center>
	</div>

</body>
</html>