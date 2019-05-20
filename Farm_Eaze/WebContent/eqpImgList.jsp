<%@page import="com.farmeaze.javafiles.DBOperations"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="homepagecss.css">
<style>
body {
	background-image: url("images/background.jpg");
	background-size: cover;
	background-repeat: no-repeat;
	width: 100%;
}

.list {
	height: 560px;
	width: 450px;
	background-color: #D7F7FF;
	border-radius: 30px;
	margin-top: 58px;
	border-radius: 30px;
	opacity: .86;
}

.list a {
	color: #3f729b;
	font-size: 18px;
	font-weight: 800;
	padding-left: 80px;
	font-stretch: wider;
	font-family: "lucida grande", tahoma, verdana, arial, sans-serif;
}

.list a:hover {
	color: #FF0000;
	font-weight: 900;
	font-variant: normal;
}

.headingp {
	font-family: Bookman;
	font-stretch: wider;
	font-size: 25px;
	font-weight: 700;
	padding-left: 10px;
	color: black;
}

.list img {
	height: 240px;
	width: 300px;
}
</style>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
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
				<li><a href="#"><span class="glyphicon glyphicon-user"></span>
						Login</a></li>
				<li><a href="#"><span class="glyphicon glyphicon-log-in"></span>
						Contact Us</a></li>
			</ul>
		</div>
	</nav>

	<%
		ArrayList<String> lis = (ArrayList<String>) request.getAttribute("e_list");
		ArrayList<String> li = DBOperations.equip_dispaly();
	%>

	<div class="list">
		<p class="headingp">Equipments available:</p>
		<%
			for (String x : li) {
		%>

		<br> <a href=<%="\"ProviderRetriveServlet?eqp=" + x + "\""%>>
			<%=x%>
		</a>
		<%
			if (x.compareToIgnoreCase("Rotavator") == 0) {
		%>
		<img alt="rotavator" src="images/rotavatorHD.jpg">
		<%
			}
		%>
		<%
			if (x.compareToIgnoreCase("Cultivator") == 0) {
		%>
		<img alt="rotavator" src="">
		<%
			}
		%>
		<%
			if (x.compareToIgnoreCase("Puddler") == 0) {
		%>
		<img alt="rotavator" src="">
		<%
			}
		%>
		<%
			if (x.compareToIgnoreCase("Baler") == 0) {
		%>
		<img alt="rotavator" src="">
		<%
			}
		%>
		<%
			if (x.compareToIgnoreCase("Trolley") == 0) {
		%>
		<img alt="rotavator" src="">
		<%
			}
		%>
		<%
			if (x.compareToIgnoreCase("Fertilizer/seed Driller") == 0) {
		%>
		<img alt="rotavator" src="">
		<%
			}
		%>
		<%
			if (x.compareToIgnoreCase("MB Plough") == 0) {
		%>
		<img alt="rotavator" src="">
		<%
			}
		%>
		<%
			if (x.compareToIgnoreCase("Reversible MB Plough") == 0) {
		%>
		<img alt="rotavator" src="">
		<%
			}
		%>
		<%
			if (x.compareToIgnoreCase("Disc Plough") == 0) {
		%>
		<img alt="rotavator" src="">
		<%
			}
		%>
		<%
			if (x.compareToIgnoreCase("Harvester") == 0) {
		%>
		<img alt="rotavator" src="">
		<%
			}
		%>
		<%
			if (x.compareToIgnoreCase("Thresher") == 0) {
		%>
		<img alt="rotavator" src="">
		<%
			}
		%>
		<br>
		<%
			}
		%>
	</div>

	<div class="footer">
		<p>FarmEaze Copy-right @ 2019</p>
	</div>

</body>
</html>