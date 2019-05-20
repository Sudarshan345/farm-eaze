<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="farmeaze.css">
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
		<form action="Equipment_insert_servlet" method="get">


			<h1 class="heading">Add Product Details</h1>

			<table align="center">
				<tr>
					<th class="sel">Select</th>
					<th>Product Type</th>
					<th>Description</th>
				</tr>

				<tr>
					<td><input type="checkbox" value="landleveler"
						name="equipment"></td>
					<td><label>Land Leveler</label></td>
					<td><textarea rows="3" cols="100"
							placeholder="Please enter product details like blades"
							name="landleveler_desc"></textarea></td>
				</tr>
				<tr>
					<td><input type="checkbox" value="2mbplough" name="equipment"></td>
					<td><label>2 MB Plough</label></td>
					<td><textarea rows="3" cols="100"
							placeholder="Please enter product details like blades"
							name="2mbplough_desc"></textarea></td>
				</tr>
				<tr>
					<td><input type="checkbox" value="reversable2mbplough"
						name="equipment"></td>
					<td><label>Reversable 2 MB Plough</label></td>
					<td><textarea rows="3" cols="100"
							placeholder="Please enter product details like blades"
							name="reversable2mbplough_desc"></textarea></td>
				</tr>
				<tr>
					<td><input type="checkbox" value="reversableplough"
						name="equipment"></td>
					<td><label>Reversable Plough</label></td>
					<td><textarea rows="3" cols="100"
							placeholder="Please enter product details like blades"
							name="reversableplough_desc"></textarea></td>
				</tr>
				<tr>
					<td><input type="checkbox" value="discplough" name="equipment"></td>
					<td><label>Disc Plough</label></td>
					<td><textarea rows="3" cols="100"
							placeholder="Please enter product details like blades"
							name="discplough_desc"></textarea></td>
				</tr>
				<tr>
					<td><input type="checkbox" value="rotovator" name="equipment"></td>
					<td><label>Rotovator</label></td>
					<td><textarea rows="3" cols="100"
							placeholder="Please enter product details like blades"
							name="rotovator_desc"></textarea></td>
				</tr>
				<tr>
					<td><input type="checkbox" value="puddler" name="equipment"></td>
					<td><label>Puddler</label></td>
					<td><textarea rows="3" cols="100"
							placeholder="Please enter product details like blades"
							name="puddler_desc"></textarea></td>
				</tr>
				<tr>
					<td><input type="checkbox" value="multicroptresher"
						name="equipment"></td>
					<td><label>Multi Crop Tresher</label></td>
					<td><textarea rows="3" cols="100"
							placeholder="Please enter product details like blades"
							name="multicroptresher_desc"></textarea></td>
				</tr>
				<tr>
					<td><input type="checkbox" value="seedcumfeltilizedrill"
						name="equipment"></td>
					<td><label>Seed Cum Fertilize Drill</label></td>
					<td><textarea rows="3" cols="100"
							placeholder="Please enter product details like blades"
							name="seedcumfeltilizedrill_desc"></textarea></td>
				</tr>
				<tr>
					<td><input type="checkbox" value="combinedharvester"
						name="equipment"></td>
					<td><label>Combined Harvester</label></td>
					<td><textarea rows="3" cols="100"
							placeholder="Please enter product details like blades"
							name="combinedharvester_desc"></textarea></td>
				</tr>
				<tr>
					<td><input type="checkbox" value="trolley" name="equipment"></td>
					<td><label>Trolley</label></td>
					<td><textarea rows="3" cols="100"
							placeholder="Please enter product details like blades"
							name="trolley_desc"></textarea></td>
				</tr>
				<tr>
					<td><input type="checkbox" value="baler" name="equipment"></td>
					<td><label>Baler</label></td>
					<td><textarea rows="3" cols="100"
							placeholder="Please enter product details like blades"
							name="baler_desc"></textarea></td>
				</tr>

			</table>
			<div class="last">

				<h4>
					<u>Add Eqipment</u>
				</h4>
				<div class="first">
					<label>Product Type</label> <input type="text" name="add_equipment">
				</div>
				<div class="sencond">
					<label>Description</label>
					<textarea cols="100"
						placeholder="Please enter product details like blades and Supportiive hp,for crop,supportive land type"></textarea>
				</div>
			</div>

			<button type="submit" class="btn btn-primary btn">Submit_equipments</button>
		</form>
	</div>

	<div class="equip">
		<button type="submit" class="btn btn-primary btn-lg">Submit</button>
	</div>
	<footer>
		<p>FarmEaze -copyright 2019-2020</p>
	</footer>
	2
</body>
</html>