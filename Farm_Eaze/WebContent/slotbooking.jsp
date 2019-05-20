<%@page import="com.farmeaze.javafiles.TimeSlots"%>
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
<link rel="stylesheet" type="text/css" href="homepagecss.css">
<style type="text/css">
th {
	font-style: italic;
	font-size: 30px;
	border: .1px solid grey;
	padding: 8px;
	color: #66FF52;
}

td {
	border: .1px solid grey;
	font-size: 25px;
	border-radius: 10px;
	padding: 8px;
}

input {
	border-radius: 20px;
}

body {
	background-image: url("images/hdbimg2.jpg");
	background-size: cover;
	background-repeat: no-repeat;
}

table {
	margin-left: 290px;
	margin-top: 0px;
	background-color: #FCFFFF;
	opacity: .7;
	float: left;
}

.form1 {
	margin-left:110px;
	color: black;
	font-size: 20px;
	font-family: Courier;
	font-weight: 800;
	padding: 30px;
	background-color: #BBFDFF;
	float: left;
	opacity: .75;
}

.spn {
	margin-top: 60px;
	font-size: 28px;
	margin-left: 290px;
	color: #ffffff;
	font-style: inherit;
	font-family: unset;
	font-weight: bold;
	float: left;
}

.spn2 {
	font-size: 28px;
	color: cyan;
	font-style: inherit;
	font-family: unset;
	font-weight: bold;
	float: left;
	margin-top: 60px;
	margin-left: 25px;
}
</style>
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


	<div class="spn">previous bookings for this provider:</div>
	<div class="spn2">please check and Select available Slot:</div>
	<table>
		<tr>
			<th>From Date</th>
			<th>Time</th>
			<th>To Date</th>
			<th>Time</th>
		</tr>
		<%
			List<TimeSlots> l = (List<TimeSlots>) request.getAttribute("list");
			for (TimeSlots t : l) {
		%><tr>
			<td><%=t.getfromdate()%></td>
			<td><%=t.getfromtime()%></td>
			<td><%=t.gettodate()%></td>
			<td><%=t.gettotime()%></td>

		</tr>
		<%
			}
		%>

	</table>


	<%
		Integer id = (Integer) request.getAttribute("p_id");
	%>

	<form action="Time_into_db" class="form1">
		FROM Date:<input type="date" name="fromDate" placeholder="from_date"><br>
		<br> Time:<input type="text" name="ftime"
			placeholder="time...ex:10AM"> <br> <br> TO Date:<input
			type="date" name="toDate"><br> <br> Time: <input
			type="text" name="ttime" placeholder="time...ex:10AM"><br>
		<br> <br> <input type="hidden" value="<%=id%>" name="id">
		<br> <input type="submit" value="submit">
	</form>
	<div class="footer">
		<p>FarmEaze Copy-right @ 2019</p>
	</div>

</body>
</html>